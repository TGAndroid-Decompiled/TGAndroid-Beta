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
public abstract class p8 extends FrameLayout {
    public float E;
    public float F;
    public final q8 G;
    public long f38236a;
    public TLRPC.Document f38237b;
    public final fi.v3 f38238c;
    public final i10 d;
    public final i10 f38239e;
    public float f38240f;
    public m8 h;
    public boolean f38241n;
    public final PorterDuffColorFilter f38242r;
    public final u5 f38243s;
    public boolean f38244w;
    public float f38245x;
    public float f38246y;

    public p8(q8 q8Var, Context context) {
        super(context);
        this.G = q8Var;
        this.d = new i10();
        this.f38239e = new i10();
        this.f38240f = 1.0f;
        this.f38242r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f38243s = new u5(this, 200L, er.f34420g);
        this.f38245x = -1.0f;
        fi.v3 v3Var = new fi.v3(7, context, this);
        this.f38238c = v3Var;
        v3Var.getImageReceiver().X(1);
        v3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(v3Var, c8.ja.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f38243s.f39900c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(m8 m8Var, boolean z10) {
        m8 m8Var2 = this.h;
        if (m8Var2 != null) {
            this.f38239e.d(m8Var2.f37163c, m8Var2.d, m8Var2.f37164e, m8Var2.f37165f);
            this.f38240f = 0.0f;
            this.G.f38570n = true;
        }
        this.h = m8Var;
        this.f38241n = z10;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25565r4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        fi.v3 v3Var = this.f38238c;
        ImageReceiver imageReceiver = v3Var.getImageReceiver();
        g5 g5Var = v3Var.f35502e;
        if (g5Var != null) {
            imageReceiver = g5Var.f34813k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        fi.v3 v3Var = this.f38238c;
        ImageReceiver imageReceiver = v3Var.getImageReceiver();
        g5 g5Var = v3Var.f35502e;
        if (g5Var != null) {
            fi.u2 u2Var = g5Var.f34813k;
            g5Var.setColorFilter(this.f38242r);
            return u2Var;
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
        fi.u2 u2Var;
        if (this.f38244w == z10) {
            return;
        }
        this.f38244w = z10;
        if (z10) {
            fi.v3 v3Var = this.f38238c;
            g5 g5Var = v3Var.f35502e;
            if (g5Var != null && (u2Var = g5Var.f34813k) != null) {
                u2Var.P0(false);
            }
            v3Var.f35499a.P0(false);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25565r4, new Object[0]);
        invalidate();
    }
}
