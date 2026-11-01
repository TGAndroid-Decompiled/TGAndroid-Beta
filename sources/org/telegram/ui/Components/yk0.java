package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yk0 implements s4.r0 {
    public RecyclerView f32864a;
    public boolean f32866c;
    public int d;
    public int e;
    public int f32867f;
    public boolean f32868g;
    public boolean h;
    public int f32869i;
    public final xk0 f32871k;
    public int f32865b = -1;
    public final int f32870j = org.telegram.messenger.i0.L(80.0f);
    public final ew f32872l = new ew(this, 10);

    public yk0(xk0 xk0Var) {
        this.f32871k = xk0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10;
        int i11;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i10 = RecyclerView.R(E);
        } else {
            i10 = -1;
        }
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        xk0 xk0Var = this.f32871k;
        ew ewVar = this.f32872l;
        if (action != 1) {
            if (action == 2) {
                if (this.f32870j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f32868g) {
                            this.f32868g = true;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.g3(ewVar);
                        }
                        this.f32869i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f32867f) {
                        this.f32868g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.g3(ewVar);
                        }
                        this.f32869i = ((int) ((y3 + this.f32867f) - (this.e + i11))) / 2;
                    } else if (this.f32868g || this.h) {
                        org.telegram.messenger.i0.r(ewVar);
                        this.f32868g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f32865b != i10) {
                    this.f32865b = i10;
                    xk0Var.h(E, !xk0Var.j(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f32866c = false;
        this.f32868g = false;
        this.h = false;
        org.telegram.messenger.i0.r(ewVar);
        xk0Var.b(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().b() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f32866c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f32864a = recyclerView;
            int i10 = this.f32870j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f32867f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f32866c = false;
            this.f32868g = false;
            this.h = false;
            org.telegram.messenger.i0.r(this.f32872l);
            this.f32871k.b(false);
        }
        return z11;
    }

    public final void d(int i10, View view, boolean z10) {
        if (this.f32866c) {
            return;
        }
        this.f32865b = -1;
        org.telegram.messenger.i0.r(this.f32872l);
        this.f32868g = false;
        this.h = false;
        xk0 xk0Var = this.f32871k;
        if (!xk0Var.d(i10)) {
            this.f32866c = false;
            return;
        }
        xk0Var.b(true);
        xk0Var.h(view, z10);
        this.f32866c = true;
        this.f32865b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
