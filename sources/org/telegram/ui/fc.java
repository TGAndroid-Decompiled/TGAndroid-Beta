package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.m5 f45677a;
    public org.telegram.ui.Components.my0 f45678b;
    public org.telegram.ui.Components.f5 f45679c;
    public org.telegram.ui.ActionBar.h6 d;
    public boolean f45680e;
    public int f45681f;

    public final void a(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f45681f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28151r8[i10], this.d);
        } else {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            if (z9) {
                gpVar = s12.f24878q4;
            } else {
                gpVar = s12.f24888r4;
            }
            if (gpVar != null) {
                fpVar = gpVar.d(i10);
            }
            b(fpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.fp fpVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (fpVar == null) {
            int i7 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.8f) {
                this.f45681f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) < 0.2f) {
                this.f45681f = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
                return;
            } else {
                this.f45681f = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var), org.telegram.ui.ActionBar.m6.r1(0.7f, km0.B0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var))));
                return;
            }
        }
        this.f45681f = fpVar.e(0, h6Var);
    }

    public final void c(long j3, boolean z9, boolean z10) {
        org.telegram.ui.Components.f5 f5Var = this.f45679c;
        if (j3 == 0) {
            f5Var.g(null, z10);
            if (this.f45678b == null) {
                this.f45678b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            f5Var.j(j3, z10);
            this.f45678b = null;
        }
        f5Var.m(z9, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.f5 f5Var = this.f45679c;
        if (document == null) {
            f5Var.g(null, false);
            if (this.f45678b == null) {
                this.f45678b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            f5Var.i(document, false);
            this.f45678b = null;
        }
        f5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.f5 f5Var = this.f45679c;
        f5Var.k(Integer.valueOf(this.f45681f));
        org.telegram.ui.Components.my0 my0Var = this.f45678b;
        if (my0Var != null) {
            canvas2 = canvas;
            my0Var.c((getMeasuredWidth() - this.f45678b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28130q6, h6Var), canvas2);
        } else {
            canvas2 = canvas;
            f5Var.draw(canvas2);
        }
        if (this.f45680e) {
            if (h6Var != null) {
                paint = h6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.id.f23161a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.id.f23161a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f45677a;
        if (i7 <= 0) {
            m5Var.i(null);
            return;
        }
        m5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.d, false));
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.f5 f5Var = this.f45679c;
        f5Var.setBounds((getWidth() - f5Var.f33467s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - f5Var.f33467s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + f5Var.f33467s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45679c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45679c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var = this.f45677a;
        if (m5Var != null) {
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
