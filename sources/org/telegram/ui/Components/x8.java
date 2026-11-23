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
public abstract class x8 extends FrameLayout {
    public float E;
    public float F;
    public final y8 G;
    public long f41956a;
    public TLRPC.Document f41957b;
    public final fi.t3 f41958c;
    public final s10 d;
    public final s10 f41959e;
    public float f41960f;
    public u8 h;
    public boolean f41961n;
    public final PorterDuffColorFilter f41962r;
    public final d6 f41963s;
    public boolean f41964w;
    public float f41965x;
    public float f41966y;

    public x8(y8 y8Var, Context context) {
        super(context);
        this.G = y8Var;
        this.d = new s10();
        this.f41959e = new s10();
        this.f41960f = 1.0f;
        this.f41962r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f41963s = new d6(this, 200L, nr.f37918g);
        this.f41965x = -1.0f;
        fi.t3 t3Var = new fi.t3(7, context, this);
        this.f41958c = t3Var;
        t3Var.getImageReceiver().X(1);
        t3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(t3Var, c8.na.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f41963s.f34349c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(u8 u8Var, boolean z10) {
        u8 u8Var2 = this.h;
        if (u8Var2 != null) {
            this.f41959e.d(u8Var2.f40274c, u8Var2.d, u8Var2.f40275e, u8Var2.f40276f);
            this.f41960f = 0.0f;
            this.G.f42328n = true;
        }
        this.h = u8Var;
        this.f41961n = z10;
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25360u4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        fi.t3 t3Var = this.f41958c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        p5 p5Var = t3Var.f38792e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38457k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        fi.t3 t3Var = this.f41958c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        p5 p5Var = t3Var.f38792e;
        if (p5Var != null) {
            fi.s2 s2Var = p5Var.f38457k;
            p5Var.setColorFilter(this.f41962r);
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
        if (this.f41964w == z10) {
            return;
        }
        this.f41964w = z10;
        if (z10) {
            fi.t3 t3Var = this.f41958c;
            p5 p5Var = t3Var.f38792e;
            if (p5Var != null && (s2Var = p5Var.f38457k) != null) {
                s2Var.P0(false);
            }
            t3Var.f38789a.P0(false);
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25360u4, new Object[0]);
        invalidate();
    }
}
