package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lm0 implements s4.q0 {
    public RecyclerView f28223a;
    public boolean f28225c;
    public int d;
    public int e;
    public int f28226f;
    public boolean f28227g;
    public boolean h;
    public int f28228i;
    public final km0 f28230k;
    public int f28224b = -1;
    public final int f28229j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.k7 f28231l = new org.telegram.ui.Cells.k7(this, 20);

    public lm0(km0 km0Var) {
        this.f28230k = km0Var;
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
        km0 km0Var = this.f28230k;
        org.telegram.ui.Cells.k7 k7Var = this.f28231l;
        if (action != 1) {
            if (action == 2) {
                if (this.f28229j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f28227g) {
                            this.f28227g = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f28228i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f28226f) {
                        this.f28227g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f28228i = ((int) ((y3 + this.f28226f) - (this.e + i11))) / 2;
                    } else if (this.f28227g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        this.f28227g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f28224b != i10) {
                    this.f28224b = i10;
                    km0Var.c(E, !km0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f28225c = false;
        this.f28227g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        km0Var.a(false);
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
        if (this.f28225c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f28223a = recyclerView;
            int i10 = this.f28229j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f28226f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f28225c = false;
            this.f28227g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f28231l);
            this.f28230k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f28225c) {
            return;
        }
        this.f28224b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f28231l);
        this.f28227g = false;
        this.h = false;
        km0 km0Var = this.f28230k;
        if (!km0Var.b(i10)) {
            this.f28225c = false;
            return;
        }
        km0Var.a(true);
        km0Var.c(view, z10);
        this.f28225c = true;
        this.f28224b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
