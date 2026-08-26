package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;

public final class ThemePreviewActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda0(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public final void run() {
        ThemePreviewActivity themePreviewActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                themePreviewActivity.applyColorScheduled = false;
                int i = themePreviewActivity.lastPickedColor;
                int i2 = themePreviewActivity.lastPickedColorNum;
                int i3 = themePreviewActivity.colorType;
                Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
                if (i3 == 1) {
                    if (i2 == 0) {
                        themeAccent.accentColor = i;
                        Theme.refreshThemeColors(false, false);
                    } else if (i2 == 1) {
                        themeAccent.accentColor2 = i;
                        Theme.refreshThemeColors(true, true);
                        themePreviewActivity.listView2.invalidateViews();
                        themePreviewActivity.colorPicker.setHasChanges(themePreviewActivity.hasChanges(themePreviewActivity.colorType));
                        themePreviewActivity.updatePlayAnimationView(true);
                    }
                } else if (i3 == 2) {
                    if (i2 == 0) {
                        themeAccent.backgroundOverrideColor = i;
                    } else if (i2 == 1) {
                        int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                        if (i != 0 || defaultAccentColor == 0) {
                            themeAccent.backgroundGradientOverrideColor1 = i;
                        } else {
                            themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
                        }
                    } else if (i2 == 2) {
                        int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                        if (i != 0 || defaultAccentColor2 == 0) {
                            themeAccent.backgroundGradientOverrideColor2 = i;
                        } else {
                            themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
                        }
                    } else if (i2 == 3) {
                        int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                        if (i != 0 || defaultAccentColor3 == 0) {
                            themeAccent.backgroundGradientOverrideColor3 = i;
                        } else {
                            themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
                        }
                    }
                    Theme.refreshThemeColors(true, false);
                    themePreviewActivity.colorPicker.setHasChanges(themePreviewActivity.hasChanges(themePreviewActivity.colorType));
                    themePreviewActivity.updatePlayAnimationView(true);
                } else if (i3 == 3) {
                    if (i2 == 0) {
                        themeAccent.myMessagesAccentColor = i;
                    } else if (i2 == 1) {
                        themeAccent.myMessagesGradientAccentColor1 = i;
                    } else if (i2 == 2) {
                        int i4 = themeAccent.myMessagesGradientAccentColor2;
                        themeAccent.myMessagesGradientAccentColor2 = i;
                        if (i4 != 0 && i == 0) {
                            themePreviewActivity.messagesAdapter.mObservable.notifyItemRangeRemoved(0, 1);
                        } else if (i4 == 0 && i != 0) {
                            themePreviewActivity.messagesAdapter.mObservable.notifyItemRangeInserted(0, 1);
                            themePreviewActivity.showAnimationHint();
                        }
                    } else {
                        themeAccent.myMessagesGradientAccentColor3 = i;
                    }
                    int i5 = themePreviewActivity.lastPickedColorNum;
                    if (i5 >= 0) {
                        themePreviewActivity.messagesCheckBoxView[1].setColor(i5, i);
                    }
                    Theme.refreshThemeColors(true, true);
                    themePreviewActivity.listView2.invalidateViews();
                    themePreviewActivity.colorPicker.setHasChanges(themePreviewActivity.hasChanges(themePreviewActivity.colorType));
                    themePreviewActivity.updatePlayAnimationView(true);
                }
                int size = themePreviewActivity.themeDescriptions.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ThemeDescription themeDescription = (ThemeDescription) themePreviewActivity.themeDescriptions.get(i6);
                    themeDescription.setColor(themePreviewActivity.getThemedColor(themeDescription.currentKey), false, false);
                }
                themePreviewActivity.listView.invalidateViews();
                themePreviewActivity.listView2.invalidateViews();
                ChatActivity.AnonymousClass27 anonymousClass27 = themePreviewActivity.dotsContainer;
                if (anonymousClass27 != null) {
                    anonymousClass27.invalidate();
                }
                themePreviewActivity.lastPickedColorNum = -1;
                break;
            case 1:
                themePreviewActivity.presentFragment(StatisticActivity.create(themePreviewActivity.getMessagesController().getChat(Long.valueOf(-themePreviewActivity.dialogId)), true));
                break;
            case 2:
                themePreviewActivity.onSwitchDayNightDelegate.switchDayNight(false);
                boolean zIsDark = themePreviewActivity.themeDelegate.isDark();
                RLottieDrawable rLottieDrawable = themePreviewActivity.sunDrawable;
                rLottieDrawable.setCustomEndFrame(zIsDark ? rLottieDrawable.metaData[0] : 0);
                RLottieDrawable rLottieDrawable2 = themePreviewActivity.sunDrawable;
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.start();
                }
                themePreviewActivity.setCurrentImage(false);
                themePreviewActivity.invalidateBlur$2();
                themePreviewActivity.updateBlurred();
                if (themePreviewActivity.themeDescriptions != null) {
                    for (int i7 = 0; i7 < themePreviewActivity.themeDescriptions.size(); i7++) {
                        ((ThemeDescription) themePreviewActivity.themeDescriptions.get(i7)).setColor(themePreviewActivity.getThemedColor(((ThemeDescription) themePreviewActivity.themeDescriptions.get(i7)).currentKey), false, false);
                    }
                }
                if (themePreviewActivity.shouldShowBrightnessControll) {
                    ThemePreviewActivity.DayNightSwitchDelegate dayNightSwitchDelegate = themePreviewActivity.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate == null || !dayNightSwitchDelegate.isDark()) {
                        ThemePreviewActivity.AnonymousClass15 anonymousClass15 = themePreviewActivity.dimmingSlider;
                        anonymousClass15.valueIsAnimated = true;
                        float f = anonymousClass15.minVolume;
                        anonymousClass15.value = (0.0f - f) / (anonymousClass15.maxVolume - f);
                        anonymousClass15.updateText(0.0f);
                    } else {
                        themePreviewActivity.dimmingSlider.setVisibility(0);
                        ThemePreviewActivity.AnonymousClass15 anonymousClass16 = themePreviewActivity.dimmingSlider;
                        float f2 = themePreviewActivity.dimAmount;
                        anonymousClass16.valueIsAnimated = true;
                        float f3 = anonymousClass16.minVolume;
                        anonymousClass16.value = (f2 - f3) / (anonymousClass16.maxVolume - f3);
                        anonymousClass16.updateText(f2);
                    }
                    ValueAnimator valueAnimator = themePreviewActivity.changeDayNightViewAnimator2;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        themePreviewActivity.changeDayNightViewAnimator2.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(themePreviewActivity.progressToDarkTheme, themePreviewActivity.onSwitchDayNightDelegate.isDark() ? 1.0f : 0.0f);
                    themePreviewActivity.changeDayNightViewAnimator2 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(themePreviewActivity, 17));
                    themePreviewActivity.changeDayNightViewAnimator2.addListener(new ThemePreviewActivity.AnonymousClass32(themePreviewActivity, 5));
                    themePreviewActivity.changeDayNightViewAnimator2.setDuration(250L);
                    themePreviewActivity.changeDayNightViewAnimator2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    themePreviewActivity.changeDayNightViewAnimator2.start();
                }
                break;
            default:
                if (themePreviewActivity.getParentActivity() != null && themePreviewActivity.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    HintView hintView = new HintView(7, themePreviewActivity.getParentActivity(), null, true);
                    hintView.setAlpha(0.0f);
                    hintView.setVisibility(4);
                    hintView.setShowingDuration(4000L);
                    themePreviewActivity.frameLayout.addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (themePreviewActivity.onSwitchDayNightDelegate.isDark()) {
                        hintView.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        hintView.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    hintView.setBackgroundColor();
                    hintView.showForView(themePreviewActivity.dayNightItem, true);
                    hintView.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
