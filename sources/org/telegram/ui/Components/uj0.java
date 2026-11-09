package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uj0 implements v4.r0 {
    public RecyclerView f38735a;
    public boolean f38737c;
    public int d;
    public int f38738e;
    public int f38739f;
    public boolean f38740g;
    public boolean h;
    public int f38741i;
    public final tj0 f38743k;
    public int f38736b = -1;
    public final int f38742j = org.telegram.messenger.g0.L(80.0f);
    public final et f38744l = new et(this, 12);

    public uj0(tj0 tj0Var) {
        this.f38743k = tj0Var;
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
        tj0 tj0Var = this.f38743k;
        et etVar = this.f38744l;
        if (action != 1) {
            if (action == 2) {
                if (this.f38742j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f38740g) {
                            this.f38740g = true;
                            org.telegram.messenger.g0.r(etVar);
                            org.telegram.messenger.g0.h3(etVar);
                        }
                        this.f38741i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f38738e && y10 <= this.f38739f) {
                        this.f38740g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(etVar);
                            org.telegram.messenger.g0.h3(etVar);
                        }
                        this.f38741i = ((int) ((y10 + this.f38739f) - (this.f38738e + i10))) / 2;
                    } else if (this.f38740g || this.h) {
                        org.telegram.messenger.g0.r(etVar);
                        this.f38740g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f38736b != i7) {
                    this.f38736b = i7;
                    tj0Var.j(E, !tj0Var.k(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f38737c = false;
        this.f38740g = false;
        this.h = false;
        org.telegram.messenger.g0.r(etVar);
        tj0Var.d(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().b() != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f38737c && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f38735a = recyclerView;
            int i7 = this.f38742j;
            if (i7 > -1) {
                this.d = i7;
                this.f38738e = recyclerView.getMeasuredHeight() - i7;
                this.f38739f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f38737c = false;
            this.f38740g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f38744l);
            this.f38743k.d(false);
        }
        return z10;
    }

    public final void d(int i7, View view, boolean z9) {
        if (this.f38737c) {
            return;
        }
        this.f38736b = -1;
        org.telegram.messenger.g0.r(this.f38744l);
        this.f38740g = false;
        this.h = false;
        tj0 tj0Var = this.f38743k;
        if (!tj0Var.e(i7)) {
            this.f38737c = false;
            return;
        }
        tj0Var.d(true);
        tj0Var.j(view, z9);
        this.f38737c = true;
        this.f38736b = i7;
    }

    @Override
    public final void c(boolean z9) {
    }
}
