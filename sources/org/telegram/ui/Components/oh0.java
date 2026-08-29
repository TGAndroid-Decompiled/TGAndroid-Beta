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
public final class oh0 extends FrameLayout {
    public final Paint f31365a;
    public final Path f31366b;
    public final nh0 f31367c;
    public float d;
    public float f31368e;
    public float f31369f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f31370n;

    public oh0(Context context) {
        super(context);
        float f9;
        Paint paint = new Paint(1);
        this.f31365a = paint;
        this.f31366b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f9 = 1.0f;
            } else {
                f9 = 1.5f;
            }
            this.f31367c = new mh0(this, f9);
        } else {
            this.f31367c = new lh0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(oh0 oh0Var, Canvas canvas) {
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
        this.f31367c.c(new cv(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f31370n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f31370n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f31370n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f31370n = null;
        }
        this.f31367c.d(i10, i11);
    }

    public void setBlurIntensity(float f9) {
        this.f31369f = f9;
        this.f31367c.b(f9);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setIntensity(float f9) {
        this.d = f9;
        this.f31367c.a(f9);
        invalidate();
    }

    public void setPullProgress(float f9) {
        this.f31368e = f9;
        invalidate();
    }
}
