package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class c9 extends FrameLayout {
    public float E;
    public final d9 F;
    public long f23205a;
    public TLRPC.Document f23206b;
    public final ai.z5 f23207c;
    public final o20 d;
    public final o20 e;
    public float f23208f;
    public z8 h;
    public boolean f23209n;
    public final PorterDuffColorFilter f23210r;
    public final d6 f23211s;
    public boolean v;
    public float f23212w;
    public float f23213x;
    public float f23214y;

    public c9(d9 d9Var, Context context) {
        super(context);
        this.F = d9Var;
        this.d = new o20();
        this.e = new o20();
        this.f23208f = 1.0f;
        this.f23210r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f23211s = new d6(this, 200L, qr.f27643g);
        this.f23212w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f23207c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.y5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f23211s.f23501c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(z8 z8Var, boolean z10) {
        z8 z8Var2 = this.h;
        if (z8Var2 != null) {
            this.e.d(z8Var2.f30777c, z8Var2.d, z8Var2.e, z8Var2.f30778f);
            this.f23208f = 0.0f;
            this.F.f23526n = true;
        }
        this.h = z8Var;
        this.f23209n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.z5 z5Var = this.f23207c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        p5 p5Var = z5Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f27162k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f23207c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        p5 p5Var = z5Var.e;
        if (p5Var != null) {
            ai.l4 l4Var = p5Var.f27162k;
            p5Var.setColorFilter(this.f23210r);
            return l4Var;
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
        ai.l4 l4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ai.z5 z5Var = this.f23207c;
            p5 p5Var = z5Var.e;
            if (p5Var != null && (l4Var = p5Var.f27162k) != null) {
                l4Var.startAnimation();
            }
            z5Var.f29029a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
