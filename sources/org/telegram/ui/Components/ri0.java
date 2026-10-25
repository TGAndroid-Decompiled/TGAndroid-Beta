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
public class ri0 extends FrameLayout {
    public final Paint f32250a;
    public final Path f32251b;
    public final qi0 f32252c;
    public float d;
    public float e;
    public float f32253f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f32254n;

    public ri0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f32250a = paint;
        this.f32251b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f32252c = new pi0(this, f7);
        } else {
            this.f32252c = new oi0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(ri0 ri0Var, Canvas canvas) {
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
        this.f32252c.c(new tv(this, 15), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f32254n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f32254n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    public float getHiddenAvatarSizeDp() {
        NotchInfoUtils.NotchInfo notchInfo = this.f32254n;
        if (notchInfo != null && notchInfo.isLikelyCircle) {
            return (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f32254n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f32254n = null;
        }
        this.f32252c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f32253f = f7;
        this.f32252c.b(f7);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setHideProgress(float f7) {
        boolean z10;
        setPullProgress(f7);
        setBlurIntensity(Math.min((a8.ee.a(f7, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i10 = 0;
        if (f7 > 0.0f && f7 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setGooeyEnabled(z10);
        if (f7 >= 1.0f) {
            i10 = 8;
        }
        setVisibility(i10);
    }

    public void setIntensity(float f7) {
        this.d = f7;
        this.f32252c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
