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
public abstract class q8 extends FrameLayout {
    public float E;
    public float F;
    public final r8 G;
    public long f37369a;
    public TLRPC.Document f37370b;
    public final ei.d4 f37371c;
    public final b10 d;
    public final b10 f37372e;
    public float f37373f;
    public n8 h;
    public boolean f37374n;
    public final PorterDuffColorFilter f37375r;
    public final u5 f37376s;
    public boolean f37377w;
    public float f37378x;
    public float f37379y;

    public q8(r8 r8Var, Context context) {
        super(context);
        this.G = r8Var;
        this.d = new b10();
        this.f37372e = new b10();
        this.f37373f = 1.0f;
        this.f37375r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f37376s = new u5(this, 200L, xq.f40453g);
        this.f37378x = -1.0f;
        ei.d4 d4Var = new ei.d4(7, context, this);
        this.f37371c = d4Var;
        d4Var.getImageReceiver().X(1);
        d4Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(d4Var, b8.mf.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f37376s.f38645c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(f12, 0.0f, f14);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, T1, T1, paint);
    }

    public final void b(n8 n8Var, boolean z10) {
        n8 n8Var2 = this.h;
        if (n8Var2 != null) {
            this.f37372e.d(n8Var2.f36413c, n8Var2.d, n8Var2.f36414e, n8Var2.f36415f);
            this.f37373f = 0.0f;
            this.G.f37675n = true;
        }
        this.h = n8Var;
        this.f37374n = z10;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ei.d4 d4Var = this.f37371c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        g5 g5Var = d4Var.f35345e;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            return imageReceiver.B().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ei.d4 d4Var = this.f37371c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        g5 g5Var = d4Var.f35345e;
        if (g5Var != null) {
            ei.c3 c3Var = g5Var.f33971k;
            g5Var.setColorFilter(this.f37375r);
            return c3Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.G.V) {
            super.onMeasure(i3, i10);
        } else {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        ei.c3 c3Var;
        if (this.f37377w == z10) {
            return;
        }
        this.f37377w = z10;
        if (z10) {
            ei.d4 d4Var = this.f37371c;
            g5 g5Var = d4Var.f35345e;
            if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
                c3Var.P0(false);
            }
            d4Var.f35342a.P0(false);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        invalidate();
    }
}
