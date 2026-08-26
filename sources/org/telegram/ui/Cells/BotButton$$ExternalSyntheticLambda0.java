package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import androidx.appcompat.app.WindowDecorActionBar;
import com.google.android.gms.cast.zzbe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Paint.Views.PipettePickerView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.Components.voip.ImageWithWavesView;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.web.WebActionBar;

public final class BotButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public BotButton$$ExternalSyntheticLambda0(zzbe zzbeVar, View view) {
        this.$r8$classId = 1;
        this.f$0 = zzbeVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence;
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                BotButton botButton = (BotButton) this.f$0;
                botButton.getClass();
                botButton.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                botButton.invalidateRunnable.run();
                break;
            case 1:
                ((View) ((WindowDecorActionBar) ((zzbe) this.f$0).zza).mContainerView.getParent()).invalidate();
                break;
            case 2:
                AppIconsSelectorCell.IconHolderView iconHolderView = (AppIconsSelectorCell.IconHolderView) this.f$0;
                iconHolderView.getClass();
                iconHolderView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                ((ChatMessageCell) this.f$0).lambda$startRevealMedia$14(valueAnimator);
                break;
            case 4:
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) this.f$0;
                groupCreateUserCell.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 0.18f * fFloatValue;
                float f2 = groupCreateUserCell.isChecked ? 1.0f - f : 0.82f + f;
                BackupImageView backupImageView = groupCreateUserCell.avatarImageView;
                backupImageView.setScaleX(f2);
                backupImageView.setScaleY(f2);
                if (!groupCreateUserCell.isChecked) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                groupCreateUserCell.checkProgress = fFloatValue;
                groupCreateUserCell.invalidate();
                break;
            case 5:
                ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) this.f$0;
                reactedUserHolderView.getClass();
                reactedUserHolderView.alphaInternal = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                reactedUserHolderView.invalidate();
                break;
            case 6:
                ((SharedPhotoVideoCell2) this.f$0).lambda$startRevealMedia$3(valueAnimator);
                break;
            case 7:
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) this.f$0;
                slideIntChooseView.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slideIntChooseView.maxTextEmojiSaturation = fFloatValue2;
                colorMatrix.setSaturation(fFloatValue2);
                if (Theme.currentTheme.isDark()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - slideIntChooseView.maxTextEmojiSaturation) * (-0.3f));
                }
                slideIntChooseView.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 8:
                ((TextSelectionHelper) this.f$0).lambda$showHandleViews$0(valueAnimator);
                break;
            case 9:
                ThemePreviewMessagesCell.AnonymousClass1.C00081 c00081 = ThemePreviewMessagesCell.AnonymousClass1.C00081.this;
                ThemePreviewMessagesCell.AnonymousClass1.this.getTransitionParams().animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThemePreviewMessagesCell.AnonymousClass1.this.invalidate();
                break;
            case 10:
                ChartPickerDelegate.CapturesData capturesData = (ChartPickerDelegate.CapturesData) this.f$0;
                capturesData.getClass();
                capturesData.aValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChartPickerDelegate.this.view.invalidate();
                break;
            case 11:
                ((MaskPaintView) this.f$0).onRenderViewAlphaUpdate(valueAnimator);
                break;
            case 12:
                PaintToolsView paintToolsView = (PaintToolsView) this.f$0;
                paintToolsView.getClass();
                paintToolsView.nextSelectedIndexProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintToolsView.invalidate();
                break;
            case 13:
                PipettePickerView pipettePickerView = (PipettePickerView) this.f$0;
                pipettePickerView.getClass();
                pipettePickerView.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pipettePickerView.invalidate();
                break;
            case 14:
                ColorPickerBottomSheet.AnonymousClass1 anonymousClass1 = (ColorPickerBottomSheet.AnonymousClass1) this.f$0;
                anonymousClass1.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass1.invalidate();
                break;
            case 15:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                stickerMakerView.getClass();
                stickerMakerView.bordersAnimatorValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 16:
                StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.f$0;
                storyLinkPreviewDialog.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyLinkPreviewDialog.openProgress = fFloatValue3;
                WebActionBar.AnonymousClass1 anonymousClass2 = storyLinkPreviewDialog.containerView;
                anonymousClass2.setAlpha(fFloatValue3);
                anonymousClass2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, storyLinkPreviewDialog.openProgress));
                anonymousClass2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, storyLinkPreviewDialog.openProgress));
                storyLinkPreviewDialog.windowView.invalidate();
                break;
            case 17:
                BoostCounterView boostCounterView = (BoostCounterView) this.f$0;
                boostCounterView.getClass();
                boostCounterView.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                boostCounterView.invalidate();
                break;
            case 18:
                ((SelectorSearchCell) this.f$0).lambda$getContainerHeightAnimator$1(valueAnimator);
                break;
            case 19:
                ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = (ChatSelectionReactionMenuOverlay) this.f$0;
                chatSelectionReactionMenuOverlay.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass3 = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
                if (anonymousClass3 != null) {
                    anonymousClass3.setAlpha(fFloatValue4);
                }
                break;
            case 20:
                ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = (ImageWithWavesView.AvatarWavesDrawable) this.f$0;
                avatarWavesDrawable.getClass();
                avatarWavesDrawable.muteToStaticProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 21:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.f$0;
                rTMPStreamPipOverlay.getClass();
                rTMPStreamPipOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                VoIPFloatingLayout voIPFloatingLayout = (VoIPFloatingLayout) this.f$0;
                voIPFloatingLayout.getClass();
                voIPFloatingLayout.mutedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPFloatingLayout.invalidate();
                break;
            case 23:
                VoIPPiPView voIPPiPView = (VoIPPiPView) this.f$0;
                voIPPiPView.getClass();
                voIPPiPView.progressToCameraMini = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPPiPView.floatingView.invalidate();
                break;
            case 24:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.currentPage.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starGiftSheet.onSwitchedPage();
                break;
            case 25:
                ((StarGiftSheet.CraftTopView) this.f$0).cube.invalidate();
                break;
            case 26:
                StarGiftSheet.CraftTopView.Cube3D cube3D = (StarGiftSheet.CraftTopView.Cube3D) this.f$0;
                cube3D.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cube3D.pullingT = fFloatValue5;
                if (fFloatValue5 >= 0.8f && (animSequence = cube3D.sequence) != null && (z = animSequence.waitingForPull) && z) {
                    animSequence.waitingForPull = false;
                    animSequence.executeNext();
                }
                cube3D.invalidate();
                break;
            case 27:
                float fSin = (((float) Math.sin(((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 3.141592653589793d)) * 0.03f) + 1.0f;
                View view = (View) this.f$0;
                view.setScaleX(fSin);
                view.setScaleY(fSin);
                break;
            case 28:
                StarReactionsOverlay starReactionsOverlay = (StarReactionsOverlay) this.f$0;
                starReactionsOverlay.getClass();
                starReactionsOverlay.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starReactionsOverlay.invalidate();
                break;
            default:
                StarsIntroActivity.StarsBalanceView starsBalanceView = (StarsIntroActivity.StarsBalanceView) this.f$0;
                starsBalanceView.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StarsIntroActivity.StarsBalanceView.AnonymousClass1 anonymousClass4 = starsBalanceView.amountTextView;
                anonymousClass4.setScaleX(fFloatValue6);
                anonymousClass4.setScaleY(fFloatValue6);
                break;
        }
    }

    public BotButton$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
