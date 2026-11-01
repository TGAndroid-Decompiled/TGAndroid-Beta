package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class uf0 extends org.telegram.ui.Cells.z implements kn0, org.telegram.messenger.z5, org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f30950f;
    public org.telegram.messenger.kj h;
    public int f30951n;
    public TextPaint f30952r;
    public ln0 f30953s;
    public eh0 f30954w;
    public int f30955x;
    public int f30956y;

    @Override
    public final void D(boolean z10) {
        x();
    }

    @Override
    public final void N(String str) {
        x();
    }

    @Override
    public final void c(float f7) {
        org.telegram.messenger.kj kjVar = this.h;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        MediaController.B().i0(this.h, f7);
    }

    public final org.telegram.messenger.kj getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f30954w.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.D != 3) {
            x();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.b6.q(this.f30951n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f30950f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.i0.f16172q;
            int i10 = point.y;
            int i11 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                i11 = measuredWidth;
            }
            org.telegram.ui.ActionBar.t6.f21168q3.p((int) getY(), i11, i10);
            org.telegram.ui.ActionBar.c5 c5Var = org.telegram.ui.ActionBar.t6.f21168q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (c5Var != null) {
                c5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.t6.f21168q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i12 = this.D;
            if (i12 != 0 && i12 != 1) {
                canvas.translate(org.telegram.messenger.i0.L(12.0f) + this.f30955x, this.f30956y);
                eh0 eh0Var = this.f30954w;
                float f7 = eh0Var.e / 2;
                float f10 = eh0Var.f25839f / 2.0f;
                canvas.drawRect(0.0f, f7 - f10, eh0Var.d, f10 + f7, eh0Var.f25836a);
                float f11 = eh0Var.e / 2;
                canvas.drawRect(0.0f, f11 - f10, eh0Var.f25838c * eh0Var.d, f10 + f11, eh0Var.f25837b);
            } else {
                canvas.translate(this.f30955x, this.f30956y);
                this.f30953s.b(canvas);
            }
            canvas.restore();
            int i13 = this.D;
            this.f30952r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.t6.U4[i13][this.G];
            int L = org.telegram.messenger.i0.L(36.0f);
            org.telegram.ui.Cells.z.t(((L - drawable.getIntrinsicWidth()) / 2) + this.E, ((L - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.I, org.telegram.messenger.i0.L(18.0f));
            this.H.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        eh0 eh0Var = this.f30954w;
        if (this.h != null) {
            this.f30955x = org.telegram.messenger.i0.L(54.0f);
            this.E = org.telegram.messenger.i0.L(10.0f);
            this.I = (getMeasuredWidth() - this.J) - org.telegram.messenger.i0.L(16.0f);
            this.f30953s.i((getMeasuredWidth() - org.telegram.messenger.i0.L(70.0f)) - this.J, org.telegram.messenger.i0.L(30.0f));
            eh0Var.d = (getMeasuredWidth() - org.telegram.messenger.i0.L(94.0f)) - this.J;
            eh0Var.e = org.telegram.messenger.i0.L(30.0f);
            this.f30956y = org.telegram.messenger.i0.L(13.0f);
            this.F = org.telegram.messenger.i0.L(10.0f);
            y();
            if (!z10 && this.f30950f) {
                return;
            }
            this.f30950f = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.kj kjVar) {
        if (this.h != kjVar) {
            this.f30951n = kjVar.I1;
            ln0 ln0Var = this.f30953s;
            int i10 = org.telegram.ui.ActionBar.t6.f21028ie;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.t6.f21085le;
            ln0Var.g(x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21067ke, false));
            eh0 eh0Var = this.f30954w;
            eh0Var.f25836a.setColor(-2497813);
            eh0Var.f25837b.setColor(-7944712);
            this.h = kjVar;
            this.f30950f = false;
            requestLayout();
        }
        x();
    }

    @Override
    public final void updateColors() {
        try {
            ln0 ln0Var = this.f30953s;
            if (ln0Var != null && this.h != null) {
                int i10 = org.telegram.ui.ActionBar.t6.f21028ie;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.t6.f21085le;
                ln0Var.g(x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21067ke, false));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void x() {
        eh0 eh0Var = this.f30954w;
        String S0 = this.h.S0();
        org.telegram.messenger.b8.G(this.f30951n);
        if (org.telegram.messenger.b8.N(this.h.f16690k, false, true).exists()) {
            org.telegram.messenger.b6.q(this.f30951n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.D = 1;
            } else {
                this.D = 0;
            }
            eh0Var.a(0.0f);
        } else {
            org.telegram.messenger.b6.q(this.f30951n).a(S0, null, this);
            if (!org.telegram.messenger.b8.G(this.f30951n).T(S0)) {
                this.D = 2;
                eh0Var.a(0.0f);
            } else {
                this.D = 3;
                Float w9 = org.telegram.messenger.ic.D().w(S0);
                if (w9 != null) {
                    eh0Var.a(w9.floatValue());
                } else {
                    eh0Var.a(0.0f);
                }
            }
        }
        y();
    }

    public final void y() {
        int i10;
        TextPaint textPaint = this.f30952r;
        org.telegram.messenger.kj kjVar = this.h;
        if (kjVar == null) {
            return;
        }
        ln0 ln0Var = this.f30953s;
        if (!ln0Var.e) {
            ln0Var.h(kjVar.f16652b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i11 = 0;
            while (true) {
                if (i11 < this.h.F0().attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                    i11++;
                } else {
                    i10 = 0;
                    break;
                }
            }
        } else {
            i10 = this.h.f16675g0;
        }
        String g02 = org.telegram.messenger.i0.g0(i10, true, false);
        this.J = (int) Math.ceil(textPaint.measureText(g02));
        this.H = new StaticLayout(g02, textPaint, this.J, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void d(float f7) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
