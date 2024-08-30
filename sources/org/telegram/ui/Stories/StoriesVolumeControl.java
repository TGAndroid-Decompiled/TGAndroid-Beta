package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;

public class StoriesVolumeControl extends View {
    float currentProgress;
    Runnable hideRunnable;
    boolean isVisible;
    Paint paint;
    AnimatedFloat progressToVisible;
    AnimatedFloat volumeProgress;

    public StoriesVolumeControl(Context context) {
        super(context);
        this.paint = new Paint(1);
        this.hideRunnable = new Runnable() {
            @Override
            public void run() {
                StoriesVolumeControl storiesVolumeControl = StoriesVolumeControl.this;
                storiesVolumeControl.isVisible = false;
                storiesVolumeControl.invalidate();
            }
        };
        this.progressToVisible = new AnimatedFloat(this);
        this.volumeProgress = new AnimatedFloat(this);
        this.paint.setColor(-1);
    }

    private void adjustVolume(boolean z) {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f = streamMaxVolume;
        int max = (int) Math.max(1.0f, f / 15.0f);
        if (z) {
            int i = streamVolume + max;
            if (i <= streamMaxVolume) {
                streamMaxVolume = i;
            }
        } else {
            streamMaxVolume = streamVolume - max;
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
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        AndroidUtilities.runOnUIThread(this.hideRunnable, 2000L);
    }

    public void hide() {
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        this.hideRunnable.run();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.volumeProgress.set(this.currentProgress);
        this.progressToVisible.set(this.isVisible ? 1.0f : 0.0f);
        if (this.progressToVisible.get() != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            this.paint.setAlpha((int) (this.progressToVisible.get() * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * this.volumeProgress.get(), getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, this.paint);
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
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

    public void unmute() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= streamMinVolume) {
            adjustVolume(true);
            return;
        }
        if (this.isVisible) {
            return;
        }
        float f = streamVolume / streamMaxVolume;
        this.currentProgress = f;
        this.volumeProgress.set(f, true);
        this.isVisible = true;
        invalidate();
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        AndroidUtilities.runOnUIThread(this.hideRunnable, 2000L);
    }
}
