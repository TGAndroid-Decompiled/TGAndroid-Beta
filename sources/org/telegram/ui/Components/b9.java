package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class b9 extends FrameLayout {
    public float E;
    public final c9 F;
    public long f24928a;
    public TLRPC.Document f24929b;
    public final ci.j4 f24930c;
    public final v20 d;
    public final v20 e;
    public float f24931f;
    public y8 h;
    public boolean f24932n;
    public final PorterDuffColorFilter f24933r;
    public final d6 f24934s;
    public boolean v;
    public float f24935w;
    public float f24936x;
    public float f24937y;

    public b9(c9 c9Var, Context context) {
        super(context);
        this.F = c9Var;
        this.d = new v20();
        this.e = new v20();
        this.f24931f = 1.0f;
        this.f24933r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f24934s = new d6(this, 200L, zr.f33338g);
        this.f24935w = -1.0f;
        ci.j4 j4Var = new ci.j4(this, context, 7);
        this.f24930c = j4Var;
        j4Var.getImageReceiver().setAutoRepeatCount(1);
        j4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(j4Var, w7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f24934s.f25568c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(y8 y8Var, boolean z10) {
        y8 y8Var2 = this.h;
        if (y8Var2 != null) {
            this.e.d(y8Var2.f32842c, y8Var2.d, y8Var2.e, y8Var2.f32843f);
            this.f24931f = 0.0f;
            this.F.f25262n = true;
        }
        this.h = y8Var;
        this.f24932n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ci.j4 j4Var = this.f24930c;
        ImageReceiver imageReceiver = j4Var.getImageReceiver();
        p5 p5Var = j4Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f29484k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ci.j4 j4Var = this.f24930c;
        ImageReceiver imageReceiver = j4Var.getImageReceiver();
        p5 p5Var = j4Var.e;
        if (p5Var != null) {
            ci.f3 f3Var = p5Var.f29484k;
            p5Var.setColorFilter(this.f24933r);
            return f3Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.F.U) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        ci.f3 f3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ci.j4 j4Var = this.f24930c;
            p5 p5Var = j4Var.e;
            if (p5Var != null && (f3Var = p5Var.f29484k) != null) {
                f3Var.startAnimation();
            }
            j4Var.f31064a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
