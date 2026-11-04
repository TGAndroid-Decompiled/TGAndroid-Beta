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
public final class te0 extends org.telegram.ui.Cells.z implements lm0, org.telegram.messenger.x5, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f38399f;
    public org.telegram.messenger.zi h;
    public int f38400n;
    public TextPaint f38401r;
    public mm0 f38402s;
    public eg0 f38403w;
    public int f38404x;
    public int f38405y;

    @Override
    public final void C(boolean z10) {
        v();
    }

    @Override
    public final void M(String str) {
        v();
    }

    @Override
    public final void c(float f10) {
        org.telegram.messenger.zi ziVar = this.h;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.zi getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f38403w.a(Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.E != 3) {
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(this.f38400n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f38399f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.g0.f22608q;
            int i3 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i3 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.k6.f28118q3.p((int) getY(), i10, i3);
            org.telegram.ui.ActionBar.t4 t4Var = org.telegram.ui.ActionBar.k6.f28118q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (t4Var != null) {
                t4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.k6.f28118q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.E;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.f38404x, this.f38405y);
                eg0 eg0Var = this.f38403w;
                float f10 = eg0Var.f33391e / 2;
                float f11 = eg0Var.f33392f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, eg0Var.d, f11 + f10, eg0Var.f33388a);
                float f12 = eg0Var.f33391e / 2;
                canvas.drawRect(0.0f, f12 - f11, eg0Var.f33390c * eg0Var.d, f11 + f12, eg0Var.f33389b);
            } else {
                canvas.translate(this.f38404x, this.f38405y);
                this.f38402s.b(canvas);
            }
            canvas.restore();
            int i12 = this.E;
            this.f38401r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i12][this.H];
            int L = org.telegram.messenger.g0.L(36.0f);
            org.telegram.ui.Cells.z.s(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.J, org.telegram.messenger.g0.L(18.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        eg0 eg0Var = this.f38403w;
        if (this.h != null) {
            this.f38404x = org.telegram.messenger.g0.L(54.0f);
            this.F = org.telegram.messenger.g0.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
            this.f38402s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
            eg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
            eg0Var.f33391e = org.telegram.messenger.g0.L(30.0f);
            this.f38405y = org.telegram.messenger.g0.L(13.0f);
            this.G = org.telegram.messenger.g0.L(10.0f);
            w();
            if (!z10 && this.f38399f) {
                return;
            }
            this.f38399f = true;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.te0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.zi ziVar) {
        if (this.h != ziVar) {
            this.f38400n = ziVar.I1;
            mm0 mm0Var = this.f38402s;
            int i3 = org.telegram.ui.ActionBar.k6.ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int i10 = org.telegram.ui.ActionBar.k6.f28033le;
            mm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
            eg0 eg0Var = this.f38403w;
            eg0Var.f33388a.setColor(-2497813);
            eg0Var.f33389b.setColor(-7944712);
            this.h = ziVar;
            this.f38399f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            mm0 mm0Var = this.f38402s;
            if (mm0Var != null && this.h != null) {
                int i3 = org.telegram.ui.ActionBar.k6.ie;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                int i10 = org.telegram.ui.ActionBar.k6.f28033le;
                mm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        eg0 eg0Var = this.f38403w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.f38400n);
        if (org.telegram.messenger.w7.N(this.h.f26868k, false, true).exists()) {
            org.telegram.messenger.z5.q(this.f38400n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.E = 1;
            } else {
                this.E = 0;
            }
            eg0Var.a(0.0f);
        } else {
            org.telegram.messenger.z5.q(this.f38400n).a(S0, null, this);
            if (!org.telegram.messenger.w7.G(this.f38400n).T(S0)) {
                this.E = 2;
                eg0Var.a(0.0f);
            } else {
                this.E = 3;
                Float w10 = org.telegram.messenger.zb.D().w(S0);
                if (w10 != null) {
                    eg0Var.a(w10.floatValue());
                } else {
                    eg0Var.a(0.0f);
                }
            }
        }
        w();
    }

    public final void w() {
        int i3;
        TextPaint textPaint = this.f38401r;
        org.telegram.messenger.zi ziVar = this.h;
        if (ziVar == null) {
            return;
        }
        mm0 mm0Var = this.f38402s;
        if (!mm0Var.f36191e) {
            mm0Var.h(ziVar.f26828b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i10 = 0;
            while (true) {
                if (i10 < this.h.F0().attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i3 = (int) documentAttribute.duration;
                        break;
                    }
                    i10++;
                } else {
                    i3 = 0;
                    break;
                }
            }
        } else {
            i3 = this.h.f26851g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i3, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g02));
        this.I = new StaticLayout(g02, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void d(float f10) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
