package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public final class RecordedAudioPlayerView extends View {
    public boolean allowDraw;
    public final Paint backgroundPaint;
    public final RectF backgroundRect;
    public final RectF badgeClickRect;
    public final RectF badgeRect;
    public final Path clipPath;
    public final Paint darkerBackgroundPaint;
    public boolean destroyed;
    public float duration;
    public final Paint handlePaint;
    public final RectF handleRect;
    public float holdProgress;
    public int lastWaveformWidth;
    public float left;
    public final RectF leftHandleClickRect;
    public boolean leftPressed;
    public final PlayPauseDrawable playPauseDrawable;
    public boolean playPressed;
    public VideoPlayer player;
    public boolean progressPressed;
    public final SeekBarView$$ExternalSyntheticLambda1 progressUpdate;
    public final Theme.ResourcesProvider resourcesProvider;
    public float right;
    public final RectF rightHandleClickRect;
    public boolean rightPressed;
    public final AnimatedFloat showBadge;
    public final AnimatedFloat showDuration;
    public final AnimatedTextView.AnimatedTextDrawable text;
    public boolean wasPlaying;
    public byte[] waveformData;
    public final Paint waveformPaint;
    public final Path waveformPath;

    public RecordedAudioPlayerView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.darkerBackgroundPaint = new Paint(1);
        this.waveformPaint = new Paint(1);
        this.handlePaint = new Paint(1);
        this.left = 0.0f;
        this.right = 1.0f;
        this.wasPlaying = false;
        this.progressUpdate = new SeekBarView$$ExternalSyntheticLambda1(this, 4);
        this.backgroundRect = new RectF();
        this.badgeRect = new RectF();
        this.handleRect = new RectF();
        this.clipPath = new Path();
        this.badgeClickRect = new RectF();
        this.leftHandleClickRect = new RectF();
        this.rightHandleClickRect = new RectF();
        this.waveformPath = new Path();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.showDuration = new AnimatedFloat(this, 0L, 340L, cubicBezierInterpolator);
        this.showBadge = new AnimatedFloat(this, 0L, 340L, cubicBezierInterpolator);
        this.allowDraw = true;
        this.resourcesProvider = resourcesProvider;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(12);
        this.playPauseDrawable = playPauseDrawable;
        playPauseDrawable.parent = this;
        playPauseDrawable.setCallback(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.text = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.5f;
        animatedTextDrawable.animateDuration = 200L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.allowDraw) {
            drawIn(canvas, this.backgroundRect);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        VideoPlayer videoPlayer;
        boolean zContains = this.badgeClickRect.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.leftHandleClickRect;
        boolean z = !zContains && rectF.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.rightHandleClickRect;
        boolean z2 = !zContains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
        boolean z3 = (zContains || z || z2 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
        if (motionEvent.getAction() == 0) {
            this.playPressed = zContains;
            this.leftPressed = z;
            this.rightPressed = z2;
            if (z || z2) {
                VideoPlayer videoPlayer2 = this.player;
                if (videoPlayer2 != null) {
                    videoPlayer2.isPlaying();
                }
                setPlaying(false);
            }
            this.progressPressed = z3;
            if (z3) {
                VideoPlayer videoPlayer3 = this.player;
                if (videoPlayer3 != null) {
                    videoPlayer3.isPlaying();
                }
                VideoPlayer videoPlayer4 = this.player;
                this.holdProgress = videoPlayer4 != null ? videoPlayer4.getCurrentPosition() / this.player.getDuration() : 1.0f;
                setPlaying(false);
            }
            if (getParent() != null && (this.playPressed || this.leftPressed || this.rightPressed || this.progressPressed)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z4 = this.leftPressed;
            RectF rectF3 = this.backgroundRect;
            if (z4) {
                this.left = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.right - Math.max(1.0f / this.duration, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.rightPressed) {
                this.right = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.duration, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.left));
                invalidate();
            } else if (this.progressPressed) {
                VideoPlayer videoPlayer5 = this.player;
                if (videoPlayer5 != null) {
                    float fClamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.right, this.left);
                    this.holdProgress = fClamp;
                    videoPlayer5.seekTo((long) (fClamp * this.player.getDuration()), false);
                }
                invalidate();
            }
            this.text.setText(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.right - this.left) * this.duration)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.playPressed) {
                VideoPlayer videoPlayer6 = this.player;
                setPlaying(!(videoPlayer6 != null && videoPlayer6.isPlaying()));
            } else if (this.leftPressed && this.wasPlaying) {
                VideoPlayer videoPlayer7 = this.player;
                if (videoPlayer7 != null) {
                    videoPlayer7.seekTo((long) (this.left * videoPlayer7.getDuration()), false);
                }
                setPlaying(true);
            } else if (this.rightPressed && this.wasPlaying) {
                VideoPlayer videoPlayer8 = this.player;
                if (videoPlayer8 != null) {
                    videoPlayer8.seekTo(Math.max((long) (this.left * videoPlayer8.getDuration()), ((long) (this.right * this.player.getDuration())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.progressPressed && ((videoPlayer = this.player) == null || !videoPlayer.isPlaying())) {
                setPlaying(true);
            }
            this.playPressed = false;
            this.leftPressed = false;
            this.rightPressed = false;
            this.progressPressed = false;
        }
        return this.playPressed || this.leftPressed || this.rightPressed || this.progressPressed || super.dispatchTouchEvent(motionEvent);
    }

    public final void drawIn(Canvas canvas, RectF rectF) {
        Paint paint;
        int i;
        float fClamp;
        Paint paint2 = this.backgroundPaint;
        int i2 = Theme.key_chat_recordedVoiceBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint2.setColor(Theme.getColor(i2, resourcesProvider));
        Paint paint3 = this.darkerBackgroundPaint;
        paint3.setColor(Theme.getColor(Theme.key_chat_recordedVoiceDarkerBackground, resourcesProvider));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        int i3 = Theme.key_chat_recordedVoiceProgressInner;
        int color = Theme.getColor(i3, resourcesProvider);
        animatedTextDrawable.textPaint.setColor(color);
        animatedTextDrawable.alpha = Color.alpha(color);
        int color2 = Theme.getColor(Theme.key_chat_recordedVoicePlayPause, resourcesProvider);
        PlayPauseDrawable playPauseDrawable = this.playPauseDrawable;
        playPauseDrawable.paint.setColor(color2);
        Paint paint4 = this.waveformPaint;
        paint4.setColor(Theme.getColor(Theme.key_chat_recordedVoiceProgress, resourcesProvider));
        Paint paint5 = this.handlePaint;
        paint5.setColor(Theme.getColor(i3, resourcesProvider));
        int iLerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.left));
        int iLerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.right));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i4 = this.lastWaveformWidth;
        Path path = this.waveformPath;
        if (i4 == measuredWidth) {
            paint = paint5;
            i = iLerp2;
        } else {
            int iDp = measuredWidth / AndroidUtilities.dp(3.0f);
            int iDp2 = AndroidUtilities.dp(2.0f);
            int iDp3 = AndroidUtilities.dp(12.0f);
            byte bMin = 127;
            byte bMax = -128;
            int i5 = 0;
            while (i5 < iDp) {
                Paint paint6 = paint5;
                byte[] bArr = this.waveformData;
                byte b = bArr == null ? (byte) 0 : bArr[(int) ((i5 / iDp) * bArr.length)];
                bMin = (byte) Math.min((int) bMin, (int) b);
                bMax = (byte) Math.max((int) bMax, (int) b);
                i5++;
                paint5 = paint6;
                iLerp2 = iLerp2;
            }
            paint = paint5;
            i = iLerp2;
            path.rewind();
            int i6 = 0;
            while (i6 < iDp) {
                byte[] bArr2 = this.waveformData;
                float fLerp = AndroidUtilities.lerp(iDp2, iDp3, Utilities.clamp01(AndroidUtilities.ilerp((int) (bArr2 == null ? (byte) 0 : bArr2[(int) ((i6 / iDp) * bArr2.length)]), (int) bMin, (int) bMax)));
                float fDp = AndroidUtilities.dp(3.0f) * i6;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fDp, (-fLerp) / 2.0f, AndroidUtilities.dp(2.0f) + fDp, fLerp / 2.0f);
                path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                i6++;
                iDp = iDp;
                iDp2 = iDp2;
            }
            this.lastWaveformWidth = measuredWidth;
        }
        canvas.save();
        Path path2 = this.clipPath;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.drawRect(rectF.left, rectF.top, iLerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint3);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i, rectF.top, rectF.right, rectF.bottom, paint3);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i7 = Theme.key_chat_recordedVoiceProgress;
        paint4.setColor(Theme.multAlpha(0.3f, Theme.getColor(i7, resourcesProvider)));
        canvas.drawPath(path, paint4);
        canvas.restore();
        float f = iLerp;
        float f2 = i;
        canvas.drawRect(f, rectF.top, f2, rectF.bottom, paint2);
        if (this.progressPressed) {
            fClamp = this.holdProgress;
        } else {
            VideoPlayer videoPlayer = this.player;
            fClamp = Utilities.clamp(videoPlayer != null ? videoPlayer.getCurrentPosition() / this.player.getDuration() : 1.0f, this.right, this.left);
        }
        float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), fClamp), f2, f);
        if (fClamp2 < f2) {
            canvas.save();
            canvas.clipRect(fClamp2, rectF.top, f2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!this.wasPlaying || fClamp >= this.left || this.progressPressed) {
                paint4.setColor(Theme.getColor(i7, resourcesProvider));
            } else {
                paint4.setColor(Theme.getColor(Theme.key_chat_recordedVoiceProgressInner, resourcesProvider));
            }
            canvas.drawPath(path, paint4);
            canvas.restore();
        }
        if (fClamp2 > f) {
            canvas.save();
            canvas.clipRect(f, rectF.top, fClamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            VideoPlayer videoPlayer2 = this.player;
            if ((videoPlayer2 != null && videoPlayer2.isPlaying()) || this.wasPlaying || this.progressPressed) {
                paint4.setColor(Theme.getColor(Theme.key_chat_recordedVoiceProgressInner, resourcesProvider));
            } else {
                paint4.setColor(Theme.getColor(i7, resourcesProvider));
            }
            canvas.drawPath(path, paint4);
            canvas.restore();
        }
        RectF rectF3 = this.handleRect;
        rectF3.set(iLerp - AndroidUtilities.dp(7.0f), rectF.centerY() - AndroidUtilities.dp(5.33f), iLerp - AndroidUtilities.dp(5.33f), rectF.centerY() + AndroidUtilities.dp(5.33f));
        Paint paint7 = paint;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint7);
        rectF3.set(AndroidUtilities.dp(5.33f) + i, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint7);
        this.leftHandleClickRect.set(iLerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + iLerp, getHeight());
        this.rightHandleClickRect.set(i - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i, getHeight());
        float f3 = this.showBadge.set(!this.progressPressed);
        if (f3 > 0.0f) {
            float currentWidth = (int) (animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(30.0f));
            float f4 = this.showDuration.set(currentWidth <= ((float) ((i - iLerp) - AndroidUtilities.dp(8.0f))));
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), currentWidth, f4);
            int iDp4 = AndroidUtilities.dp(20.0f);
            RectF rectF4 = this.badgeRect;
            float f5 = iLerp + i;
            float f6 = iDp4 / 2.0f;
            rectF4.set((f5 - fLerp2) / 2.0f, rectF.centerY() - f6, (f5 + fLerp2) / 2.0f, rectF.centerY() + f6);
            int alpha = paint3.getAlpha();
            paint3.setAlpha((int) (alpha * f3));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint3);
            paint3.setAlpha(alpha);
            RectF rectF5 = this.badgeClickRect;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int iDp5 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (iDp5 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), f4), rectF4.centerY());
            playPauseDrawable.setBounds(0, (-iDp5) / 2, iDp5, iDp5 / 2);
            playPauseDrawable.alpha = (int) (f3 * 255.0f);
            playPauseDrawable.draw(canvas);
            canvas.restore();
            if (f4 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                animatedTextDrawable.setBounds(-1, -1, 1, 1);
                animatedTextDrawable.alpha = (int) (f4 * 255.0f * f3);
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public float getAudioLeft() {
        return this.left;
    }

    public long getAudioLeftMs() {
        return (long) (this.left * getDuration());
    }

    public float getAudioRight() {
        return this.right;
    }

    public long getAudioRightMs() {
        return (long) (this.right * getDuration());
    }

    public long getDuration() {
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    public double getNewDuration() {
        return ((double) ((this.right - this.left) * getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float fDp = AndroidUtilities.dp(32.0f);
        this.backgroundRect.set(0.0f, (getHeight() - fDp) / 2.0f, getWidth(), (getHeight() + fDp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float fDp = AndroidUtilities.dp(32.0f);
        this.backgroundRect.set(0.0f, (getMeasuredHeight() - fDp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + fDp) / 2.0f);
    }

    public void setAllowDraw(boolean z) {
        if (this.allowDraw != z) {
            this.allowDraw = z;
            invalidate();
        }
    }

    public void setPlaying(boolean z) {
        if (this.destroyed) {
            z = false;
        }
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            float currentPosition = videoPlayer.getCurrentPosition() / this.player.getDuration();
            float f = this.left;
            if (currentPosition < f || currentPosition > this.right) {
                VideoPlayer videoPlayer2 = this.player;
                videoPlayer2.seekTo((long) (f * videoPlayer2.getDuration()), false);
            }
            this.player.setPlayWhenReady(z);
        }
        this.playPauseDrawable.setPause(z, true);
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.progressUpdate;
        AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
        if (z) {
            AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda1, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.text == drawable || this.playPauseDrawable == drawable || super.verifyDrawable(drawable);
    }
}
