package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.PeerColorActivity;

public final class StoryRecorder$$ExternalSyntheticLambda24 implements View.OnClickListener {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda24(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void onClick(View view) {
        int i = 2;
        boolean z = false;
        StoryRecorder storyRecorder = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (!storyRecorder.awaitingPlayer) {
                    storyRecorder.onBackPressed();
                    break;
                }
                break;
            case 1:
                StoryRecorder storyRecorder2 = this.f$0;
                if (storyRecorder2.outputEntry != null && storyRecorder2.changeDayNightView == null && storyRecorder2.themeButton != null) {
                    ValueAnimator valueAnimator = storyRecorder2.changeDayNightViewAnimator;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z2 = storyRecorder2.outputEntry.isDark;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(storyRecorder2.windowView.getWidth(), storyRecorder2.windowView.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        storyRecorder2.themeButton.setAlpha(0.0f);
                        StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder2.previewView;
                        if (anonymousClass7 != null) {
                            anonymousClass7.drawForThemeToggle = true;
                        }
                        StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder2.paintView;
                        if (anonymousClass24 != null) {
                            anonymousClass24.drawForThemeToggle = true;
                        }
                        storyRecorder2.windowView.draw(canvas);
                        StoryRecorder.AnonymousClass7 anonymousClass8 = storyRecorder2.previewView;
                        if (anonymousClass8 != null) {
                            anonymousClass8.drawForThemeToggle = false;
                        }
                        StoryRecorder.AnonymousClass24 anonymousClass25 = storyRecorder2.paintView;
                        if (anonymousClass25 != null) {
                            anonymousClass25.drawForThemeToggle = false;
                        }
                        storyRecorder2.themeButton.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        storyRecorder2.themeButton.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float measuredWidth = (storyRecorder2.themeButton.getMeasuredWidth() / 2.0f) + f;
                        float measuredHeight = (storyRecorder2.themeButton.getMeasuredHeight() / 2.0f) + f2;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        StoryRecorder.AnonymousClass31 anonymousClass31 = new StoryRecorder.AnonymousClass31(storyRecorder2, storyRecorder2.activity, z2, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 0);
                        storyRecorder2.changeDayNightView = anonymousClass31;
                        anonymousClass31.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                        storyRecorder2.changeDayNightViewProgress = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        storyRecorder2.changeDayNightViewAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new PeerColorActivity.AnonymousClass8(storyRecorder2, i));
                        storyRecorder2.changeDayNightViewAnimator.addListener(new StoryRecorder.AnonymousClass17(storyRecorder2, i));
                        storyRecorder2.changeDayNightViewAnimator.setStartDelay(80L);
                        storyRecorder2.changeDayNightViewAnimator.setDuration(z2 ? 320L : 450L);
                        storyRecorder2.changeDayNightViewAnimator.setInterpolator(z2 ? CubicBezierInterpolator.EASE_IN : CubicBezierInterpolator.EASE_OUT_QUINT);
                        storyRecorder2.changeDayNightViewAnimator.start();
                        storyRecorder2.windowView.addView(storyRecorder2.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder2, 4));
                    }
                    break;
                }
                break;
            case 2:
                StoryEntry storyEntry = storyRecorder.outputEntry;
                if (storyEntry != null && !storyRecorder.awaitingPlayer) {
                    storyEntry.muted = !storyEntry.muted;
                    ArrayList arrayList = storyEntry.collageContent;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((StoryEntry) obj).muted = storyRecorder.outputEntry.muted;
                        }
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(storyRecorder.outputEntry.audioPath);
                    StoryEntry storyEntry2 = storyRecorder.outputEntry;
                    boolean z3 = storyEntry2.round != null;
                    if (storyRecorder.currentEditMode == -1) {
                        HintView2 hintView2 = storyRecorder.muteHint;
                        String string = storyEntry2.muted ? LocaleController.getString((!zIsEmpty || z3) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted) : LocaleController.getString((!zIsEmpty || z3) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        boolean z4 = storyRecorder.muteHint.shown;
                        if (hintView2.getMeasuredWidth() < 0) {
                            hintView2.textToSet = string;
                        } else {
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = hintView2.textDrawable;
                            if (!LocaleController.isRTL && z4) {
                                z = true;
                            }
                            animatedTextDrawable.setText(string, z, true);
                        }
                        storyRecorder.muteHint.show();
                    }
                    storyRecorder.setIconMuted(storyRecorder.outputEntry.muted, true);
                    storyRecorder.previewView.checkVolumes();
                    break;
                }
                break;
            case 3:
                boolean zContains = storyRecorder.previewView.pauseLinks.contains(-9982);
                storyRecorder.previewView.updatePauseReason(-9982, !zContains);
                ((PlayPauseDrawable) storyRecorder.playButton.this$0).setPause(zContains, true);
                break;
            case 4:
                if (storyRecorder.cameraView != null && !storyRecorder.awaitingPlayer) {
                    String currentFlashMode = storyRecorder.getCurrentFlashMode();
                    String nextFlashMode = storyRecorder.getNextFlashMode();
                    if (currentFlashMode != null && !currentFlashMode.equals(nextFlashMode)) {
                        StoryRecorder.AnonymousClass25 anonymousClass26 = storyRecorder.cameraView;
                        if (anonymousClass26 != null && anonymousClass26.getCameraSession() != null) {
                            if (!storyRecorder.cameraView.isFrontface() || storyRecorder.cameraView.getCameraSession().hasFlashModes()) {
                                storyRecorder.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
                            } else {
                                int iIndexOf = storyRecorder.frontfaceFlashModes.indexOf(nextFlashMode);
                                if (iIndexOf >= 0) {
                                    storyRecorder.frontfaceFlashMode = iIndexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", storyRecorder.frontfaceFlashMode).apply();
                                }
                            }
                        }
                        storyRecorder.setCameraFlashModeIcon(nextFlashMode);
                        break;
                    }
                }
                break;
            case 5:
                StoryRecorder.AnonymousClass25 anonymousClass27 = storyRecorder.cameraView;
                if (anonymousClass27 != null && storyRecorder.currentPage == 0) {
                    anonymousClass27.toggleDual();
                    storyRecorder.dualButton.setValue(storyRecorder.cameraView.isDual());
                    storyRecorder.dualButton.setContentDescription(LocaleController.getString(storyRecorder.cameraView.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    storyRecorder.dualHint.hide(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (storyRecorder.savedDualHint.shown) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    storyRecorder.savedDualHint.hide(true);
                    break;
                }
                break;
            case 6:
                if (storyRecorder.currentPage == 0 && !storyRecorder.animatedRecording) {
                    StoryRecorder.AnonymousClass25 anonymousClass28 = storyRecorder.cameraView;
                    if (anonymousClass28 != null && anonymousClass28.isDual()) {
                        storyRecorder.cameraView.toggleDual();
                    }
                    if (!storyRecorder.collageListView.visible && !storyRecorder.collageLayoutView.hasLayout()) {
                        storyRecorder.collageLayoutView.setLayout(storyRecorder.lastCollageLayout);
                        storyRecorder.collageListView.setSelected(storyRecorder.lastCollageLayout);
                        storyRecorder.collageButton.setIcon(new MotionPhotoDrawable(storyRecorder.lastCollageLayout, false), true);
                        storyRecorder.collageButton.setSelected(true);
                        StoryRecorder.AnonymousClass25 anonymousClass29 = storyRecorder.cameraView;
                        if (anonymousClass29 != null) {
                            anonymousClass29.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                        }
                        StoryRecorder.AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
                        if (anonymousClass19 != null) {
                            anonymousClass19.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
                            storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
                        }
                    }
                    CollageLayoutButton.CollageLayoutListView collageLayoutListView = storyRecorder.collageListView;
                    collageLayoutListView.setVisible(!collageLayoutListView.visible, true);
                    storyRecorder.updateActionBarButtons(true);
                    break;
                }
                break;
            case 7:
                storyRecorder.collageLayoutView.setLayout(null);
                storyRecorder.collageLayoutView.clear$2();
                storyRecorder.collageListView.setSelected((CollageLayout) null);
                StoryRecorder.AnonymousClass25 anonymousClass210 = storyRecorder.cameraView;
                if (anonymousClass210 != null) {
                    anonymousClass210.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                }
                storyRecorder.collageListView.setVisible(false, true);
                storyRecorder.updateActionBarButtons(true);
                StoryRecorder.AnonymousClass19 anonymousClass110 = storyRecorder.galleryListView;
                if (anonymousClass110 != null) {
                    anonymousClass110.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
                    storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
                }
                break;
            case 8:
                storyRecorder.startLive();
                break;
            case 9:
                StoryRecorder.AnonymousClass25 anonymousClass211 = storyRecorder.cameraView;
                if (anonymousClass211 != null && !storyRecorder.awaitingPlayer && !storyRecorder.takingPhoto && anonymousClass211.isInited() && storyRecorder.currentPage == 0) {
                    storyRecorder.cameraView.switchCamera();
                    storyRecorder.recordControl.rotateFlip(180.0f);
                    MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", storyRecorder.cameraView.isFrontface()).apply();
                    if (!storyRecorder.useDisplayFlashlight()) {
                        storyRecorder.flashViews.flashOut();
                    } else {
                        FlashViews flashViews = storyRecorder.flashViews;
                        flashViews.setScreenBrightness(flashViews.intensity);
                        flashViews.flashTo(1.0f, 320L, null);
                    }
                    break;
                }
                break;
            case 10:
                storyRecorder.startLive();
                break;
            case 11:
                StoryEntry storyEntry3 = storyRecorder.outputEntry;
                if (storyEntry3 != null) {
                    storyEntry3.coverSet = true;
                    storyEntry3.cover = storyRecorder.coverValue;
                    storyRecorder.processDone$11();
                    StoryEntry storyEntry4 = storyRecorder.outputEntry;
                    if (storyEntry4 != null && !storyEntry4.isEditingCover) {
                        AndroidUtilities.runOnUIThread(new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (storyRecorder.noCameraPermission) {
                    storyRecorder.requestCameraPermission(true);
                }
                break;
            case 13:
                storyRecorder.switchToEditMode(-1, false, true);
                break;
            default:
                storyRecorder.switchToEditMode(-1, false, true);
                break;
        }
    }
}
