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
public abstract class s8 extends FrameLayout {
    public float D;
    public float E;
    public final t8 F;
    public long f37966a;
    public TLRPC.Document f37967b;
    public final di.c4 f37968c;
    public final e10 d;
    public final e10 f37969e;
    public float f37970f;
    public p8 h;
    public boolean f37971n;
    public final PorterDuffColorFilter f37972r;
    public final w5 f37973s;
    public boolean f37974w;
    public float f37975x;
    public float f37976y;

    public s8(t8 t8Var, Context context) {
        super(context);
        this.F = t8Var;
        this.d = new e10();
        this.f37969e = new e10();
        this.f37970f = 1.0f;
        this.f37972r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f37973s = new w5(this, 200L, xq.f40311g);
        this.f37975x = -1.0f;
        di.c4 c4Var = new di.c4(7, context, this);
        this.f37968c = c4Var;
        c4Var.getImageReceiver().X(1);
        c4Var.getImageReceiver().R0 = true;
        setClipChildren(false);
        addView(c4Var, c8.ha.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f37973s.f39849c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(p8 p8Var, boolean z9) {
        p8 p8Var2 = this.h;
        if (p8Var2 != null) {
            this.f37969e.d(p8Var2.f36918c, p8Var2.d, p8Var2.f36919e, p8Var2.f36920f);
            this.f37970f = 0.0f;
            this.F.f38291n = true;
        }
        this.h = p8Var;
        this.f37971n = z9;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        di.c4 c4Var = this.f37968c;
        ImageReceiver imageReceiver = c4Var.getImageReceiver();
        i5 i5Var = c4Var.f35560e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34505k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        di.c4 c4Var = this.f37968c;
        ImageReceiver imageReceiver = c4Var.getImageReceiver();
        i5 i5Var = c4Var.f35560e;
        if (i5Var != null) {
            di.z2 z2Var = i5Var.f34505k;
            i5Var.setColorFilter(this.f37972r);
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
        if (this.f37974w == z9) {
            return;
        }
        this.f37974w = z9;
        if (z9) {
            di.c4 c4Var = this.f37968c;
            i5 i5Var = c4Var.f35560e;
            if (i5Var != null && (z2Var = i5Var.f34505k) != null) {
                z2Var.P0(false);
            }
            c4Var.f35557a.P0(false);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, new Object[0]);
        invalidate();
    }
}
