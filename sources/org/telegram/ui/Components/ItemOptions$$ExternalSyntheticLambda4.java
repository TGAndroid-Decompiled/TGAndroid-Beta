package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Paint.Views.PipettePickerView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PhotoViewer;

public final class ItemOptions$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public ItemOptions$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ItemOptions itemOptions = (ItemOptions) this.f$0;
                itemOptions.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ItemOptions.DimView dimView = itemOptions.dimView;
                if (dimView != null) {
                    dimView.setProgress(fFloatValue);
                }
                break;
            case 1:
                ChatSearchTabs chatSearchTabs = (ChatSearchTabs) this.f$0;
                chatSearchTabs.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatSearchTabs.actionBarTagsT = fFloatValue2;
                chatSearchTabs.setShown(fFloatValue2);
                chatSearchTabs.onShownUpdate(false);
                break;
            case 2:
                ChatThemeBottomSheet chatThemeBottomSheet = (ChatThemeBottomSheet) this.f$0;
                chatThemeBottomSheet.getClass();
                chatThemeBottomSheet.subTextTranslation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatThemeBottomSheet.applyTextView.setTranslationY((-AndroidUtilities.dp(7.0f)) * chatThemeBottomSheet.subTextTranslation);
                break;
            case 3:
                CounterView.CounterDrawable counterDrawable = (CounterView.CounterDrawable) this.f$0;
                counterDrawable.getClass();
                counterDrawable.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = counterDrawable.parent;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 4:
                ((EmojiPacksAlert) this.f$0).lambda$loadAnimation$8(valueAnimator);
                break;
            case 5:
                EmojiPacksAlert.EmojiImageView emojiImageView = (EmojiPacksAlert.EmojiImageView) this.f$0;
                emojiImageView.getClass();
                emojiImageView.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (emojiImageView.getParent() instanceof View) {
                    ((View) emojiImageView.getParent()).invalidate();
                }
                break;
            case 6:
                EmojiPacksAlert.EmojiPackHeader emojiPackHeader = (EmojiPacksAlert.EmojiPackHeader) this.f$0;
                emojiPackHeader.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emojiPackHeader.toggleT = fFloatValue3;
                TextView textView = emojiPackHeader.addButtonView;
                textView.setScaleX(1.0f - fFloatValue3);
                textView.setScaleY(1.0f - emojiPackHeader.toggleT);
                textView.setAlpha(1.0f - emojiPackHeader.toggleT);
                TextView textView2 = emojiPackHeader.removeButtonView;
                textView2.setScaleX(emojiPackHeader.toggleT);
                textView2.setScaleY(emojiPackHeader.toggleT);
                textView2.setAlpha(emojiPackHeader.toggleT);
                break;
            case 7:
                EmojiTabsStrip.EmojiTabButton emojiTabButton = (EmojiTabsStrip.EmojiTabButton) this.f$0;
                emojiTabButton.getClass();
                emojiTabButton.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emojiTabButton.updateColor();
                break;
            case 8:
                EmojiTabsStrip.EmojiTabsView emojiTabsView = (EmojiTabsStrip.EmojiTabsView) this.f$0;
                emojiTabsView.getClass();
                emojiTabsView.showT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emojiTabsView.invalidate();
                emojiTabsView.requestLayout();
                emojiTabsView.updateButtonsVisibility();
                EmojiTabsStrip.this.contentView.invalidate();
                break;
            case 9:
                EmojiView.ImageViewEmoji imageViewEmoji = (EmojiView.ImageViewEmoji) this.f$0;
                imageViewEmoji.getClass();
                imageViewEmoji.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imageViewEmoji.invalidate();
                break;
            case 10:
                EmojiView.SearchField searchField = (EmojiView.SearchField) this.f$0;
                searchField.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                searchField.inputBoxGradientAlpha = fFloatValue4;
                View view2 = searchField.inputBoxGradient;
                if (view2 == null) {
                    IntroActivity.AnonymousClass1 anonymousClass1 = searchField.inputBox;
                    if (anonymousClass1 != null) {
                        anonymousClass1.invalidate();
                    }
                } else {
                    view2.setAlpha(fFloatValue4);
                }
                break;
            case 11:
                DialogsActivity.AnonymousClass10 anonymousClass10 = ((FilterTabsView.AnonymousClass4) this.f$0).this$0;
                anonymousClass10.listView.invalidate();
                anonymousClass10.invalidate();
                break;
            case 12:
                FlatCheckBox flatCheckBox = (FlatCheckBox) this.f$0;
                flatCheckBox.getClass();
                flatCheckBox.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                flatCheckBox.invalidate();
                break;
            case 13:
                GroupCallPip groupCallPip = (GroupCallPip) this.f$0;
                if (!groupCallPip.removed) {
                    float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    groupCallPip.pinnedProgress = fFloatValue5;
                    groupCallPip.button.setPinnedProgress(fFloatValue5);
                    float f = 1.0f - (groupCallPip.pinnedProgress * 0.6f);
                    GroupCallPip.AnonymousClass3 anonymousClass3 = groupCallPip.windowView;
                    anonymousClass3.setScaleX(f);
                    anonymousClass3.setScaleY(1.0f - (groupCallPip.pinnedProgress * 0.6f));
                    if (groupCallPip.moving) {
                        groupCallPip.updateButtonPosition();
                    }
                    break;
                }
                break;
            case 14:
                InstantCameraView instantCameraView = (InstantCameraView) this.f$0;
                if (!instantCameraView.useCamera2) {
                    CameraSession cameraSession = instantCameraView.cameraSession;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                } else {
                    Camera2Session camera2Session = instantCameraView.camera2SessionCurrent;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
                break;
            case 15:
                ((InviteMembersBottomSheet) this.f$0).lambda$spansCountChanged$3(valueAnimator);
                break;
            case 16:
                InviteMembersBottomSheet.SpansContainer spansContainer = (InviteMembersBottomSheet.SpansContainer) this.f$0;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                inviteMembersBottomSheet.scrollViewH = iIntValue;
                ((BottomSheet) inviteMembersBottomSheet).containerView.invalidate();
                break;
            case 17:
                ((ItemOptions.DimView) this.f$0).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                JoinToSendSettingsView joinToSendSettingsView = (JoinToSendSettingsView) this.f$0;
                joinToSendSettingsView.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joinToSendSettingsView.toggleValue = fFloatValue6;
                joinToSendSettingsView.updateToggleValue(fFloatValue6);
                break;
            case 19:
                PhotoViewer.this.containerView.invalidate();
                break;
            case 20:
                PaintToolsView paintToolsView = (PaintToolsView) this.f$0;
                paintToolsView.getClass();
                paintToolsView.nextSelectedIndexProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintToolsView.invalidate();
                break;
            case 21:
                PipettePickerView pipettePickerView = (PipettePickerView) this.f$0;
                pipettePickerView.getClass();
                pipettePickerView.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pipettePickerView.invalidate();
                break;
            case 22:
                ColorPickerBottomSheet.AnonymousClass1 anonymousClass2 = (ColorPickerBottomSheet.AnonymousClass1) this.f$0;
                anonymousClass2.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass2.invalidate();
                break;
            case 23:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                stickerMakerView.getClass();
                stickerMakerView.bordersAnimatorValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 24:
                StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.f$0;
                storyLinkPreviewDialog.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyLinkPreviewDialog.openProgress = fFloatValue7;
                GLIconSettingsView gLIconSettingsView = storyLinkPreviewDialog.containerView;
                gLIconSettingsView.setAlpha(fFloatValue7);
                gLIconSettingsView.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, storyLinkPreviewDialog.openProgress));
                gLIconSettingsView.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, storyLinkPreviewDialog.openProgress));
                storyLinkPreviewDialog.windowView.invalidate();
                break;
            case 25:
                PasscodeView.AnonymousClass9 anonymousClass9 = (PasscodeView.AnonymousClass9) this.f$0;
                anonymousClass9.getClass();
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PasscodeView passcodeView = PasscodeView.this;
                passcodeView.shownT = fFloatValue8;
                passcodeView.onAnimationUpdate(fFloatValue8);
                break;
            case 26:
                PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.f$0;
                pipVideoOverlay.getClass();
                pipVideoOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f$0;
                limitPreviewView.getClass();
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.limitIconRotation = fFloatValue9 < 0.5f ? (fFloatValue9 / 0.5f) * (-7.0f) : (1.0f - ((fFloatValue9 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 28:
                PremiumButtonView premiumButtonView = (PremiumButtonView) this.f$0;
                premiumButtonView.getClass();
                premiumButtonView.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                premiumButtonView.buttonTextView.invalidate();
                PremiumButtonView.AnonymousClass1 anonymousClass4 = premiumButtonView.overlayTextView;
                if (anonymousClass4 != null) {
                    anonymousClass4.invalidate();
                }
                break;
            default:
                ((StarParticlesView) this.f$0).drawable.speedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
