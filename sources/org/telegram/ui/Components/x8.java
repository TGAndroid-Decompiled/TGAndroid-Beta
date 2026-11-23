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
    public long f41999a;
    public TLRPC.Document f42000b;
    public final fi.t3 f42001c;
    public final s10 d;
    public final s10 f42002e;
    public float f42003f;
    public u8 h;
    public boolean f42004n;
    public final PorterDuffColorFilter f42005r;
    public final d6 f42006s;
    public boolean f42007w;
    public float f42008x;
    public float f42009y;

    public x8(y8 y8Var, Context context) {
        super(context);
        this.G = y8Var;
        this.d = new s10();
        this.f42002e = new s10();
        this.f42003f = 1.0f;
        this.f42005r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f42006s = new d6(this, 200L, nr.f37961g);
        this.f42008x = -1.0f;
        fi.t3 t3Var = new fi.t3(7, context, this);
        this.f42001c = t3Var;
        t3Var.getImageReceiver().X(1);
        t3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(t3Var, c8.ma.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f42006s.f34386c;
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
            this.f42002e.d(u8Var2.f40291c, u8Var2.d, u8Var2.f40292e, u8Var2.f40293f);
            this.f42003f = 0.0f;
            this.G.f42350n = true;
        }
        this.h = u8Var;
        this.f42004n = z10;
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25396u4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        fi.t3 t3Var = this.f42001c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        p5 p5Var = t3Var.f38838e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38499k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        fi.t3 t3Var = this.f42001c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        p5 p5Var = t3Var.f38838e;
        if (p5Var != null) {
            fi.s2 s2Var = p5Var.f38499k;
            p5Var.setColorFilter(this.f42005r);
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
        if (this.f42007w == z10) {
            return;
        }
        this.f42007w = z10;
        if (z10) {
            fi.t3 t3Var = this.f42001c;
            p5 p5Var = t3Var.f38838e;
            if (p5Var != null && (s2Var = p5Var.f38499k) != null) {
                s2Var.P0(false);
            }
            t3Var.f38835a.P0(false);
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25396u4, new Object[0]);
        invalidate();
    }
}
