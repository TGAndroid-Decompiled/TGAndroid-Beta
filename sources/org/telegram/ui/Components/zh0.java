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
public final class zh0 extends FrameLayout {
    public final Paint f31342a;
    public final Path f31343b;
    public final yh0 f31344c;
    public float d;
    public float e;
    public float f31345f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f31346n;

    public zh0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f31342a = paint;
        this.f31343b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f31344c = new xh0(this, f10);
        } else {
            this.f31344c = new wh0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(zh0 zh0Var, Canvas canvas) {
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
        this.f31344c.c(new fv(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f31346n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f31346n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f31346n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f31346n = null;
        }
        this.f31344c.d(i10, i11);
    }

    public void setBlurIntensity(float f10) {
        this.f31345f = f10;
        this.f31344c.b(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        invalidate();
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.f31344c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.e = f10;
        invalidate();
    }
}
