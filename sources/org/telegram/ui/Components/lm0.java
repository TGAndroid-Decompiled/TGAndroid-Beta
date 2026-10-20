package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lm0 implements s4.q0 {
    public RecyclerView f28219a;
    public boolean f28221c;
    public int d;
    public int e;
    public int f28222f;
    public boolean f28223g;
    public boolean h;
    public int f28224i;
    public final km0 f28226k;
    public int f28220b = -1;
    public final int f28225j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.k7 f28227l = new org.telegram.ui.Cells.k7(this, 20);

    public lm0(km0 km0Var) {
        this.f28226k = km0Var;
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
        km0 km0Var = this.f28226k;
        org.telegram.ui.Cells.k7 k7Var = this.f28227l;
        if (action != 1) {
            if (action == 2) {
                if (this.f28225j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f28223g) {
                            this.f28223g = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f28224i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f28222f) {
                        this.f28223g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f28224i = ((int) ((y3 + this.f28222f) - (this.e + i11))) / 2;
                    } else if (this.f28223g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        this.f28223g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f28220b != i10) {
                    this.f28220b = i10;
                    km0Var.c(E, !km0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f28221c = false;
        this.f28223g = false;
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
        if (this.f28221c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f28219a = recyclerView;
            int i10 = this.f28225j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f28222f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f28221c = false;
            this.f28223g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f28227l);
            this.f28226k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f28221c) {
            return;
        }
        this.f28220b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f28227l);
        this.f28223g = false;
        this.h = false;
        km0 km0Var = this.f28226k;
        if (!km0Var.b(i10)) {
            this.f28221c = false;
            return;
        }
        km0Var.a(true);
        km0Var.c(view, z10);
        this.f28221c = true;
        this.f28220b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
