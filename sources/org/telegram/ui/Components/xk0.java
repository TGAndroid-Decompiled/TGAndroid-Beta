package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xk0 implements s4.r0 {
    public RecyclerView f32497a;
    public boolean f32499c;
    public int d;
    public int e;
    public int f32500f;
    public boolean f32501g;
    public boolean h;
    public int f32502i;
    public final wk0 f32504k;
    public int f32498b = -1;
    public final int f32503j = org.telegram.messenger.i0.L(80.0f);
    public final ew f32505l = new ew(this, 10);

    public xk0(wk0 wk0Var) {
        this.f32504k = wk0Var;
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
        wk0 wk0Var = this.f32504k;
        ew ewVar = this.f32505l;
        if (action != 1) {
            if (action == 2) {
                if (this.f32503j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f32501g) {
                            this.f32501g = true;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.g3(ewVar);
                        }
                        this.f32502i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f32500f) {
                        this.f32501g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.i0.r(ewVar);
                            org.telegram.messenger.i0.g3(ewVar);
                        }
                        this.f32502i = ((int) ((y3 + this.f32500f) - (this.e + i11))) / 2;
                    } else if (this.f32501g || this.h) {
                        org.telegram.messenger.i0.r(ewVar);
                        this.f32501g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f32498b != i10) {
                    this.f32498b = i10;
                    wk0Var.h(E, !wk0Var.j(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f32499c = false;
        this.f32501g = false;
        this.h = false;
        org.telegram.messenger.i0.r(ewVar);
        wk0Var.b(false);
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
        if (this.f32499c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f32497a = recyclerView;
            int i10 = this.f32503j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f32500f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f32499c = false;
            this.f32501g = false;
            this.h = false;
            org.telegram.messenger.i0.r(this.f32505l);
            this.f32504k.b(false);
        }
        return z11;
    }

    public final void d(int i10, View view, boolean z10) {
        if (this.f32499c) {
            return;
        }
        this.f32498b = -1;
        org.telegram.messenger.i0.r(this.f32505l);
        this.f32501g = false;
        this.h = false;
        wk0 wk0Var = this.f32504k;
        if (!wk0Var.d(i10)) {
            this.f32499c = false;
            return;
        }
        wk0Var.b(true);
        wk0Var.h(view, z10);
        this.f32499c = true;
        this.f32498b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
