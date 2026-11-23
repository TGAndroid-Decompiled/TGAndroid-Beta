package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ik0 implements v4.t0 {
    public RecyclerView f36040a;
    public boolean f36042c;
    public int d;
    public int f36043e;
    public int f36044f;
    public boolean f36045g;
    public boolean h;
    public int f36046i;
    public final hk0 f36048k;
    public int f36041b = -1;
    public final int f36047j = org.telegram.messenger.g0.L(80.0f);
    public final rc f36049l = new rc(this, 17);

    public ik0(hk0 hk0Var) {
        this.f36048k = hk0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7;
        int i10;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i7 = RecyclerView.R(E);
        } else {
            i7 = -1;
        }
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        hk0 hk0Var = this.f36048k;
        rc rcVar = this.f36049l;
        if (action != 1) {
            if (action == 2) {
                if (this.f36047j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f36045g) {
                            this.f36045g = true;
                            org.telegram.messenger.g0.r(rcVar);
                            org.telegram.messenger.g0.g3(rcVar);
                        }
                        this.f36046i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f36043e && y10 <= this.f36044f) {
                        this.f36045g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(rcVar);
                            org.telegram.messenger.g0.g3(rcVar);
                        }
                        this.f36046i = ((int) ((y10 + this.f36044f) - (this.f36043e + i10))) / 2;
                    } else if (this.f36045g || this.h) {
                        org.telegram.messenger.g0.r(rcVar);
                        this.f36045g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f36041b != i7) {
                    this.f36041b = i7;
                    hk0Var.n(E, !hk0Var.o(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f36042c = false;
        this.f36045g = false;
        this.h = false;
        org.telegram.messenger.g0.r(rcVar);
        hk0Var.f(false);
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
        if (this.f36042c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f36040a = recyclerView;
            int i7 = this.f36047j;
            if (i7 > -1) {
                this.d = i7;
                this.f36043e = recyclerView.getMeasuredHeight() - i7;
                this.f36044f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f36042c = false;
            this.f36045g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f36049l);
            this.f36048k.f(false);
        }
        return z11;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.f36042c) {
            return;
        }
        this.f36041b = -1;
        org.telegram.messenger.g0.r(this.f36049l);
        this.f36045g = false;
        this.h = false;
        hk0 hk0Var = this.f36048k;
        if (!hk0Var.g(i7)) {
            this.f36042c = false;
            return;
        }
        hk0Var.f(true);
        hk0Var.n(view, z10);
        this.f36042c = true;
        this.f36041b = i7;
    }

    @Override
    public final void c(boolean z10) {
    }
}
