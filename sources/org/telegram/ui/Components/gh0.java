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

public final class gh0 extends FrameLayout {

    public final Paint f28626a;

    public final Path f28627b;

    public final fh0 f28628c;
    public float d;

    public float f28629e;

    public float f28630f;
    public boolean h;

    public NotchInfoUtils.NotchInfo f28631n;

    public gh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f28626a = paint;
        this.f28627b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || SharedConfig.getDevicePerformanceClass() < 1) {
            this.f28628c = new dh0(this);
        } else {
            this.f28628c = new eh0(this, SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(gh0 gh0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
        } else {
            this.f28628c.c(new vu(this, 12), canvas);
        }
    }

    public float getAvatarEndScale() {
        float fMin;
        int iDp;
        NotchInfoUtils.NotchInfo notchInfo = this.f28631n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            fMin = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            iDp = AndroidUtilities.dp(100.0f);
        } else {
            fMin = Math.min(notchInfo.bounds.width(), this.f28631n.bounds.height());
            iDp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, fMin / iDp);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.f28631n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.f28631n = null;
        }
        this.f28628c.d(i10, i11);
    }

    public void setBlurIntensity(float f10) {
        this.f28630f = f10;
        this.f28628c.b(f10);
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
        this.f28628c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f28629e = f10;
        invalidate();
    }
}
