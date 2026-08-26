package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.os.BuildCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.emojiview.FoundStickerPackButton;
import org.telegram.ui.Components.emojiview.FoundStickerPackCell;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$$ExternalSyntheticLambda2;

public final class ColorPicker$$ExternalSyntheticLambda6 implements NumberPicker.Formatter, NumberPicker.OnScrollListener, AlertDialog.OnButtonClickListener, NumberPicker.OnValueChangeListener, ListAnimator.Callback, ImageReceiver.ImageReceiverDelegate, AlertsCreator.ScheduleDatePickerDelegate, OnApplyWindowInsetsListener, BlurVisibilityDrawable.DrawRunnable, InputConnectionCompat$OnCommitContentListener, RecyclerListView.OnItemLongClickListener, CameraController.VideoTakeCallback, PhotoAttachPhotoCell.ParentFastScrollDelegate, StoryViewer.PlaceProvider, ActionBarMenuItem.ActionBarMenuItemDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener, SpoilersClickDetector.OnSpoilerClickedListener, Utilities.Callback5 {
    public final int $r8$classId;
    public final Object f$0;

    public ColorPicker$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ((AutoDeletePopupWrapper.Callback) this.f$0).setAutoDeleteHistory(i * 60, i == 0 ? 71 : 70);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 6:
                AttachBotIntroTopView attachBotIntroTopView = (AttachBotIntroTopView) obj;
                attachBotIntroTopView.getClass();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(attachBotIntroTopView, 19));
                duration.start();
                break;
            default:
                BackupImageView backupImageView = (BackupImageView) obj;
                backupImageView.getClass();
                if (z && !z2) {
                    backupImageView.checkCreateBlurredImage();
                    break;
                }
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void draw(Canvas canvas, int i) {
        ((Bulletin.Layout) this.f$0).dispatchDrawImplBlur(canvas, i);
    }

    @Override
    public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
        ChatAvatarContainer.AnonymousClass1 anonymousClass1 = (ChatAvatarContainer.AnonymousClass1) ((UserCell.AnonymousClass1) this.f$0).this$0;
        ImageReceiver imageReceiver = anonymousClass1.imageReceiver;
        transitionViewHolder.storyImage = imageReceiver;
        transitionViewHolder.crossfadeToAvatarImage = imageReceiver;
        UserCell.AnonymousClass1 anonymousClass2 = anonymousClass1.params;
        transitionViewHolder.params = anonymousClass2;
        boolean z = anonymousClass2.drawnLive;
        ChatAvatarContainer.AnonymousClass1 anonymousClass3 = ChatAvatarContainer.this.avatarImageView;
        transitionViewHolder.view = anonymousClass3;
        transitionViewHolder.alpha = anonymousClass3.getAlpha();
        transitionViewHolder.clipTop = 0.0f;
        transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
        transitionViewHolder.clipParent = (View) anonymousClass1.getParent();
        return true;
    }

    @Override
    public String format(int i) {
        return ((String[]) this.f$0)[i];
    }

    @Override
    public boolean hasChanges() {
        return false;
    }

    @Override
    public void loadNext(boolean z) {
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public boolean onApplyMetadataAnimation(float f) {
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Bulletin.BulletinWindow bulletinWindow = (Bulletin.BulletinWindow) this.f$0;
        bulletinWindow.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Bulletin.BulletinWindow.BulletinWindowLayout bulletinWindowLayout = bulletinWindow.container;
        if (bulletinWindowLayout != null) {
            bulletinWindowLayout.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        }
        view.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 3:
                ((LaunchActivity$$ExternalSyntheticLambda121) this.f$0).run();
                break;
            case 11:
                ChatActivityEnterView.this.emojiView.clearRecentEmoji();
                break;
            case 13:
                ((ChatLinkActivity$$ExternalSyntheticLambda9) this.f$0).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 17:
                ((ChatAttachAlertPollLayout) this.f$0).parentAlert.lambda$showGiftOfferSheet$15();
                break;
            case 18:
                ChatAttachAlertPollLayout.this.emojiView.clearRecentEmoji();
                break;
            case 22:
                EditTextEmoji.this.emojiView.clearRecentEmoji();
                break;
            case 25:
                MediaDataController.getInstance(EmojiView.this.currentAccount).clearRecentStickers();
                break;
            case 27:
                ((ChatActivity$$ExternalSyntheticLambda17) this.f$0).run();
                break;
            case 28:
                ((GigagroupConvertAlert) this.f$0).onCovert();
                break;
            default:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$1$20();
                break;
        }
    }

    @Override
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        int i2 = 25;
        ChatActivityEnterView.ChatActivityEditTextCaption chatActivityEditTextCaption = (ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.isLiveComment) {
            return true;
        }
        int i3 = BuildCompat.$r8$clinit;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.mImpl.requestPermission();
            } catch (Exception unused) {
                return false;
            }
        }
        if (!inputContentInfoCompat.mImpl.getDescription().hasMimeType("image/gif")) {
            InputContentInfoCompat.InputContentInfoCompatImpl inputContentInfoCompatImpl = inputContentInfoCompat.mImpl;
            if (!SendMessagesHelper.shouldSendWebPAsSticker(null, inputContentInfoCompatImpl.getContentUri())) {
                chatActivityEditTextCaption.editPhoto(inputContentInfoCompatImpl.getContentUri(), inputContentInfoCompatImpl.getDescription().getMimeType(0));
                return true;
            }
        }
        if (!chatActivityEnterView.isInScheduleMode()) {
            chatActivityEditTextCaption.send(inputContentInfoCompat, true, 0, 0);
            return true;
        }
        AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.parentFragment.getDialogId(), -1L, 0, new ChatActivity$$ExternalSyntheticLambda189(i2, chatActivityEditTextCaption, inputContentInfoCompat), null, chatActivityEnterView.resourcesProvider);
        return true;
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        CustomPopupMenu customPopupMenu = (CustomPopupMenu) this.f$0;
        customPopupMenu.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = customPopupMenu.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            actionBarPopupWindow.dismiss(true);
        }
    }

    @Override
    public void onFinishMetadataAnimation(boolean z) {
    }

    @Override
    public void onFinishVideoRecording(String str, long j) {
        int i;
        int i2;
        ChatAttachAlertPhotoLayout.AnonymousClass10 anonymousClass10 = (ChatAttachAlertPhotoLayout.AnonymousClass10) this.f$0;
        if (anonymousClass10.outputFile != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (chatAttachAlertPhotoLayout.parentAlert.destroyed || chatAttachAlertPhotoLayout.cameraView == null) {
                return;
            }
            ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i = options.outWidth;
                try {
                    i2 = options.outHeight;
                } catch (Exception unused) {
                    i2 = 0;
                }
            } catch (Exception unused2) {
                i = 0;
            }
            int i3 = i;
            int i4 = ChatAttachAlertPhotoLayout.lastImageId;
            ChatAttachAlertPhotoLayout.lastImageId = i4 - 1;
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i4, 0L, anonymousClass10.outputFile.getAbsolutePath(), 0, true, i3, i2, 0L);
            photoEntry.duration = (int) (j / 1000.0f);
            photoEntry.thumbPath = str;
            if (chatAttachAlertPhotoLayout.parentAlert.avatarPicker != 0 && chatAttachAlertPhotoLayout.cameraView.isFrontface()) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.openPhotoViewer(photoEntry, false, false);
        }
    }

    @Override
    public void onForceApplyChanges() {
    }

    @Override
    public void onItemClick(int i) {
        switch (this.$r8$classId) {
            case 0:
                ColorPicker.ColorPickerDelegate colorPickerDelegate = ((ColorPicker) this.f$0).delegate;
                if (i == 1 || i == 2) {
                    colorPickerDelegate.openThemeCreate(i == 2);
                } else if (i == 3) {
                    colorPickerDelegate.deleteTheme();
                }
                break;
            default:
                EmojiPacksAlert.access$6500((EmojiPacksAlert) this.f$0, i);
                break;
        }
    }

    @Override
    public void onItemsChanged() {
        AnimatedLinearLayout animatedLinearLayout = (AnimatedLinearLayout) this.f$0;
        animatedLinearLayout.checkViewsVisibility();
        animatedLinearLayout.onItemsChanged();
    }

    @Override
    public void onPrepareMetadataAnimation() {
    }

    @Override
    public void onScrollStateChange(int i) {
        if (i == 0) {
            ((AlertsCreator$$ExternalSyntheticLambda70) this.f$0).run();
        }
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        ((EditTextEffects) this.f$0).onSpoilerClicked(spoilerEffect, f, f2);
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        AlertsCreator.AnonymousClass47 anonymousClass47 = (AlertsCreator.AnonymousClass47) this.f$0;
        try {
            if (i == 0) {
                anonymousClass47.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                anonymousClass47.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void preLayout(int i, long j, StoryViewer$$ExternalSyntheticLambda2 storyViewer$$ExternalSyntheticLambda2) {
        storyViewer$$ExternalSyntheticLambda2.run();
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.TL_messages_stickerSet stickerSet4;
        switch (this.$r8$classId) {
            case 24:
                UItem uItem = (UItem) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = (EmojiView.EmojiSearchAdapter) this.f$0;
                emojiSearchAdapter.getClass();
                Object obj6 = uItem.object;
                TLRPC.Document document = null;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    EmojiView.EmojiPackInfo emojiPackInfo = (EmojiView.EmojiPackInfo) uItem.object2;
                    long j = emojiSearchAdapter.selectedPackId;
                    TLRPC.StickerSet stickerSet5 = ((TLRPC.StickerSetCovered) obj6).set;
                    long j2 = stickerSet5.id;
                    if (j == j2) {
                        emojiSearchAdapter.selectedPackId = 0L;
                        stickerSet = null;
                    } else {
                        emojiSearchAdapter.selectedPackId = j2;
                        emojiSearchAdapter.selectedPackStickers = emojiPackInfo.documents;
                        emojiSearchAdapter.selectedPackStickerSet = stickerSet5;
                        stickerSet = stickerSet5;
                    }
                } else if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                    long j3 = emojiSearchAdapter.selectedPackId;
                    TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                    long j4 = stickerSet6.id;
                    if (j3 == j4) {
                        emojiSearchAdapter.selectedPackId = 0L;
                        stickerSet = null;
                    } else {
                        emojiSearchAdapter.selectedPackId = j4;
                        emojiSearchAdapter.selectedPackStickers = tL_messages_stickerSet.documents;
                        emojiSearchAdapter.selectedPackStickerSet = stickerSet6;
                        stickerSet = stickerSet6;
                    }
                } else {
                    stickerSet = null;
                }
                EmojiView.EmojiSearchAdapter.AnonymousClass1 anonymousClass1 = emojiSearchAdapter.foundPacksListView;
                int childCount = anonymousClass1.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    FoundStickerPackCell foundStickerPackCell = (FoundStickerPackCell) anonymousClass1.getChildAt(i);
                    if (foundStickerPackCell != view) {
                        foundStickerPackCell.setSelected(false, true);
                    }
                }
                long j5 = emojiSearchAdapter.selectedPackId;
                EmojiView emojiView = EmojiView.this;
                if (j5 != 0 && emojiSearchAdapter.selectedPackStickers.size() < emojiSearchAdapter.selectedPackStickerSet.count && (stickerSet2 = MediaDataController.getInstance(emojiView.currentAccount).getStickerSet(emojiSearchAdapter.selectedPackStickerSet, false)) != null) {
                    emojiSearchAdapter.selectedPackStickers = stickerSet2.documents;
                }
                TLObject tLObject = (TLObject) uItem.object;
                FoundStickerPackButton foundStickerPackButton = emojiView.emojiAddPackButton;
                ArrayList arrayList = emojiSearchAdapter.selectedPackStickers;
                if (arrayList != null && !arrayList.isEmpty()) {
                    document = (TLRPC.Document) emojiSearchAdapter.selectedPackStickers.get(0);
                }
                TLRPC.Document document2 = document;
                BoolAnimator boolAnimator = emojiView.animatorSearchEmojiPackSelected;
                emojiView.setFoundPackButtonText(foundStickerPackButton, tLObject, stickerSet, document2, true, boolAnimator.floatValue > 0.0f);
                ((FoundStickerPackCell) view).setSelected(emojiSearchAdapter.selectedPackId != 0, true);
                boolAnimator.setValue(emojiSearchAdapter.selectedPackId != 0, true);
                emojiSearchAdapter.notifyDataSetChanged();
                AndroidUtilities.hideKeyboard(emojiView.emojiSearchField.searchEditText);
                if (emojiSearchAdapter.selectedPackId != 0) {
                    anonymousClass1.scrollOnSelect(view);
                }
                break;
            default:
                UItem uItem2 = (UItem) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = (EmojiView.StickersSearchGridAdapter) this.f$0;
                stickersSearchGridAdapter.getClass();
                Object obj7 = uItem2.object;
                TLRPC.Document document3 = null;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    EmojiView.EmojiPackInfo emojiPackInfo2 = (EmojiView.EmojiPackInfo) uItem2.object2;
                    long j6 = stickersSearchGridAdapter.selectedPackId;
                    TLRPC.StickerSet stickerSet7 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j7 = stickerSet7.id;
                    if (j6 == j7) {
                        stickersSearchGridAdapter.selectedPackId = 0L;
                        stickerSet3 = null;
                    } else {
                        stickersSearchGridAdapter.selectedPackId = j7;
                        stickersSearchGridAdapter.selectedPackStickers = emojiPackInfo2.documents;
                        stickersSearchGridAdapter.selectedPackStickerSet = stickerSet7;
                        stickerSet3 = stickerSet7;
                    }
                } else if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                    long j8 = stickersSearchGridAdapter.selectedPackId;
                    TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                    long j9 = stickerSet8.id;
                    if (j8 == j9) {
                        stickersSearchGridAdapter.selectedPackId = 0L;
                        stickerSet3 = null;
                    } else {
                        stickersSearchGridAdapter.selectedPackId = j9;
                        stickersSearchGridAdapter.selectedPackStickers = tL_messages_stickerSet2.documents;
                        stickersSearchGridAdapter.selectedPackStickerSet = stickerSet8;
                        stickerSet3 = stickerSet8;
                    }
                } else {
                    stickerSet3 = null;
                }
                EmojiView.StickersSearchGridAdapter.AnonymousClass2 anonymousClass2 = stickersSearchGridAdapter.foundPacksListView;
                int childCount2 = anonymousClass2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    FoundStickerPackCell foundStickerPackCell2 = (FoundStickerPackCell) anonymousClass2.getChildAt(i2);
                    if (foundStickerPackCell2 != view2) {
                        foundStickerPackCell2.setSelected(false, true);
                    }
                }
                long j10 = stickersSearchGridAdapter.selectedPackId;
                EmojiView emojiView2 = EmojiView.this;
                if (j10 != 0 && stickersSearchGridAdapter.selectedPackStickers.size() < stickersSearchGridAdapter.selectedPackStickerSet.count && (stickerSet4 = MediaDataController.getInstance(emojiView2.currentAccount).getStickerSet(stickersSearchGridAdapter.selectedPackStickerSet, false)) != null) {
                    stickersSearchGridAdapter.selectedPackStickers = stickerSet4.documents;
                }
                TLObject tLObject2 = (TLObject) uItem2.object;
                FoundStickerPackButton foundStickerPackButton2 = emojiView2.stickerAddPackButton;
                ArrayList arrayList2 = stickersSearchGridAdapter.selectedPackStickers;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    document3 = (TLRPC.Document) stickersSearchGridAdapter.selectedPackStickers.get(0);
                }
                TLRPC.Document document4 = document3;
                BoolAnimator boolAnimator2 = emojiView2.animatorSearchStickerPackSelected;
                emojiView2.setFoundPackButtonText(foundStickerPackButton2, tLObject2, stickerSet3, document4, false, boolAnimator2.floatValue > 0.0f);
                ((FoundStickerPackCell) view2).setSelected(stickersSearchGridAdapter.selectedPackId != 0, true);
                boolAnimator2.setValue(stickersSearchGridAdapter.selectedPackId != 0, true);
                stickersSearchGridAdapter.notifyDataSetChanged();
                AndroidUtilities.hideKeyboard(emojiView2.stickersSearchField.searchEditText);
                if (stickersSearchGridAdapter.selectedPackId != 0) {
                    anonymousClass2.scrollOnSelect(view2);
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        Object item;
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.f$0;
        RecyclerView.Adapter adapter = chatAttachAlertDocumentLayout.listView.getAdapter();
        ChatAttachAlertDocumentLayout.ListAdapter listAdapter = chatAttachAlertDocumentLayout.listAdapter;
        if (adapter == listAdapter) {
            item = listAdapter.getItem(i);
        } else {
            ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = chatAttachAlertDocumentLayout.searchAdapter;
            item = searchAdapter.getItem(searchAdapter.getSectionForPosition(i), searchAdapter.getPositionInSectionForPosition(i));
        }
        return chatAttachAlertDocumentLayout.onItemClick(view, item);
    }
}
