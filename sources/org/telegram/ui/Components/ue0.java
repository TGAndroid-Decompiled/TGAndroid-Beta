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
public final class ue0 extends org.telegram.ui.Cells.z implements mm0, org.telegram.messenger.x5, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f40006f;
    public org.telegram.messenger.gj h;
    public int f40007n;
    public TextPaint f40008r;
    public nm0 f40009s;
    public eg0 f40010w;
    public int f40011x;
    public int f40012y;

    @Override
    public final void C(boolean z10) {
        v();
    }

    @Override
    public final void N(String str) {
        v();
    }

    @Override
    public final void e(float f10) {
        org.telegram.messenger.gj gjVar = this.h;
        if (gjVar == null) {
            return;
        }
        gjVar.f23779b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.gj getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f40010w.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.E != 3) {
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(this.f40007n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f40006f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.g0.f23611q;
            int i7 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i7 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.j6.f29086q3.o((int) getY(), i10, i7);
            org.telegram.ui.ActionBar.r4 r4Var = org.telegram.ui.ActionBar.j6.f29086q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (r4Var != null) {
                r4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.j6.f29086q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.E;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.f40011x, this.f40012y);
                eg0 eg0Var = this.f40010w;
                float f10 = eg0Var.f34313e / 2;
                float f11 = eg0Var.f34314f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, eg0Var.d, f11 + f10, eg0Var.f34310a);
                float f12 = eg0Var.f34313e / 2;
                canvas.drawRect(0.0f, f12 - f11, eg0Var.f34312c * eg0Var.d, f11 + f12, eg0Var.f34311b);
            } else {
                canvas.translate(this.f40011x, this.f40012y);
                this.f40009s.b(canvas);
            }
            canvas.restore();
            int i12 = this.E;
            this.f40008r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.j6.U4[i12][this.H];
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        eg0 eg0Var = this.f40010w;
        if (this.h != null) {
            this.f40011x = org.telegram.messenger.g0.L(54.0f);
            this.F = org.telegram.messenger.g0.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
            this.f40009s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
            eg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
            eg0Var.f34313e = org.telegram.messenger.g0.L(30.0f);
            this.f40012y = org.telegram.messenger.g0.L(13.0f);
            this.G = org.telegram.messenger.g0.L(10.0f);
            w();
            if (!z10 && this.f40006f) {
                return;
            }
            this.f40006f = true;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ue0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.gj gjVar) {
        if (this.h != gjVar) {
            this.f40007n = gjVar.K1;
            nm0 nm0Var = this.f40009s;
            int i7 = org.telegram.ui.ActionBar.j6.le;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.j6.f29057oe;
            nm0Var.g(x02, x03, org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ne, false));
            eg0 eg0Var = this.f40010w;
            eg0Var.f34310a.setColor(-2497813);
            eg0Var.f34311b.setColor(-7944712);
            this.h = gjVar;
            this.f40006f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            nm0 nm0Var = this.f40009s;
            if (nm0Var != null && this.h != null) {
                int i7 = org.telegram.ui.ActionBar.j6.le;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                int i10 = org.telegram.ui.ActionBar.j6.f29057oe;
                nm0Var.g(x02, x03, org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ne, false));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        eg0 eg0Var = this.f40010w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.f40007n);
        if (org.telegram.messenger.w7.M(this.h.f23819k, false, true).exists()) {
            org.telegram.messenger.z5.q(this.f40007n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.E = 1;
            } else {
                this.E = 0;
            }
            eg0Var.a(0.0f);
        } else {
            org.telegram.messenger.z5.q(this.f40007n).a(S0, null, this);
            if (!org.telegram.messenger.w7.G(this.f40007n).S(S0)) {
                this.E = 2;
                eg0Var.a(0.0f);
            } else {
                this.E = 3;
                Float w10 = org.telegram.messenger.fc.D().w(S0);
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
        int i7;
        TextPaint textPaint = this.f40008r;
        org.telegram.messenger.gj gjVar = this.h;
        if (gjVar == null) {
            return;
        }
        nm0 nm0Var = this.f40009s;
        if (!nm0Var.f37629e) {
            nm0Var.h(gjVar.f23779b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i10 = 0;
            while (true) {
                if (i10 < this.h.F0().attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i7 = (int) documentAttribute.duration;
                        break;
                    }
                    i10++;
                } else {
                    i7 = 0;
                    break;
                }
            }
        } else {
            i7 = this.h.f23811i0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g02));
        this.I = new StaticLayout(g02, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void g(float f10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
