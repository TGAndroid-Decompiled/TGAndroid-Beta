package org.telegram.ui.Components;

import android.app.Activity;
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
import java.util.regex.Matcher;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda75;

public final class ShareTopView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public int currentAccount;
    public int currentMode;
    public String dismissedMessage;
    public final ArrayList foundUrls;
    public SeekBarView$$ExternalSyntheticLambda1 hintRunnable;
    public final Layout[] layouts;
    public final HashMap linkPreviewCache;
    public int linkRequestId;
    public int linkRequestSerial;
    public boolean linkSearchEnabled;
    public TLRPC.WebPage loadedWebPage;
    public ArrayList mediaEntries;
    public OnModeChangeListener modeChangeListener;
    public String pendingHintText;
    public boolean previewEnabled;
    public final ArrayList recipients;
    public long selfId;
    public boolean showingHint;

    public final class Layout extends FrameLayout {
        public final ImageView closeButton;
        public final LinearLayout container;
        public final ImageView icon;
        public final BackupImageView[] images;
        public final FrameLayout imagesContainer;
        public final BackupImageView linkImage;
        public final SimpleTextView name;
        public final SimpleTextView obj;
        public final SimpleTextView objHint;

        public Layout(Activity activity, Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            LinearLayout linearLayout = new LinearLayout(activity);
            this.container = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 20, 20, 6, 6));
            ScaleStateListAnimator.apply(linearLayout, 0.02f, 1.2f);
            addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
            ImageView imageView = new ImageView(activity);
            this.icon = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_replyPanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(imageView, LayoutHelper.createLinear(40, 38, 51));
            FrameLayout frameLayout = new FrameLayout(activity);
            this.imagesContainer = frameLayout;
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-2, -1, 115, 6, 0, 0, 0));
            this.images = new BackupImageView[3];
            for (int i = 2; i >= 0; i--) {
                this.images[i] = new BackupImageView(activity);
                this.images[i].setRoundRadius(AndroidUtilities.dp(6.0f));
                this.images[i].setVisibility(8);
                int i2 = 32 - (i * 4);
                this.imagesContainer.addView(this.images[i], LayoutHelper.createFrame(i2, i2, 19, i * 12, 0.0f, 0.0f, 0.0f));
            }
            BackupImageView backupImageView = new BackupImageView(activity);
            this.linkImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
            backupImageView.setVisibility(8);
            this.container.addView(backupImageView, LayoutHelper.createLinear(34, 34, 19, 6, 0, 0, 0));
            FrameLayout frameLayout2 = new FrameLayout(activity);
            this.container.addView(frameLayout2, LayoutHelper.createLinear(0, -1, 1.0f, 119));
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.name = simpleTextView;
            simpleTextView.setTextSize(14);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextColor(Theme.getColor(Theme.key_chat_replyPanelName, resourcesProvider));
            frameLayout2.addView(simpleTextView, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(activity);
            this.obj = simpleTextView2;
            simpleTextView2.setTextSize(14);
            int i3 = Theme.key_glass_defaultText;
            simpleTextView2.setTextColor(Theme.getColor(i3, resourcesProvider));
            frameLayout2.addView(simpleTextView2, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(activity);
            this.objHint = simpleTextView3;
            simpleTextView3.setTextSize(14);
            simpleTextView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            simpleTextView3.setAlpha(0.0f);
            frameLayout2.addView(simpleTextView3, LayoutHelper.createFrame(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
            ImageView imageView2 = new ImageView(activity);
            this.closeButton = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.input_clear);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(18.0f)));
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 28));
            this.container.addView(imageView2, LayoutHelper.createLinear(36, 36, 21, 0, 0, 4, 0));
        }
    }

    public interface OnModeChangeListener {
    }

    public ShareTopView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.layouts = new Layout[2];
        this.currentMode = 0;
        this.recipients = new ArrayList();
        this.previewEnabled = true;
        this.foundUrls = new ArrayList();
        this.linkPreviewCache = new HashMap();
        int i = 0;
        while (true) {
            Layout[] layoutArr = this.layouts;
            if (i >= layoutArr.length) {
                layoutArr[0].setVisibility(0);
                this.layouts[1].setVisibility(8);
                return;
            } else {
                layoutArr[i] = new Layout(activity, resourcesProvider);
                addView(this.layouts[i], LayoutHelper.createFrame(-1.0f, -1));
                i++;
            }
        }
    }

    public static void bindLinkLoaded(Layout layout, TLRPC.WebPage webPage, String str) {
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
        layout.name.setText(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null && (str3 = webPage.display_url) == null) {
            str3 = str;
        }
        layout.obj.setText(str3, false);
        TLRPC.Photo photo = webPage.photo;
        BackupImageView backupImageView = layout.linkImage;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
                backupImageView.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", null, 0L, null, webPage, 1);
                backupImageView.onNewImageSet();
                backupImageView.setVisibility(0);
            } else {
                backupImageView.setVisibility(8);
            }
        } else {
            backupImageView.setVisibility(8);
        }
        layout.container.setClickable(false);
    }

    public static void bindThumb(BackupImageView backupImageView, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            backupImageView.setVisibility(8);
            return;
        }
        backupImageView.setVisibility(0);
        backupImageView.imageReceiver.setOrientation(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            backupImageView.setImage(str, null, null);
            return;
        }
        if (photoEntry.path == null) {
            backupImageView.setImageDrawable(null);
            return;
        }
        if (photoEntry.isVideo) {
            backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        backupImageView.imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
    }

    public final String buildRecipientText(Layout layout) {
        ArrayList arrayList = this.recipients;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
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
                sb.append(arrayList.size() == 1 ? DialogObject.getName(this.currentAccount, jLongValue) : DialogObject.getShortName(this.currentAccount, jLongValue));
            }
        }
        String string = LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        SimpleTextView simpleTextView = layout.obj;
        return (arrayList.size() > 2 || simpleTextView.getPaint().measureText(string) > ((float) (simpleTextView.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : simpleTextView.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]) : string;
    }

    public final void cancelLinkRequest() {
        if (this.linkRequestId != 0) {
            AccountInstance.getInstance(this.currentAccount).getConnectionsManager().cancelRequest(this.linkRequestId, true);
            this.linkRequestId = 0;
        }
        this.linkRequestSerial++;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didReceivedWebpagesInUpdates && this.loadedWebPage != null && i2 == this.currentAccount) {
            LongSparseArray longSparseArray = (LongSparseArray) objArr[0];
            for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) longSparseArray.valueAt(i3);
                if (webPage != null && webPage.id == this.loadedWebPage.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.loadedWebPage = null;
                        cancelLinkRequest();
                        if (this.currentMode != 0) {
                            this.currentMode = 0;
                            OnModeChangeListener onModeChangeListener = this.modeChangeListener;
                            if (onModeChangeListener != null) {
                                ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener).onModeChanged(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.loadedWebPage = webPage;
                        ArrayList arrayList = this.foundUrls;
                        String string = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap map = this.linkPreviewCache;
                        if (!map.containsKey(string)) {
                            map.put(string, webPage);
                        }
                        bindLinkLoaded(this.layouts[0], webPage, string);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void doLinkSearch(CharSequence charSequence, boolean z) {
        ArrayList arrayList;
        OnModeChangeListener onModeChangeListener;
        boolean zIsEmpty;
        if (charSequence == null || charSequence.length() == 0) {
            arrayList = null;
        } else {
            try {
                Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
                arrayList = null;
                while (matcher.find()) {
                    try {
                        if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                arrayList = null;
            }
        }
        ArrayList arrayList2 = this.foundUrls;
        if (!z) {
            if (arrayList != null) {
                if (arrayList.size() == arrayList2.size()) {
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            zIsEmpty = true;
                            break;
                        } else {
                            if (!TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                                zIsEmpty = false;
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    zIsEmpty = false;
                    break;
                }
            } else {
                zIsEmpty = arrayList2.isEmpty();
            }
            if (zIsEmpty) {
                return;
            }
        }
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            cancelLinkRequest();
            this.loadedWebPage = null;
            if (this.currentMode != 0) {
                this.currentMode = 0;
                OnModeChangeListener onModeChangeListener2 = this.modeChangeListener;
                if (onModeChangeListener2 != null) {
                    ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener2).onModeChanged(0);
                    return;
                }
                return;
            }
            return;
        }
        String string = TextUtils.join(" ", arrayList).toString();
        if (!this.previewEnabled) {
            String str = this.dismissedMessage;
            if (str != null && str.equals(string)) {
                return;
            }
            this.previewEnabled = true;
            this.dismissedMessage = null;
        }
        int i2 = this.currentMode;
        boolean z2 = (i2 == 2 || i2 == 0) ? false : true;
        if (i2 != 2) {
            this.currentMode = 2;
        }
        if (z2) {
            switchLayouts();
        }
        TLRPC.WebPage webPage = (TLRPC.WebPage) this.linkPreviewCache.get(string);
        Layout[] layoutArr = this.layouts;
        if (webPage != null) {
            this.loadedWebPage = webPage;
            bindLinkLoaded(layoutArr[0], webPage, string);
        } else {
            Layout layout = layoutArr[0];
            layout.icon.setImageResource(R.drawable.msg_link2);
            layout.icon.setVisibility(0);
            layout.imagesContainer.setVisibility(8);
            layout.linkImage.setVisibility(8);
            layout.closeButton.setVisibility(0);
            layout.name.setText(LocaleController.getString(R.string.GettingLinkInfo), false);
            layout.obj.setText(string == null ? "" : string, false);
            layout.container.setClickable(false);
            cancelLinkRequest();
            if (string != null && !string.isEmpty()) {
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = string;
                int i3 = this.linkRequestSerial + 1;
                this.linkRequestSerial = i3;
                this.linkRequestId = AccountInstance.getInstance(this.currentAccount).getConnectionsManager().sendRequest(getwebpagepreview, new ProfileActivity$$ExternalSyntheticLambda75(this, i3, string, 9));
            }
        }
        Layout layout2 = layoutArr[0];
        String str2 = this.pendingHintText;
        if (str2 != null) {
            layout2.objHint.setText(str2, false);
        }
        int i4 = this.currentMode;
        if (i2 == i4 || (onModeChangeListener = this.modeChangeListener) == null) {
            return;
        }
        ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener).onModeChanged(i4);
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.loadedWebPage;
    }

    public int getMode() {
        return this.currentMode;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        cancelLinkRequest();
    }

    public final void rebindObserver(int i) {
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

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (Layout layout : this.layouts) {
            layout.container.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(OnModeChangeListener onModeChangeListener) {
        this.modeChangeListener = onModeChangeListener;
    }

    public final void setSharedMedia(int i, ArrayList arrayList) {
        OnModeChangeListener onModeChangeListener;
        rebindObserver(i);
        this.selfId = AccountInstance.getInstance(i).getUserConfig().getClientUserId();
        this.mediaEntries = arrayList;
        this.linkSearchEnabled = false;
        this.loadedWebPage = null;
        cancelLinkRequest();
        this.foundUrls.clear();
        int i2 = this.currentMode;
        boolean z = (i2 == 1 || i2 == 0) ? false : true;
        this.currentMode = 1;
        if (z) {
            switchLayouts();
        }
        Layout[] layoutArr = this.layouts;
        Layout layout = layoutArr[0];
        layout.icon.setImageResource(R.drawable.filled_forward);
        layout.icon.setVisibility(0);
        layout.linkImage.setVisibility(8);
        layout.imagesContainer.setVisibility(0);
        layout.closeButton.setVisibility(8);
        layout.container.setClickable(true);
        ArrayList arrayList2 = this.mediaEntries;
        SimpleTextView simpleTextView = layout.obj;
        SimpleTextView simpleTextView2 = layout.name;
        BackupImageView[] backupImageViewArr = layout.images;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            simpleTextView2.setText("", false);
            simpleTextView.setText("", false);
            for (BackupImageView backupImageView : backupImageViewArr) {
                backupImageView.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i4++;
                } else {
                    i5++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                simpleTextView2.setText(LocaleController.getString(((MediaController.PhotoEntry) arrayList2.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto), false);
            } else if (i4 == 0) {
                simpleTextView2.setText(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i5 == 0) {
                simpleTextView2.setText(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                simpleTextView2.setText(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            simpleTextView.setText(buildRecipientText(layout), false);
            bindThumb(backupImageViewArr[0], arrayList2.size() > 0 ? (MediaController.PhotoEntry) arrayList2.get(0) : null);
            bindThumb(backupImageViewArr[1], arrayList2.size() > 1 ? (MediaController.PhotoEntry) arrayList2.get(1) : null);
            bindThumb(backupImageViewArr[2], arrayList2.size() > 2 ? (MediaController.PhotoEntry) arrayList2.get(2) : null);
        }
        Layout layout2 = layoutArr[0];
        String str = this.pendingHintText;
        if (str != null) {
            layout2.objHint.setText(str, false);
        }
        int i6 = this.currentMode;
        if (i2 == i6 || (onModeChangeListener = this.modeChangeListener) == null) {
            return;
        }
        ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener).onModeChanged(i6);
    }

    public final void stopHintRotation() {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.hintRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            this.hintRunnable = null;
        }
        this.showingHint = false;
        for (Layout layout : this.layouts) {
            layout.obj.setAlpha(1.0f);
            SimpleTextView simpleTextView = layout.obj;
            simpleTextView.setScaleX(1.0f);
            simpleTextView.setScaleY(1.0f);
            layout.objHint.setAlpha(0.0f);
        }
    }

    public final void switchLayouts() {
        Layout[] layoutArr = this.layouts;
        Layout layout = layoutArr[0];
        Layout layout2 = layoutArr[1];
        layoutArr[0] = layout2;
        layoutArr[1] = layout;
        layout2.getClass();
        layoutArr[0].setVisibility(0);
        layoutArr[0].setScaleX(0.8f);
        layoutArr[0].setScaleY(0.8f);
        layoutArr[0].setAlpha(0.0f);
        layoutArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = layoutArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 320L);
        Layout layout3 = layoutArr[1];
        layout3.getClass();
        layout3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new SeekBarView$$ExternalSyntheticLambda1(layout3, 14)).start();
    }
}
