package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.util.Property;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_installStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSetInstallResultArchive;
import org.telegram.tgnet.TLRPC$TL_stickers_checkShortName;
import org.telegram.tgnet.TLRPC$TL_stickers_suggestShortName;
import org.telegram.tgnet.TLRPC$TL_stickers_suggestedShortName;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.ContentPreviewViewer;

public class StickersAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private GridAdapter adapter;
    private List<ThemeDescription> animatingDescriptions;
    private String buttonTextColorKey;
    private int checkReqId;
    private Runnable checkRunnable;
    private boolean clearsInputField;
    private StickersAlertDelegate delegate;
    private FrameLayout emptyView;
    private RecyclerListView gridView;
    private boolean ignoreLayout;
    private String importingSoftware;
    private ArrayList<Parcelable> importingStickers;
    private ArrayList<SendMessagesHelper.ImportingSticker> importingStickersPaths;
    private TLRPC$InputStickerSet inputStickerSet;
    private StickersAlertInstallDelegate installDelegate;
    private int itemSize;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private GridLayoutManager layoutManager;
    private Runnable onDismissListener;
    private ActionBarMenuItem optionsButton;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private TextView pickerBottomLayout;
    private ContentPreviewViewer.ContentPreviewViewerDelegate previewDelegate;
    private TextView previewSendButton;
    private View previewSendButtonShadow;
    private int reqId;
    private int scrollOffsetY;
    private TLRPC$Document selectedSticker;
    private SendMessagesHelper.ImportingSticker selectedStickerPath;
    private String setTitle;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private boolean showEmoji;
    private boolean showTooltipWhenToggle;
    private TextView stickerEmojiTextView;
    private BackupImageView stickerImageView;
    private FrameLayout stickerPreviewLayout;
    private TLRPC$TL_messages_stickerSet stickerSet;
    private ArrayList<TLRPC$StickerSetCovered> stickerSetCovereds;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private TextView titleTextView;
    private HashMap<String, SendMessagesHelper.ImportingSticker> uploadImportStickers;
    private Pattern urlPattern;

    public interface StickersAlertDelegate {
        boolean canSchedule();

        boolean isInScheduleMode();

        void onStickerSelected(TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i);
    }

    public interface StickersAlertInstallDelegate {
        void onStickerSetInstalled();

        void onStickerSetUninstalled();
    }

    public static boolean lambda$init$9(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$showNameEnterAlert$20(DialogInterface dialogInterface, int i) {
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public static class LinkMovementMethodMy extends LinkMovementMethod {
        private LinkMovementMethodMy() {
        }

        @Override
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            try {
                boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    Selection.removeSelection(spannable);
                }
                return onTouchEvent;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public StickersAlert(Context context, final Object obj, TLObject tLObject, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.previewDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
            @Override
            public String getQuery(boolean z) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
            }

            @Override
            public void gifAddedOrDeleted() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
            }

            @Override
            public boolean needMenu() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
            }

            @Override
            public boolean needOpen() {
                return false;
            }

            @Override
            public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
            }

            @Override
            public void sendGif(Object obj2, Object obj3, boolean z, int i) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj2, obj3, z, i);
            }

            @Override
            public void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj2, boolean z, int i) {
                if (StickersAlert.this.delegate != null) {
                    StickersAlert.this.delegate.onStickerSelected(tLRPC$Document, str, obj2, null, StickersAlert.this.clearsInputField, z, i);
                    StickersAlert.this.dismiss();
                }
            }

            @Override
            public boolean canSchedule() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.canSchedule();
            }

            @Override
            public boolean isInScheduleMode() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.isInScheduleMode();
            }

            @Override
            public boolean needRemove() {
                return StickersAlert.this.importingStickers != null;
            }

            @Override
            public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                StickersAlert.this.removeSticker(importingSticker);
            }

            @Override
            public boolean needSend() {
                return StickersAlert.this.previewSendButton.getVisibility() == 0 && StickersAlert.this.importingStickers == null;
            }

            @Override
            public long getDialogId() {
                if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                    return ((ChatActivity) StickersAlert.this.parentFragment).getDialogId();
                }
                return 0L;
            }
        };
        fixNavigationBar();
        this.resourcesProvider = resourcesProvider;
        this.parentActivity = (Activity) context;
        final TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers = new TLRPC$TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC$Photo) {
            TLRPC$Photo tLRPC$Photo = (TLRPC$Photo) tLObject;
            TLRPC$TL_inputStickeredMediaPhoto tLRPC$TL_inputStickeredMediaPhoto = new TLRPC$TL_inputStickeredMediaPhoto();
            TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
            tLRPC$TL_inputStickeredMediaPhoto.id = tLRPC$TL_inputPhoto;
            tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
            tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
            byte[] bArr = tLRPC$Photo.file_reference;
            tLRPC$TL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tLRPC$TL_inputPhoto.file_reference = new byte[0];
            }
            tLRPC$TL_messages_getAttachedStickers.media = tLRPC$TL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC$Document) {
            TLRPC$Document tLRPC$Document = (TLRPC$Document) tLObject;
            TLRPC$TL_inputStickeredMediaDocument tLRPC$TL_inputStickeredMediaDocument = new TLRPC$TL_inputStickeredMediaDocument();
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_inputStickeredMediaDocument.id = tLRPC$TL_inputDocument;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            byte[] bArr2 = tLRPC$Document.file_reference;
            tLRPC$TL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tLRPC$TL_inputDocument.file_reference = new byte[0];
            }
            tLRPC$TL_messages_getAttachedStickers.media = tLRPC$TL_inputStickeredMediaDocument;
        }
        final RequestDelegate stickersAlert$$ExternalSyntheticLambda30 = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$new$1(tLRPC$TL_messages_getAttachedStickers, tLObject2, tLRPC$TL_error);
            }
        };
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getAttachedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$new$2(obj, tLRPC$TL_messages_getAttachedStickers, stickersAlert$$ExternalSyntheticLambda30, tLObject2, tLRPC$TL_error);
            }
        });
        init(context);
    }

    public void lambda$new$1(final TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$new$0(tLRPC$TL_error, tLObject, tLRPC$TL_messages_getAttachedStickers);
            }
        });
    }

    public void lambda$new$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers) {
        this.reqId = 0;
        if (tLRPC$TL_error == null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            if (tLRPC$Vector.objects.isEmpty()) {
                dismiss();
            } else if (tLRPC$Vector.objects.size() == 1) {
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                this.inputStickerSet = tLRPC$TL_inputStickerSetID;
                TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$StickerSetCovered) tLRPC$Vector.objects.get(0)).set;
                tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                loadStickerSet();
            } else {
                this.stickerSetCovereds = new ArrayList<>();
                for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                    this.stickerSetCovereds.add((TLRPC$StickerSetCovered) tLRPC$Vector.objects.get(i));
                }
                this.gridView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                this.titleTextView.setVisibility(8);
                this.shadow[0].setVisibility(8);
                this.adapter.notifyDataSetChanged();
            }
        } else {
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.parentFragment, tLRPC$TL_messages_getAttachedStickers, new Object[0]);
            dismiss();
        }
    }

    public void lambda$new$2(Object obj, TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers, RequestDelegate requestDelegate, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text) || obj == null) {
            requestDelegate.run(tLObject, tLRPC$TL_error);
        } else {
            FileRefController.getInstance(this.currentAccount).requestReference(obj, tLRPC$TL_messages_getAttachedStickers, requestDelegate);
        }
    }

    public StickersAlert(Context context, String str, final ArrayList<Parcelable> arrayList, final ArrayList<String> arrayList2, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.previewDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
            @Override
            public String getQuery(boolean z) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
            }

            @Override
            public void gifAddedOrDeleted() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
            }

            @Override
            public boolean needMenu() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
            }

            @Override
            public boolean needOpen() {
                return false;
            }

            @Override
            public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
            }

            @Override
            public void sendGif(Object obj2, Object obj3, boolean z, int i) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj2, obj3, z, i);
            }

            @Override
            public void sendSticker(TLRPC$Document tLRPC$Document, String str2, Object obj2, boolean z, int i) {
                if (StickersAlert.this.delegate != null) {
                    StickersAlert.this.delegate.onStickerSelected(tLRPC$Document, str2, obj2, null, StickersAlert.this.clearsInputField, z, i);
                    StickersAlert.this.dismiss();
                }
            }

            @Override
            public boolean canSchedule() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.canSchedule();
            }

            @Override
            public boolean isInScheduleMode() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.isInScheduleMode();
            }

            @Override
            public boolean needRemove() {
                return StickersAlert.this.importingStickers != null;
            }

            @Override
            public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                StickersAlert.this.removeSticker(importingSticker);
            }

            @Override
            public boolean needSend() {
                return StickersAlert.this.previewSendButton.getVisibility() == 0 && StickersAlert.this.importingStickers == null;
            }

            @Override
            public long getDialogId() {
                if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                    return ((ChatActivity) StickersAlert.this.parentFragment).getDialogId();
                }
                return 0L;
            }
        };
        fixNavigationBar();
        this.parentActivity = (Activity) context;
        this.importingStickers = arrayList;
        this.importingSoftware = str;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$new$4(arrayList, arrayList2);
            }
        });
        init(context);
    }

    public void lambda$new$4(ArrayList arrayList, ArrayList arrayList2) {
        Uri uri;
        String stickerExt;
        int i;
        final ArrayList arrayList3 = new ArrayList();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int size = arrayList.size();
        final Boolean bool = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if ((obj instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj))) != null) {
                boolean equals = "tgs".equals(stickerExt);
                if (bool == null) {
                    bool = Boolean.valueOf(equals);
                } else if (bool.booleanValue() != equals) {
                    continue;
                }
                if (!isDismissed()) {
                    SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                    importingSticker.animated = equals;
                    String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                    importingSticker.path = copyFileToCache;
                    if (copyFileToCache != null) {
                        if (!equals) {
                            BitmapFactory.decodeFile(copyFileToCache, options);
                            int i3 = options.outWidth;
                            if ((i3 == 512 && (i = options.outHeight) > 0 && i <= 512) || (options.outHeight == 512 && i3 > 0 && i3 <= 512)) {
                                importingSticker.mimeType = "image/" + stickerExt;
                                importingSticker.validated = true;
                            }
                        } else {
                            importingSticker.mimeType = "application/x-tgsticker";
                        }
                        if (arrayList2 == null || arrayList2.size() != size || !(arrayList2.get(i2) instanceof String)) {
                            importingSticker.emoji = "#️⃣";
                        } else {
                            importingSticker.emoji = (String) arrayList2.get(i2);
                        }
                        arrayList3.add(importingSticker);
                        if (arrayList3.size() >= 200) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$new$3(arrayList3, bool);
            }
        });
    }

    public void lambda$new$3(ArrayList arrayList, Boolean bool) {
        this.importingStickersPaths = arrayList;
        if (arrayList.isEmpty()) {
            dismiss();
            return;
        }
        this.adapter.notifyDataSetChanged();
        if (bool.booleanValue()) {
            this.uploadImportStickers = new HashMap<>();
            int size = this.importingStickersPaths.size();
            for (int i = 0; i < size; i++) {
                SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
                this.uploadImportStickers.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(this.currentAccount).uploadFile(importingSticker.path, false, true, ConnectionsManager.FileTypeFile);
            }
        }
        updateFields();
    }

    public StickersAlert(Context context, BaseFragment baseFragment, TLRPC$InputStickerSet tLRPC$InputStickerSet, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, StickersAlertDelegate stickersAlertDelegate) {
        this(context, baseFragment, tLRPC$InputStickerSet, tLRPC$TL_messages_stickerSet, stickersAlertDelegate, null);
    }

    public StickersAlert(Context context, BaseFragment baseFragment, TLRPC$InputStickerSet tLRPC$InputStickerSet, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, StickersAlertDelegate stickersAlertDelegate, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.previewDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
            @Override
            public String getQuery(boolean z) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
            }

            @Override
            public void gifAddedOrDeleted() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
            }

            @Override
            public boolean needMenu() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
            }

            @Override
            public boolean needOpen() {
                return false;
            }

            @Override
            public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet2, boolean z) {
            }

            @Override
            public void sendGif(Object obj2, Object obj3, boolean z, int i) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj2, obj3, z, i);
            }

            @Override
            public void sendSticker(TLRPC$Document tLRPC$Document, String str2, Object obj2, boolean z, int i) {
                if (StickersAlert.this.delegate != null) {
                    StickersAlert.this.delegate.onStickerSelected(tLRPC$Document, str2, obj2, null, StickersAlert.this.clearsInputField, z, i);
                    StickersAlert.this.dismiss();
                }
            }

            @Override
            public boolean canSchedule() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.canSchedule();
            }

            @Override
            public boolean isInScheduleMode() {
                return StickersAlert.this.delegate != null && StickersAlert.this.delegate.isInScheduleMode();
            }

            @Override
            public boolean needRemove() {
                return StickersAlert.this.importingStickers != null;
            }

            @Override
            public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                StickersAlert.this.removeSticker(importingSticker);
            }

            @Override
            public boolean needSend() {
                return StickersAlert.this.previewSendButton.getVisibility() == 0 && StickersAlert.this.importingStickers == null;
            }

            @Override
            public long getDialogId() {
                if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                    return ((ChatActivity) StickersAlert.this.parentFragment).getDialogId();
                }
                return 0L;
            }
        };
        fixNavigationBar();
        this.delegate = stickersAlertDelegate;
        this.inputStickerSet = tLRPC$InputStickerSet;
        this.stickerSet = tLRPC$TL_messages_stickerSet;
        this.parentFragment = baseFragment;
        loadStickerSet();
        init(context);
    }

    public void setClearsInputField(boolean z) {
        this.clearsInputField = z;
    }

    private void loadStickerSet() {
        String str;
        if (this.inputStickerSet != null) {
            final MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.stickerSet == null && (str = this.inputStickerSet.short_name) != null) {
                this.stickerSet = mediaDataController.getStickerSetByName(str);
            }
            if (this.stickerSet == null) {
                this.stickerSet = mediaDataController.getStickerSetById(this.inputStickerSet.id);
            }
            if (this.stickerSet == null) {
                TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                tLRPC$TL_messages_getStickerSet.stickerset = this.inputStickerSet;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StickersAlert.this.lambda$loadStickerSet$6(mediaDataController, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                if (this.adapter != null) {
                    updateSendButton();
                    updateFields();
                    this.adapter.notifyDataSetChanged();
                }
                mediaDataController.preloadStickerSetThumb(this.stickerSet);
            }
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        if (tLRPC$TL_messages_stickerSet != null) {
            this.showEmoji = !tLRPC$TL_messages_stickerSet.set.masks;
        }
    }

    public void lambda$loadStickerSet$6(final MediaDataController mediaDataController, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$loadStickerSet$5(tLRPC$TL_error, tLObject, mediaDataController);
            }
        });
    }

    public void lambda$loadStickerSet$5(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, MediaDataController mediaDataController) {
        this.reqId = 0;
        if (tLRPC$TL_error == null) {
            if (Build.VERSION.SDK_INT >= 19) {
                AnonymousClass2 r3 = new AnonymousClass2();
                r3.addTarget(this.containerView);
                TransitionManager.beginDelayedTransition(this.container, r3);
            }
            this.optionsButton.setVisibility(0);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            this.stickerSet = tLRPC$TL_messages_stickerSet;
            this.showEmoji = !tLRPC$TL_messages_stickerSet.set.masks;
            mediaDataController.preloadStickerSetThumb(tLRPC$TL_messages_stickerSet);
            updateSendButton();
            updateFields();
            this.adapter.notifyDataSetChanged();
            return;
        }
        Toast.makeText(getContext(), LocaleController.getString("AddStickersNotFound", R.string.AddStickersNotFound), 0).show();
        dismiss();
    }

    public class AnonymousClass2 extends Transition {
        AnonymousClass2() {
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
            transitionValues.values.put("start", Boolean.TRUE);
            transitionValues.values.put("offset", Integer.valueOf(((BottomSheet) StickersAlert.this).containerView.getTop() + StickersAlert.this.scrollOffsetY));
        }

        @Override
        public void captureEndValues(TransitionValues transitionValues) {
            transitionValues.values.put("start", Boolean.FALSE);
            transitionValues.values.put("offset", Integer.valueOf(((BottomSheet) StickersAlert.this).containerView.getTop() + StickersAlert.this.scrollOffsetY));
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            final int i = StickersAlert.this.scrollOffsetY;
            final int intValue = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StickersAlert.AnonymousClass2.this.lambda$createAnimator$0(intValue, i, valueAnimator);
                }
            });
            return ofFloat;
        }

        public void lambda$createAnimator$0(int i, int i2, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            StickersAlert.this.gridView.setAlpha(animatedFraction);
            StickersAlert.this.titleTextView.setAlpha(animatedFraction);
            if (i != 0) {
                int i3 = (int) (i * (1.0f - animatedFraction));
                StickersAlert.this.setScrollOffsetY(i2 + i3);
                StickersAlert.this.gridView.setTranslationY(i3);
            }
        }
    }

    private void init(Context context) {
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean fullHeight;
            private int lastNotifyWidth;
            private RectF rect = new RectF();

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || StickersAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= StickersAlert.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                StickersAlert.this.dismiss();
                return true;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int dp;
                int i3;
                int size = View.MeasureSpec.getSize(i2);
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 21) {
                    StickersAlert.this.ignoreLayout = true;
                    setPadding(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, 0);
                    StickersAlert.this.ignoreLayout = false;
                }
                StickersAlert.this.itemSize = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f)) / 5;
                if (StickersAlert.this.importingStickers != null) {
                    dp = AndroidUtilities.dp(96.0f) + (Math.max(3, (int) Math.ceil(StickersAlert.this.importingStickers.size() / 5.0f)) * AndroidUtilities.dp(82.0f)) + ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                    i3 = AndroidUtilities.statusBarHeight;
                } else if (StickersAlert.this.stickerSetCovereds != null) {
                    dp = AndroidUtilities.dp(56.0f) + (AndroidUtilities.dp(60.0f) * StickersAlert.this.stickerSetCovereds.size()) + (StickersAlert.this.adapter.stickersRowCount * AndroidUtilities.dp(82.0f)) + ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                    i3 = AndroidUtilities.dp(24.0f);
                } else {
                    dp = AndroidUtilities.dp(96.0f) + (Math.max(3, StickersAlert.this.stickerSet != null ? (int) Math.ceil(StickersAlert.this.stickerSet.documents.size() / 5.0f) : 0) * AndroidUtilities.dp(82.0f)) + ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                    i3 = AndroidUtilities.statusBarHeight;
                }
                int i4 = dp + i3;
                int i5 = size / 5;
                double d = i5;
                Double.isNaN(d);
                int i6 = ((double) i4) < d * 3.2d ? 0 : i5 * 2;
                if (i6 != 0 && i4 < size) {
                    i6 -= size - i4;
                }
                if (i6 == 0) {
                    i6 = ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                }
                if (StickersAlert.this.stickerSetCovereds != null) {
                    i6 += AndroidUtilities.dp(8.0f);
                }
                if (StickersAlert.this.gridView.getPaddingTop() != i6) {
                    StickersAlert.this.ignoreLayout = true;
                    StickersAlert.this.gridView.setPadding(AndroidUtilities.dp(10.0f), i6, AndroidUtilities.dp(10.0f), 0);
                    StickersAlert.this.emptyView.setPadding(0, i6, 0, 0);
                    StickersAlert.this.ignoreLayout = false;
                }
                if (i4 < size) {
                    z = false;
                }
                this.fullHeight = z;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(i4, size), 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5 = i3 - i;
                if (this.lastNotifyWidth != i5) {
                    this.lastNotifyWidth = i5;
                    if (!(StickersAlert.this.adapter == null || StickersAlert.this.stickerSetCovereds == null)) {
                        StickersAlert.this.adapter.notifyDataSetChanged();
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                StickersAlert.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (!StickersAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }

            @Override
            protected void onDraw(android.graphics.Canvas r14) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.StickersAlert.AnonymousClass3.onDraw(android.graphics.Canvas):void");
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        this.shadow[0] = new View(context);
        this.shadow[0].setBackgroundColor(getThemedColor("dialogShadowLine"));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setVisibility(4);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, StickersAlert.this.gridView, 0, StickersAlert.this.previewDelegate, this.resourcesProvider);
            }

            @Override
            public void requestLayout() {
                if (!StickersAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.gridView = recyclerListView;
        recyclerListView.setTag(14);
        RecyclerListView recyclerListView2 = this.gridView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5) {
            @Override
            public boolean isLayoutRTL() {
                return StickersAlert.this.stickerSetCovereds != null && LocaleController.isRTL;
            }
        };
        this.layoutManager = gridLayoutManager;
        recyclerListView2.setLayoutManager(gridLayoutManager);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                if ((StickersAlert.this.stickerSetCovereds == null || !(StickersAlert.this.adapter.cache.get(i2) instanceof Integer)) && i2 != StickersAlert.this.adapter.totalItems) {
                    return 1;
                }
                return StickersAlert.this.adapter.stickersPerRow;
            }
        });
        RecyclerListView recyclerListView3 = this.gridView;
        GridAdapter gridAdapter = new GridAdapter(context);
        this.adapter = gridAdapter;
        recyclerListView3.setAdapter(gridAdapter);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
            }
        });
        this.gridView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.gridView.setClipToPadding(false);
        this.gridView.setEnabled(true);
        this.gridView.setGlowColor(getThemedColor("dialogScrollGlow"));
        this.gridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$init$7;
                lambda$init$7 = StickersAlert.this.lambda$init$7(view, motionEvent);
                return lambda$init$7;
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                StickersAlert.this.updateLayout();
            }
        });
        RecyclerListView.OnItemClickListener stickersAlert$$ExternalSyntheticLambda34 = new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                StickersAlert.this.lambda$init$8(view, i2);
            }
        };
        this.stickersOnItemClickListener = stickersAlert$$ExternalSyntheticLambda34;
        this.gridView.setOnItemClickListener(stickersAlert$$ExternalSyntheticLambda34);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void requestLayout() {
                if (!StickersAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.emptyView = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.gridView.setEmptyView(this.emptyView);
        this.emptyView.setOnTouchListener(StickersAlert$$ExternalSyntheticLambda13.INSTANCE);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextColor(getThemedColor("dialogTextBlack"));
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setLinkTextColor(getThemedColor("dialogTextLink"));
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.titleTextView.setGravity(16);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor("key_sheet_other"), this.resourcesProvider);
        this.optionsButton = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.optionsButton.setSubMenuOpenSide(2);
        this.optionsButton.setIcon(R.drawable.ic_ab_other);
        this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor("player_actionBarSelector"), 1));
        this.containerView.addView(this.optionsButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.optionsButton.addSubItem(1, R.drawable.msg_share, LocaleController.getString("StickersShare", R.string.StickersShare));
        this.optionsButton.addSubItem(2, R.drawable.msg_link, LocaleController.getString("CopyLink", R.string.CopyLink));
        this.optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$init$10(view);
            }
        });
        this.optionsButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i2) {
                StickersAlert.this.onSubItemClick(i2);
            }
        });
        this.optionsButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.optionsButton.setVisibility(this.inputStickerSet != null ? 0 : 8);
        this.emptyView.addView(new RadialProgressView(context), LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor("dialogShadowLine"));
        this.containerView.addView(this.shadow[1], layoutParams2);
        TextView textView2 = new TextView(context);
        this.pickerBottomLayout = textView2;
        textView2.setBackgroundDrawable(Theme.createSelectorWithBackgroundDrawable(getThemedColor("dialogBackground"), getThemedColor("listSelectorSDK21")));
        TextView textView3 = this.pickerBottomLayout;
        this.buttonTextColorKey = "dialogTextBlue2";
        textView3.setTextColor(getThemedColor("dialogTextBlue2"));
        this.pickerBottomLayout.setTextSize(1, 14.0f);
        this.pickerBottomLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.pickerBottomLayout.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.pickerBottomLayout.setGravity(17);
        this.containerView.addView(this.pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.stickerPreviewLayout = frameLayout3;
        frameLayout3.setVisibility(8);
        this.stickerPreviewLayout.setSoundEffectsEnabled(false);
        this.containerView.addView(this.stickerPreviewLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.stickerPreviewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$init$11(view);
            }
        });
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerImageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.stickerImageView.setLayerNum(7);
        this.stickerPreviewLayout.addView(this.stickerImageView);
        TextView textView4 = new TextView(context);
        this.stickerEmojiTextView = textView4;
        textView4.setTextSize(1, 30.0f);
        this.stickerEmojiTextView.setGravity(85);
        this.stickerPreviewLayout.addView(this.stickerEmojiTextView);
        TextView textView5 = new TextView(context);
        this.previewSendButton = textView5;
        textView5.setTextSize(1, 14.0f);
        this.previewSendButton.setTextColor(getThemedColor("dialogTextBlue2"));
        this.previewSendButton.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor("dialogBackground"), getThemedColor("listSelectorSDK21")));
        this.previewSendButton.setGravity(17);
        this.previewSendButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.previewSendButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.stickerPreviewLayout.addView(this.previewSendButton, LayoutHelper.createFrame(-1, 48, 83));
        this.previewSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$init$12(view);
            }
        });
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.previewSendButtonShadow = view;
        view.setBackgroundColor(getThemedColor("dialogShadowLine"));
        this.stickerPreviewLayout.addView(this.previewSendButtonShadow, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        updateFields();
        updateSendButton();
        updateColors();
        this.adapter.notifyDataSetChanged();
    }

    public boolean lambda$init$7(View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, 0, this.stickersOnItemClickListener, this.previewDelegate, this.resourcesProvider);
    }

    public void lambda$init$8(View view, int i) {
        boolean z;
        if (this.stickerSetCovereds != null) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) this.adapter.positionsToSets.get(i);
            if (tLRPC$StickerSetCovered != null) {
                dismiss();
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                TLRPC$StickerSet tLRPC$StickerSet = tLRPC$StickerSetCovered.set;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                new StickersAlert(this.parentActivity, this.parentFragment, tLRPC$TL_inputStickerSetID, null, null, this.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList<SendMessagesHelper.ImportingSticker> arrayList = this.importingStickersPaths;
        if (arrayList == null) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
            if (tLRPC$TL_messages_stickerSet != null && i >= 0 && i < tLRPC$TL_messages_stickerSet.documents.size()) {
                this.selectedSticker = this.stickerSet.documents.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= this.selectedSticker.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.selectedSticker.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                        String str = tLRPC$DocumentAttribute.alt;
                        if (str != null && str.length() > 0) {
                            TextView textView = this.stickerEmojiTextView;
                            textView.setText(Emoji.replaceEmoji(tLRPC$DocumentAttribute.alt, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                            z = true;
                        }
                    } else {
                        i2++;
                    }
                }
                z = false;
                if (!z) {
                    this.stickerEmojiTextView.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.selectedSticker.id), this.stickerEmojiTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                }
                if (!ContentPreviewViewer.getInstance().showMenuFor(view)) {
                    this.stickerImageView.getImageReceiver().setImage(ImageLocation.getForDocument(this.selectedSticker), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.selectedSticker.thumbs, 90), this.selectedSticker), (String) null, "webp", this.stickerSet, 1);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
                    layoutParams.topMargin = this.scrollOffsetY;
                    this.stickerPreviewLayout.setLayoutParams(layoutParams);
                    this.stickerPreviewLayout.setVisibility(0);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, View.ALPHA, 0.0f, 1.0f));
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                }
            }
        } else if (i >= 0 && i < arrayList.size()) {
            SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
            this.selectedStickerPath = importingSticker;
            if (importingSticker.validated) {
                TextView textView2 = this.stickerEmojiTextView;
                textView2.setText(Emoji.replaceEmoji(importingSticker.emoji, textView2.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                this.stickerImageView.setImage(ImageLocation.getForPath(this.selectedStickerPath.path), null, null, null, null, null, this.selectedStickerPath.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
                layoutParams2.topMargin = this.scrollOffsetY;
                this.stickerPreviewLayout.setLayoutParams(layoutParams2);
                this.stickerPreviewLayout.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, View.ALPHA, 0.0f, 1.0f));
                animatorSet2.setDuration(200L);
                animatorSet2.start();
            }
        }
    }

    public void lambda$init$10(View view) {
        this.optionsButton.toggleSubMenu();
    }

    public void lambda$init$11(View view) {
        hidePreview();
    }

    public void lambda$init$12(View view) {
        if (this.importingStickersPaths != null) {
            removeSticker(this.selectedStickerPath);
            hidePreview();
            this.selectedStickerPath = null;
            return;
        }
        this.delegate.onStickerSelected(this.selectedSticker, null, this.stickerSet, null, this.clearsInputField, true, 0);
        dismiss();
    }

    private void updateSendButton() {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.importingStickers != null) {
            this.previewSendButton.setText(LocaleController.getString("ImportStickersRemove", R.string.ImportStickersRemove).toUpperCase());
            this.previewSendButton.setTextColor(getThemedColor("dialogTextRed"));
            float f = min;
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.previewSendButton.setVisibility(0);
            this.previewSendButtonShadow.setVisibility(0);
        } else if (this.delegate == null || ((tLRPC$TL_messages_stickerSet = this.stickerSet) != null && tLRPC$TL_messages_stickerSet.set.masks)) {
            this.previewSendButton.setText(LocaleController.getString("Close", R.string.Close).toUpperCase());
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, min, 17));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, min, 17));
            this.previewSendButton.setVisibility(8);
            this.previewSendButtonShadow.setVisibility(8);
        } else {
            this.previewSendButton.setText(LocaleController.getString("SendSticker", R.string.SendSticker).toUpperCase());
            float f2 = min;
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.previewSendButton.setVisibility(0);
            this.previewSendButtonShadow.setVisibility(0);
        }
    }

    public void removeSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.importingStickersPaths.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.importingStickersPaths.remove(indexOf);
            this.adapter.notifyItemRemoved(indexOf);
            if (this.importingStickersPaths.isEmpty()) {
                dismiss();
            } else {
                updateFields();
            }
        }
    }

    public void setInstallDelegate(StickersAlertInstallDelegate stickersAlertInstallDelegate) {
        this.installDelegate = stickersAlertInstallDelegate;
    }

    public void onSubItemClick(int i) {
        BaseFragment baseFragment;
        if (this.stickerSet != null) {
            String str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addstickers/" + this.stickerSet.set.short_name;
            if (i == 1) {
                Context context = this.parentActivity;
                if (context == null && (baseFragment = this.parentFragment) != null) {
                    context = baseFragment.getParentActivity();
                }
                if (context == null) {
                    context = getContext();
                }
                ShareAlert shareAlert = new ShareAlert(context, null, str, false, str, false, this.resourcesProvider);
                BaseFragment baseFragment2 = this.parentFragment;
                if (baseFragment2 != null) {
                    baseFragment2.showDialog(shareAlert);
                } else {
                    shareAlert.show();
                }
            } else if (i == 2) {
                try {
                    AndroidUtilities.addToClipboard(str);
                    BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createCopyLinkBulletin().show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    private void updateFields() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.StickersAlert.updateFields():void");
    }

    public void lambda$updateFields$15(View view) {
        dismiss();
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetInstalled();
        }
        if (this.inputStickerSet != null && !MediaDataController.getInstance(this.currentAccount).cancelRemovingStickerSet(this.inputStickerSet.id)) {
            TLRPC$TL_messages_installStickerSet tLRPC$TL_messages_installStickerSet = new TLRPC$TL_messages_installStickerSet();
            tLRPC$TL_messages_installStickerSet.stickerset = this.inputStickerSet;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickersAlert.this.lambda$updateFields$14(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$updateFields$14(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$updateFields$13(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$updateFields$13(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        ?? r0 = this.stickerSet.set.masks;
        try {
            if (tLRPC$TL_error == null) {
                if (this.showTooltipWhenToggle) {
                    Bulletin.make(this.parentFragment, new StickerSetBulletinLayout(this.pickerBottomLayout.getContext(), this.stickerSet, 2, null, this.resourcesProvider), 1500).show();
                }
                if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(this.currentAccount).processStickerSetInstallResultArchive(this.parentFragment, true, r0, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(getContext(), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(this.currentAccount).loadStickers(r0 == true ? 1 : 0, false, true);
    }

    public void lambda$updateFields$16(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$17(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 0, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$18(View view) {
        showNameEnterAlert();
    }

    public void lambda$updateFields$19(View view) {
        dismiss();
    }

    private void showNameEnterAlert() {
        Context context = getContext();
        final int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString("ImportStickersEnterName", R.string.ImportStickersEnterName));
        builder.setPositiveButton(LocaleController.getString("Next", R.string.Next), StickersAlert$$ExternalSyntheticLambda1.INSTANCE);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        final TextView textView = new TextView(context);
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(getThemedColor("dialogTextHint"));
        textView2.setMaxLines(1);
        textView2.setLines(1);
        textView2.setText("t.me/addstickers/");
        textView2.setInputType(16385);
        textView2.setGravity(51);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        textView2.setImeOptions(6);
        textView2.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 36, 51));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor("dialogInputField"), Theme.getColor("dialogInputFieldActivated"), Theme.getColor("dialogTextRed2"));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(getThemedColor("dialogTextBlack"));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setCursorColor(getThemedColor("windowBackgroundWhiteBlackText"));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (iArr[0] == 2) {
                    StickersAlert.this.checkUrlAvailable(textView, editTextBoldCursor.getText().toString(), false);
                }
            }
        });
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                boolean lambda$showNameEnterAlert$21;
                lambda$showNameEnterAlert$21 = StickersAlert.lambda$showNameEnterAlert$21(AlertDialog.Builder.this, textView3, i, keyEvent);
                return lambda$showNameEnterAlert$21;
            }
        });
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
            }
        });
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString("ImportStickersEnterNameInfo", R.string.ImportStickersEnterNameInfo)));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        textView.setTextColor(getThemedColor("dialogTextGray2"));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                StickersAlert.lambda$showNameEnterAlert$24(EditTextBoldCursor.this, dialogInterface);
            }
        });
        create.show();
        editTextBoldCursor.requestFocus();
        create.getButton(-1).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$showNameEnterAlert$28(iArr, editTextBoldCursor, textView, textView2, builder, view);
            }
        });
    }

    public static boolean lambda$showNameEnterAlert$21(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        builder.create().getButton(-1).callOnClick();
        return true;
    }

    public static void lambda$showNameEnterAlert$24(final EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.lambda$showNameEnterAlert$23(EditTextBoldCursor.this);
            }
        });
    }

    public static void lambda$showNameEnterAlert$23(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public void lambda$showNameEnterAlert$28(final int[] iArr, final EditTextBoldCursor editTextBoldCursor, final TextView textView, final TextView textView2, AlertDialog.Builder builder, View view) {
        if (iArr[0] != 1) {
            if (iArr[0] == 0) {
                iArr[0] = 1;
                TLRPC$TL_stickers_suggestShortName tLRPC$TL_stickers_suggestShortName = new TLRPC$TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                this.setTitle = obj;
                tLRPC$TL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stickers_suggestShortName, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StickersAlert.this.lambda$showNameEnterAlert$26(editTextBoldCursor, textView, textView2, iArr, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (iArr[0] == 2) {
                iArr[0] = 3;
                if (!this.lastNameAvailable) {
                    AndroidUtilities.shakeView(editTextBoldCursor, 2.0f, 0);
                    editTextBoldCursor.performHapticFeedback(3, 2);
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(this.currentAccount).prepareImportStickers(this.setTitle, this.lastCheckName, this.importingSoftware, this.importingStickersPaths, new MessagesStorage.StringCallback() {
                    @Override
                    public final void run(String str) {
                        StickersAlert.this.lambda$showNameEnterAlert$27(str);
                    }
                });
                builder.getDismissRunnable().run();
                dismiss();
            }
        }
    }

    public void lambda$showNameEnterAlert$26(final EditTextBoldCursor editTextBoldCursor, final TextView textView, final TextView textView2, final int[] iArr, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$showNameEnterAlert$25(tLObject, editTextBoldCursor, textView, textView2, iArr);
            }
        });
    }

    public void lambda$showNameEnterAlert$25(TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        String str;
        boolean z = true;
        if (!(tLObject instanceof TLRPC$TL_stickers_suggestedShortName) || (str = ((TLRPC$TL_stickers_suggestedShortName) tLObject).short_name) == null) {
            z = false;
        } else {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
            checkUrlAvailable(textView, editTextBoldCursor.getText().toString(), true);
        }
        textView2.setVisibility(0);
        editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
        if (!z) {
            editTextBoldCursor.setText("");
        }
        iArr[0] = 2;
    }

    public void lambda$showNameEnterAlert$27(String str) {
        new ImportingAlert(getContext(), this.lastCheckName, null, this.resourcesProvider).show();
    }

    public void checkUrlAvailable(final TextView textView, final String str, boolean z) {
        if (z) {
            textView.setText(LocaleController.getString("ImportStickersLinkAvailable", R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor("windowBackgroundWhiteGreenText"));
            this.lastNameAvailable = true;
            this.lastCheckName = str;
            return;
        }
        Runnable runnable = this.checkRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkReqId, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString("ImportStickersEnterUrlInfo", R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor("dialogTextGray2"));
            return;
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString("ImportStickersLinkInvalid", R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor("windowBackgroundWhiteRedText4"));
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString("ImportStickersEnterUrlInfo", R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor("windowBackgroundWhiteRedText4"));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString("ImportStickersLinkInvalidShort", R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor("windowBackgroundWhiteRedText4"));
        } else if (str.length() > 32) {
            textView.setText(LocaleController.getString("ImportStickersLinkInvalidLong", R.string.ImportStickersLinkInvalidLong));
            textView.setTextColor(getThemedColor("windowBackgroundWhiteRedText4"));
        } else {
            textView.setText(LocaleController.getString("ImportStickersLinkChecking", R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor("windowBackgroundWhiteGrayText8"));
            this.lastCheckName = str;
            Runnable stickersAlert$$ExternalSyntheticLambda16 = new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.this.lambda$checkUrlAvailable$31(str, textView);
                }
            };
            this.checkRunnable = stickersAlert$$ExternalSyntheticLambda16;
            AndroidUtilities.runOnUIThread(stickersAlert$$ExternalSyntheticLambda16, 300L);
        }
    }

    public void lambda$checkUrlAvailable$31(final String str, final TextView textView) {
        TLRPC$TL_stickers_checkShortName tLRPC$TL_stickers_checkShortName = new TLRPC$TL_stickers_checkShortName();
        tLRPC$TL_stickers_checkShortName.short_name = str;
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stickers_checkShortName, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$checkUrlAvailable$30(str, textView, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$checkUrlAvailable$30(final String str, final TextView textView, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$checkUrlAvailable$29(str, tLRPC$TL_error, tLObject, textView);
            }
        });
    }

    public void lambda$checkUrlAvailable$29(String str, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TextView textView) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 != null && str2.equals(str)) {
            if (tLRPC$TL_error != null || !(tLObject instanceof TLRPC$TL_boolTrue)) {
                textView.setText(LocaleController.getString("ImportStickersLinkTaken", R.string.ImportStickersLinkTaken));
                textView.setTextColor(getThemedColor("windowBackgroundWhiteRedText4"));
                this.lastNameAvailable = false;
                return;
            }
            textView.setText(LocaleController.getString("ImportStickersLinkAvailable", R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor("windowBackgroundWhiteGreenText"));
            this.lastNameAvailable = true;
        }
    }

    @SuppressLint({"NewApi"})
    public void updateLayout() {
        if (this.gridView.getChildCount() <= 0) {
            setScrollOffsetY(this.gridView.getPaddingTop());
            return;
        }
        int i = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            runShadowAnimation(0, true);
        } else {
            runShadowAnimation(0, false);
            i = top;
        }
        if (this.scrollOffsetY != i) {
            setScrollOffsetY(i);
        }
    }

    public void setScrollOffsetY(int i) {
        this.scrollOffsetY = i;
        this.gridView.setTopGlowOffset(i);
        if (this.stickerSetCovereds == null) {
            float f = i;
            this.titleTextView.setTranslationY(f);
            if (this.importingStickers == null) {
                this.optionsButton.setTranslationY(f);
            }
            this.shadow[0].setTranslationY(f);
        }
        this.containerView.invalidate();
    }

    private void hidePreview() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StickersAlert.this.stickerPreviewLayout.setVisibility(8);
                StickersAlert.this.stickerImageView.setImageDrawable(null);
            }
        });
        animatorSet.start();
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if (this.stickerSetCovereds == null) {
            if ((z && this.shadow[i].getTag() != null) || (!z && this.shadow[i].getTag() == null)) {
                this.shadow[i].setTag(z ? null : 1);
                if (z) {
                    this.shadow[i].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.shadowAnimation;
                if (animatorSetArr[i] != null) {
                    animatorSetArr[i].cancel();
                }
                this.shadowAnimation[i] = new AnimatorSet();
                AnimatorSet animatorSet = this.shadowAnimation[i];
                Animator[] animatorArr = new Animator[1];
                View view = this.shadow[i];
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = z ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
                animatorSet.playTogether(animatorArr);
                this.shadowAnimation[i].setDuration(150L);
                this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (StickersAlert.this.shadowAnimation[i] != null && StickersAlert.this.shadowAnimation[i].equals(animator)) {
                            if (!z) {
                                StickersAlert.this.shadow[i].setVisibility(4);
                            }
                            StickersAlert.this.shadowAnimation[i] = null;
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {
                        if (StickersAlert.this.shadowAnimation[i] != null && StickersAlert.this.shadowAnimation[i].equals(animator)) {
                            StickersAlert.this.shadowAnimation[i] = null;
                        }
                    }
                });
                this.shadowAnimation[i].start();
            }
        }
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public void setOnDismissListener(Runnable runnable) {
        this.onDismissListener = runnable;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        Runnable runnable = this.onDismissListener;
        if (runnable != null) {
            runnable.run();
        }
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            ArrayList<SendMessagesHelper.ImportingSticker> arrayList = this.importingStickersPaths;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
                    if (!importingSticker.validated) {
                        FileLoader.getInstance(this.currentAccount).cancelFileUpload(importingSticker.path, false);
                    }
                    if (importingSticker.animated) {
                        new File(importingSticker.path).delete();
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() {
            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onOffsetChange(this, f);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                if (StickersAlert.this.pickerBottomLayout != null) {
                    return StickersAlert.this.pickerBottomLayout.getHeight();
                }
                return 0;
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Bulletin.removeDelegate((FrameLayout) this.containerView);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        HashMap<String, SendMessagesHelper.ImportingSticker> hashMap;
        final String str;
        final SendMessagesHelper.ImportingSticker importingSticker;
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.gridView;
            if (recyclerListView != null) {
                int childCount = recyclerListView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.gridView.getChildAt(i3).invalidate();
                }
            }
            if (ContentPreviewViewer.getInstance().isVisible()) {
                ContentPreviewViewer.getInstance().close();
            }
            ContentPreviewViewer.getInstance().reset();
        } else if (i == NotificationCenter.fileUploaded) {
            HashMap<String, SendMessagesHelper.ImportingSticker> hashMap2 = this.uploadImportStickers;
            if (!(hashMap2 == null || (importingSticker = hashMap2.get((str = (String) objArr[0]))) == null)) {
                importingSticker.uploadMedia(this.currentAccount, (TLRPC$InputFile) objArr[1], new Runnable() {
                    @Override
                    public final void run() {
                        StickersAlert.this.lambda$didReceivedNotification$32(str, importingSticker);
                    }
                });
            }
        } else if (i == NotificationCenter.fileUploadFailed && (hashMap = this.uploadImportStickers) != null) {
            SendMessagesHelper.ImportingSticker remove = hashMap.remove((String) objArr[0]);
            if (remove != null) {
                removeSticker(remove);
            }
            if (this.uploadImportStickers.isEmpty()) {
                updateFields();
            }
        }
    }

    public void lambda$didReceivedNotification$32(String str, SendMessagesHelper.ImportingSticker importingSticker) {
        if (!isDismissed()) {
            this.uploadImportStickers.remove(str);
            if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                removeSticker(importingSticker);
            } else {
                importingSticker.validated = true;
                int indexOf = this.importingStickersPaths.indexOf(importingSticker);
                if (indexOf >= 0) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.gridView.findViewHolderForAdapterPosition(indexOf);
                    if (findViewHolderForAdapterPosition != null) {
                        ((StickerEmojiCell) findViewHolderForAdapterPosition.itemView).setSticker(importingSticker);
                    }
                } else {
                    this.adapter.notifyDataSetChanged();
                }
            }
            if (this.uploadImportStickers.isEmpty()) {
                updateFields();
            }
        }
    }

    private void setButton(View.OnClickListener onClickListener, String str, String str2) {
        TextView textView = this.pickerBottomLayout;
        this.buttonTextColorKey = str2;
        textView.setTextColor(getThemedColor(str2));
        this.pickerBottomLayout.setText(str.toUpperCase());
        this.pickerBottomLayout.setOnClickListener(onClickListener);
    }

    public void setShowTooltipWhenToggle(boolean z) {
        this.showTooltipWhenToggle = z;
    }

    public void updateColors() {
        updateColors(false);
    }

    public void updateColors(boolean z) {
        this.adapter.updateColors();
        this.titleTextView.setHighlightColor(getThemedColor("dialogLinkSelection"));
        this.stickerPreviewLayout.setBackgroundColor(getThemedColor("dialogBackground") & (-536870913));
        this.optionsButton.setIconColor(getThemedColor("key_sheet_other"));
        this.optionsButton.setPopupItemsColor(getThemedColor("actionBarDefaultSubmenuItem"), false);
        this.optionsButton.setPopupItemsColor(getThemedColor("actionBarDefaultSubmenuItemIcon"), true);
        this.optionsButton.setPopupItemsSelectorColor(getThemedColor("dialogButtonSelector"));
        this.optionsButton.redrawPopup(getThemedColor("actionBarDefaultSubmenuBackground"));
        if (z) {
            if (Theme.isAnimatingColor() && this.animatingDescriptions == null) {
                ArrayList<ThemeDescription> themeDescriptions = getThemeDescriptions();
                this.animatingDescriptions = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i = 0; i < size; i++) {
                    this.animatingDescriptions.get(i).setDelegateDisabled();
                }
            }
            int size2 = this.animatingDescriptions.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ThemeDescription themeDescription = this.animatingDescriptions.get(i2);
                themeDescription.setColor(getThemedColor(themeDescription.getCurrentKey()), false, false);
            }
        }
        if (!(Theme.isAnimatingColor() || this.animatingDescriptions == null)) {
            this.animatingDescriptions = null;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate stickersAlert$$ExternalSyntheticLambda33 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                StickersAlert.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, "key_sheet_scrollUp"));
        this.adapter.getThemeDescriptions(arrayList, stickersAlert$$ExternalSyntheticLambda33);
        arrayList.add(new ThemeDescription(this.shadow[0], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogShadowLine"));
        arrayList.add(new ThemeDescription(this.shadow[1], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogShadowLine"));
        arrayList.add(new ThemeDescription(this.gridView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "dialogScrollGlow"));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_LINKCOLOR, null, null, null, null, "dialogTextLink"));
        arrayList.add(new ThemeDescription(this.optionsButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "player_actionBarSelector"));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, this.buttonTextColorKey));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogTextBlue2"));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.previewSendButtonShadow, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogShadowLine"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "dialogLinkSelection"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "dialogBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "key_sheet_other"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "actionBarDefaultSubmenuItem"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "actionBarDefaultSubmenuItemIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, stickersAlert$$ExternalSyntheticLambda33, "actionBarDefaultSubmenuBackground"));
        return arrayList;
    }

    public class GridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int stickersPerRow;
        private int stickersRowCount;
        private int totalItems;
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<TLRPC$StickerSetCovered> positionsToSets = new SparseArray<>();

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public GridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return this.totalItems;
        }

        @Override
        public int getItemViewType(int i) {
            if (StickersAlert.this.stickerSetCovereds == null) {
                return 0;
            }
            Object obj = this.cache.get(i);
            if (obj != null) {
                return obj instanceof TLRPC$Document ? 0 : 2;
            }
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell;
            if (i == 0) {
                StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this.context, false) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                    }
                };
                stickerEmojiCell.getImageView().setLayerNum(7);
                featuredStickerSetInfoCell = stickerEmojiCell;
            } else if (i != 1) {
                featuredStickerSetInfoCell = i != 2 ? null : new FeaturedStickerSetInfoCell(this.context, 8, true, false, ((BottomSheet) StickersAlert.this).resourcesProvider);
            } else {
                featuredStickerSetInfoCell = new EmptyCell(this.context);
            }
            return new RecyclerListView.Holder(featuredStickerSetInfoCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (StickersAlert.this.stickerSetCovereds != null) {
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    ((StickerEmojiCell) viewHolder.itemView).setSticker((TLRPC$Document) this.cache.get(i), this.positionsToSets.get(i), false);
                } else if (itemViewType == 1) {
                    ((EmptyCell) viewHolder.itemView).setHeight(AndroidUtilities.dp(82.0f));
                } else if (itemViewType == 2) {
                    ((FeaturedStickerSetInfoCell) viewHolder.itemView).setStickerSet((TLRPC$StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(((Integer) this.cache.get(i)).intValue()), false);
                }
            } else if (StickersAlert.this.importingStickers != null) {
                ((StickerEmojiCell) viewHolder.itemView).setSticker((SendMessagesHelper.ImportingSticker) StickersAlert.this.importingStickersPaths.get(i));
            } else {
                ((StickerEmojiCell) viewHolder.itemView).setSticker(StickersAlert.this.stickerSet.documents.get(i), StickersAlert.this.stickerSet, StickersAlert.this.showEmoji);
            }
        }

        @Override
        public void notifyDataSetChanged() {
            int i;
            int i2;
            int i3 = 0;
            if (StickersAlert.this.stickerSetCovereds != null) {
                int measuredWidth = StickersAlert.this.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.dp(72.0f);
                StickersAlert.this.layoutManager.setSpanCount(this.stickersPerRow);
                this.cache.clear();
                this.positionsToSets.clear();
                this.totalItems = 0;
                this.stickersRowCount = 0;
                for (int i4 = 0; i4 < StickersAlert.this.stickerSetCovereds.size(); i4++) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(i4);
                    if (!tLRPC$StickerSetCovered.covers.isEmpty() || tLRPC$StickerSetCovered.cover != null) {
                        double d = this.stickersRowCount;
                        double ceil = Math.ceil(StickersAlert.this.stickerSetCovereds.size() / this.stickersPerRow);
                        Double.isNaN(d);
                        this.stickersRowCount = (int) (d + ceil);
                        this.positionsToSets.put(this.totalItems, tLRPC$StickerSetCovered);
                        SparseArray<Object> sparseArray = this.cache;
                        int i5 = this.totalItems;
                        this.totalItems = i5 + 1;
                        sparseArray.put(i5, Integer.valueOf(i4));
                        int i6 = this.totalItems / this.stickersPerRow;
                        if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                            i = (int) Math.ceil(tLRPC$StickerSetCovered.covers.size() / this.stickersPerRow);
                            for (int i7 = 0; i7 < tLRPC$StickerSetCovered.covers.size(); i7++) {
                                this.cache.put(this.totalItems + i7, tLRPC$StickerSetCovered.covers.get(i7));
                            }
                        } else {
                            this.cache.put(this.totalItems, tLRPC$StickerSetCovered.cover);
                            i = 1;
                        }
                        int i8 = 0;
                        while (true) {
                            i2 = this.stickersPerRow;
                            if (i8 >= i * i2) {
                                break;
                            }
                            this.positionsToSets.put(this.totalItems + i8, tLRPC$StickerSetCovered);
                            i8++;
                        }
                        this.totalItems += i * i2;
                    }
                }
            } else if (StickersAlert.this.importingStickersPaths != null) {
                this.totalItems = StickersAlert.this.importingStickersPaths.size();
            } else {
                if (StickersAlert.this.stickerSet != null) {
                    i3 = StickersAlert.this.stickerSet.documents.size();
                }
                this.totalItems = i3;
            }
            super.notifyDataSetChanged();
        }

        @Override
        public void notifyItemRemoved(int i) {
            if (StickersAlert.this.importingStickersPaths != null) {
                this.totalItems = StickersAlert.this.importingStickersPaths.size();
            }
            super.notifyItemRemoved(i);
        }

        public void updateColors() {
            if (StickersAlert.this.stickerSetCovereds != null) {
                int childCount = StickersAlert.this.gridView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = StickersAlert.this.gridView.getChildAt(i);
                    if (childAt instanceof FeaturedStickerSetInfoCell) {
                        ((FeaturedStickerSetInfoCell) childAt).updateColors();
                    }
                }
            }
        }

        public void getThemeDescriptions(List<ThemeDescription> list, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
            if (StickersAlert.this.stickerSetCovereds != null) {
                FeaturedStickerSetInfoCell.createThemeDescriptions(list, StickersAlert.this.gridView, themeDescriptionDelegate);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().closeWithMenu();
        } else {
            super.onBackPressed();
        }
    }
}
