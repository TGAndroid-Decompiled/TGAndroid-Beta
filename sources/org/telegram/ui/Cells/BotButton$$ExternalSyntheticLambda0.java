package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.cast.zzbe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.AvatarPreviewPagerIndicator;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.ChannelCreateActivity;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditTypeActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AttachBotIntroTopView;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.PhotoViewer;

public final class BotButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public BotButton$$ExternalSyntheticLambda0(zzbe zzbeVar, View view) {
        this.$r8$classId = 1;
        this.f$0 = zzbeVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
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
                ArticleViewer.ErrorContainer errorContainer = (ArticleViewer.ErrorContainer) this.f$0;
                errorContainer.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                errorContainer.titleView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
                errorContainer.descriptionView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
                errorContainer.codeView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
                break;
            case 3:
                AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = (AvatarPreviewPagerIndicator) this.f$0;
                float fLerp = AndroidUtilities.lerp(avatarPreviewPagerIndicator.animatorValues, valueAnimator.getAnimatedFraction());
                int i = (int) (255.0f * fLerp);
                avatarPreviewPagerIndicator.topOverlayGradient.setAlpha(i);
                avatarPreviewPagerIndicator.bottomOverlayGradient.setAlpha(i);
                avatarPreviewPagerIndicator.backgroundPaint.setAlpha((int) (66.0f * fLerp));
                avatarPreviewPagerIndicator.barPaint.setAlpha((int) (85.0f * fLerp));
                avatarPreviewPagerIndicator.selectedBarPaint.setAlpha(i);
                avatarPreviewPagerIndicator.alpha = fLerp;
                avatarPreviewPagerIndicator.invalidate();
                break;
            case 4:
                ((CacheControlActivity) this.f$0).lambda$updateActionBar$21(valueAnimator);
                break;
            case 5:
                CalendarActivity calendarActivity = (CalendarActivity) this.f$0;
                calendarActivity.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < calendarActivity.listView.getChildCount(); i2++) {
                    CalendarActivity.MonthView.access$1200((CalendarActivity.MonthView) calendarActivity.listView.getChildAt(i2), fFloatValue2);
                }
                break;
            case 6:
                AppIconsSelectorCell.IconHolderView iconHolderView = (AppIconsSelectorCell.IconHolderView) this.f$0;
                iconHolderView.getClass();
                iconHolderView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$0;
                chatMessageCell.getClass();
                chatMessageCell.mediaSpoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatMessageCell.invalidate();
                break;
            case 8:
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) this.f$0;
                groupCreateUserCell.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 0.18f * fFloatValue3;
                float f2 = groupCreateUserCell.isChecked ? 1.0f - f : 0.82f + f;
                BackupImageView backupImageView = groupCreateUserCell.avatarImageView;
                backupImageView.setScaleX(f2);
                backupImageView.setScaleY(f2);
                if (!groupCreateUserCell.isChecked) {
                    fFloatValue3 = 1.0f - fFloatValue3;
                }
                groupCreateUserCell.checkProgress = fFloatValue3;
                groupCreateUserCell.invalidate();
                break;
            case 9:
                ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) this.f$0;
                reactedUserHolderView.getClass();
                reactedUserHolderView.alphaInternal = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                reactedUserHolderView.invalidate();
                break;
            case 10:
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.f$0;
                sharedPhotoVideoCell2.getClass();
                sharedPhotoVideoCell2.spoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sharedPhotoVideoCell2.invalidate();
                break;
            case 11:
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) this.f$0;
                slideIntChooseView.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slideIntChooseView.maxTextEmojiSaturation = fFloatValue4;
                colorMatrix.setSaturation(fFloatValue4);
                if (Theme.currentTheme.isDark()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - slideIntChooseView.maxTextEmojiSaturation) * (-0.3f));
                }
                slideIntChooseView.maxText.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 12:
                TextSelectionHelper textSelectionHelper = (TextSelectionHelper) this.f$0;
                textSelectionHelper.getClass();
                textSelectionHelper.handleViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHelper.textSelectionOverlay.invalidate();
                break;
            case 13:
                ThemePreviewMessagesCell.AnonymousClass1.C00061 c00061 = (ThemePreviewMessagesCell.AnonymousClass1.C00061) ((PhotoViewer.AnonymousClass9) this.f$0).this$0;
                ThemePreviewMessagesCell.AnonymousClass1.this.getTransitionParams().animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThemePreviewMessagesCell.AnonymousClass1.this.invalidate();
                break;
            case 14:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$0;
                CrossfadeDrawable crossfadeDrawable = channelCreateActivity.doneButtonDrawable;
                crossfadeDrawable.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                crossfadeDrawable.invalidateSelf();
                channelCreateActivity.doneButtonDrawable.invalidateSelf();
                break;
            case 15:
                ChartPickerDelegate.CapturesData capturesData = (ChartPickerDelegate.CapturesData) this.f$0;
                capturesData.getClass();
                capturesData.aValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChartPickerDelegate.this.view.invalidate();
                break;
            case 16:
                ChatActivity.AnonymousClass58 anonymousClass58 = (ChatActivity.AnonymousClass58) this.f$0;
                anonymousClass58.getClass();
                anonymousClass58.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                anonymousClass58.invalidate();
                break;
            case 17:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                CrossfadeDrawable crossfadeDrawable2 = chatEditTypeActivity.doneButtonDrawable;
                crossfadeDrawable2.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                crossfadeDrawable2.invalidateSelf();
                chatEditTypeActivity.doneButtonDrawable.invalidateSelf();
                break;
            case 18:
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.f$0;
                animatedTextDrawable.getClass();
                animatedTextDrawable.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                animatedTextDrawable.invalidateSelf();
                Runnable runnable = animatedTextDrawable.widthUpdatedListener;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 19:
                AttachBotIntroTopView attachBotIntroTopView = (AttachBotIntroTopView) this.f$0;
                attachBotIntroTopView.imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                attachBotIntroTopView.invalidate();
                break;
            case 20:
                AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.f$0;
                audioPlayerAlert.getClass();
                audioPlayerAlert.titleTextView.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                audioPlayerAlert.authorTextView.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                AvatarConstructorFragment avatarConstructorFragment = (AvatarConstructorFragment) this.f$0;
                avatarConstructorFragment.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (avatarConstructorFragment.progressToLightStatusBar != fFloatValue5) {
                    avatarConstructorFragment.progressToLightStatusBar = fFloatValue5;
                    int iBlendARGB = ColorUtils.blendARGB(fFloatValue5, -16777216, -1);
                    int alphaComponent = ColorUtils.setAlphaComponent(iBlendARGB, 60);
                    avatarConstructorFragment.overlayActionBar.setItemsColor(iBlendARGB, false);
                    avatarConstructorFragment.setPhotoItem.setBackground(Theme.createSelectorDrawable(alphaComponent, 3, -1));
                }
                break;
            case 22:
                AvatarsDrawable avatarsDrawable = (AvatarsDrawable) this.f$0;
                avatarsDrawable.getClass();
                avatarsDrawable.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = avatarsDrawable.parent;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 23:
                BatteryDrawable batteryDrawable = (BatteryDrawable) this.f$0;
                batteryDrawable.getClass();
                batteryDrawable.fillValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                batteryDrawable.invalidateSelf();
                break;
            case 24:
                BlurringShader.StoryBlurDrawer storyBlurDrawer = (BlurringShader.StoryBlurDrawer) this.f$0;
                storyBlurDrawer.getClass();
                storyBlurDrawer.oldPaintAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyBlurDrawer.view.invalidate();
                break;
            case 25:
                ButtonBounce buttonBounce = (ButtonBounce) this.f$0;
                buttonBounce.getClass();
                buttonBounce.pressedT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonBounce.invalidate();
                break;
            case 26:
                ChatAttachAlert.AnonymousClass24 anonymousClass24 = (ChatAttachAlert.AnonymousClass24) this.f$0;
                anonymousClass24.getClass();
                anonymousClass24.countBounceScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 27:
                ChatAttachAlert.AnonymousClass1 anonymousClass1 = (ChatAttachAlert.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.buttonsRecyclerViewWrapper.setAlpha(1.0f - fFloatValue6);
                chatAttachAlert.botMainButtonTextView.setAlpha(fFloatValue6);
                float fDp = fFloatValue6 * AndroidUtilities.dp(36.0f);
                chatAttachAlert.botMainButtonOffsetY = fDp;
                chatAttachAlert.buttonsRecyclerViewWrapper.setTranslationY(fDp);
                break;
            case 28:
                ChatAttachAlert.AnonymousClass17 anonymousClass17 = (ChatAttachAlert.AnonymousClass17) this.f$0;
                anonymousClass17.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                chatAttachAlert2.captionEditTextTopOffset = fFloatValue7;
                chatAttachAlert2.captionContainer.invalidate();
                chatAttachAlert2.frameLayout2.invalidate();
                anonymousClass17.invalidate();
                break;
            default:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) this.f$0;
                mediaCell.getClass();
                mediaCell.spoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaCell.this$2.this$1.invalidate();
                break;
        }
    }

    public BotButton$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
