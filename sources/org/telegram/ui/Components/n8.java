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
public abstract class n8 extends FrameLayout {
    public float D;
    public float E;
    public final o8 F;
    public long f28704a;
    public TLRPC.Document f28705b;
    public final ag.d2 f28706c;
    public final u10 d;
    public final u10 e;
    public float f28707f;
    public k8 h;
    public boolean f28708n;
    public final PorterDuffColorFilter f28709r;
    public final t5 f28710s;
    public boolean f28711w;
    public float f28712x;
    public float f28713y;

    public n8(o8 o8Var, Context context) {
        super(context);
        this.F = o8Var;
        this.d = new u10();
        this.e = new u10();
        this.f28707f = 1.0f;
        this.f28709r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f28710s = new t5(this, 200L, gr.f26496g);
        this.f28712x = -1.0f;
        ag.d2 d2Var = new ag.d2(this, context, 6);
        this.f28706c = d2Var;
        d2Var.getImageReceiver().X(1);
        d2Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(d2Var, w7.b6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f28710s.f30445c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float T1 = org.telegram.messenger.i0.T1(f11, 0.0f, f13);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(k8 k8Var, boolean z10) {
        k8 k8Var2 = this.h;
        if (k8Var2 != null) {
            this.e.d(k8Var2.f27676c, k8Var2.d, k8Var2.e, k8Var2.f27677f);
            this.f28707f = 0.0f;
            this.F.f28993n = true;
        }
        this.h = k8Var;
        this.f28708n = z10;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ag.d2 d2Var = this.f28706c;
        ImageReceiver imageReceiver = d2Var.getImageReceiver();
        f5 f5Var = d2Var.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f25975k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ag.d2 d2Var = this.f28706c;
        ImageReceiver imageReceiver = d2Var.getImageReceiver();
        f5 f5Var = d2Var.e;
        if (f5Var != null) {
            ag.c2 c2Var = f5Var.f25975k;
            f5Var.setColorFilter(this.f28709r);
            return c2Var;
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
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        ag.c2 c2Var;
        if (this.f28711w == z10) {
            return;
        }
        this.f28711w = z10;
        if (z10) {
            ag.d2 d2Var = this.f28706c;
            f5 f5Var = d2Var.e;
            if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
                c2Var.P0(false);
            }
            d2Var.f26292a.P0(false);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, new Object[0]);
        invalidate();
    }
}
