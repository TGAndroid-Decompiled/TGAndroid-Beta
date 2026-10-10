package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tm0 implements s4.s0 {
    public RecyclerView f31174a;
    public boolean f31176c;
    public int d;
    public int f31177e;
    public int f31178f;
    public boolean f31179g;
    public boolean h;
    public int f31180i;
    public final sm0 f31182k;
    public int f31175b = -1;
    public final int f31181j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f31183l = new org.telegram.ui.Cells.t6(this, 21);

    public tm0(sm0 sm0Var) {
        this.f31182k = sm0Var;
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
        sm0 sm0Var = this.f31182k;
        org.telegram.ui.Cells.t6 t6Var = this.f31183l;
        if (action != 1) {
            if (action == 2) {
                if (this.f31181j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f31179g) {
                            this.f31179g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31180i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f31177e && y3 <= this.f31178f) {
                        this.f31179g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31180i = ((int) ((y3 + this.f31178f) - (this.f31177e + i11))) / 2;
                    } else if (this.f31179g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f31179g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f31175b != i10) {
                    this.f31175b = i10;
                    sm0Var.c(E, !sm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f31176c = false;
        this.f31179g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        sm0Var.a(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().h() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f31176c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f31174a = recyclerView;
            int i10 = this.f31181j;
            if (i10 > -1) {
                this.d = i10;
                this.f31177e = recyclerView.getMeasuredHeight() - i10;
                this.f31178f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f31176c = false;
            this.f31179g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31183l);
            this.f31182k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f31176c) {
            return;
        }
        this.f31175b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f31183l);
        this.f31179g = false;
        this.h = false;
        sm0 sm0Var = this.f31182k;
        if (!sm0Var.b(i10)) {
            this.f31176c = false;
            return;
        }
        sm0Var.a(true);
        sm0Var.c(view, z10);
        this.f31176c = true;
        this.f31175b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
