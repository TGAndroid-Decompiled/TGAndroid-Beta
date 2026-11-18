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
public final class ef0 extends org.telegram.ui.Cells.z implements um0, org.telegram.messenger.y5, org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f34690f;
    public org.telegram.messenger.fj h;
    public int f34691n;
    public TextPaint f34692r;
    public vm0 f34693s;
    public og0 f34694w;
    public int f34695x;
    public int f34696y;

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
        org.telegram.messenger.fj fjVar = this.h;
        if (fjVar == null) {
            return;
        }
        fjVar.f23928b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.fj getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f34694w.a(Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.E != 3) {
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.a6.q(this.f34691n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f34690f) {
                requestLayout();
                return;
            }
            Point point = org.telegram.messenger.g0.f24121q;
            int i7 = point.y;
            int i10 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i7 = view.getMeasuredHeight();
                i10 = measuredWidth;
            }
            org.telegram.ui.ActionBar.n6.f29633q3.o((int) getY(), i10, i7);
            org.telegram.ui.ActionBar.v4 v4Var = org.telegram.ui.ActionBar.n6.f29633q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (v4Var != null) {
                v4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            org.telegram.ui.ActionBar.n6.f29633q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            int i11 = this.E;
            if (i11 != 0 && i11 != 1) {
                canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.f34695x, this.f34696y);
                og0 og0Var = this.f34694w;
                float f10 = og0Var.f38103e / 2;
                float f11 = og0Var.f38104f / 2.0f;
                canvas.drawRect(0.0f, f10 - f11, og0Var.d, f11 + f10, og0Var.f38100a);
                float f12 = og0Var.f38103e / 2;
                canvas.drawRect(0.0f, f12 - f11, og0Var.f38102c * og0Var.d, f11 + f12, og0Var.f38101b);
            } else {
                canvas.translate(this.f34695x, this.f34696y);
                this.f34693s.b(canvas);
            }
            canvas.restore();
            int i12 = this.E;
            this.f34692r.setColor(-6182221);
            Drawable drawable = org.telegram.ui.ActionBar.n6.U4[i12][this.H];
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
        og0 og0Var = this.f34694w;
        if (this.h != null) {
            this.f34695x = org.telegram.messenger.g0.L(54.0f);
            this.F = org.telegram.messenger.g0.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
            this.f34693s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
            og0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
            og0Var.f38103e = org.telegram.messenger.g0.L(30.0f);
            this.f34696y = org.telegram.messenger.g0.L(13.0f);
            this.G = org.telegram.messenger.g0.L(10.0f);
            w();
            if (!z10 && this.f34690f) {
                return;
            }
            this.f34690f = true;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ef0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(org.telegram.messenger.fj fjVar) {
        if (this.h != fjVar) {
            this.f34691n = fjVar.K1;
            vm0 vm0Var = this.f34693s;
            int i7 = org.telegram.ui.ActionBar.n6.le;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.n6.f29604oe;
            vm0Var.g(x02, x03, org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ne, false));
            og0 og0Var = this.f34694w;
            og0Var.f38100a.setColor(-2497813);
            og0Var.f38101b.setColor(-7944712);
            this.h = fjVar;
            this.f34690f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            vm0 vm0Var = this.f34693s;
            if (vm0Var != null && this.h != null) {
                int i7 = org.telegram.ui.ActionBar.n6.le;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                int i10 = org.telegram.ui.ActionBar.n6.f29604oe;
                vm0Var.g(x02, x03, org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ne, false));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        og0 og0Var = this.f34694w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.f34691n);
        if (org.telegram.messenger.w7.M(this.h.f23968k, false, true).exists()) {
            org.telegram.messenger.a6.q(this.f34691n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (I && (!I || !MediaController.B().H())) {
                this.E = 1;
            } else {
                this.E = 0;
            }
            og0Var.a(0.0f);
        } else {
            org.telegram.messenger.a6.q(this.f34691n).a(S0, null, this);
            if (!org.telegram.messenger.w7.G(this.f34691n).S(S0)) {
                this.E = 2;
                og0Var.a(0.0f);
            } else {
                this.E = 3;
                Float w10 = org.telegram.messenger.ec.D().w(S0);
                if (w10 != null) {
                    og0Var.a(w10.floatValue());
                } else {
                    og0Var.a(0.0f);
                }
            }
        }
        w();
    }

    public final void w() {
        int i7;
        TextPaint textPaint = this.f34692r;
        org.telegram.messenger.fj fjVar = this.h;
        if (fjVar == null) {
            return;
        }
        vm0 vm0Var = this.f34693s;
        if (!vm0Var.f40710e) {
            vm0Var.h(fjVar.f23928b0);
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
            i7 = this.h.f23960i0;
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
