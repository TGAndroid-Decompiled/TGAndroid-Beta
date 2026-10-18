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
public abstract class d9 extends FrameLayout {
    public float E;
    public final e9 F;
    public long f25521a;
    public TLRPC.Document f25522b;
    public final ci.k4 f25523c;
    public final x20 d;
    public final x20 e;
    public float f25524f;
    public a9 h;
    public boolean f25525n;
    public final PorterDuffColorFilter f25526r;
    public final f6 f25527s;
    public boolean v;
    public float f25528w;
    public float f25529x;
    public float f25530y;

    public d9(e9 e9Var, Context context) {
        super(context);
        this.F = e9Var;
        this.d = new x20();
        this.e = new x20();
        this.f25524f = 1.0f;
        this.f25526r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f25527s = new f6(this, 200L, bs.f25038g);
        this.f25528w = -1.0f;
        ci.k4 k4Var = new ci.k4(this, context, 7);
        this.f25523c = k4Var;
        k4Var.getImageReceiver().setAutoRepeatCount(1);
        k4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(k4Var, w7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f25527s.f26100c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(a9 a9Var, boolean z10) {
        a9 a9Var2 = this.h;
        if (a9Var2 != null) {
            this.e.d(a9Var2.f24550c, a9Var2.d, a9Var2.e, a9Var2.f24551f);
            this.f25524f = 0.0f;
            this.F.f25887n = true;
        }
        this.h = a9Var;
        this.f25525n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ci.k4 k4Var = this.f25523c;
        ImageReceiver imageReceiver = k4Var.getImageReceiver();
        r5 r5Var = k4Var.e;
        if (r5Var != null) {
            imageReceiver = r5Var.f29849k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ci.k4 k4Var = this.f25523c;
        ImageReceiver imageReceiver = k4Var.getImageReceiver();
        r5 r5Var = k4Var.e;
        if (r5Var != null) {
            ci.g3 g3Var = r5Var.f29849k;
            r5Var.setColorFilter(this.f25526r);
            return g3Var;
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
        ci.g3 g3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ci.k4 k4Var = this.f25523c;
            r5 r5Var = k4Var.e;
            if (r5Var != null && (g3Var = r5Var.f29849k) != null) {
                g3Var.startAnimation();
            }
            k4Var.f32040a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
