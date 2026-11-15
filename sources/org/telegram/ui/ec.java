package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ec extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.j5 f46663a;
    public org.telegram.ui.Components.oy0 f46664b;
    public org.telegram.ui.Components.e5 f46665c;
    public org.telegram.ui.ActionBar.e6 d;
    public boolean f46666e;
    public int f46667f;

    public final void a(int i7, int i10, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp cpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f46667f = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29110r8[i10], this.d);
        } else {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            if (z10) {
                dpVar = s12.f25383r4;
            } else {
                dpVar = s12.f25393s4;
            }
            if (dpVar != null) {
                cpVar = dpVar.d(i10);
            }
            b(cpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.cp cpVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (cpVar == null) {
            int i7 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) > 0.8f) {
                this.f46667f = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) < 0.2f) {
                this.f46667f = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
                return;
            } else {
                this.f46667f = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var), org.telegram.ui.ActionBar.j6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.j6.w0(i7, e6Var))));
                return;
            }
        }
        this.f46667f = cpVar.e(0, e6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.e5 e5Var = this.f46665c;
        if (j3 == 0) {
            e5Var.g(null, z11);
            if (this.f46664b == null) {
                this.f46664b = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.j(j3, z11);
            this.f46664b = null;
        }
        e5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.e5 e5Var = this.f46665c;
        if (document == null) {
            e5Var.g(null, false);
            if (this.f46664b == null) {
                this.f46664b = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.i(document, false);
            this.f46664b = null;
        }
        e5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.e5 e5Var = this.f46665c;
        e5Var.k(Integer.valueOf(this.f46667f));
        org.telegram.ui.Components.oy0 oy0Var = this.f46664b;
        if (oy0Var != null) {
            canvas2 = canvas;
            oy0Var.c((getMeasuredWidth() - this.f46664b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29089q6, e6Var), canvas2);
        } else {
            canvas2 = canvas;
            e5Var.draw(canvas2);
        }
        if (this.f46666e) {
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.hd.f24104a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.hd.f24104a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f46663a;
        if (i7 <= 0) {
            j5Var.i(null);
            return;
        }
        j5Var.i(new org.telegram.ui.ActionBar.t2(i7, getContext(), this.d, false));
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.e5 e5Var = this.f46665c;
        e5Var.setBounds((getWidth() - e5Var.f34184s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.f34184s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.f34184s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46665c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46665c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.j5 j5Var = this.f46663a;
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
