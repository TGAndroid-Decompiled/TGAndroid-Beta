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
public final class sh0 extends FrameLayout {
    public final Paint f30293a;
    public final Path f30294b;
    public final rh0 f30295c;
    public float d;
    public float f30296e;
    public float f30297f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f30298n;

    public sh0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f30293a = paint;
        this.f30294b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f30295c = new qh0(this, f7);
        } else {
            this.f30295c = new ph0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(sh0 sh0Var, Canvas canvas) {
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
        this.f30295c.c(new kv(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f30298n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f30298n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f30298n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f30298n = null;
        }
        this.f30295c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f30297f = f7;
        this.f30295c.b(f7);
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
        this.f30295c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.f30296e = f7;
        invalidate();
    }
}
