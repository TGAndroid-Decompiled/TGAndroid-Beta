package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;

public final class TypingDotsDrawable extends StatusDrawable {
    public final Paint currentPaint;
    public boolean ignoreAnimationLocks;
    public final int currentAccount = UserConfig.selectedAccount;
    public boolean isChat = false;
    public final float[] scales = new float[3];
    public final float[] startTimes = {0.0f, 150.0f, 300.0f};
    public final float[] elapsedTimes = {0.0f, 0.0f, 0.0f};
    public long lastUpdateTime = 0;
    public boolean started = false;
    public final DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();

    public TypingDotsDrawable(boolean z) {
        if (z) {
            this.currentPaint = new Paint(1);
        }
    }

    public final void checkUpdate$1() {
        if (this.started) {
            if (NotificationCenter.getInstance(this.currentAccount).isAnimationInProgress() && !this.ignoreAnimationLocks) {
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 7), 100L);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            for (int i = 0; i < 3; i++) {
                float[] fArr = this.elapsedTimes;
                float f = fArr[i] + j;
                fArr[i] = f;
                float[] fArr2 = this.startTimes;
                float f2 = f - fArr2[i];
                float[] fArr3 = this.scales;
                if (f2 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.decelerateInterpolator;
                    if (f2 <= 320.0f) {
                        fArr3[i] = decelerateInterpolator.getInterpolation(f2 / 320.0f) + 1.33f;
                    } else if (f2 <= 640.0f) {
                        fArr3[i] = (1.0f - decelerateInterpolator.getInterpolation((f2 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f2 >= 800.0f) {
                        fArr[i] = 0.0f;
                        fArr2[i] = 0.0f;
                        fArr3[i] = 1.33f;
                    } else {
                        fArr3[i] = 1.33f;
                    }
                } else {
                    fArr3[i] = 1.33f;
                }
            }
            invalidateLimited();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp;
        int i;
        int i2 = getBounds().left;
        if (this.isChat) {
            iDp = AndroidUtilities.dp(8.5f);
            i = getBounds().top;
        } else {
            iDp = AndroidUtilities.dp(9.3f);
            i = getBounds().top;
        }
        int i3 = iDp + i;
        Paint paint = this.currentPaint;
        if (paint == null) {
            paint = Theme.chat_statusPaint;
            paint.setAlpha(255);
        }
        float fDp = AndroidUtilities.dp(3.0f) + i2;
        float f = i3;
        float[] fArr = this.scales;
        canvas.drawCircle(fDp, f, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i2, f, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i2, f, fArr[2] * AndroidUtilities.density, paint);
        checkUpdate$1();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColor(int i) {
        Paint paint = this.currentPaint;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.currentPaint;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setIsChat(boolean z) {
        this.isChat = z;
    }

    @Override
    public final void start() {
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        invalidateSelf();
    }

    @Override
    public final void stop() {
        for (int i = 0; i < 3; i++) {
            this.elapsedTimes[i] = 0.0f;
            this.scales[i] = 1.33f;
        }
        float[] fArr = this.startTimes;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.started = false;
    }
}
