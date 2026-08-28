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
public final class eh0 extends FrameLayout {
    public final Paint f28026a;
    public final Path f28027b;
    public final dh0 f28028c;
    public float d;
    public float f28029e;
    public float f28030f;
    public boolean h;
    public NotchInfoUtils.NotchInfo f28031n;

    public eh0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f28026a = paint;
        this.f28027b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f28028c = new ch0(this, f10);
        } else {
            this.f28028c = new bh0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(eh0 eh0Var, Canvas canvas) {
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
        this.f28028c.c(new wu(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.f28031n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.f28031n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f28031n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f28031n = null;
        }
        this.f28028c.d(i9, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f28030f = f10;
        this.f28028c.b(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.f28028c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f28029e = f10;
        invalidate();
    }
}
