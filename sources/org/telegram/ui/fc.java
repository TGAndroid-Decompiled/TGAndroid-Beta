package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.l5 f45681a;
    public org.telegram.ui.Components.ny0 f45682b;
    public org.telegram.ui.Components.g5 f45683c;
    public org.telegram.ui.ActionBar.g6 d;
    public boolean f45684e;
    public int f45685f;

    public final void a(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f45685f = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28126r8[i10], this.d);
        } else {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            if (z9) {
                gpVar = s12.f24874q4;
            } else {
                gpVar = s12.f24884r4;
            }
            if (gpVar != null) {
                fpVar = gpVar.d(i10);
            }
            b(fpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.fp fpVar) {
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (fpVar == null) {
            int i7 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i7, g6Var)) > 0.8f) {
                this.f45685f = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i7, g6Var)) < 0.2f) {
                this.f45685f = org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
                return;
            } else {
                this.f45685f = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var), org.telegram.ui.ActionBar.l6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.l6.w0(i7, g6Var))));
                return;
            }
        }
        this.f45685f = fpVar.e(0, g6Var);
    }

    public final void c(long j3, boolean z9, boolean z10) {
        org.telegram.ui.Components.g5 g5Var = this.f45683c;
        if (j3 == 0) {
            g5Var.g(null, z10);
            if (this.f45682b == null) {
                this.f45682b = new org.telegram.ui.Components.ny0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.j(j3, z10);
            this.f45682b = null;
        }
        g5Var.m(z9, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.g5 g5Var = this.f45683c;
        if (document == null) {
            g5Var.g(null, false);
            if (this.f45682b == null) {
                this.f45682b = new org.telegram.ui.Components.ny0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.i(document, false);
            this.f45682b = null;
        }
        g5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i7;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.g5 g5Var = this.f45683c;
        g5Var.k(Integer.valueOf(this.f45685f));
        org.telegram.ui.Components.ny0 ny0Var = this.f45682b;
        if (ny0Var != null) {
            canvas2 = canvas;
            ny0Var.c((getMeasuredWidth() - this.f45682b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28105q6, g6Var), canvas2);
        } else {
            canvas2 = canvas;
            g5Var.draw(canvas2);
        }
        if (this.f45684e) {
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.id.f23157a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.id.f23157a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f45681a;
        if (i7 <= 0) {
            l5Var.i(null);
            return;
        }
        l5Var.i(new org.telegram.ui.ActionBar.u2(i7, getContext(), this.d, false));
        l5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.g5 g5Var = this.f45683c;
        g5Var.setBounds((getWidth() - g5Var.f33869s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.f33869s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.f33869s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45683c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45683c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.l5 l5Var = this.f45681a;
        if (l5Var != null) {
            l5Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
