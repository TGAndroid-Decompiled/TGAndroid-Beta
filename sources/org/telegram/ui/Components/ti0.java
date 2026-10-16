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
public final class ti0 extends FrameLayout {
    public final Paint f29071a;
    public final Path f29072b;
    public final si0 f29073c;
    public float d;
    public float e;
    public float f29074f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f29075n;

    public ti0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f29071a = paint;
        this.f29072b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f29073c = new ri0(this, f7);
        } else {
            this.f29073c = new qi0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(ti0 ti0Var, Canvas canvas) {
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
        this.f29073c.c(new xv(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f29075n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f29075n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f29075n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f29075n = null;
        }
        this.f29073c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f29074f = f7;
        this.f29073c.b(f7);
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
        this.f29073c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
