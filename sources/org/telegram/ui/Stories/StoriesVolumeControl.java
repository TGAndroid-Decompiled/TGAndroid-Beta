package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.LaunchActivity;

public final class StoriesVolumeControl extends View {
    public float currentProgress;
    public final LaunchActivity.AnonymousClass18 hideRunnable;
    public boolean isVisible;
    public final Paint paint;
    public final AnimatedFloat progressToVisible;
    public final AnimatedFloat volumeProgress;

    public StoriesVolumeControl(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.hideRunnable = new LaunchActivity.AnonymousClass18(this, 21);
        this.progressToVisible = new AnimatedFloat(this);
        this.volumeProgress = new AnimatedFloat(this);
        paint.setColor(-1);
    }

    public final void adjustVolume(boolean z) {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f = streamMaxVolume;
        int iMax = (int) Math.max(1.0f, f / 15.0f);
        if (z) {
            int i = streamVolume + iMax;
            if (i <= streamMaxVolume) {
                streamMaxVolume = i;
            }
        } else {
            streamMaxVolume = streamVolume - iMax;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f2 = streamMaxVolume / f;
        this.currentProgress = f2;
        if (!this.isVisible) {
            this.volumeProgress.set(f2, true);
        }
        invalidate();
        this.isVisible = true;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.hideRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
        AndroidUtilities.runOnUIThread(anonymousClass18, 2000L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.currentProgress;
        AnimatedFloat animatedFloat = this.volumeProgress;
        animatedFloat.set(f, false);
        float f2 = this.isVisible ? 1.0f : 0.0f;
        AnimatedFloat animatedFloat2 = this.progressToVisible;
        animatedFloat2.set(f2, false);
        if (animatedFloat2.value != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            Paint paint = this.paint;
            paint.setAlpha((int) (animatedFloat2.value * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * animatedFloat.value, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 24) {
            adjustVolume(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        adjustVolume(false);
        return true;
    }
}
