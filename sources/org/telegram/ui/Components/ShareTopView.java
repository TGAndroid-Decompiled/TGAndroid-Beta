package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;

public class ShareTopView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private int currentAccount;
    private int currentMode;
    private String dismissedMessage;
    private final ArrayList foundUrls;
    private Runnable hintRunnable;
    private View.OnClickListener layoutClickListener;
    public final Layout[] layouts;
    private final HashMap linkPreviewCache;
    private int linkRequestId;
    private int linkRequestSerial;
    private boolean linkSearchEnabled;
    private TLRPC.WebPage loadedWebPage;
    private ArrayList mediaEntries;
    private OnModeChangeListener modeChangeListener;
    private CharSequence pendingHintText;
    private boolean previewEnabled;
    private final ArrayList recipients;
    private final Theme.ResourcesProvider resourcesProvider;
    private long selfId;
    private boolean showingHint;

    public interface OnModeChangeListener {
        void onModeChanged(int i, int i2);
    }

    public ShareTopView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.layouts = new Layout[2];
        this.currentMode = 0;
        this.recipients = new ArrayList();
        this.previewEnabled = true;
        this.foundUrls = new ArrayList();
        this.linkPreviewCache = new HashMap();
        this.resourcesProvider = resourcesProvider;
        int i = 0;
        while (true) {
            Layout[] layoutArr = this.layouts;
            if (i < layoutArr.length) {
                layoutArr[i] = new Layout(context, resourcesProvider);
                addView(this.layouts[i], LayoutHelper.createFrame(-1, -1.0f));
                i++;
            } else {
                layoutArr[0].setVisibility(0);
                this.layouts[1].setVisibility(8);
                return;
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        cancelLinkRequest();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didReceivedWebpagesInUpdates && this.loadedWebPage != null && i2 == this.currentAccount) {
            LongSparseArray longSparseArray = (LongSparseArray) objArr[0];
            for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) longSparseArray.valueAt(i3);
                if (webPage != null && webPage.id == this.loadedWebPage.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        int i4 = this.currentMode;
                        this.loadedWebPage = null;
                        cancelLinkRequest();
                        if (this.currentMode != 0) {
                            this.currentMode = 0;
                            OnModeChangeListener onModeChangeListener = this.modeChangeListener;
                            if (onModeChangeListener != null) {
                                onModeChangeListener.onModeChanged(i4, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.loadedWebPage = webPage;
                        String string = this.foundUrls.isEmpty() ? "" : TextUtils.join(" ", this.foundUrls).toString();
                        if (!this.linkPreviewCache.containsKey(string)) {
                            this.linkPreviewCache.put(string, webPage);
                        }
                        bindLinkLoaded(current(), webPage, string);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public Layout current() {
        return this.layouts[0];
    }

    public int getMode() {
        return this.currentMode;
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.loadedWebPage;
    }

    public BackupImageView getThumbView(int i) {
        BackupImageView[] backupImageViewArr;
        if (this.currentMode == 1 && (backupImageViewArr = current().images) != null && i >= 0 && i < backupImageViewArr.length && backupImageViewArr[i].getVisibility() == 0) {
            return backupImageViewArr[i];
        }
        return null;
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        this.layoutClickListener = onClickListener;
        for (Layout layout : this.layouts) {
            layout.container.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(OnModeChangeListener onModeChangeListener) {
        this.modeChangeListener = onModeChangeListener;
    }

    public void setSharedMedia(int i, ArrayList arrayList) {
        OnModeChangeListener onModeChangeListener;
        rebindObserver(i);
        this.selfId = AccountInstance.getInstance(i).getUserConfig().getClientUserId();
        this.mediaEntries = arrayList;
        boolean z = false;
        this.linkSearchEnabled = false;
        this.loadedWebPage = null;
        cancelLinkRequest();
        this.foundUrls.clear();
        int i2 = this.currentMode;
        if (i2 != 1 && i2 != 0) {
            z = true;
        }
        this.currentMode = 1;
        if (z) {
            switchLayouts(true);
        }
        bindMedia(current());
        applyHintText(current());
        int i3 = this.currentMode;
        if (i2 == i3 || (onModeChangeListener = this.modeChangeListener) == null) {
            return;
        }
        onModeChangeListener.onModeChanged(i2, i3);
    }

    public void setSharedLink(int i, String str) {
        prepareForLinkSearch(i);
        if (str == null || str.isEmpty()) {
            return;
        }
        doLinkSearch(str, true);
    }

    public void setSharedText(int i, CharSequence charSequence) {
        prepareForLinkSearch(i);
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        doLinkSearch(charSequence, true);
    }

    private void prepareForLinkSearch(int i) {
        rebindObserver(i);
        this.selfId = AccountInstance.getInstance(i).getUserConfig().getClientUserId();
        this.mediaEntries = null;
        this.linkSearchEnabled = true;
        this.previewEnabled = true;
        this.dismissedMessage = null;
        this.loadedWebPage = null;
        cancelLinkRequest();
        this.foundUrls.clear();
    }

    public boolean isPreviewEnabled() {
        return this.previewEnabled;
    }

    public void dismissWebPagePreview() {
        if (this.foundUrls.isEmpty()) {
            return;
        }
        this.dismissedMessage = TextUtils.join(" ", this.foundUrls).toString();
        this.previewEnabled = false;
        cancelLinkRequest();
        this.loadedWebPage = null;
        int i = this.currentMode;
        if (i != 0) {
            this.currentMode = 0;
            OnModeChangeListener onModeChangeListener = this.modeChangeListener;
            if (onModeChangeListener != null) {
                onModeChangeListener.onModeChanged(i, 0);
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, boolean z) {
        if (this.linkSearchEnabled) {
            doLinkSearch(charSequence, z);
        }
    }

    private void doLinkSearch(CharSequence charSequence, boolean z) {
        OnModeChangeListener onModeChangeListener;
        ArrayList arrayListExtractUrls = extractUrls(charSequence);
        if (z || !sameUrls(arrayListExtractUrls)) {
            this.foundUrls.clear();
            if (arrayListExtractUrls != null) {
                this.foundUrls.addAll(arrayListExtractUrls);
            }
            boolean z2 = false;
            if (arrayListExtractUrls == null || arrayListExtractUrls.isEmpty()) {
                cancelLinkRequest();
                this.loadedWebPage = null;
                int i = this.currentMode;
                if (i != 0) {
                    this.currentMode = 0;
                    OnModeChangeListener onModeChangeListener2 = this.modeChangeListener;
                    if (onModeChangeListener2 != null) {
                        onModeChangeListener2.onModeChanged(i, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            String string = TextUtils.join(" ", arrayListExtractUrls).toString();
            if (!this.previewEnabled) {
                String str = this.dismissedMessage;
                if (str != null && str.equals(string)) {
                    return;
                }
                this.previewEnabled = true;
                this.dismissedMessage = null;
            }
            int i2 = this.currentMode;
            if (i2 != 2 && i2 != 0) {
                z2 = true;
            }
            if (i2 != 2) {
                this.currentMode = 2;
            }
            if (z2) {
                switchLayouts(true);
            }
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.linkPreviewCache.get(string);
            if (webPage != null) {
                this.loadedWebPage = webPage;
                bindLinkLoaded(current(), webPage, string);
            } else {
                bindLinkLoading(current(), string);
                requestLinkPreview(string);
            }
            applyHintText(current());
            int i3 = this.currentMode;
            if (i2 == i3 || (onModeChangeListener = this.modeChangeListener) == null) {
                return;
            }
            onModeChangeListener.onModeChanged(i2, i3);
        }
    }

    public void setRecipients(int i, ArrayList arrayList) {
        rebindObserver(i);
        this.selfId = AccountInstance.getInstance(i).getUserConfig().getClientUserId();
        this.recipients.clear();
        if (arrayList != null) {
            this.recipients.addAll(arrayList);
        }
        Layout layoutCurrent = current();
        if (this.currentMode == 1) {
            layoutCurrent.obj.setText(buildRecipientText(layoutCurrent));
        }
    }

    private static ArrayList extractUrls(CharSequence charSequence) {
        ArrayList arrayList = null;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
                while (matcher.find()) {
                    if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean sameUrls(ArrayList arrayList) {
        if (arrayList == null) {
            return this.foundUrls.isEmpty();
        }
        if (arrayList.size() != this.foundUrls.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) this.foundUrls.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void switchLayouts(boolean z) {
        Layout[] layoutArr = this.layouts;
        Layout layout = layoutArr[0];
        Layout layout2 = layoutArr[1];
        layoutArr[0] = layout2;
        layoutArr[1] = layout;
        if (z) {
            layout2.active = true;
            layout2.setVisibility(0);
            this.layouts[0].setScaleX(0.8f);
            this.layouts[0].setScaleY(0.8f);
            this.layouts[0].setAlpha(0.0f);
            this.layouts[0].setTranslationY(AndroidUtilities.dp(20.0f));
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.layouts[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            final Layout layout3 = this.layouts[1];
            layout3.active = false;
            layout3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    layout3.setVisibility(8);
                }
            }).start();
            return;
        }
        layout.setVisibility(8);
        Layout[] layoutArr2 = this.layouts;
        layoutArr2[1].active = false;
        layoutArr2[0].setVisibility(0);
        this.layouts[0].setScaleX(1.0f);
        this.layouts[0].setScaleY(1.0f);
        this.layouts[0].setAlpha(1.0f);
        this.layouts[0].setTranslationY(0.0f);
        this.layouts[0].active = true;
    }

    private void rebindObserver(int i) {
        if (this.currentAccount == i) {
            this.currentAccount = i;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.currentAccount = i;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    private void cancelLinkRequest() {
        if (this.linkRequestId != 0) {
            AccountInstance.getInstance(this.currentAccount).getConnectionsManager().cancelRequest(this.linkRequestId, true);
            this.linkRequestId = 0;
        }
        this.linkRequestSerial++;
    }

    private void requestLinkPreview(final String str) {
        cancelLinkRequest();
        if (str == null || str.isEmpty()) {
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = str;
        final int i = this.linkRequestSerial + 1;
        this.linkRequestSerial = i;
        this.linkRequestId = AccountInstance.getInstance(this.currentAccount).getConnectionsManager().sendRequest(getwebpagepreview, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ShareTopView.$r8$lambda$A6ZiDmaA01FOWLNWhPbQ_iufumE(this.f$0, i, str, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$A6ZiDmaA01FOWLNWhPbQ_iufumE(final ShareTopView shareTopView, final int i, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        shareTopView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ShareTopView.m2769$r8$lambda$mKFoh2HtvAFSQQxf684zGN4Dd8(this.f$0, i, tLObject, str);
            }
        });
    }

    public static void m2769$r8$lambda$mKFoh2HtvAFSQQxf684zGN4Dd8(ShareTopView shareTopView, int i, TLObject tLObject, String str) {
        TLRPC.WebPage webPage;
        if (i != shareTopView.linkRequestSerial) {
            return;
        }
        shareTopView.linkRequestId = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(shareTopView.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(shareTopView.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
            } else {
                webPage = null;
            }
        } else {
            webPage = null;
        }
        if (webPage instanceof TLRPC.TL_webPage) {
            if (shareTopView.linkPreviewCache.size() > 5) {
                Iterator it = shareTopView.linkPreviewCache.keySet().iterator();
                while (it.hasNext() && shareTopView.linkPreviewCache.size() > 5) {
                    it.next();
                    it.remove();
                }
            }
            shareTopView.linkPreviewCache.put(str, webPage);
            shareTopView.loadedWebPage = webPage;
            shareTopView.bindLinkLoaded(shareTopView.current(), webPage, str);
            return;
        }
        if (webPage instanceof TLRPC.TL_webPagePending) {
            shareTopView.loadedWebPage = webPage;
            return;
        }
        if (webPage instanceof TLRPC.TL_webPageEmpty) {
            shareTopView.loadedWebPage = null;
            int i2 = shareTopView.currentMode;
            if (i2 != 0) {
                shareTopView.currentMode = 0;
                OnModeChangeListener onModeChangeListener = shareTopView.modeChangeListener;
                if (onModeChangeListener != null) {
                    onModeChangeListener.onModeChanged(i2, 0);
                }
            }
        }
    }

    private void bindMedia(Layout layout) {
        layout.icon.setImageResource(R.drawable.filled_forward);
        layout.icon.setVisibility(0);
        layout.linkImage.setVisibility(8);
        layout.imagesContainer.setVisibility(0);
        layout.closeButton.setVisibility(8);
        layout.container.setClickable(true);
        ArrayList arrayList = this.mediaEntries;
        if (arrayList == null || arrayList.isEmpty()) {
            layout.name.setText("");
            layout.obj.setText("");
            for (BackupImageView backupImageView : layout.images) {
                backupImageView.setVisibility(8);
            }
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((MediaController.PhotoEntry) obj).isVideo) {
                i2++;
            } else {
                i3++;
            }
        }
        int size2 = arrayList.size();
        if (size2 == 1) {
            layout.name.setText(LocaleController.getString(((MediaController.PhotoEntry) arrayList.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto));
        } else if (i2 == 0) {
            layout.name.setText(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]));
        } else if (i3 == 0) {
            layout.name.setText(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]));
        } else {
            layout.name.setText(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]));
        }
        layout.obj.setText(buildRecipientText(layout));
        bindThumb(layout.images[0], arrayList.size() > 0 ? (MediaController.PhotoEntry) arrayList.get(0) : null);
        bindThumb(layout.images[1], arrayList.size() > 1 ? (MediaController.PhotoEntry) arrayList.get(1) : null);
        bindThumb(layout.images[2], arrayList.size() > 2 ? (MediaController.PhotoEntry) arrayList.get(2) : null);
    }

    private void bindLinkLoading(Layout layout, String str) {
        layout.icon.setImageResource(R.drawable.msg_link2);
        layout.icon.setVisibility(0);
        layout.imagesContainer.setVisibility(8);
        layout.linkImage.setVisibility(8);
        layout.closeButton.setVisibility(0);
        layout.name.setText(LocaleController.getString(R.string.GettingLinkInfo));
        SimpleTextView simpleTextView = layout.obj;
        if (str == null) {
            str = "";
        }
        simpleTextView.setText(str);
        layout.container.setClickable(false);
    }

    private void bindLinkLoaded(Layout layout, TLRPC.WebPage webPage, String str) {
        layout.icon.setImageResource(R.drawable.msg_link2);
        layout.icon.setVisibility(0);
        layout.imagesContainer.setVisibility(8);
        layout.closeButton.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        layout.name.setText(str2);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null && (str3 = webPage.display_url) == null) {
            str3 = str;
        }
        layout.obj.setText(str3);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                layout.linkImage.setRoundRadius(AndroidUtilities.dp(4.0f));
                layout.linkImage.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", (String) null, 0L, 1, webPage);
                layout.linkImage.setVisibility(0);
            } else {
                layout.linkImage.setVisibility(8);
            }
        } else {
            layout.linkImage.setVisibility(8);
        }
        layout.container.setClickable(false);
    }

    private void bindThumb(BackupImageView backupImageView, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            backupImageView.setVisibility(8);
            return;
        }
        backupImageView.setVisibility(0);
        backupImageView.setOrientation(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            backupImageView.setImage(str, null, null);
            return;
        }
        if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            backupImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        backupImageView.setImageDrawable(null);
    }

    private CharSequence buildRecipientText(Layout layout) {
        String shortName;
        if (this.recipients.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.recipients;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long jLongValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (jLongValue == this.selfId) {
                sb.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                if (this.recipients.size() == 1) {
                    shortName = DialogObject.getName(this.currentAccount, jLongValue);
                } else {
                    shortName = DialogObject.getShortName(this.currentAccount, jLongValue);
                }
                sb.append(shortName);
            }
        }
        String string = LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        return (this.recipients.size() > 2 || layout.obj.getPaint().measureText(string) > ((float) (layout.obj.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : layout.obj.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", this.recipients.size(), new Object[0]) : string;
    }

    public void startHintRotation(CharSequence charSequence) {
        stopHintRotation();
        this.pendingHintText = charSequence;
        applyHintText(current());
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ShareTopView.$r8$lambda$Nb22ItWQJ08gUUbIUXFzK7iiFYw(this.f$0);
            }
        };
        this.hintRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    public static void $r8$lambda$Nb22ItWQJ08gUUbIUXFzK7iiFYw(ShareTopView shareTopView) {
        if (shareTopView.currentMode != 1) {
            for (Layout layout : shareTopView.layouts) {
                layout.obj.setAlpha(1.0f);
                layout.obj.setScaleX(1.0f);
                layout.obj.setScaleY(1.0f);
                layout.objHint.setAlpha(0.0f);
            }
            shareTopView.showingHint = false;
            AndroidUtilities.runOnUIThread(shareTopView.hintRunnable, 4000L);
            return;
        }
        shareTopView.showingHint = !shareTopView.showingHint;
        for (Layout layout2 : shareTopView.layouts) {
            layout2.obj.setPivotX(0.0f);
            layout2.objHint.setPivotX(0.0f);
            if (shareTopView.showingHint) {
                layout2.obj.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                layout2.objHint.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                layout2.obj.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                layout2.objHint.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
            }
        }
        AndroidUtilities.runOnUIThread(shareTopView.hintRunnable, 4000L);
    }

    public void stopHintRotation() {
        Runnable runnable = this.hintRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hintRunnable = null;
        }
        this.showingHint = false;
        for (Layout layout : this.layouts) {
            layout.obj.setAlpha(1.0f);
            layout.obj.setScaleX(1.0f);
            layout.obj.setScaleY(1.0f);
            layout.objHint.setAlpha(0.0f);
        }
    }

    private void applyHintText(Layout layout) {
        CharSequence charSequence = this.pendingHintText;
        if (charSequence != null) {
            layout.objHint.setText(charSequence);
        }
    }

    public static String extractFirstUrl(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
                if (matcher.find()) {
                    return charSequence.subSequence(matcher.start(), matcher.end()).toString();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public class Layout extends FrameLayout {
        public boolean active;
        public final ImageView closeButton;
        public final LinearLayout container;
        public final ImageView icon;
        public final BackupImageView[] images;
        public final FrameLayout imagesContainer;
        public final BackupImageView linkImage;
        public final SimpleTextView name;
        public final SimpleTextView obj;
        public final SimpleTextView objHint;
        public final FrameLayout textLayout;

        public Layout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.active = true;
            LinearLayout linearLayout = new LinearLayout(context);
            this.container = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 20, 20, 6, 6));
            ScaleStateListAnimator.apply(linearLayout, 0.02f, 1.2f);
            addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
            ImageView imageView = new ImageView(context);
            this.icon = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_replyPanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(imageView, LayoutHelper.createLinear(40, 38, 51));
            FrameLayout frameLayout = new FrameLayout(context);
            this.imagesContainer = frameLayout;
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-2, -1, 115, 6, 0, 0, 0));
            this.images = new BackupImageView[3];
            for (int i = 2; i >= 0; i--) {
                this.images[i] = new BackupImageView(context);
                this.images[i].setRoundRadius(AndroidUtilities.dp(6.0f));
                this.images[i].setVisibility(8);
                int i2 = 32 - (i * 4);
                this.imagesContainer.addView(this.images[i], LayoutHelper.createFrame(i2, i2, 19, i * 12, 0.0f, 0.0f, 0.0f));
            }
            BackupImageView backupImageView = new BackupImageView(context);
            this.linkImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
            backupImageView.setVisibility(8);
            this.container.addView(backupImageView, LayoutHelper.createLinear(34, 34, 19, 6, 0, 0, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.textLayout = frameLayout2;
            this.container.addView(frameLayout2, LayoutHelper.createLinear(0, -1, 1.0f, 119));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.name = simpleTextView;
            simpleTextView.setTextSize(14);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextColor(Theme.getColor(Theme.key_chat_replyPanelName, resourcesProvider));
            frameLayout2.addView(simpleTextView, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.obj = simpleTextView2;
            simpleTextView2.setTextSize(14);
            int i3 = Theme.key_glass_defaultText;
            simpleTextView2.setTextColor(Theme.getColor(i3, resourcesProvider));
            frameLayout2.addView(simpleTextView2, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.objHint = simpleTextView3;
            simpleTextView3.setTextSize(14);
            simpleTextView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            simpleTextView3.setAlpha(0.0f);
            frameLayout2.addView(simpleTextView3, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.closeButton = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.input_clear);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(18.0f)));
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ShareTopView.this.dismissWebPagePreview();
                }
            });
            this.container.addView(imageView2, LayoutHelper.createLinear(36, 36, 21, 0, 0, 4, 0));
        }
    }
}
