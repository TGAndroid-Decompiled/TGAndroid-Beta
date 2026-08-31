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
public final class bi0 extends FrameLayout {
    public final Paint f25595a;
    public final Path f25596b;
    public final ai0 f25597c;
    public float d;
    public float f25598e;
    public float f25599f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f25600n;

    public bi0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f25595a = paint;
        this.f25596b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f25597c = new zh0(this, f10);
        } else {
            this.f25597c = new yh0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(bi0 bi0Var, Canvas canvas) {
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
        this.f25597c.c(new hv(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f25600n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f25600n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f25600n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f25600n = null;
        }
        this.f25597c.d(i10, i11);
    }

    public void setBlurIntensity(float f10) {
        this.f25599f = f10;
        this.f25597c.b(f10);
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
        this.f25597c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f25598e = f10;
        invalidate();
    }
}
