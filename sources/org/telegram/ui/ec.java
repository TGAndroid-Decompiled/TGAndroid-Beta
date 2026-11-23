package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ec extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.m5 f47196a;
    public org.telegram.ui.Components.xy0 f47197b;
    public org.telegram.ui.Components.n5 f47198c;
    public org.telegram.ui.ActionBar.h6 d;
    public boolean f47199e;
    public int f47200f;

    public final void a(int i7, int i10, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp cpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f47200f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29608r8[i10], this.d);
        } else {
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
            if (z10) {
                dpVar = u12.f25930t4;
            } else {
                dpVar = u12.f25938u4;
            }
            if (dpVar != null) {
                cpVar = dpVar.d(i10);
            }
            b(cpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.cp cpVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (cpVar == null) {
            int i7 = org.telegram.ui.ActionBar.m6.f29627s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.8f) {
                this.f47200f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29529n6, h6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) < 0.2f) {
                this.f47200f = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
                return;
            } else {
                this.f47200f = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var), org.telegram.ui.ActionBar.m6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var))));
                return;
            }
        }
        this.f47200f = cpVar.e(0, h6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.n5 n5Var = this.f47198c;
        if (j3 == 0) {
            n5Var.g(null, z11);
            if (this.f47197b == null) {
                this.f47197b = new org.telegram.ui.Components.xy0(org.telegram.messenger.hd.N0(2131752299, null), 16.0f, null);
            }
        } else {
            n5Var.j(j3, z11);
            this.f47197b = null;
        }
        n5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.n5 n5Var = this.f47198c;
        if (document == null) {
            n5Var.g(null, false);
            if (this.f47197b == null) {
                this.f47197b = new org.telegram.ui.Components.xy0(org.telegram.messenger.hd.N0(2131752299, null), 16.0f, null);
            }
        } else {
            n5Var.i(document, false);
            this.f47197b = null;
        }
        n5Var.m(false, false);
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
        org.telegram.ui.Components.n5 n5Var = this.f47198c;
        n5Var.k(Integer.valueOf(this.f47200f));
        org.telegram.ui.Components.xy0 xy0Var = this.f47197b;
        if (xy0Var != null) {
            canvas2 = canvas;
            xy0Var.c((getMeasuredWidth() - this.f47197b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29587q6, h6Var), canvas2);
        } else {
            canvas2 = canvas;
            n5Var.draw(canvas2);
        }
        if (this.f47199e) {
            if (h6Var != null) {
                paint = h6Var.g("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.m6.f29470k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.hd.f24408a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.hd.f24408a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f47196a;
        if (i7 <= 0) {
            m5Var.i(null);
            return;
        }
        m5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.d, false));
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.n5 n5Var = this.f47198c;
        n5Var.setBounds((getWidth() - n5Var.f37736s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - n5Var.f37736s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + n5Var.f37736s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47198c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47198c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var = this.f47196a;
        if (m5Var != null) {
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
