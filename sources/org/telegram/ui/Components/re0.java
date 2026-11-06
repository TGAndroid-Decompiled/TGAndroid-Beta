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
public final class re0 extends org.telegram.ui.Cells.z implements im0, org.telegram.messenger.x5, org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f37716f;
    public org.telegram.messenger.ij h;
    public int f37717n;
    public TextPaint f37718r;
    public jm0 f37719s;
    public bg0 f37720w;
    public int f37721x;
    public int f37722y;

    @Override
    public final void C(boolean z9) {
        v();
    }

    @Override
    public final void M(String str) {
        v();
    }

    @Override
    public final void a(float f10) {
        org.telegram.messenger.ij ijVar = this.h;
        if (ijVar == null) {
            return;
        }
        ijVar.f23197b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.ij getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f37720w.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.D != 3) {
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(this.f37717n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f37716f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.g0.f22537q;
            int i7 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i7 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.k6.f28085q3.p((int) getY(), i10, i7);
            org.telegram.ui.ActionBar.t4 t4Var = org.telegram.ui.ActionBar.k6.f28085q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (t4Var != null) {
                t4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.k6.f28085q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.D;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.f37721x, this.f37722y);
                bg0 bg0Var = this.f37720w;
                float f10 = bg0Var.f32148e / 2;
                float f11 = bg0Var.f32149f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, bg0Var.d, f11 + f10, bg0Var.f32145a);
                float f12 = bg0Var.f32148e / 2;
                canvas.drawRect(0.0f, f12 - f11, bg0Var.f32147c * bg0Var.d, f11 + f12, bg0Var.f32146b);
            } else {
                canvas.translate(this.f37721x, this.f37722y);
                this.f37719s.b(canvas);
            }
            canvas.restore();
            int i12 = this.D;
            this.f37718r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i12][this.G];
            int L = org.telegram.messenger.g0.L(36.0f);
            org.telegram.ui.Cells.z.s(((L - drawable.getIntrinsicWidth()) / 2) + this.E, ((L - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.I, org.telegram.messenger.g0.L(18.0f));
            this.H.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bg0 bg0Var = this.f37720w;
        if (this.h != null) {
            this.f37721x = org.telegram.messenger.g0.L(54.0f);
            this.E = org.telegram.messenger.g0.L(10.0f);
            this.I = (getMeasuredWidth() - this.J) - org.telegram.messenger.g0.L(16.0f);
            this.f37719s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.J, org.telegram.messenger.g0.L(30.0f));
            bg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.J;
            bg0Var.f32148e = org.telegram.messenger.g0.L(30.0f);
            this.f37722y = org.telegram.messenger.g0.L(13.0f);
            this.F = org.telegram.messenger.g0.L(10.0f);
            w();
            if (!z9 && this.f37716f) {
                return;
            }
            this.f37716f = true;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.re0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.ij ijVar) {
        if (this.h != ijVar) {
            this.f37717n = ijVar.I1;
            jm0 jm0Var = this.f37719s;
            int i7 = org.telegram.ui.ActionBar.k6.f27947ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.k6.le;
            jm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27984ke, false));
            bg0 bg0Var = this.f37720w;
            bg0Var.f32145a.setColor(-2497813);
            bg0Var.f32146b.setColor(-7944712);
            this.h = ijVar;
            this.f37716f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            jm0 jm0Var = this.f37719s;
            if (jm0Var != null && this.h != null) {
                int i7 = org.telegram.ui.ActionBar.k6.f27947ie;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
                int i10 = org.telegram.ui.ActionBar.k6.le;
                jm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27984ke, false));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        bg0 bg0Var = this.f37720w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.f37717n);
        if (org.telegram.messenger.w7.N(this.h.f23237k, false, true).exists()) {
            org.telegram.messenger.z5.q(this.f37717n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.D = 1;
            } else {
                this.D = 0;
            }
            bg0Var.a(0.0f);
        } else {
            org.telegram.messenger.z5.q(this.f37717n).a(S0, null, this);
            if (!org.telegram.messenger.w7.G(this.f37717n).T(S0)) {
                this.D = 2;
                bg0Var.a(0.0f);
            } else {
                this.D = 3;
                Float w10 = org.telegram.messenger.gc.D().w(S0);
                if (w10 != null) {
                    bg0Var.a(w10.floatValue());
                } else {
                    bg0Var.a(0.0f);
                }
            }
        }
        w();
    }

    public final void w() {
        int i7;
        TextPaint textPaint = this.f37718r;
        org.telegram.messenger.ij ijVar = this.h;
        if (ijVar == null) {
            return;
        }
        jm0 jm0Var = this.f37719s;
        if (!jm0Var.f35015e) {
            jm0Var.h(ijVar.f23197b0);
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
            i7 = this.h.f23220g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, true, false);
        this.J = (int) Math.ceil(textPaint.measureText(g02));
        this.H = new StaticLayout(g02, textPaint, this.J, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void d(float f10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
