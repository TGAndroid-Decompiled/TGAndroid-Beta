package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;
public final class gi0 extends FrameLayout {
    public final Paint f24571a;
    public final Path f24572b;
    public final fi0 f24573c;
    public float d;
    public float e;
    public float f24574f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f24575n;

    public gi0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f24571a = paint;
        this.f24572b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f24573c = new ei0(this, f7);
        } else {
            this.f24573c = new di0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(gi0 gi0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
            return;
        }
        this.f24573c.c(new ov(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f24575n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f24575n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f24575n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f24575n = null;
        }
        this.f24573c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f24574f = f7;
        this.f24573c.b(f7);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setIntensity(float f7) {
        this.d = f7;
        this.f24573c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
