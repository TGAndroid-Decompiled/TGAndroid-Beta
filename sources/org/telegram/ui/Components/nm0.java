package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nm0 implements s4.q0 {
    public RecyclerView f28967a;
    public boolean f28969c;
    public int d;
    public int e;
    public int f28970f;
    public boolean f28971g;
    public boolean h;
    public int f28972i;
    public final mm0 f28974k;
    public int f28968b = -1;
    public final int f28973j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.u5 f28975l = new org.telegram.ui.Cells.u5(this, 22);

    public nm0(mm0 mm0Var) {
        this.f28974k = mm0Var;
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
        mm0 mm0Var = this.f28974k;
        org.telegram.ui.Cells.u5 u5Var = this.f28975l;
        if (action != 1) {
            if (action == 2) {
                if (this.f28973j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f28971g) {
                            this.f28971g = true;
                            AndroidUtilities.cancelRunOnUIThread(u5Var);
                            AndroidUtilities.runOnUIThread(u5Var);
                        }
                        this.f28972i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f28970f) {
                        this.f28971g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(u5Var);
                            AndroidUtilities.runOnUIThread(u5Var);
                        }
                        this.f28972i = ((int) ((y3 + this.f28970f) - (this.e + i11))) / 2;
                    } else if (this.f28971g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        this.f28971g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f28968b != i10) {
                    this.f28968b = i10;
                    mm0Var.c(E, !mm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f28969c = false;
        this.f28971g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        mm0Var.a(false);
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
        if (this.f28969c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f28967a = recyclerView;
            int i10 = this.f28973j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f28970f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f28969c = false;
            this.f28971g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f28975l);
            this.f28974k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f28969c) {
            return;
        }
        this.f28968b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f28975l);
        this.f28971g = false;
        this.h = false;
        mm0 mm0Var = this.f28974k;
        if (!mm0Var.b(i10)) {
            this.f28969c = false;
            return;
        }
        mm0Var.a(true);
        mm0Var.c(view, z10);
        this.f28969c = true;
        this.f28968b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
