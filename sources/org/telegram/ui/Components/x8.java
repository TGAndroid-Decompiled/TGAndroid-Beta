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
    public long f41937a;
    public TLRPC.Document f41938b;
    public final fi.t3 f41939c;
    public final p10 d;
    public final p10 f41940e;
    public float f41941f;
    public u8 h;
    public boolean f41942n;
    public final PorterDuffColorFilter f41943r;
    public final c6 f41944s;
    public boolean f41945w;
    public float f41946x;
    public float f41947y;

    public x8(y8 y8Var, Context context) {
        super(context);
        this.G = y8Var;
        this.d = new p10();
        this.f41940e = new p10();
        this.f41941f = 1.0f;
        this.f41943r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f41944s = new c6(this, 200L, lr.f37209g);
        this.f41946x = -1.0f;
        fi.t3 t3Var = new fi.t3(7, context, this);
        this.f41939c = t3Var;
        t3Var.getImageReceiver().X(1);
        t3Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(t3Var, c8.ma.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f41944s.f33892c;
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
            this.f41940e.d(u8Var2.f40252c, u8Var2.d, u8Var2.f40253e, u8Var2.f40254f);
            this.f41941f = 0.0f;
            this.G.f42402n = true;
        }
        this.h = u8Var;
        this.f41942n = z10;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25197t4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        fi.t3 t3Var = this.f41939c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.f38745e;
        if (o5Var != null) {
            imageReceiver = o5Var.f37976k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        fi.t3 t3Var = this.f41939c;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        o5 o5Var = t3Var.f38745e;
        if (o5Var != null) {
            fi.s2 s2Var = o5Var.f37976k;
            o5Var.setColorFilter(this.f41943r);
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
        if (this.f41945w == z10) {
            return;
        }
        this.f41945w = z10;
        if (z10) {
            fi.t3 t3Var = this.f41939c;
            o5 o5Var = t3Var.f38745e;
            if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
                s2Var.P0(false);
            }
            t3Var.f38742a.P0(false);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25197t4, new Object[0]);
        invalidate();
    }
}
