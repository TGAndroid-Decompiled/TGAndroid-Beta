package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public org.telegram.ui.ActionBar.k5 f45595a;
    public org.telegram.ui.Components.ly0 f45596b;
    public org.telegram.ui.Components.g5 f45597c;
    public org.telegram.ui.ActionBar.f6 d;
    public boolean f45598e;
    public int f45599f;

    public final void a(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f45599f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28109r8[i10], this.d);
        } else {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            if (z9) {
                gpVar = s12.f24859q4;
            } else {
                gpVar = s12.f24869r4;
            }
            if (gpVar != null) {
                fpVar = gpVar.d(i10);
            }
            b(fpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.fp fpVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (fpVar == null) {
            int i7 = org.telegram.ui.ActionBar.k6.f28128s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) > 0.8f) {
                this.f45599f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) < 0.2f) {
                this.f45599f = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
                return;
            } else {
                this.f45599f = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var), org.telegram.ui.ActionBar.k6.r1(0.7f, hm0.B0(org.telegram.ui.ActionBar.k6.w0(i7, f6Var))));
                return;
            }
        }
        this.f45599f = fpVar.e(0, f6Var);
    }

    public final void c(long j3, boolean z9, boolean z10) {
        org.telegram.ui.Components.g5 g5Var = this.f45597c;
        if (j3 == 0) {
            g5Var.g(null, z10);
            if (this.f45596b == null) {
                this.f45596b = new org.telegram.ui.Components.ly0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.j(j3, z10);
            this.f45596b = null;
        }
        g5Var.m(z9, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.g5 g5Var = this.f45597c;
        if (document == null) {
            g5Var.g(null, false);
            if (this.f45596b == null) {
                this.f45596b = new org.telegram.ui.Components.ly0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.i(document, false);
            this.f45596b = null;
        }
        g5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.g5 g5Var = this.f45597c;
        g5Var.k(Integer.valueOf(this.f45599f));
        org.telegram.ui.Components.ly0 ly0Var = this.f45596b;
        if (ly0Var != null) {
            canvas2 = canvas;
            ly0Var.c((getMeasuredWidth() - this.f45596b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28088q6, f6Var), canvas2);
        } else {
            canvas2 = canvas;
            g5Var.draw(canvas2);
        }
        if (this.f45598e) {
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.hd.f22871a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22871a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f45595a;
        if (i7 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new org.telegram.ui.ActionBar.u2(i7, getContext(), this.d, false));
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.g5 g5Var = this.f45597c;
        g5Var.setBounds((getWidth() - g5Var.f33792s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.f33792s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.f33792s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45597c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45597c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f45595a;
        if (k5Var != null) {
            k5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
