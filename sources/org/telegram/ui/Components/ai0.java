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
public final class ai0 extends FrameLayout {
    public final Paint f23377a;
    public final Path f23378b;
    public final zh0 f23379c;
    public float d;
    public float e;
    public float f23380f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f23381n;

    public ai0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f23377a = paint;
        this.f23378b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f23379c = new yh0(this, f10);
        } else {
            this.f23379c = new xh0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(ai0 ai0Var, Canvas canvas) {
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
        this.f23379c.c(new ev(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f23381n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f23381n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f23381n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f23381n = null;
        }
        this.f23379c.d(i10, i11);
    }

    public void setBlurIntensity(float f10) {
        this.f23380f = f10;
        this.f23379c.b(f10);
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
        this.f23379c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.e = f10;
        invalidate();
    }
}
