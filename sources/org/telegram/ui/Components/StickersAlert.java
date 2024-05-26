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
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.util.Property;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Dialog;
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
import org.telegram.tgnet.TLRPC$TL_forumTopic;
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
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
import org.telegram.tgnet.TLRPC$TL_stickers_changeStickerPosition;
import org.telegram.tgnet.TLRPC$TL_stickers_checkShortName;
import org.telegram.tgnet.TLRPC$TL_stickers_removeStickerFromSet;
import org.telegram.tgnet.TLRPC$TL_stickers_renameStickerSet;
import org.telegram.tgnet.TLRPC$TL_stickers_suggestShortName;
import org.telegram.tgnet.TLRPC$TL_stickers_suggestedShortName;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
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
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class StickersAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private GridAdapter adapter;
    private List<ThemeDescription> animatingDescriptions;
    private int buttonTextColorKey;
    private int checkReqId;
    private Runnable checkRunnable;
    private boolean clearsInputField;
    private StickersAlertCustomButtonDelegate customButtonDelegate;
    private StickersAlertDelegate delegate;
    private ActionBarMenuSubItem deleteItem;
    private TextView descriptionTextView;
    private ItemTouchHelper dragAndDropHelper;
    private TLRPC$Document draggedDocument;
    private FrameLayout emptyView;
    private RecyclerListView gridView;
    private boolean ignoreLayout;
    private boolean ignoreMasterDismiss;
    private String importingSoftware;
    private ArrayList<Parcelable> importingStickers;
    private ArrayList<SendMessagesHelper.ImportingSticker> importingStickersPaths;
    private TLRPC$InputStickerSet inputStickerSet;
    private StickersAlertInstallDelegate installDelegate;
    private boolean isEditModeEnabled;
    private int itemHeight;
    private int itemSize;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private GridLayoutManager layoutManager;
    private Runnable masterDismissListener;
    private Runnable onDismissListener;
    private ActionBarMenuItem optionsButton;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private FrameLayout pickerBottomFrameLayout;
    private AnimatedTextView pickerBottomLayout;
    private PremiumButtonView premiumButtonView;
    private ContentPreviewViewer.ContentPreviewViewerDelegate previewDelegate;
    private TextView previewSendButton;
    private View previewSendButtonShadow;
    public boolean probablyEmojis;
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
    public TLRPC$TL_messages_stickerSet stickerSet;
    private ArrayList<TLRPC$StickerSetCovered> stickerSetCovereds;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private final StickersShaker stickersShaker;
    private LinkSpanDrawable.LinksTextView titleTextView;
    private HashMap<String, SendMessagesHelper.ImportingSticker> uploadImportStickers;
    private Pattern urlPattern;

    public interface StickersAlertCustomButtonDelegate {
        int getCustomButtonColorKey();

        int getCustomButtonRippleColorKey();

        String getCustomButtonText();

        int getCustomButtonTextColorKey();

        boolean onCustomButtonPressed();
    }

    public interface StickersAlertDelegate {
        boolean canSchedule();

        boolean isInScheduleMode();

        void onStickerSelected(TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i);
    }

    public interface StickersAlertInstallDelegate {
        void onStickerSetInstalled();

        void onStickerSetUninstalled();
    }

    public static boolean lambda$init$10(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$showNameEnterAlert$34(DialogInterface dialogInterface, int i) {
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public class AnonymousClass1 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        @Override
        public void addToFavoriteSelected(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
        }

        @Override
        public boolean canDeleteSticker(TLRPC$Document tLRPC$Document) {
            return true;
        }

        @Override
        public boolean canEditSticker() {
            return true;
        }

        @Override
        public Boolean canSetAsStatus(TLRPC$Document tLRPC$Document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, tLRPC$Document);
        }

        @Override
        public void copyEmoji(TLRPC$Document tLRPC$Document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, tLRPC$Document);
        }

        @Override
        public String getQuery(boolean z) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
        }

        @Override
        public void gifAddedOrDeleted() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
        }

        @Override
        public boolean isPhotoEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
        }

        @Override
        public boolean isReplacedSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
        }

        @Override
        public boolean isSettingIntroSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
        }

        @Override
        public boolean isStickerEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
        }

        @Override
        public boolean needCopy(TLRPC$Document tLRPC$Document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, tLRPC$Document);
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
        public boolean needRemoveFromRecent(TLRPC$Document tLRPC$Document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, tLRPC$Document);
        }

        @Override
        public void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
        }

        @Override
        public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
        }

        @Override
        public void removeFromRecent(TLRPC$Document tLRPC$Document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, tLRPC$Document);
        }

        @Override
        public void resetTouch() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
        }

        @Override
        public void sendEmoji(TLRPC$Document tLRPC$Document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, tLRPC$Document);
        }

        @Override
        public void sendGif(Object obj, Object obj2, boolean z, int i) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i);
        }

        @Override
        public void sendSticker() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this);
        }

        @Override
        public void setAsEmojiStatus(TLRPC$Document tLRPC$Document, Integer num) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, tLRPC$Document, num);
        }

        @Override
        public void setIntroSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
        }

        @Override
        public void stickerSetSelected(TLRPC$StickerSet tLRPC$StickerSet, String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, tLRPC$StickerSet, str);
        }

        AnonymousClass1() {
        }

        @Override
        public boolean can() {
            TLRPC$StickerSet tLRPC$StickerSet;
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = StickersAlert.this.stickerSet;
            return tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null || !tLRPC$StickerSet.emojis;
        }

        @Override
        public void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i) {
            if (StickersAlert.this.delegate == null) {
                return;
            }
            StickersAlert.this.delegate.onStickerSelected(tLRPC$Document, str, obj, null, StickersAlert.this.clearsInputField, z, i);
            StickersAlert.this.dismiss();
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
        public void deleteSticker(TLRPC$Document tLRPC$Document) {
            StickersAlert.this.stickerSet.documents.remove(tLRPC$Document);
            final boolean isEmpty = StickersAlert.this.stickerSet.documents.isEmpty();
            if (isEmpty) {
                StickersAlert.this.dismiss();
            }
            StickersAlert.this.adapter.notifyDataSetChanged();
            final AlertDialog alertDialog = new AlertDialog(StickersAlert.this.getContext(), 3, ((BottomSheet) StickersAlert.this).resourcesProvider);
            alertDialog.showDelayed(350L);
            TLRPC$TL_stickers_removeStickerFromSet tLRPC$TL_stickers_removeStickerFromSet = new TLRPC$TL_stickers_removeStickerFromSet();
            tLRPC$TL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(tLRPC$Document, "").document;
            ConnectionsManager.getInstance(((BottomSheet) StickersAlert.this).currentAccount).sendRequest(tLRPC$TL_stickers_removeStickerFromSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickersAlert.AnonymousClass1.this.lambda$deleteSticker$1(isEmpty, alertDialog, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$deleteSticker$1(final boolean z, final AlertDialog alertDialog, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.AnonymousClass1.this.lambda$deleteSticker$0(tLObject, z, alertDialog);
                }
            });
        }

        public void lambda$deleteSticker$0(TLObject tLObject, boolean z, AlertDialog alertDialog) {
            if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
                MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tLRPC$TL_messages_stickerSet);
                if (z) {
                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject, 0, null, false, false);
                } else {
                    StickersAlert stickersAlert = StickersAlert.this;
                    stickersAlert.stickerSet = tLRPC$TL_messages_stickerSet;
                    stickersAlert.loadStickerSet();
                    StickersAlert.this.updateFields();
                }
            }
            alertDialog.dismiss();
        }

        @Override
        public void editSticker(final TLRPC$Document tLRPC$Document) {
            final ChatActivity chatActivity = StickersAlert.this.parentFragment instanceof ChatActivity ? (ChatActivity) StickersAlert.this.parentFragment : null;
            if (MessageObject.isStaticStickerDocument(tLRPC$Document)) {
                final ArrayList arrayList = new ArrayList();
                final File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StickersAlert.AnonymousClass1.this.lambda$editSticker$2(pathToAttach, arrayList, chatActivity, tLRPC$Document);
                    }
                }, 300L);
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.AnonymousClass1.this.lambda$editSticker$3(tLRPC$Document, chatActivity);
                }
            }, 300L);
        }

        public void lambda$editSticker$2(File file, ArrayList arrayList, ChatActivity chatActivity, TLRPC$Document tLRPC$Document) {
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L));
            PhotoViewer.getInstance().setParentActivity(StickersAlert.this.parentFragment.getParentActivity(), ((BottomSheet) StickersAlert.this).resourcesProvider);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 11, false, new PhotoViewer.EmptyPhotoViewerProvider(this) {
                @Override
                public boolean allowCaption() {
                    return false;
                }
            }, chatActivity);
            PhotoViewer.getInstance().enableStickerMode(tLRPC$Document, false, null);
            ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(StickersAlert.this.stickerSet);
        }

        public void lambda$editSticker$3(TLRPC$Document tLRPC$Document, ChatActivity chatActivity) {
            double d;
            File makeCacheFile = StoryEntry.makeCacheFile(((BottomSheet) StickersAlert.this).currentAccount, "webp");
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            int i = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
            float f = (float) LiteMode.FLAG_CALLS_ANIMATIONS;
            Size size = new Size(f, f);
            float f2 = i;
            size.width = f2;
            float floor = (float) Math.floor((f2 * f) / f);
            size.height = floor;
            if (floor > f2) {
                size.height = f2;
                size.width = (float) Math.floor((f2 * f) / f);
            }
            Bitmap createBitmap = Bitmap.createBitmap(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS, Bitmap.Config.ARGB_8888);
            try {
                createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(makeCacheFile));
            } catch (Throwable th) {
                FileLog.e(th);
            }
            createBitmap.recycle();
            ArrayList<Object> arrayList = new ArrayList<>();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, makeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
            arrayList.add(photoEntry);
            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
            mediaEntity.type = (byte) 0;
            mediaEntity.parentObject = StickersAlert.this.stickerSet;
            mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true).getAbsolutePath();
            mediaEntity.x = 0.5f - ((Math.min((int) LiteMode.FLAG_CALLS_ANIMATIONS, (int) LiteMode.FLAG_CALLS_ANIMATIONS) / f) / 2.0f);
            mediaEntity.y = 0.5f - ((Math.min((int) LiteMode.FLAG_CALLS_ANIMATIONS, (int) LiteMode.FLAG_CALLS_ANIMATIONS) / f) / 2.0f);
            mediaEntity.width = Math.min((int) LiteMode.FLAG_CALLS_ANIMATIONS, (int) LiteMode.FLAG_CALLS_ANIMATIONS) / f;
            mediaEntity.height = Math.min((int) LiteMode.FLAG_CALLS_ANIMATIONS, (int) LiteMode.FLAG_CALLS_ANIMATIONS) / f;
            Double.isNaN(size.width);
            int floor2 = (int) Math.floor(d * 0.5d);
            mediaEntity.viewWidth = floor2;
            mediaEntity.viewHeight = floor2;
            mediaEntity.scale = 2.0f;
            mediaEntity.document = tLRPC$Document;
            if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) || MessageObject.isVideoStickerDocument(tLRPC$Document)) {
                mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
            }
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
            photoEntry.mediaEntities = arrayList2;
            arrayList2.add(mediaEntity);
            photoEntry.averageDuration = 3000L;
            if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true)) {
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true);
                if (pathToAttach != null) {
                    try {
                        photoEntry.averageDuration = (long) (RLottieDrawable.getDuration(pathToAttach.getAbsolutePath(), null) * 1000.0d);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } else if (MessageObject.isVideoStickerDocument(tLRPC$Document)) {
                photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(tLRPC$Document) * 1000.0d);
            }
            PhotoViewer.getInstance().setParentActivity(StickersAlert.this.parentFragment.getParentActivity(), ((BottomSheet) StickersAlert.this).resourcesProvider);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 11, false, new PhotoViewer.EmptyPhotoViewerProvider(this) {
                @Override
                public boolean allowCaption() {
                    return false;
                }
            }, chatActivity);
            PhotoViewer.getInstance().enableStickerMode(tLRPC$Document, true, null);
            ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(StickersAlert.this.stickerSet);
        }

        @Override
        public boolean needSend(int i) {
            return StickersAlert.this.delegate != null;
        }

        @Override
        public long getDialogId() {
            if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                return ((ChatActivity) StickersAlert.this.parentFragment).getDialogId();
            }
            return 0L;
        }
    }

    public StickersAlert(Context context, final Object obj, TLObject tLObject, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
        this.resourcesProvider = resourcesProvider;
        fixNavigationBar();
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
        final RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$new$1(tLRPC$TL_messages_getAttachedStickers, tLObject2, tLRPC$TL_error);
            }
        };
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getAttachedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$new$2(obj, tLRPC$TL_messages_getAttachedStickers, requestDelegate, tLObject2, tLRPC$TL_error);
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
                return;
            } else if (tLRPC$Vector.objects.size() == 1) {
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                this.inputStickerSet = tLRPC$TL_inputStickerSetID;
                TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$StickerSetCovered) tLRPC$Vector.objects.get(0)).set;
                tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                loadStickerSet();
                return;
            } else {
                this.stickerSetCovereds = new ArrayList<>();
                for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                    this.stickerSetCovereds.add((TLRPC$StickerSetCovered) tLRPC$Vector.objects.get(i));
                }
                this.gridView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                this.titleTextView.setVisibility(8);
                this.shadow[0].setVisibility(8);
                this.adapter.notifyDataSetChanged();
                return;
            }
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.parentFragment, tLRPC$TL_messages_getAttachedStickers, new Object[0]);
        dismiss();
    }

    public void lambda$new$2(Object obj, TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers, RequestDelegate requestDelegate, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && obj != null) {
            FileRefController.getInstance(this.currentAccount).requestReference(obj, tLRPC$TL_messages_getAttachedStickers, requestDelegate);
        } else {
            requestDelegate.run(tLObject, tLRPC$TL_error);
        }
    }

    public StickersAlert(Context context, String str, final ArrayList<Parcelable> arrayList, final ArrayList<String> arrayList2, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
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
                if (isDismissed()) {
                    return;
                }
                SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                importingSticker.animated = equals;
                String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : LiteMode.FLAG_CALLS_ANIMATIONS) * 1024);
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
                    if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i2) instanceof String)) {
                        importingSticker.emoji = (String) arrayList2.get(i2);
                    } else {
                        importingSticker.emoji = "#️⃣";
                    }
                    arrayList3.add(importingSticker);
                    if (arrayList3.size() >= 200) {
                        break;
                    }
                } else {
                    continue;
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
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
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

    public void loadStickerSet() {
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
                updateDescription();
                mediaDataController.preloadStickerSetThumb(this.stickerSet);
                checkPremiumStickers();
            }
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        if (tLRPC$TL_messages_stickerSet != null) {
            this.showEmoji = !tLRPC$TL_messages_stickerSet.set.masks;
        }
        checkPremiumStickers();
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
        TLRPC$StickerSet tLRPC$StickerSet;
        boolean z = false;
        this.reqId = 0;
        if (tLRPC$TL_error == null) {
            if (Build.VERSION.SDK_INT >= 19) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                anonymousClass2.addTarget(this.containerView);
                TransitionManager.beginDelayedTransition(this.container, anonymousClass2);
            }
            this.optionsButton.setVisibility(0);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            this.stickerSet = tLRPC$TL_messages_stickerSet;
            mediaDataController.putStickerSet(tLRPC$TL_messages_stickerSet, false);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSet;
            if (tLRPC$TL_messages_stickerSet2 != null && tLRPC$TL_messages_stickerSet2.documents.isEmpty()) {
                dismiss();
                return;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = this.stickerSet;
            if (tLRPC$TL_messages_stickerSet3 != null && (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet3.set) != null && !tLRPC$StickerSet.masks) {
                z = true;
            }
            this.showEmoji = z;
            checkPremiumStickers();
            mediaDataController.preloadStickerSetThumb(this.stickerSet);
            updateSendButton();
            updateFields();
            updateDescription();
            this.adapter.notifyDataSetChanged();
            return;
        }
        dismiss();
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString("AddStickersNotFound", R.string.AddStickersNotFound)).show();
        }
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

    public void updateStickerSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.stickerSet = tLRPC$TL_messages_stickerSet;
        if (this.adapter != null) {
            updateSendButton();
            updateFields();
            this.adapter.notifyDataSetChanged();
        }
        updateDescription();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.stickerSet);
        checkPremiumStickers();
    }

    private void checkPremiumStickers() {
        if (this.stickerSet != null) {
            TLRPC$TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.stickerSet);
            this.stickerSet = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public boolean isEmoji() {
        TLRPC$StickerSet tLRPC$StickerSet;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        return !(tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null || !tLRPC$StickerSet.emojis) || (tLRPC$TL_messages_stickerSet == null && this.probablyEmojis);
    }

    private void init(Context context) {
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean fullHeight;
            private int lastNotifyWidth;
            private RectF rect = new RectF();
            private Boolean statusBarOpen;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && StickersAlert.this.scrollOffsetY != 0 && motionEvent.getY() < StickersAlert.this.scrollOffsetY) {
                    StickersAlert.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int r12, int r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.StickersAlert.AnonymousClass3.onMeasure(int, int):void");
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5 = i3 - i;
                if (this.lastNotifyWidth != i5) {
                    this.lastNotifyWidth = i5;
                    if (StickersAlert.this.adapter != null && StickersAlert.this.stickerSetCovereds != null) {
                        StickersAlert.this.adapter.notifyDataSetChanged();
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                StickersAlert.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            private void updateLightStatusBar(boolean z) {
                Boolean bool = this.statusBarOpen;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = AndroidUtilities.computePerceivedBrightness(StickersAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                    boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(StickersAlert.this.getThemedColor(Theme.key_actionBarDefault), AndroidUtilities.DARK_STATUS_BAR_OVERLAY)) > 0.721f;
                    Boolean valueOf = Boolean.valueOf(z);
                    this.statusBarOpen = valueOf;
                    if (!valueOf.booleanValue()) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(StickersAlert.this.getWindow(), z2);
                }
            }

            @Override
            protected void onDraw(android.graphics.Canvas r13) {
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
        View view = this.shadow[0];
        int i2 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i2));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setVisibility(4);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view2, long j) {
                if ((view2 instanceof StickerEmojiCell) && StickersAlert.this.isEditModeEnabled) {
                    int adapterPosition = StickersAlert.this.gridView.getChildViewHolder(view2).getAdapterPosition();
                    canvas.save();
                    canvas.rotate(StickersAlert.this.stickersShaker.getRotationValueForPos(adapterPosition), view2.getLeft() + (view2.getMeasuredWidth() / 2.0f), view2.getTop() + (view2.getMeasuredHeight() / 2.0f));
                    canvas.translate(StickersAlert.this.stickersShaker.getTranslateXValueForPos(adapterPosition), StickersAlert.this.stickersShaker.getTranslateYValueForPos(adapterPosition));
                    boolean drawChild = super.drawChild(canvas, view2, j);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view2, j);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (StickersAlert.this.isEditModeEnabled) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, StickersAlert.this.gridView, 0, StickersAlert.this.previewDelegate, this.resourcesProvider);
            }

            @Override
            public void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
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
            public int getSpanSize(int i3) {
                if ((StickersAlert.this.stickerSetCovereds == null || !(StickersAlert.this.adapter.cache.get(i3) instanceof Integer)) && i3 != StickersAlert.this.adapter.totalItems) {
                    return 1;
                }
                return StickersAlert.this.adapter.stickersPerRow;
            }
        });
        this.dragAndDropHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(15, 0) {
            private int movedPos = -1;

            @Override
            public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i3, RecyclerView.ViewHolder viewHolder2, int i4, int i5, int i6) {
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i3) {
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() != viewHolder2.getItemViewType() || StickersAlert.this.stickerSet == null) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                StickersAlert.this.stickerSet.documents.add(adapterPosition2, StickersAlert.this.stickerSet.documents.remove(adapterPosition));
                StickersAlert.this.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                this.movedPos = adapterPosition2;
                return true;
            }

            @Override
            public int getDragDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getItemViewType() == 3) {
                    return 0;
                }
                return super.getDragDirs(recyclerView, viewHolder);
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i3) {
                super.onSelectedChanged(viewHolder, i3);
                if (i3 != 0 || StickersAlert.this.draggedDocument == null || this.movedPos <= 0) {
                    if (i3 == 2) {
                        StickersAlert.this.draggedDocument = ((StickerEmojiCell) viewHolder.itemView).getSticker();
                        return;
                    }
                    return;
                }
                TLRPC$TL_stickers_changeStickerPosition tLRPC$TL_stickers_changeStickerPosition = new TLRPC$TL_stickers_changeStickerPosition();
                tLRPC$TL_stickers_changeStickerPosition.position = this.movedPos;
                tLRPC$TL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(StickersAlert.this.draggedDocument, "").document;
                this.movedPos = -1;
                StickersAlert.this.draggedDocument = null;
            }
        });
        RecyclerListView recyclerListView3 = this.gridView;
        GridAdapter gridAdapter = new GridAdapter(context);
        this.adapter = gridAdapter;
        recyclerListView3.setAdapter(gridAdapter);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(android.graphics.Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
            }
        });
        this.gridView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.gridView.setClipToPadding(false);
        this.gridView.setEnabled(true);
        this.gridView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.gridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$init$7;
                lambda$init$7 = StickersAlert.this.lambda$init$7(view2, motionEvent);
                return lambda$init$7;
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                StickersAlert.this.updateLayout();
            }
        });
        RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i3) {
                StickersAlert.this.lambda$init$9(view2, i3);
            }
        };
        this.stickersOnItemClickListener = onItemClickListener;
        this.gridView.setOnItemClickListener(onItemClickListener);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.emptyView = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.gridView.setEmptyView(this.emptyView);
        this.emptyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$init$10;
                lambda$init$10 = StickersAlert.lambda$init$10(view2, motionEvent);
                return lambda$init$10;
            }
        });
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.titleTextView = linksTextView;
        linksTextView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.titleTextView.setGravity(16);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(Theme.key_sheet_other), this.resourcesProvider);
        this.optionsButton = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.optionsButton.setSubMenuOpenSide(2);
        this.optionsButton.setIcon(R.drawable.ic_ab_other);
        this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_player_actionBarSelector), 1));
        this.containerView.addView(this.optionsButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.optionsButton.addSubItem(1, R.drawable.msg_share, LocaleController.getString("StickersShare", R.string.StickersShare));
        this.optionsButton.addSubItem(2, R.drawable.msg_link, LocaleController.getString("CopyLink", R.string.CopyLink));
        this.optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StickersAlert.this.lambda$init$11(view2);
            }
        });
        this.optionsButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i3) {
                StickersAlert.this.onSubItemClick(i3);
            }
        });
        this.optionsButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.optionsButton.setVisibility(this.inputStickerSet != null ? 0 : 8);
        this.emptyView.addView(new RadialProgressView(context), LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(this.shadow[1], layoutParams2);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.pickerBottomLayout = animatedTextView;
        int i3 = Theme.key_dialogBackground;
        int themedColor = getThemedColor(i3);
        int i4 = Theme.key_listSelector;
        animatedTextView.setBackground(Theme.createSelectorWithBackgroundDrawable(themedColor, getThemedColor(i4)));
        AnimatedTextView animatedTextView2 = this.pickerBottomLayout;
        int i5 = Theme.key_dialogTextBlue2;
        this.buttonTextColorKey = i5;
        animatedTextView2.setTextColor(getThemedColor(i5));
        this.pickerBottomLayout.setTextSize(AndroidUtilities.dp(14.0f));
        this.pickerBottomLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.pickerBottomLayout.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.pickerBottomLayout.setGravity(17);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.pickerBottomFrameLayout = frameLayout3;
        frameLayout3.addView(this.pickerBottomLayout, LayoutHelper.createFrame(-1, 48.0f));
        this.containerView.addView(this.pickerBottomFrameLayout, LayoutHelper.createFrame(-1, -2, 83));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, false, this.resourcesProvider);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        this.premiumButtonView.setVisibility(4);
        this.containerView.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.stickerPreviewLayout = frameLayout4;
        frameLayout4.setVisibility(8);
        this.stickerPreviewLayout.setSoundEffectsEnabled(false);
        this.containerView.addView(this.stickerPreviewLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.stickerPreviewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StickersAlert.this.lambda$init$12(view2);
            }
        });
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerImageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.stickerImageView.setLayerNum(7);
        this.stickerPreviewLayout.addView(this.stickerImageView);
        TextView textView = new TextView(context);
        this.stickerEmojiTextView = textView;
        textView.setTextSize(1, 30.0f);
        this.stickerEmojiTextView.setGravity(85);
        this.stickerPreviewLayout.addView(this.stickerEmojiTextView);
        TextView textView2 = new TextView(context);
        this.previewSendButton = textView2;
        textView2.setTextSize(1, 14.0f);
        this.previewSendButton.setTextColor(getThemedColor(i5));
        this.previewSendButton.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(i3), getThemedColor(i4)));
        this.previewSendButton.setGravity(17);
        this.previewSendButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.previewSendButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.stickerPreviewLayout.addView(this.previewSendButton, LayoutHelper.createFrame(-1, 48, 83));
        this.previewSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StickersAlert.this.lambda$init$13(view2);
            }
        });
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        this.previewSendButtonShadow = view2;
        view2.setBackgroundColor(getThemedColor(i2));
        this.stickerPreviewLayout.addView(this.previewSendButtonShadow, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        updateFields();
        updateSendButton();
        updateDescription();
        updateColors();
        this.adapter.notifyDataSetChanged();
    }

    public boolean lambda$init$7(View view, MotionEvent motionEvent) {
        if (this.isEditModeEnabled) {
            return false;
        }
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, 0, this.stickersOnItemClickListener, this.previewDelegate, this.resourcesProvider);
    }

    public void lambda$init$9(View view, int i) {
        boolean z;
        TLRPC$StickerSet tLRPC$StickerSet;
        if (view instanceof AddStickerBtnView) {
            StickersDialogs.showAddStickerDialog(this.stickerSet, view, this.parentFragment, this.resourcesProvider);
        } else if (this.isEditModeEnabled) {
        } else {
            if (this.stickerSetCovereds == null) {
                ArrayList<SendMessagesHelper.ImportingSticker> arrayList = this.importingStickersPaths;
                if (arrayList != null) {
                    if (i < 0 || i >= arrayList.size()) {
                        return;
                    }
                    SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
                    this.selectedStickerPath = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = this.stickerEmojiTextView;
                        textView.setText(Emoji.replaceEmoji((CharSequence) importingSticker.emoji, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                        this.stickerImageView.setImage(ImageLocation.getForPath(this.selectedStickerPath.path), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Bitmap) null, this.selectedStickerPath.animated ? "tgs" : null, 0, (Object) null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
                        layoutParams.topMargin = this.scrollOffsetY;
                        this.stickerPreviewLayout.setLayoutParams(layoutParams);
                        this.stickerPreviewLayout.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
                if (tLRPC$TL_messages_stickerSet == null || i < 0 || i >= tLRPC$TL_messages_stickerSet.documents.size()) {
                    return;
                }
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
                            TextView textView2 = this.stickerEmojiTextView;
                            textView2.setText(Emoji.replaceEmoji((CharSequence) tLRPC$DocumentAttribute.alt, textView2.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                            z = true;
                        }
                    } else {
                        i2++;
                    }
                }
                z = false;
                if (!z) {
                    this.stickerEmojiTextView.setText(Emoji.replaceEmoji((CharSequence) MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.selectedSticker.id), this.stickerEmojiTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(30.0f), false));
                }
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSet;
                if ((tLRPC$TL_messages_stickerSet2 == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet2.set) == null || !tLRPC$StickerSet.emojis) && !ContentPreviewViewer.getInstance().showMenuFor(view)) {
                    this.stickerImageView.getImageReceiver().setImage(ImageLocation.getForDocument(this.selectedSticker), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.selectedSticker.thumbs, 90), this.selectedSticker), (String) null, "webp", this.stickerSet, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
                    layoutParams2.topMargin = this.scrollOffsetY;
                    this.stickerPreviewLayout.setLayoutParams(layoutParams2);
                    this.stickerPreviewLayout.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    return;
                }
                return;
            }
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) this.adapter.positionsToSets.get(i);
            if (tLRPC$StickerSetCovered != null) {
                this.ignoreMasterDismiss = true;
                dismiss();
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$StickerSetCovered.set;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet2.access_hash;
                tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet2.id;
                StickersAlert stickersAlert = new StickersAlert(this.parentActivity, this.parentFragment, tLRPC$TL_inputStickerSetID, null, null, this.resourcesProvider);
                if (this.masterDismissListener != null) {
                    stickersAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StickersAlert.this.lambda$init$8(dialogInterface);
                        }
                    });
                }
                stickersAlert.show();
            }
        }
    }

    public void lambda$init$8(DialogInterface dialogInterface) {
        this.masterDismissListener.run();
    }

    public void lambda$init$11(View view) {
        checkOptions();
        this.optionsButton.toggleSubMenu();
    }

    public void lambda$init$12(View view) {
        hidePreview();
    }

    public void lambda$init$13(View view) {
        if (this.importingStickersPaths != null) {
            removeSticker(this.selectedStickerPath);
            hidePreview();
            this.selectedStickerPath = null;
            return;
        }
        this.delegate.onStickerSelected(this.selectedSticker, null, this.stickerSet, null, this.clearsInputField, true, 0);
        dismiss();
    }

    private void updateDescription() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.stickerSet);
    }

    private void checkOptions() {
        TLRPC$StickerSet tLRPC$StickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        boolean z = tLRPC$TL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tLRPC$TL_messages_stickerSet.set.id);
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSet;
        if (tLRPC$TL_messages_stickerSet2 != null && (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet2.set) != null && tLRPC$StickerSet.creator && this.deleteItem == null) {
            this.optionsButton.addSubItem(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            this.optionsButton.addSubItem(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z) {
                this.deleteItem = this.optionsButton.addSubItem(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), 0, this.resourcesProvider);
                actionBarPopupWindowLayout.setFitItems(true);
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$checkOptions$14(view);
                    }
                });
                ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, this.resourcesProvider);
                int themedColor = getThemedColor(Theme.key_text_RedBold);
                addItem.setColors(themedColor, themedColor);
                addItem.setSelectorColor(Theme.multAlpha(themedColor, 0.1f));
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$checkOptions$15(view);
                    }
                });
                addItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$checkOptions$17(view);
                    }
                });
                this.deleteItem = this.optionsButton.addSwipeBackItem(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindowLayout);
            }
            this.optionsButton.addColoredGap();
            MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(this.currentAccount, getContext(), this.resourcesProvider, new ArrayList(), 4);
            messageContainsEmojiButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StickersAlert.this.lambda$checkOptions$19(view);
                }
            });
            messageContainsEmojiButton.setTag(R.id.fit_width_tag, 1);
            this.optionsButton.addSubItem(messageContainsEmojiButton, -1, -2);
            int themedColor2 = getThemedColor(Theme.key_text_RedBold);
            this.deleteItem.setColors(themedColor2, themedColor2);
            this.deleteItem.setSelectorColor(Theme.multAlpha(themedColor2, 0.1f));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (this.optionsButton.getPopupLayout() != null) {
            this.optionsButton.getPopupLayout().requestLayout();
        }
    }

    public void lambda$checkOptions$14(View view) {
        this.optionsButton.getPopupLayout().getSwipeBack().closeForeground();
    }

    public void lambda$checkOptions$15(View view) {
        this.optionsButton.closeSubMenu();
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, true);
    }

    public void lambda$checkOptions$17(View view) {
        this.optionsButton.closeSubMenu();
        StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$checkOptions$16();
            }
        });
    }

    public void lambda$checkOptions$16() {
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public void lambda$checkOptions$19(View view) {
        this.optionsButton.closeSubMenu();
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$checkOptions$18();
            }
        }, 200L);
    }

    public void lambda$checkOptions$18() {
        MessagesController.getInstance(this.currentAccount).openByUserName("stickers", this.parentFragment, 1);
    }

    private void updateSendButton() {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        android.graphics.Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.importingStickers != null) {
            this.previewSendButton.setText(LocaleController.getString("ImportStickersRemove", R.string.ImportStickersRemove));
            this.previewSendButton.setTextColor(getThemedColor(Theme.key_text_RedBold));
            float f = min;
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.previewSendButton.setVisibility(0);
            this.previewSendButtonShadow.setVisibility(0);
        } else if (this.delegate != null && ((tLRPC$TL_messages_stickerSet = this.stickerSet) == null || !tLRPC$TL_messages_stickerSet.set.masks)) {
            this.previewSendButton.setText(LocaleController.getString("SendSticker", R.string.SendSticker));
            float f2 = min;
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.previewSendButton.setVisibility(0);
            this.previewSendButtonShadow.setVisibility(0);
        } else {
            this.previewSendButton.setText(LocaleController.getString("Close", R.string.Close));
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(min, min, 17));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(min, min, 17));
            this.previewSendButton.setVisibility(8);
            this.previewSendButtonShadow.setVisibility(8);
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

    public void setCustomButtonDelegate(StickersAlertCustomButtonDelegate stickersAlertCustomButtonDelegate) {
        this.customButtonDelegate = stickersAlertCustomButtonDelegate;
        updateFields();
    }

    public void onSubItemClick(int i) {
        String str;
        BaseFragment baseFragment;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        if (tLRPC$TL_messages_stickerSet == null) {
            return;
        }
        TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
        if (tLRPC$StickerSet != null && tLRPC$StickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addemoji/" + this.stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addstickers/" + this.stickerSet.set.short_name;
        }
        String str2 = str;
        if (i == 1) {
            Context context = this.parentActivity;
            if (context == null && (baseFragment = this.parentFragment) != null) {
                context = baseFragment.getParentActivity();
            }
            if (context == null) {
                context = getContext();
            }
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(context, null, str2, false, str2, false, this.resourcesProvider);
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 != null) {
                baseFragment2.showDialog(anonymousClass11);
                BaseFragment baseFragment3 = this.parentFragment;
                if (baseFragment3 instanceof ChatActivity) {
                    anonymousClass11.setCalcMandatoryInsets(((ChatActivity) baseFragment3).isKeyboardVisible());
                    return;
                }
                return;
            }
            anonymousClass11.show();
        } else if (i == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createCopyLinkBulletin().show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == 3) {
            if (this.isEditModeEnabled) {
                disableEditMode();
            } else {
                enableEditMode();
            }
        } else if (i == 4) {
            StickersDialogs.showNameEditorDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StickersAlert.this.lambda$onSubItemClick$22((CharSequence) obj, (Utilities.Callback) obj2);
                }
            });
        } else if (i == 5) {
            StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.this.lambda$onSubItemClick$23();
                }
            });
        }
    }

    public class AnonymousClass11 extends ShareAlert {
        AnonymousClass11(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                AndroidUtilities.requestAdjustResize(StickersAlert.this.parentFragment.getParentActivity(), StickersAlert.this.parentFragment.getClassGuid());
                if (((ChatActivity) StickersAlert.this.parentFragment).getChatActivityEnterView().getVisibility() == 0) {
                    StickersAlert.this.parentFragment.getFragmentView().requestLayout();
                }
            }
        }

        @Override
        public void onSend(final LongSparseArray<TLRPC$Dialog> longSparseArray, final int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.AnonymousClass11.this.lambda$onSend$0(longSparseArray, i);
                }
            }, 100L);
        }

        public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
            UndoView undoView = StickersAlert.this.parentFragment instanceof ChatActivity ? ((ChatActivity) StickersAlert.this.parentFragment).getUndoView() : StickersAlert.this.parentFragment instanceof ProfileActivity ? ((ProfileActivity) StickersAlert.this.parentFragment).getUndoView() : null;
            if (undoView != null) {
                if (longSparseArray.size() == 1) {
                    undoView.showWithAction(((TLRPC$Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i));
                } else {
                    undoView.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }
    }

    public void lambda$onSubItemClick$22(CharSequence charSequence, final Utilities.Callback callback) {
        this.titleTextView.setText(charSequence);
        TLRPC$TL_stickers_renameStickerSet tLRPC$TL_stickers_renameStickerSet = new TLRPC$TL_stickers_renameStickerSet();
        tLRPC$TL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(this.stickerSet.set);
        tLRPC$TL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_stickers_renameStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.lambda$onSubItemClick$21(Utilities.Callback.this, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$onSubItemClick$21(final Utilities.Callback callback, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.lambda$onSubItemClick$20(TLObject.this, callback);
            }
        });
    }

    public static void lambda$onSubItemClick$20(TLObject tLObject, Utilities.Callback callback) {
        boolean z;
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tLRPC$TL_messages_stickerSet);
            if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tLRPC$TL_messages_stickerSet.set.id)) {
                MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLRPC$TL_messages_stickerSet, 2, null, false, false);
            }
            z = true;
        } else {
            z = false;
        }
        callback.run(Boolean.valueOf(z));
    }

    public void lambda$onSubItemClick$23() {
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public void updateFields() {
        ArrayList<TLRPC$Document> arrayList;
        boolean z;
        TLRPC$StickerSet tLRPC$StickerSet;
        String formatPluralString;
        String formatPluralString2;
        ArrayList<TLRPC$Document> arrayList2;
        TLRPC$StickerSet tLRPC$StickerSet2;
        TLRPC$StickerSet tLRPC$StickerSet3;
        TLRPC$StickerSet tLRPC$StickerSet4;
        TLRPC$StickerSet tLRPC$StickerSet5;
        TLRPC$StickerSet tLRPC$StickerSet6;
        boolean z2;
        TLRPC$StickerSet tLRPC$StickerSet7;
        boolean z3;
        if (this.titleTextView == null) {
            return;
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSet;
        int i = 1;
        if (tLRPC$TL_messages_stickerSet != null && (arrayList = tLRPC$TL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) this.stickerSet.set.title, this.titleTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
            try {
                if (this.urlPattern == null) {
                    this.urlPattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.urlPattern.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.stickerSet.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline(replaceEmoji.subSequence(start + 1, end).toString()) {
                        @Override
                        public void onClick(View view) {
                            MessagesController.getInstance(((BottomSheet) StickersAlert.this).currentAccount).openByUserName(getURL(), StickersAlert.this.parentFragment, 1);
                            StickersAlert.this.dismiss();
                        }
                    }, start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.titleTextView.setText(replaceEmoji);
            if (isEmoji()) {
                int measuredWidth = this.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.adapter.stickersPerRow = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
            } else {
                this.adapter.stickersPerRow = 5;
            }
            this.layoutManager.setSpanCount(this.adapter.stickersPerRow);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSet;
            if (tLRPC$TL_messages_stickerSet2 != null && (tLRPC$StickerSet7 = tLRPC$TL_messages_stickerSet2.set) != null && tLRPC$StickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.customButtonDelegate == null) {
                if (this.stickerSet.documents != null) {
                    for (int i2 = 0; i2 < this.stickerSet.documents.size(); i2++) {
                        if (!MessageObject.isFreeEmoji(this.stickerSet.documents.get(i2))) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    this.premiumButtonView.setVisibility(0);
                    this.pickerBottomLayout.setBackground(null);
                    setButton(null, null, -1);
                    this.premiumButtonView.setButton(LocaleController.getString(R.string.UnlockPremiumEmoji), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersAlert.this.lambda$updateFields$24(view);
                        }
                    });
                    return;
                }
            } else {
                this.premiumButtonView.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = this.stickerSet;
            if (tLRPC$TL_messages_stickerSet3 == null || (tLRPC$StickerSet6 = tLRPC$TL_messages_stickerSet3.set) == null || !tLRPC$StickerSet6.emojis) {
                z = tLRPC$TL_messages_stickerSet3 == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(tLRPC$StickerSet.id);
            } else {
                ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i3 = 0; stickerSets != null && i3 < stickerSets.size(); i3++) {
                    if (stickerSets.get(i3) != null && stickerSets.get(i3).set != null && stickerSets.get(i3).set.id == this.stickerSet.set.id) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                z = !z2;
            }
            if (this.customButtonDelegate != null) {
                setButton(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$updateFields$25(view);
                    }
                }, this.customButtonDelegate.getCustomButtonText(), this.customButtonDelegate.getCustomButtonTextColorKey(), this.customButtonDelegate.getCustomButtonColorKey(), this.customButtonDelegate.getCustomButtonRippleColorKey());
                return;
            }
            if (z) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet4 = this.stickerSet;
                if (tLRPC$TL_messages_stickerSet4 != null && (tLRPC$StickerSet5 = tLRPC$TL_messages_stickerSet4.set) != null && tLRPC$StickerSet5.emojis) {
                    i = 5;
                } else if (tLRPC$TL_messages_stickerSet4 == null || (tLRPC$StickerSet4 = tLRPC$TL_messages_stickerSet4.set) == null || !tLRPC$StickerSet4.masks) {
                    i = 0;
                }
                if (!mediaDataController.areStickersLoaded(i)) {
                    mediaDataController.checkStickers(i);
                    setButton(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet5 = this.stickerSet;
                if (tLRPC$TL_messages_stickerSet5 != null && (tLRPC$StickerSet3 = tLRPC$TL_messages_stickerSet5.set) != null && tLRPC$StickerSet3.masks) {
                    ArrayList<TLRPC$Document> arrayList3 = tLRPC$TL_messages_stickerSet5.documents;
                    formatPluralString2 = LocaleController.formatPluralString("AddManyMasksCount", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                } else if (tLRPC$TL_messages_stickerSet5 == null || (tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet5.set) == null || !tLRPC$StickerSet2.emojis) {
                    formatPluralString2 = LocaleController.formatPluralString("AddManyStickersCount", (tLRPC$TL_messages_stickerSet5 == null || (arrayList2 = tLRPC$TL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), new Object[0]);
                } else {
                    ArrayList<TLRPC$Document> arrayList4 = tLRPC$TL_messages_stickerSet5.documents;
                    formatPluralString2 = LocaleController.formatPluralString("AddManyEmojiCount", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                }
                setButton(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$updateFields$28(view);
                    }
                }, formatPluralString2, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
            } else {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet6 = this.stickerSet;
                TLRPC$StickerSet tLRPC$StickerSet8 = tLRPC$TL_messages_stickerSet6.set;
                boolean z4 = tLRPC$StickerSet8.creator;
                if (z4) {
                    formatPluralString = LocaleController.getString(this.isEditModeEnabled ? R.string.Done : R.string.EditStickers);
                } else if (tLRPC$StickerSet8.masks) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tLRPC$TL_messages_stickerSet6.documents.size(), new Object[0]);
                } else if (tLRPC$StickerSet8.emojis) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", tLRPC$TL_messages_stickerSet6.documents.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyStickersCount", tLRPC$TL_messages_stickerSet6.documents.size(), new Object[0]);
                }
                String str = formatPluralString;
                if (z4) {
                    setButton(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersAlert.this.lambda$updateFields$29(view);
                        }
                    }, str, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
                } else if (this.stickerSet.set.official) {
                    setButton(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersAlert.this.lambda$updateFields$30(view);
                        }
                    }, str, Theme.key_text_RedBold);
                } else {
                    setButton(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersAlert.this.lambda$updateFields$31(view);
                        }
                    }, str, Theme.key_text_RedBold);
                }
            }
            this.adapter.notifyDataSetChanged();
            return;
        }
        ArrayList<Parcelable> arrayList5 = this.importingStickers;
        if (arrayList5 != null) {
            LinkSpanDrawable.LinksTextView linksTextView = this.titleTextView;
            ArrayList<SendMessagesHelper.ImportingSticker> arrayList6 = this.importingStickersPaths;
            linksTextView.setText(LocaleController.formatPluralString("Stickers", arrayList6 != null ? arrayList6.size() : arrayList5.size(), new Object[0]));
            HashMap<String, SendMessagesHelper.ImportingSticker> hashMap = this.uploadImportStickers;
            if (hashMap == null || hashMap.isEmpty()) {
                View.OnClickListener onClickListener = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StickersAlert.this.lambda$updateFields$32(view);
                    }
                };
                int i4 = R.string.ImportStickers;
                Object[] objArr = new Object[1];
                ArrayList arrayList7 = this.importingStickersPaths;
                if (arrayList7 == null) {
                    arrayList7 = this.importingStickers;
                }
                objArr[0] = LocaleController.formatPluralString("Stickers", arrayList7.size(), new Object[0]);
                setButton(onClickListener, LocaleController.formatString("ImportStickers", i4, objArr), Theme.key_dialogTextBlue2);
                this.pickerBottomLayout.setEnabled(true);
                return;
            }
            setButton(null, LocaleController.getString("ImportStickersProcessing", R.string.ImportStickersProcessing), Theme.key_dialogTextGray2);
            this.pickerBottomLayout.setEnabled(false);
            return;
        }
        setButton(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$updateFields$33(view);
            }
        }, LocaleController.getString("Close", R.string.Close), Theme.key_dialogTextBlue2);
    }

    public void lambda$updateFields$24(View view) {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).lambda$runLinkRequest$87(new PremiumPreviewFragment(null));
        }
    }

    public void lambda$updateFields$25(View view) {
        if (this.customButtonDelegate.onCustomButtonPressed()) {
            dismiss();
        }
    }

    public void lambda$updateFields$28(View view) {
        dismiss();
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetInstalled();
        }
        if (this.inputStickerSet == null || MediaDataController.getInstance(this.currentAccount).cancelRemovingStickerSet(this.inputStickerSet.id)) {
            return;
        }
        TLRPC$TL_messages_installStickerSet tLRPC$TL_messages_installStickerSet = new TLRPC$TL_messages_installStickerSet();
        tLRPC$TL_messages_installStickerSet.stickerset = this.inputStickerSet;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_installStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$updateFields$27(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$updateFields$27(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$updateFields$26(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$updateFields$26(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        int i;
        TLRPC$StickerSet tLRPC$StickerSet = this.stickerSet.set;
        if (tLRPC$StickerSet.masks) {
            i = 1;
        } else {
            i = tLRPC$StickerSet.emojis ? 5 : 0;
        }
        try {
            if (tLRPC$TL_error == null) {
                if (this.showTooltipWhenToggle) {
                    Bulletin.make(this.parentFragment, new StickerSetBulletinLayout(this.pickerBottomFrameLayout.getContext(), this.stickerSet, 2, null, this.resourcesProvider), 1500).show();
                }
                if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(this.currentAccount).processStickerSetInstallResultArchive(this.parentFragment, true, i, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(getContext(), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(this.currentAccount).loadStickers(i, false, true);
    }

    public void lambda$updateFields$29(View view) {
        if (this.isEditModeEnabled) {
            disableEditMode();
        } else {
            enableEditMode();
        }
    }

    public void lambda$updateFields$30(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$31(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        dismiss();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 0, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$32(View view) {
        showNameEnterAlert();
    }

    public void lambda$updateFields$33(View view) {
        dismiss();
    }

    private void showNameEnterAlert() {
        Context context = getContext();
        final int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString("ImportStickersEnterName", R.string.ImportStickersEnterName));
        builder.setPositiveButton(LocaleController.getString("Next", R.string.Next), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                StickersAlert.lambda$showNameEnterAlert$34(dialogInterface, i);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        final TextView textView = new TextView(context);
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(getThemedColor(Theme.key_dialogTextHint));
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
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_dialogInputField), Theme.getColor(Theme.key_dialogInputFieldActivated), Theme.getColor(Theme.key_text_RedBold));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
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
                if (iArr[0] != 2) {
                    return;
                }
                StickersAlert.this.checkUrlAvailable(textView, editTextBoldCursor.getText().toString(), false);
            }
        });
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                boolean lambda$showNameEnterAlert$35;
                lambda$showNameEnterAlert$35 = StickersAlert.lambda$showNameEnterAlert$35(AlertDialog.Builder.this, textView3, i, keyEvent);
                return lambda$showNameEnterAlert$35;
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
        textView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                StickersAlert.lambda$showNameEnterAlert$38(EditTextBoldCursor.this, dialogInterface);
            }
        });
        create.show();
        editTextBoldCursor.requestFocus();
        create.getButton(-1).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickersAlert.this.lambda$showNameEnterAlert$42(iArr, editTextBoldCursor, textView, textView2, builder, view);
            }
        });
    }

    public static boolean lambda$showNameEnterAlert$35(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            builder.create().getButton(-1).callOnClick();
            return true;
        }
        return false;
    }

    public static void lambda$showNameEnterAlert$38(final EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.lambda$showNameEnterAlert$37(EditTextBoldCursor.this);
            }
        });
    }

    public static void lambda$showNameEnterAlert$37(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public void lambda$showNameEnterAlert$42(final int[] iArr, final EditTextBoldCursor editTextBoldCursor, final TextView textView, final TextView textView2, AlertDialog.Builder builder, View view) {
        if (iArr[0] == 1) {
            return;
        }
        if (iArr[0] == 0) {
            iArr[0] = 1;
            TLRPC$TL_stickers_suggestShortName tLRPC$TL_stickers_suggestShortName = new TLRPC$TL_stickers_suggestShortName();
            String obj = editTextBoldCursor.getText().toString();
            this.setTitle = obj;
            tLRPC$TL_stickers_suggestShortName.title = obj;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stickers_suggestShortName, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickersAlert.this.lambda$showNameEnterAlert$40(editTextBoldCursor, textView, textView2, iArr, tLObject, tLRPC$TL_error);
                }
            });
        } else if (iArr[0] == 2) {
            iArr[0] = 3;
            if (!this.lastNameAvailable) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                editTextBoldCursor.performHapticFeedback(3, 2);
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(this.currentAccount).prepareImportStickers(this.setTitle, this.lastCheckName, this.importingSoftware, this.importingStickersPaths, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    StickersAlert.this.lambda$showNameEnterAlert$41(str);
                }
            });
            builder.getDismissRunnable().run();
            dismiss();
        }
    }

    public void lambda$showNameEnterAlert$40(final EditTextBoldCursor editTextBoldCursor, final TextView textView, final TextView textView2, final int[] iArr, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$showNameEnterAlert$39(tLObject, editTextBoldCursor, textView, textView2, iArr);
            }
        });
    }

    public void lambda$showNameEnterAlert$39(TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
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

    public void lambda$showNameEnterAlert$41(String str) {
        new ImportingAlert(getContext(), this.lastCheckName, null, this.resourcesProvider).show();
    }

    public void checkUrlAvailable(final TextView textView, final String str, boolean z) {
        if (z) {
            textView.setText(LocaleController.getString("ImportStickersLinkAvailable", R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
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
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
            return;
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString("ImportStickersLinkInvalid", R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString("ImportStickersEnterUrlInfo", R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString("ImportStickersLinkInvalidShort", R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
        } else if (str.length() > 32) {
            textView.setText(LocaleController.getString("ImportStickersLinkInvalidLong", R.string.ImportStickersLinkInvalidLong));
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
        } else {
            textView.setText(LocaleController.getString("ImportStickersLinkChecking", R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText8));
            this.lastCheckName = str;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.this.lambda$checkUrlAvailable$45(str, textView);
                }
            };
            this.checkRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 300L);
        }
    }

    public void lambda$checkUrlAvailable$45(final String str, final TextView textView) {
        TLRPC$TL_stickers_checkShortName tLRPC$TL_stickers_checkShortName = new TLRPC$TL_stickers_checkShortName();
        tLRPC$TL_stickers_checkShortName.short_name = str;
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stickers_checkShortName, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StickersAlert.this.lambda$checkUrlAvailable$44(str, textView, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$checkUrlAvailable$44(final String str, final TextView textView, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$checkUrlAvailable$43(str, tLRPC$TL_error, tLObject, textView);
            }
        });
    }

    public void lambda$checkUrlAvailable$43(String str, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TextView textView) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tLRPC$TL_error == null && (tLObject instanceof TLRPC$TL_boolTrue)) {
            textView.setText(LocaleController.getString("ImportStickersLinkAvailable", R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
            this.lastNameAvailable = true;
            return;
        }
        textView.setText(LocaleController.getString("ImportStickersLinkTaken", R.string.ImportStickersLinkTaken));
        textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
        this.lastNameAvailable = false;
    }

    @SuppressLint({"NewApi"})
    public void updateLayout() {
        if (this.gridView.getChildCount() <= 0) {
            setScrollOffsetY(this.gridView.getPaddingTop());
            return;
        }
        View view = null;
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < this.gridView.getChildCount(); i3++) {
            View childAt = this.gridView.getChildAt(i3);
            int childAdapterPosition = this.gridView.getChildAdapterPosition(childAt);
            if (i2 == -1 || i2 > childAdapterPosition) {
                view = childAt;
                i2 = childAdapterPosition;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            runShadowAnimation(0, false);
            i = top;
        } else {
            runShadowAnimation(0, true);
        }
        runShadowAnimation(1, true);
        if (this.scrollOffsetY != i) {
            setScrollOffsetY(i);
        }
    }

    public void setScrollOffsetY(int i) {
        this.scrollOffsetY = i;
        if (this.stickerSetCovereds == null) {
            float f = i;
            this.titleTextView.setTranslationY(f);
            TextView textView = this.descriptionTextView;
            if (textView != null) {
                textView.setTranslationY(f);
            }
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
        if (this.stickerSetCovereds != null) {
            return;
        }
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
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
                if (StickersAlert.this.shadowAnimation[i] == null || !StickersAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    StickersAlert.this.shadow[i].setVisibility(4);
                }
                StickersAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (StickersAlert.this.shadowAnimation[i] == null || !StickersAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                StickersAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public void setOnDismissListener(Runnable runnable) {
        this.onDismissListener = runnable;
    }

    @Override
    public void dismiss() {
        Runnable runnable;
        super.dismiss();
        this.stickersShaker.stopShake(false);
        if (!this.ignoreMasterDismiss && (runnable = this.masterDismissListener) != null) {
            runnable.run();
        }
        Runnable runnable2 = this.onDismissListener;
        if (runnable2 != null) {
            runnable2.run();
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                if (StickersAlert.this.pickerBottomFrameLayout != null) {
                    return StickersAlert.this.pickerBottomFrameLayout.getHeight();
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
        } else if (i == NotificationCenter.fileUploaded) {
            HashMap<String, SendMessagesHelper.ImportingSticker> hashMap = this.uploadImportStickers;
            if (hashMap == null || (importingSticker = hashMap.get((str = (String) objArr[0]))) == null) {
                return;
            }
            importingSticker.uploadMedia(this.currentAccount, (TLRPC$InputFile) objArr[1], new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.this.lambda$didReceivedNotification$46(str, importingSticker);
                }
            });
        } else if (i == NotificationCenter.fileUploadFailed) {
            HashMap<String, SendMessagesHelper.ImportingSticker> hashMap2 = this.uploadImportStickers;
            if (hashMap2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker remove = hashMap2.remove((String) objArr[0]);
            if (remove != null) {
                removeSticker(remove);
            }
            if (this.uploadImportStickers.isEmpty()) {
                updateFields();
            }
        } else if (i == NotificationCenter.stickersDidLoad) {
            if (this.inputStickerSet != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.inputStickerSet.short_name;
                r3 = str2 != null ? mediaDataController.getStickerSetByName(str2) : null;
                if (r3 == null) {
                    r3 = mediaDataController.getStickerSetById(this.inputStickerSet.id);
                }
            }
            if (r3 != null && r3 != this.stickerSet) {
                this.stickerSet = r3;
                loadStickerSet();
            }
            updateFields();
        }
    }

    public void lambda$didReceivedNotification$46(String str, SendMessagesHelper.ImportingSticker importingSticker) {
        if (isDismissed()) {
            return;
        }
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

    private void setButton(View.OnClickListener onClickListener, String str, int i) {
        setButton(onClickListener, str, i, -1, -1);
    }

    private void setButton(View.OnClickListener onClickListener, String str, int i, int i2, int i3) {
        if (i >= 0) {
            AnimatedTextView animatedTextView = this.pickerBottomLayout;
            this.buttonTextColorKey = i;
            animatedTextView.setTextColor(getThemedColor(i));
        }
        this.pickerBottomLayout.setText(str, false);
        this.pickerBottomLayout.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.pickerBottomLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.shadow[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.gridView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams();
        if (onClickListener == null) {
            this.pickerBottomLayout.setAlpha(0.0f);
        } else if (i2 >= 0 && i3 >= 0) {
            this.pickerBottomLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor(i2), getThemedColor(i3)));
            this.pickerBottomFrameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            int dp = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp;
            marginLayoutParams.rightMargin = dp;
            marginLayoutParams.topMargin = dp;
            marginLayoutParams.leftMargin = dp;
            int dp2 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp2;
            marginLayoutParams3.bottomMargin = dp2;
            marginLayoutParams4.bottomMargin = dp2;
            if (this.pickerBottomLayout.getAlpha() < 1.0f) {
                this.pickerBottomLayout.animate().alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(240L).start();
            }
        } else {
            this.pickerBottomLayout.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_dialogBackground), Theme.multAlpha(getThemedColor(Theme.key_text_RedBold), 0.1f)));
            this.pickerBottomFrameLayout.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp3 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.pickerBottomLayout.getAlpha() < 1.0f) {
                this.pickerBottomLayout.animate().alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(240L).start();
            }
        }
        this.containerView.requestLayout();
    }

    public void setShowTooltipWhenToggle(boolean z) {
        this.showTooltipWhenToggle = z;
    }

    public void updateColors() {
        updateColors(false);
    }

    public void updateColors(boolean z) {
        this.adapter.updateColors();
        this.titleTextView.setHighlightColor(getThemedColor(Theme.key_dialogLinkSelection));
        this.stickerPreviewLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground) & (-536870913));
        this.optionsButton.setIconColor(getThemedColor(Theme.key_sheet_other));
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        this.optionsButton.setPopupItemsSelectorColor(getThemedColor(Theme.key_dialogButtonSelector));
        this.optionsButton.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        if (this.deleteItem != null) {
            int themedColor = getThemedColor(Theme.key_text_RedBold);
            this.deleteItem.setColors(themedColor, themedColor);
            this.deleteItem.setSelectorColor(Theme.multAlpha(themedColor, 0.1f));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor);
            }
        }
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
        if (Theme.isAnimatingColor() || this.animatingDescriptions == null) {
            return;
        }
        this.animatingDescriptions = null;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                StickersAlert.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(viewGroup, 0, null, null, drawableArr, null, i));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        this.adapter.getThemeDescriptions(arrayList, themeDescriptionDelegate);
        View view = this.shadow[0];
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_dialogShadowLine;
        arrayList.add(new ThemeDescription(view, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.shadow[1], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.gridView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogTextBlack));
        if (this.descriptionTextView != null) {
            arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_chat_emojiPanelTrendingDescription));
        }
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_LINKCOLOR, null, null, null, null, Theme.key_dialogTextLink));
        arrayList.add(new ThemeDescription(this.optionsButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_player_actionBarSelector));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i));
        AnimatedTextView animatedTextView = this.pickerBottomLayout;
        int i4 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i5 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(animatedTextView, i4, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, this.buttonTextColorKey));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.previewSendButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.previewSendButtonShadow, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_dialogLinkSelection));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_sheet_other));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuBackground));
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
            if (StickersAlert.this.stickerSetCovereds != null) {
                Object obj = this.cache.get(i);
                if (obj != null) {
                    return obj instanceof TLRPC$Document ? 0 : 2;
                }
                return 1;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = StickersAlert.this.stickerSet;
            return (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.documents.size() != i) ? 0 : 3;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this.context, false, ((BottomSheet) StickersAlert.this).resourcesProvider) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824));
                    }
                };
                stickerEmojiCell.getImageView().setLayerNum(7);
                frameLayout = stickerEmojiCell;
            } else if (i == 1) {
                frameLayout = new EmptyCell(this.context);
            } else if (i == 2) {
                frameLayout = new FeaturedStickerSetInfoCell(this.context, 8, true, false, ((BottomSheet) StickersAlert.this).resourcesProvider);
            } else {
                frameLayout = i != 3 ? null : new AddStickerBtnView(this.context, ((BottomSheet) StickersAlert.this).resourcesProvider);
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (StickersAlert.this.stickerSetCovereds == null) {
                if (StickersAlert.this.importingStickers != null) {
                    ((StickerEmojiCell) viewHolder.itemView).setSticker((SendMessagesHelper.ImportingSticker) StickersAlert.this.importingStickersPaths.get(i));
                    return;
                } else if (viewHolder.getItemViewType() != 3) {
                    final StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = StickersAlert.this.stickerSet;
                    if (tLRPC$TL_messages_stickerSet == null) {
                        return;
                    }
                    TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
                    StickersAlert stickersAlert = StickersAlert.this;
                    stickerEmojiCell.setSticker(tLRPC$Document, null, stickersAlert.stickerSet, null, stickersAlert.showEmoji, StickersAlert.this.isEditModeEnabled);
                    stickerEmojiCell.editModeIcon.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StickersAlert.GridAdapter.this.lambda$onBindViewHolder$0(stickerEmojiCell, view);
                        }
                    });
                    return;
                } else {
                    return;
                }
            }
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((StickerEmojiCell) viewHolder.itemView).setSticker((TLRPC$Document) this.cache.get(i), this.positionsToSets.get(i), false);
            } else if (itemViewType == 1) {
                ((EmptyCell) viewHolder.itemView).setHeight(AndroidUtilities.dp(82.0f));
            } else if (itemViewType != 2) {
            } else {
                ((FeaturedStickerSetInfoCell) viewHolder.itemView).setStickerSet((TLRPC$StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(((Integer) this.cache.get(i)).intValue()), false);
            }
        }

        public void lambda$onBindViewHolder$0(StickerEmojiCell stickerEmojiCell, View view) {
            ContentPreviewViewer.getInstance().setDelegate(StickersAlert.this.previewDelegate);
            ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
        }

        @Override
        public void notifyDataSetChanged() {
            List list;
            int i;
            int i2;
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
                for (int i3 = 0; i3 < StickersAlert.this.stickerSetCovereds.size(); i3++) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(i3);
                    if (tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered) {
                        list = ((TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered).documents;
                    } else {
                        list = tLRPC$StickerSetCovered.covers;
                    }
                    if (list != null) {
                        list = list.subList(0, Math.min(list.size(), this.stickersPerRow));
                    }
                    if (list != null && (!list.isEmpty() || tLRPC$StickerSetCovered.cover != null)) {
                        this.stickersRowCount++;
                        this.positionsToSets.put(this.totalItems, tLRPC$StickerSetCovered);
                        SparseArray<Object> sparseArray = this.cache;
                        int i4 = this.totalItems;
                        this.totalItems = i4 + 1;
                        sparseArray.put(i4, Integer.valueOf(i3));
                        int i5 = this.totalItems / this.stickersPerRow;
                        if (!list.isEmpty()) {
                            i = (int) Math.ceil(list.size() / this.stickersPerRow);
                            for (int i6 = 0; i6 < list.size(); i6++) {
                                this.cache.put(this.totalItems + i6, list.get(i6));
                            }
                        } else {
                            this.cache.put(this.totalItems, tLRPC$StickerSetCovered.cover);
                            i = 1;
                        }
                        int i7 = 0;
                        while (true) {
                            i2 = this.stickersPerRow;
                            if (i7 >= i * i2) {
                                break;
                            }
                            this.positionsToSets.put(this.totalItems + i7, tLRPC$StickerSetCovered);
                            i7++;
                        }
                        this.totalItems += i * i2;
                    }
                }
            } else if (StickersAlert.this.importingStickersPaths != null) {
                this.totalItems = StickersAlert.this.importingStickersPaths.size();
            } else {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = StickersAlert.this.stickerSet;
                this.totalItems = tLRPC$TL_messages_stickerSet != null ? tLRPC$TL_messages_stickerSet.documents.size() : 0;
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = StickersAlert.this.stickerSet;
                if (tLRPC$TL_messages_stickerSet2 != null && tLRPC$TL_messages_stickerSet2.set.creator && tLRPC$TL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC$StickerSet tLRPC$StickerSet = StickersAlert.this.stickerSet.set;
                    if (!tLRPC$StickerSet.masks && !tLRPC$StickerSet.emojis) {
                        this.totalItems++;
                    }
                }
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

    @SuppressLint({"NotifyDataSetChanged"})
    public void enableEditMode() {
        if (this.isEditModeEnabled) {
            return;
        }
        this.dragAndDropHelper.attachToRecyclerView(this.gridView);
        this.isEditModeEnabled = true;
        this.stickersShaker.startShake();
        AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer<View>) new Consumer() {
            @Override
            public final void accept(Object obj) {
                StickersAlert.lambda$enableEditMode$47((View) obj);
            }
        });
        this.optionsButton.postDelayed(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.this.lambda$enableEditMode$48();
            }
        }, 200L);
        this.pickerBottomLayout.setText(LocaleController.getString(R.string.Done), true);
    }

    public static void lambda$enableEditMode$47(View view) {
        if (view instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view).enableEditMode(true);
        }
    }

    public void lambda$enableEditMode$48() {
        this.adapter.notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void disableEditMode() {
        if (this.isEditModeEnabled) {
            this.dragAndDropHelper.attachToRecyclerView(null);
            this.isEditModeEnabled = false;
            this.stickersShaker.stopShake(true);
            AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer<View>) new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StickersAlert.lambda$disableEditMode$49((View) obj);
                }
            });
            this.optionsButton.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    StickersAlert.this.lambda$disableEditMode$50();
                }
            }, 200L);
            this.pickerBottomLayout.setText(LocaleController.getString(R.string.EditStickers), true);
        }
    }

    public static void lambda$disableEditMode$49(View view) {
        if (view instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view).disableEditMode(true);
        }
    }

    public void lambda$disableEditMode$50() {
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().closeWithMenu();
        } else {
            super.onBackPressed();
        }
    }

    public static class AddStickerBtnView extends FrameLayout {
        public AddStickerBtnView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            View view = new View(context);
            int dp = AndroidUtilities.dp(28.0f);
            int i = Theme.key_chat_emojiPanelIcon;
            Drawable createRoundRectDrawable = Theme.createRoundRectDrawable(dp, Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.12f));
            Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(createRoundRectDrawable, mutate);
            combinedDrawable.setCustomSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            view.setBackground(combinedDrawable);
            ScaleStateListAnimator.apply(view);
            addView(view, LayoutHelper.createFrame(56, 56, 17));
        }
    }

    public static class StickersShaker {
        private final List<Float> imageRotations;
        private final List<Float> imageTranslationsX;
        private final List<Float> imageTranslationsY;
        private final List<ValueAnimator> rotateAnimators;
        private final List<ValueAnimator> translateXAnimators;
        private final List<ValueAnimator> translateYAnimators;

        private StickersShaker() {
            this.rotateAnimators = new ArrayList();
            this.translateXAnimators = new ArrayList();
            this.translateYAnimators = new ArrayList();
            this.imageRotations = new ArrayList();
            this.imageTranslationsX = new ArrayList();
            this.imageTranslationsY = new ArrayList();
        }

        StickersShaker(AnonymousClass1 anonymousClass1) {
            this();
        }

        private void init() {
            if (this.imageRotations.isEmpty()) {
                for (int i = 0; i < 6; i++) {
                    this.imageRotations.add(Float.valueOf(0.0f));
                    this.imageTranslationsX.add(Float.valueOf(0.0f));
                    this.imageTranslationsY.add(Float.valueOf(0.0f));
                }
            }
        }

        public float getRotationValueForPos(int i) {
            if (this.imageRotations.isEmpty()) {
                return 0.0f;
            }
            return this.imageRotations.get(i - ((i / 6) * 6)).floatValue();
        }

        public float getTranslateXValueForPos(int i) {
            if (this.imageTranslationsX.isEmpty()) {
                return 0.0f;
            }
            return this.imageTranslationsX.get(i - ((i / 6) * 6)).floatValue();
        }

        public float getTranslateYValueForPos(int i) {
            if (this.imageTranslationsY.isEmpty()) {
                return 0.0f;
            }
            return this.imageTranslationsY.get(i - ((i / 6) * 6)).floatValue();
        }

        public void startShake() {
            stopShake(false);
            init();
            for (final int i = 0; i < 6; i++) {
                long nextFloat = Utilities.random.nextFloat() * 300;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        StickersAlert.StickersShaker.this.lambda$startShake$0(i, valueAnimator);
                    }
                });
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setCurrentPlayTime(nextFloat);
                long j = 300;
                ofFloat.setDuration(j);
                ofFloat.start();
                float dp = AndroidUtilities.dp(0.5f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        StickersAlert.StickersShaker.this.lambda$startShake$1(i, valueAnimator);
                    }
                });
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.setCurrentPlayTime(nextFloat);
                double d = 300;
                Double.isNaN(d);
                ofFloat2.setDuration((long) (d * 1.2d));
                ofFloat2.start();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        StickersAlert.StickersShaker.this.lambda$startShake$2(i, valueAnimator);
                    }
                });
                ofFloat3.setRepeatCount(-1);
                ofFloat3.setRepeatMode(1);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ofFloat3.setCurrentPlayTime(nextFloat);
                ofFloat3.setDuration(j);
                ofFloat3.start();
                this.rotateAnimators.add(ofFloat);
                this.translateXAnimators.add(ofFloat2);
                this.translateYAnimators.add(ofFloat3);
            }
        }

        public void lambda$startShake$0(int i, ValueAnimator valueAnimator) {
            this.imageRotations.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }

        public void lambda$startShake$1(int i, ValueAnimator valueAnimator) {
            this.imageTranslationsX.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }

        public void lambda$startShake$2(int i, ValueAnimator valueAnimator) {
            this.imageTranslationsY.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }

        public void stopShake(boolean z) {
            for (final int i = 0; i < this.rotateAnimators.size(); i++) {
                this.rotateAnimators.get(i).cancel();
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.imageRotations.get(i).floatValue(), 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StickersAlert.StickersShaker.this.lambda$stopShake$3(i, valueAnimator);
                        }
                    });
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                }
            }
            for (final int i2 = 0; i2 < this.translateXAnimators.size(); i2++) {
                this.translateXAnimators.get(i2).cancel();
                if (z) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.imageTranslationsX.get(i2).floatValue(), 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StickersAlert.StickersShaker.this.lambda$stopShake$4(i2, valueAnimator);
                        }
                    });
                    ofFloat2.setDuration(100L);
                    ofFloat2.start();
                }
            }
            for (final int i3 = 0; i3 < this.translateYAnimators.size(); i3++) {
                this.translateYAnimators.get(i3).cancel();
                if (z) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.imageTranslationsY.get(i3).floatValue(), 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StickersAlert.StickersShaker.this.lambda$stopShake$5(i3, valueAnimator);
                        }
                    });
                    ofFloat3.setDuration(100L);
                    ofFloat3.start();
                }
            }
            this.translateYAnimators.clear();
            this.translateXAnimators.clear();
            this.rotateAnimators.clear();
        }

        public void lambda$stopShake$3(int i, ValueAnimator valueAnimator) {
            this.imageRotations.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }

        public void lambda$stopShake$4(int i, ValueAnimator valueAnimator) {
            this.imageTranslationsX.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }

        public void lambda$stopShake$5(int i, ValueAnimator valueAnimator) {
            this.imageTranslationsY.set(i, Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }
}
