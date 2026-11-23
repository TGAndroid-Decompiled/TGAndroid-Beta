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
public final class gf0 extends org.telegram.ui.Cells.z implements wm0, org.telegram.messenger.y5, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f35519f;
    public org.telegram.messenger.gj h;
    public int f35520n;
    public TextPaint f35521r;
    public xm0 f35522s;
    public qg0 f35523w;
    public int f35524x;
    public int f35525y;

    @Override
    public final void C(boolean z10) {
        v();
    }

    @Override
    public final void N(String str) {
        v();
    }

    @Override
    public final void a(float f10) {
        org.telegram.messenger.gj gjVar = this.h;
        if (gjVar == null) {
            return;
        }
        gjVar.f24137b0 = f10;
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
        this.f35523w.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.E != 3) {
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.a6.q(this.f35520n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f35519f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.g0.f24010q;
            int i7 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i7 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.m6.f29584q3.o((int) getY(), i10, i7);
            org.telegram.ui.ActionBar.u4 u4Var = org.telegram.ui.ActionBar.m6.f29584q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (u4Var != null) {
                u4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.m6.f29584q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.E;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.f35524x, this.f35525y);
                qg0 qg0Var = this.f35523w;
                float f10 = qg0Var.f38875e / 2;
                float f11 = qg0Var.f38876f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, qg0Var.d, f11 + f10, qg0Var.f38872a);
                float f12 = qg0Var.f38875e / 2;
                canvas.drawRect(0.0f, f12 - f11, qg0Var.f38874c * qg0Var.d, f11 + f12, qg0Var.f38873b);
            } else {
                canvas.translate(this.f35524x, this.f35525y);
                this.f35522s.b(canvas);
            }
            canvas.restore();
            int i12 = this.E;
            this.f35521r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.m6.U4[i12][this.H];
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
        qg0 qg0Var = this.f35523w;
        if (this.h != null) {
            this.f35524x = org.telegram.messenger.g0.L(54.0f);
            this.F = org.telegram.messenger.g0.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
            this.f35522s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
            qg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
            qg0Var.f38875e = org.telegram.messenger.g0.L(30.0f);
            this.f35525y = org.telegram.messenger.g0.L(13.0f);
            this.G = org.telegram.messenger.g0.L(10.0f);
            w();
            if (!z10 && this.f35519f) {
                return;
            }
            this.f35519f = true;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.gj gjVar) {
        if (this.h != gjVar) {
            this.f35520n = gjVar.K1;
            xm0 xm0Var = this.f35522s;
            int i7 = org.telegram.ui.ActionBar.m6.le;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.m6.f29555oe;
            xm0Var.g(x02, x03, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ne, false));
            qg0 qg0Var = this.f35523w;
            qg0Var.f38872a.setColor(-2497813);
            qg0Var.f38873b.setColor(-7944712);
            this.h = gjVar;
            this.f35519f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            xm0 xm0Var = this.f35522s;
            if (xm0Var != null && this.h != null) {
                int i7 = org.telegram.ui.ActionBar.m6.le;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                int i10 = org.telegram.ui.ActionBar.m6.f29555oe;
                xm0Var.g(x02, x03, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ne, false));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        qg0 qg0Var = this.f35523w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.f35520n);
        if (org.telegram.messenger.w7.M(this.h.f24177k, false, true).exists()) {
            org.telegram.messenger.a6.q(this.f35520n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.E = 1;
            } else {
                this.E = 0;
            }
            qg0Var.a(0.0f);
        } else {
            org.telegram.messenger.a6.q(this.f35520n).a(S0, null, this);
            if (!org.telegram.messenger.w7.G(this.f35520n).S(S0)) {
                this.E = 2;
                qg0Var.a(0.0f);
            } else {
                this.E = 3;
                Float w10 = org.telegram.messenger.fc.D().w(S0);
                if (w10 != null) {
                    qg0Var.a(w10.floatValue());
                } else {
                    qg0Var.a(0.0f);
                }
            }
        }
        w();
    }

    public final void w() {
        int i7;
        TextPaint textPaint = this.f35521r;
        org.telegram.messenger.gj gjVar = this.h;
        if (gjVar == null) {
            return;
        }
        xm0 xm0Var = this.f35522s;
        if (!xm0Var.f42128e) {
            xm0Var.h(gjVar.f24137b0);
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
            i7 = this.h.f24169i0;
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
