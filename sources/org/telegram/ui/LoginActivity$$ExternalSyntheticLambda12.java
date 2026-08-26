package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;
import org.telegram.ui.Components.VideoPlayerSeekBar;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.recorder.PaintView;

public final class LoginActivity$$ExternalSyntheticLambda12 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public LoginActivity$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = ((LoginActivity) obj).phoneNumberConfirmView;
                if (phoneNumberConfirmView != null) {
                    int i = LoginActivity.PhoneNumberConfirmView.$r8$clinit;
                    PointF pointF = phoneNumberConfirmView.pointF;
                    ViewPositionWatcher.computeCoordinatesInParent(phoneNumberConfirmView.fabContainer, phoneNumberConfirmView.fragmentView, pointF);
                    float f3 = pointF.x;
                    FragmentFloatingButton fragmentFloatingButton = phoneNumberConfirmView.fabButton;
                    fragmentFloatingButton.setTranslationX(f3);
                    fragmentFloatingButton.setTranslationY(pointF.y);
                    phoneNumberConfirmView.requestLayout();
                }
                break;
            case 1:
                float f4 = f / 1000.0f;
                ShareDialogCell shareDialogCell = (ShareDialogCell) obj;
                SimpleTextView simpleTextView = shareDialogCell.topicTextView;
                simpleTextView.setAlpha(f4);
                float f5 = 1.0f - f4;
                ArticleViewer.AnonymousClass9 anonymousClass9 = shareDialogCell.nameTextView;
                anonymousClass9.setAlpha(f5);
                simpleTextView.setTranslationX(f5 * (-AndroidUtilities.dp(10.0f)));
                anonymousClass9.setTranslationX(f4 * AndroidUtilities.dp(10.0f));
                break;
            case 2:
                ((AudioPlayerAlert) obj).seekBarView.setBufferedProgress(f / 1000.0f);
                break;
            case 3:
                Bulletin bulletin = (Bulletin) obj;
                bulletin.lastBottomOffset = (int) f;
                Bulletin.Layout layout = bulletin.layout;
                if (layout != null) {
                    layout.updatePosition();
                }
                break;
            case 4:
                if (Math.abs(f) > ((Bulletin.Layout) obj).getWidth()) {
                    dynamicAnimation.cancel();
                }
                break;
            case 5:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) ((StarGiftSheet.AnonymousClass13) obj).this$0;
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.nextAttachLayout;
                if (attachAlertLayout == chatAttachAlert.pollLayout || attachAlertLayout == chatAttachAlert.todoLayout || (chatAttachAlert.isPhotoPicker && chatAttachAlert.viewChangeAnimator != null)) {
                    chatAttachAlert.updateSelectedPosition(1);
                }
                chatAttachAlert.nextAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
                ((BottomSheet) chatAttachAlert).containerView.invalidate();
                break;
            case 6:
                FloatingDebugView floatingDebugView = (FloatingDebugView) obj;
                floatingDebugView.getClass();
                float f6 = f / 1000.0f;
                float fDp = AndroidUtilities.dp(28.0f);
                FloatingDebugView.AnonymousClass2 anonymousClass2 = floatingDebugView.floatingButtonContainer;
                anonymousClass2.setPivotX(fDp);
                anonymousClass2.setPivotY(AndroidUtilities.dp(28.0f));
                anonymousClass2.setScaleX(f6);
                anonymousClass2.setScaleY(f6);
                anonymousClass2.setAlpha(MathUtils.clamp(f6, 0.0f, 1.0f));
                floatingDebugView.invalidate();
                break;
            case 7:
                float f7 = f / 1000.0f;
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) obj;
                lPhotoPaintView.typefaceMenuTransformProgress = f7;
                PaintTypefaceListView paintTypefaceListView = lPhotoPaintView.typefaceListView;
                paintTypefaceListView.setAlpha(f7);
                paintTypefaceListView.invalidate();
                lPhotoPaintView.overlayLayout.invalidate();
                lPhotoPaintView.textOptionsView.getTypefaceCell().setAlpha(1.0f - lPhotoPaintView.typefaceMenuTransformProgress);
                break;
            case 8:
                ((MotionBackgroundDrawable) obj).updateAnimation();
                break;
            case 9:
                float f8 = f / 100.0f;
                PaymentFormActivity.BottomFrameLayout bottomFrameLayout = (PaymentFormActivity.BottomFrameLayout) obj;
                bottomFrameLayout.progress = f8;
                TextView textView = PaymentFormActivity.this.payTextView;
                if (textView != null) {
                    textView.setAlpha((f8 * 0.2f) + 0.8f);
                }
                bottomFrameLayout.invalidate();
                break;
            case 10:
                PhotoViewer.CaptionScrollView captionScrollView = (PhotoViewer.CaptionScrollView) obj;
                captionScrollView.overScrollY = f;
                captionScrollView.velocityY = f2;
                captionScrollView.onScrollUpdate();
                break;
            case 11:
                PhotoViewer.VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = (PhotoViewer.VideoPlayerControlFrameLayout) obj;
                int iDp = videoPlayerControlFrameLayout.parentWidth > videoPlayerControlFrameLayout.parentHeight ? AndroidUtilities.dp(48.0f) : 0;
                VideoPlayerSeekBar videoPlayerSeekBar = videoPlayerControlFrameLayout.this$0.videoPlayerSeekbar;
                int measuredWidth = (int) (((videoPlayerControlFrameLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f) - iDp);
                int measuredHeight = videoPlayerControlFrameLayout.getMeasuredHeight();
                videoPlayerSeekBar.width = measuredWidth;
                videoPlayerSeekBar.height = measuredHeight;
                View view = videoPlayerSeekBar.parentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 12:
                RightSlidingDialogContainer rightSlidingDialogContainer = (RightSlidingDialogContainer) obj;
                rightSlidingDialogContainer.replaceProgress = f / 1000.0f;
                rightSlidingDialogContainer.invalidate();
                break;
            case 13:
                SecretMediaViewer.VideoPlayerControlFrameLayout videoPlayerControlFrameLayout2 = (SecretMediaViewer.VideoPlayerControlFrameLayout) obj;
                VideoPlayerSeekBar videoPlayerSeekBar2 = SecretMediaViewer.this.seekbar;
                int measuredWidth2 = (int) (((videoPlayerControlFrameLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f) - 0);
                int measuredHeight2 = videoPlayerControlFrameLayout2.getMeasuredHeight();
                videoPlayerSeekBar2.width = measuredWidth2;
                videoPlayerSeekBar2.height = measuredHeight2;
                View view2 = videoPlayerSeekBar2.parentView;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            case 14:
                StoryCaptionView storyCaptionView = (StoryCaptionView) obj;
                storyCaptionView.overScrollY = f;
                storyCaptionView.velocityY = f2;
                break;
            default:
                float f9 = f / 1000.0f;
                PaintView paintView = (PaintView) obj;
                paintView.typefaceMenuTransformProgress = f9;
                PaintTypefaceListView paintTypefaceListView2 = paintView.typefaceListView;
                paintTypefaceListView2.setAlpha(f9);
                paintTypefaceListView2.invalidate();
                paintView.overlayLayout.invalidate();
                paintView.textOptionsView.getTypefaceCell().setAlpha(1.0f - paintView.typefaceMenuTransformProgress);
                break;
        }
    }
}
