package org.telegram.ui.Components;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.style.ClickableSpan;
import android.view.ViewTreeObserver;
import java.io.File;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipActivityHandler;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;

public final class Bulletin$2$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public Bulletin$2$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlert chatAttachAlert;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Bulletin bulletin = Bulletin.this;
                Bulletin.Layout layout = bulletin.layout;
                layout.transitionRunningEnter = false;
                layout.onEnterTransitionEnd();
                if (bulletin.setCanHideOnShow) {
                    bulletin.setCanHide(true);
                }
                break;
            case 1:
                AnimatedTextView animatedTextView = (AnimatedTextView) obj;
                CharSequence charSequence = animatedTextView.toSetText;
                if (charSequence != null) {
                    animatedTextView.setText(charSequence, animatedTextView.toSetMoveDown, true);
                    animatedTextView.toSetText = null;
                    animatedTextView.toSetMoveDown = false;
                }
                break;
            case 2:
                AudioPlayerAlert.this.listView.setVisibility(8);
                break;
            case 3:
                ((AutoDeletePopupWrapper) obj).callback.showGlobalAutoDeleteScreen();
                break;
            case 4:
                BlurBehindDrawable blurBehindDrawable = (BlurBehindDrawable) obj;
                blurBehindDrawable.error = true;
                blurBehindDrawable.parentView.invalidate();
                break;
            case 5:
                BlurBehindDrawable.BlurBackgroundTask blurBackgroundTask = (BlurBehindDrawable.BlurBackgroundTask) obj;
                if (!blurBackgroundTask.canceled) {
                    BlurBehindDrawable blurBehindDrawable2 = blurBackgroundTask.this$0;
                    Bitmap[] bitmapArr = blurBehindDrawable2.renderingBitmap;
                    Canvas[] canvasArr = blurBehindDrawable2.renderingBitmapCanvas;
                    blurBehindDrawable2.renderingBitmap = blurBehindDrawable2.backgroundBitmap;
                    blurBehindDrawable2.renderingBitmapCanvas = blurBehindDrawable2.backgroundBitmapCanvas;
                    blurBehindDrawable2.backgroundBitmap = bitmapArr;
                    blurBehindDrawable2.backgroundBitmapCanvas = canvasArr;
                    blurBehindDrawable2.processingNextFrame = false;
                    ChatActivity.AnonymousClass71 anonymousClass71 = blurBehindDrawable2.parentView;
                    if (anonymousClass71 != null) {
                        anonymousClass71.invalidate();
                    }
                    break;
                }
                break;
            case 6:
                BlurringShader.BlurManager blurManager = ((BlurringShader) obj).currentManager;
                if (blurManager != null) {
                    blurManager.invalidate();
                }
                break;
            case 7:
                BlurringShader.BlurManager blurManager2 = (BlurringShader.BlurManager) obj;
                blurManager2.fallbackBitmap = blurManager2.thumbBlurer.thumbBitmap;
                blurManager2.invalidate();
                break;
            case 8:
                CapsuleBlobDrawable capsuleBlobDrawable = (CapsuleBlobDrawable) obj;
                capsuleBlobDrawable.getClass();
                if (LiteMode.isEnabled(512)) {
                    capsuleBlobDrawable.invalidateSelf();
                }
                break;
            case 9:
                ((Dialog) obj).dismiss();
                break;
            case 10:
                ChatActivityEnterView.AnonymousClass53 anonymousClass53 = (ChatActivityEnterView.AnonymousClass53) obj;
                anonymousClass53.getClass();
                int i = ChatActivityEnterView.$r8$clinit;
                ChatActivityEnterView.this.showCaptionLimitBulletin();
                break;
            case 11:
                ChatActivityEnterView.ControlsView controlsView = (ChatActivityEnterView.ControlsView) obj;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.sendButtonVisible) {
                    chatActivityEnterView.calledRecordRunnable = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.voiceOnce);
                chatActivityEnterView.delegate.needStartRecordAudio(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.slideText;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                break;
            case 12:
                ((ChatActivityEnterViewAnimatedIconView) obj).animatingState = null;
                break;
            case 13:
                ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
                break;
            case 14:
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) ((PipActivityHandler.AnonymousClass1) obj).this$0;
                try {
                    File file = chatAttachAlertDocumentLayout.currentDir;
                    if (file == null) {
                        chatAttachAlertDocumentLayout.listRoots();
                    } else {
                        chatAttachAlertDocumentLayout.listFiles(file);
                    }
                    chatAttachAlertDocumentLayout.updateSearchButton();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 15:
                ChatAttachAlertPhotoLayout.AnonymousClass1 anonymousClass1 = (ChatAttachAlertPhotoLayout.AnonymousClass1) obj;
                anonymousClass1.getClass();
                boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                ChatAttachAlertPhotoLayout.this.setCurrentSpoilerVisible(-1, true);
                break;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                if (chatAttachAlertPhotoLayout2.cameraView != null && !chatAttachAlertPhotoLayout2.parentAlert.isDismissed()) {
                    chatAttachAlertPhotoLayout2.cameraView.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 17:
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = (ChatAttachAlertPhotoLayoutPreview) obj;
                if (chatAttachAlertPhotoLayoutPreview.shown && (chatAttachAlertPhotoLayout = (chatAttachAlert = chatAttachAlertPhotoLayoutPreview.parentAlert).photoLayout) != null) {
                    chatAttachAlertPhotoLayout.previewItem.setIcon(R.drawable.ic_ab_back);
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = chatAttachAlert.photoLayout;
                    chatAttachAlertPhotoLayout3.previewItem.setText(LocaleController.getString(R.string.Back));
                    chatAttachAlertPhotoLayout3.previewItem.setRightIcon(0);
                    break;
                }
                break;
            case 18:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) obj;
                chatAttachAlertPollLayout.currentAttachAlertIndex = -1;
                chatAttachAlertPollLayout.currentAttachAlert = null;
                break;
            case 19:
                ((ChatNotificationsPopupWrapper.Callback) obj).toggleMute();
                break;
            case 20:
                ((ChatReplyContainer$Layout) obj).setVisibility(8);
                break;
            case 21:
                ((ChecksHintView.AnonymousClass1) obj).this$0.hide();
                break;
            case 22:
                ((ClearHistoryAlert) obj).lambda$showGiftOfferSheet$15();
                break;
            case 23:
                ((CompatDrawable) obj).onAttachedToWindow();
                break;
            case 24:
                CreateGroupCallBottomSheet createGroupCallBottomSheet = CreateGroupCallBottomSheet.this;
                TLRPC.Peer peer = createGroupCallBottomSheet.selectedPeer;
                boolean z2 = createGroupCallBottomSheet.chats.size() > 1;
                JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate = createGroupCallBottomSheet.joinCallDelegate;
                BaseFragment baseFragment = createGroupCallBottomSheet.fragment;
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(baseFragment, peer, createGroupCallBottomSheet.dialogId, z2, joinCallAlertDelegate);
                if (baseFragment.getParentActivity() == null) {
                    createRtmpStreamBottomSheet.show();
                } else {
                    baseFragment.showDialog(createRtmpStreamBottomSheet);
                }
                break;
            case 25:
                DialogsActivityStatusLayout dialogsActivityStatusLayout = (DialogsActivityStatusLayout) obj;
                BoolAnimator boolAnimator = dialogsActivityStatusLayout.animatorStatusBarVisible;
                boolAnimator.setValue(!boolAnimator.value, true);
                AndroidUtilities.runOnUIThread(dialogsActivityStatusLayout.justForTestR, 3000L);
                break;
            case 26:
                ((SearchViewPager.AnonymousClass8) obj).searchMessages$1(false);
                break;
            case 27:
                ((EdgeEffectTrackerFactory.TrackingEdgeEffect) obj).checkEdgeVisibility();
                break;
            case 28:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            default:
                ((EffectsTextView) obj).getClass();
                break;
        }
    }

    public Bulletin$2$$ExternalSyntheticLambda1(EffectsTextView effectsTextView, LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
        this.$r8$classId = 29;
        this.f$0 = effectsTextView;
    }
}
