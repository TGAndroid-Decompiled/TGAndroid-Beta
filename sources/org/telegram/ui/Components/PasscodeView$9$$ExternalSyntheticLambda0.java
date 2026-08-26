package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.zxing.BinaryBitmap;
import com.stripe.android.Stripe;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.BoostsActivity;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.Premium.ProfilePremiumCell;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.PaintView;

public final class PasscodeView$9$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public PasscodeView$9$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        CustomEmojiReactionsWindow customEmojiReactionsWindow;
        switch (this.$r8$classId) {
            case 0:
                PasscodeView.AnonymousClass9 anonymousClass9 = (PasscodeView.AnonymousClass9) this.f$0;
                anonymousClass9.getClass();
                try {
                    PasscodeView.this.imageView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.f$0;
                anonymousClass26.textureViewActive = true;
                anonymousClass26.invalidateAll();
                break;
            case 2:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((StickerMakerView.StickerUploader) this.f$0).mediaDocument.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 3:
                AndroidUtilities.showKeyboard(((TextPaintView) this.f$0).editText);
                break;
            case 4:
                ((PermanentLinkBottomSheet) this.f$0).linkIcon.start();
                break;
            case 5:
                FilterGLThread filterGLThread = PhotoFilterView.this.eglThread;
                if (filterGLThread != null) {
                    filterGLThread.requestRender(false, true, false);
                }
                break;
            case 6:
                PhotoFilterView.EnhanceView enhanceView = (PhotoFilterView.EnhanceView) this.f$0;
                enhanceView.shown = false;
                enhanceView.invalidate();
                break;
            case 7:
                ((PhotoViewerCoverEditor) this.f$0).gallerySheet = null;
                break;
            case 8:
                PhotoViewerCoverEditor photoViewerCoverEditor = (PhotoViewerCoverEditor) ((BinaryBitmap) this.f$0).matrix;
                photoViewerCoverEditor.videoPlayer.seekTo(photoViewerCoverEditor.time, false);
                break;
            case 9:
                PhotoViewer.AnonymousClass79 anonymousClass79 = (PhotoViewer.AnonymousClass79) this.f$0;
                if (anonymousClass79.isYouTube) {
                    anonymousClass79.runJsCode("pollPosition();");
                }
                if (anonymousClass79.isPlaying) {
                    AndroidUtilities.runOnUIThread(anonymousClass79.progressRunnable, 500L);
                }
                break;
            case 10:
                ((FrameLayout) this.f$0).invalidate();
                break;
            case 11:
                PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) ((PipVideoOverlay.AnonymousClass3) this.f$0).this$0;
                pipVideoOverlay.contentView.invalidate();
                pipVideoOverlay.contentFrameLayout.requestLayout();
                break;
            case 12:
                ((PlayingGameDrawable) this.f$0).checkUpdate();
                break;
            case 13:
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                limitReachedBottomSheet.baseFragment.presentFragment(StatisticActivity.create(limitReachedBottomSheet.getChat$1$1(), true));
                break;
            case 14:
                RLottieImageView rLottieImageView = ((PremiumButtonView) this.f$0).iconView;
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, true, false);
                rLottieImageView.playAnimation();
                break;
            case 15:
                PremiumFeatureBottomSheet.this.checkTopOffset();
                break;
            case 16:
                PremiumStickersPreviewRecycler premiumStickersPreviewRecycler = (PremiumStickersPreviewRecycler) this.f$0;
                int size = 1073741823 - (1073741823 % premiumStickersPreviewRecycler.premiumStickers.size());
                LinearLayoutManager linearLayoutManager = premiumStickersPreviewRecycler.layoutManager;
                premiumStickersPreviewRecycler.selectStickerOnNextLayout = size;
                linearLayoutManager.scrollToPositionWithOffset(size, (premiumStickersPreviewRecycler.getMeasuredHeight() - premiumStickersPreviewRecycler.getChildAt(0).getMeasuredHeight()) >> 1, linearLayoutManager.mShouldReverseLayout);
                premiumStickersPreviewRecycler.drawEffectForView(null, false);
                break;
            case 17:
                ((ProfilePremiumCell) this.f$0).invalidate();
                break;
            case 18:
                ((VideoScreenPreview) this.f$0).checkVideo();
                break;
            case 19:
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                if (bulletinFactoryGlobal != null) {
                    bulletinFactoryGlobal.createSimpleBulletinWithIconSize(R.raw.forward, 30, (SpannableStringBuilder) this.f$0).show();
                }
                break;
            case 20:
                TLRPC.Chat chat = (TLRPC.Chat) this.f$0;
                if (chat != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    LaunchActivity.getLastFragment().showAsSheet(new BoostsActivity(-chat.id), bottomSheetParams);
                }
                break;
            case 21:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21) this.f$0).run(null);
                break;
            case 22:
                ((OAuthSheet$$ExternalSyntheticLambda13) this.f$0).run(Collections.EMPTY_LIST);
                break;
            case 23:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0).run(null);
                break;
            case 24:
                GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(giftInfoBottomSheet.baseFragment, ((BottomSheet) giftInfoBottomSheet).currentAccount, null, null, null, ((BottomSheet) giftInfoBottomSheet).resourcesProvider);
                premiumPreviewBottomSheet.animateConfetti = true;
                premiumPreviewBottomSheet.isOutboundGift = true;
                giftInfoBottomSheet.baseFragment.showDialog(premiumPreviewBottomSheet);
                break;
            case 25:
                ((SelectorCountryCell) this.f$0).setCountryInternal();
                break;
            case 26:
                try {
                    ProximitySheet proximitySheet = ((ProximitySheet.AnonymousClass4) this.f$0).this$0;
                    if (proximitySheet.getParent() instanceof ViewGroup) {
                        ((ViewGroup) proximitySheet.getParent()).removeView(proximitySheet);
                    }
                    proximitySheet.onDismissCallback.run();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 27:
                ((RLottieNative) this.f$0).recycle();
                break;
            case 28:
                ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = (ChatSelectionReactionMenuOverlay) ((Stripe.AnonymousClass1) this.f$0).this$0;
                ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass2 = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
                if (anonymousClass2 != null && (customEmojiReactionsWindow = anonymousClass2.reactionsWindow) != null) {
                    customEmojiReactionsWindow.dismiss$1();
                    anonymousClass2.reactionsWindow = null;
                }
                chatSelectionReactionMenuOverlay.parentFragment.clearSelectionMode(true);
                break;
            default:
                ((ValueAnimator) this.f$0).start();
                break;
        }
    }
}
