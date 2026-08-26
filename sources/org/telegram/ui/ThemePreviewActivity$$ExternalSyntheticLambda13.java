package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.MaxFileSizeCell;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.WallpaperParallaxEffect;

public final class ThemePreviewActivity$$ExternalSyntheticLambda13 implements ImageReceiver.ImageReceiverDelegate, RecyclerListView.OnItemClickListenerExtended, WallpaperParallaxEffect.Callback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda13(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ThemePreviewActivity themePreviewActivity = this.f$0;
        if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z || drawable == null) {
            return;
        }
        AndroidUtilities.calcDrawableColor(drawable);
        themePreviewActivity.themeDelegate.applyChatServiceMessageColor(themePreviewActivity.checkBlur(drawable), drawable, Float.valueOf(themePreviewActivity.currentIntensity));
        if (!z2 && themePreviewActivity.isBlurred && themePreviewActivity.blurredBitmap == null) {
            themePreviewActivity.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(false);
            themePreviewActivity.updateBlurred();
            themePreviewActivity.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        themePreviewActivity.invalidateBlur$2();
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.actionBar2.getActionBarMenuOnItemClick().onItemClick(4);
                break;
            case 4:
                this.f$0.cancelThemeApply(false);
                break;
            case 5:
                ThemePreviewActivity themePreviewActivity = this.f$0;
                Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
                if (themeAccent.backgroundOverrideColor == 4294967296L) {
                    themeAccent.backgroundOverrideColor = 0L;
                    themeAccent.backgroundGradientOverrideColor1 = 0L;
                    themeAccent.backgroundGradientOverrideColor2 = 0L;
                    themeAccent.backgroundGradientOverrideColor3 = 0L;
                    themePreviewActivity.updatePlayAnimationView(false);
                    Theme.refreshThemeColors(false, false);
                }
                themePreviewActivity.removeBackgroundOverride = true;
                Theme.isApplyingAccent = false;
                Theme.reloadWallpaper(true);
                themePreviewActivity.selectColorType(2, false);
                break;
            case 6:
                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                Theme.ThemeAccent themeAccent2 = themePreviewActivity2.accent;
                if (themeAccent2.backgroundOverrideColor == 4294967296L) {
                    themeAccent2.backgroundOverrideColor = 0L;
                    themeAccent2.backgroundGradientOverrideColor1 = 0L;
                    themeAccent2.backgroundGradientOverrideColor2 = 0L;
                    themeAccent2.backgroundGradientOverrideColor3 = 0L;
                    themePreviewActivity2.updatePlayAnimationView(false);
                    Theme.refreshThemeColors(false, false);
                }
                themePreviewActivity2.removeBackgroundOverride = true;
                Theme.isApplyingAccent = false;
                Theme.reloadWallpaper(true);
                themePreviewActivity2.selectColorType(2, false);
                break;
            default:
                ThemePreviewActivity themePreviewActivity3 = this.f$0;
                themePreviewActivity3.getClass();
                if (Theme.hasCustomWallpaper() && Theme.currentTheme.overrideWallpaper.color != 0) {
                    Theme.ThemeAccent themeAccent3 = themePreviewActivity3.accent;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeAccent3.overrideWallpaper;
                    themeAccent3.backgroundOverrideColor = overrideWallpaperInfo.color;
                    themeAccent3.backgroundGradientOverrideColor1 = overrideWallpaperInfo.gradientColor1;
                    themeAccent3.backgroundGradientOverrideColor2 = overrideWallpaperInfo.gradientColor2;
                    themeAccent3.backgroundGradientOverrideColor3 = overrideWallpaperInfo.gradientColor3;
                    themeAccent3.backgroundRotation = overrideWallpaperInfo.rotation;
                    String str = overrideWallpaperInfo.slug;
                    themeAccent3.patternSlug = str;
                    float f = overrideWallpaperInfo.intensity;
                    themeAccent3.patternIntensity = f;
                    themePreviewActivity3.currentIntensity = f;
                    if (str == null || "c".equals(str)) {
                        themePreviewActivity3.selectedPattern = null;
                    } else {
                        int size = themePreviewActivity3.patterns.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) themePreviewActivity3.patterns.get(i2);
                            if (tL_wallPaper.pattern && themeAccent3.patternSlug.equals(tL_wallPaper.slug)) {
                                themePreviewActivity3.selectedPattern = tL_wallPaper;
                            }
                        }
                    }
                    themePreviewActivity3.removeBackgroundOverride = true;
                    themePreviewActivity3.backgroundCheckBoxView[1].setChecked(themePreviewActivity3.selectedPattern != null, true);
                    themePreviewActivity3.updatePlayAnimationView(false);
                    Theme.refreshThemeColors(false, false);
                }
                Drawable background = themePreviewActivity3.backgroundImage.getBackground();
                if (background instanceof MotionBackgroundDrawable) {
                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) background;
                    motionBackgroundDrawable.setPatternBitmap(null, 100);
                    if (Theme.currentTheme.isDark()) {
                        if (themePreviewActivity3.currentIntensity < 0.0f) {
                            themePreviewActivity3.backgroundImage.getImageReceiver().setGradientBitmap(motionBackgroundDrawable.currentBitmap);
                        }
                        MaxFileSizeCell.AnonymousClass1 anonymousClass1 = themePreviewActivity3.intensitySeekBar;
                        if (anonymousClass1 != null) {
                            anonymousClass1.setTwoSided(true);
                        }
                    } else {
                        float f2 = themePreviewActivity3.currentIntensity;
                        if (f2 < 0.0f) {
                            themePreviewActivity3.currentIntensity = -f2;
                        }
                    }
                }
                MaxFileSizeCell.AnonymousClass1 anonymousClass2 = themePreviewActivity3.intensitySeekBar;
                if (anonymousClass2 != null) {
                    anonymousClass2.setProgress(themePreviewActivity3.currentIntensity);
                }
                Theme.isApplyingAccent = false;
                Theme.reloadWallpaper(true);
                themePreviewActivity3.selectColorType(2, false);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ThemePreviewActivity themePreviewActivity = this.f$0;
        themePreviewActivity.getClass();
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (!chatMessageCell.isInsideBackground(f)) {
                themePreviewActivity.selectColorType(2, true);
            } else if (chatMessageCell.getMessageObject().isOutOwner()) {
                themePreviewActivity.selectColorType(3, true);
            } else {
                themePreviewActivity.selectColorType(1, true);
            }
        }
    }

    @Override
    public void onOffsetsChanged(int i, int i2) {
        ThemePreviewActivity themePreviewActivity = this.f$0;
        if (themePreviewActivity.isMotion) {
            themePreviewActivity.backgroundImage.getBackground();
            float scaleX = themePreviewActivity.motionAnimation != null ? (themePreviewActivity.backgroundImage.getScaleX() - 1.0f) / (themePreviewActivity.parallaxScale - 1.0f) : 1.0f;
            themePreviewActivity.backgroundImage.setTranslationX(i * scaleX);
            themePreviewActivity.backgroundImage.setTranslationY(i2 * scaleX);
        }
    }
}
