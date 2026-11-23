package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public abstract class w8 extends FrameLayout {
    public float E;
    public float F;
    public final x8 G;
    public long f41535a;
    public TLRPC.Document f41536b;
    public final fi.t3 f41537c;
    public final q10 d;
    public final q10 f41538e;
    public float f41539f;
    public t8 h;
    public boolean f41540n;
    public final PorterDuffColorFilter f41541r;
    public final c6 f41542s;
    public boolean f41543w;
    public float f41544x;
    public float f41545y;

    public w8(x8 x8Var, Context context) {
        super(context);
        this.G = x8Var;
        this.d = new q10();
        this.f41538e = new q10();
        this.f41539f = 1.0f;
        this.f41541r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f41542s = new c6(this, 200L, kr.f36859g);
        this.f41544x = -1.0f;
        fi.t3 t3Var = new fi.t3(7, context, this);
        this.f41537c = t3Var;
        t3Var.getImageReceiver().Y(1);
        t3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(t3Var, c8.na.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f41542s.f33931c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(t8 t8Var, boolean z10) {
        t8 t8Var2 = this.h;
        if (t8Var2 != null) {
            this.f41538e.d(t8Var2.f39856c, t8Var2.d, t8Var2.f39857e, t8Var2.f39858f);
            this.f41539f = 0.0f;
            this.G.f41926n = true;
        }
        this.h = t8Var;
        this.f41540n = z10;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25301u4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        fi.t3 t3Var = this.f41537c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.f38432e;
        if (o5Var != null) {
            imageReceiver = o5Var.f38028k;
        }
        if (imageReceiver != null && imageReceiver.C() != null) {
            return imageReceiver.C().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        fi.t3 t3Var = this.f41537c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.f38432e;
        if (o5Var != null) {
            fi.s2 s2Var = o5Var.f38028k;
            o5Var.setColorFilter(this.f41541r);
            return s2Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.G.V) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        fi.s2 s2Var;
        if (this.f41543w == z10) {
            return;
        }
        this.f41543w = z10;
        if (z10) {
            fi.t3 t3Var = this.f41537c;
            o5 o5Var = t3Var.f38432e;
            if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
                s2Var.Q0(false);
            }
            t3Var.f38429a.Q0(false);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25301u4, new Object[0]);
        invalidate();
    }
}
