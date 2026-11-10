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
public abstract class r8 extends FrameLayout {
    public float D;
    public float E;
    public final s8 F;
    public long f37556a;
    public TLRPC.Document f37557b;
    public final di.d4 f37558c;
    public final e10 d;
    public final e10 f37559e;
    public float f37560f;
    public o8 h;
    public boolean f37561n;
    public final PorterDuffColorFilter f37562r;
    public final v5 f37563s;
    public boolean f37564w;
    public float f37565x;
    public float f37566y;

    public r8(s8 s8Var, Context context) {
        super(context);
        this.F = s8Var;
        this.d = new e10();
        this.f37559e = new e10();
        this.f37560f = 1.0f;
        this.f37562r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f37563s = new v5(this, 200L, wq.f40047g);
        this.f37565x = -1.0f;
        di.d4 d4Var = new di.d4(7, context, this);
        this.f37558c = d4Var;
        d4Var.getImageReceiver().X(1);
        d4Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(d4Var, c8.ha.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f37563s.f38854c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(o8 o8Var, boolean z9) {
        o8 o8Var2 = this.h;
        if (o8Var2 != null) {
            this.f37559e.d(o8Var2.f36535c, o8Var2.d, o8Var2.f36536e, o8Var2.f36537f);
            this.f37560f = 0.0f;
            this.F.f37894n = true;
        }
        this.h = o8Var;
        this.f37561n = z9;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        di.d4 d4Var = this.f37558c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        h5 h5Var = d4Var.f35252e;
        if (h5Var != null) {
            imageReceiver = h5Var.f34176k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        di.d4 d4Var = this.f37558c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        h5 h5Var = d4Var.f35252e;
        if (h5Var != null) {
            di.z2 z2Var = h5Var.f34176k;
            h5Var.setColorFilter(this.f37562r);
            return z2Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.F.U) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z9) {
        di.z2 z2Var;
        if (this.f37564w == z9) {
            return;
        }
        this.f37564w = z9;
        if (z9) {
            di.d4 d4Var = this.f37558c;
            h5 h5Var = d4Var.f35252e;
            if (h5Var != null && (z2Var = h5Var.f34176k) != null) {
                z2Var.P0(false);
            }
            d4Var.f35249a.P0(false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
        invalidate();
    }
}
