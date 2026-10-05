package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dm0 implements s4.r0 {
    public RecyclerView f25824a;
    public boolean f25826c;
    public int d;
    public int f25827e;
    public int f25828f;
    public boolean f25829g;
    public boolean h;
    public int f25830i;
    public final cm0 f25832k;
    public int f25825b = -1;
    public final int f25831j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f25833l = new org.telegram.ui.Cells.t6(this, 22);

    public dm0(cm0 cm0Var) {
        this.f25832k = cm0Var;
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
        cm0 cm0Var = this.f25832k;
        org.telegram.ui.Cells.t6 t6Var = this.f25833l;
        if (action != 1) {
            if (action == 2) {
                if (this.f25831j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f25829g) {
                            this.f25829g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f25830i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f25827e && y3 <= this.f25828f) {
                        this.f25829g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f25830i = ((int) ((y3 + this.f25828f) - (this.f25827e + i11))) / 2;
                    } else if (this.f25829g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f25829g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f25825b != i10) {
                    this.f25825b = i10;
                    cm0Var.c(E, !cm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f25826c = false;
        this.f25829g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        cm0Var.a(false);
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
        if (this.f25826c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f25824a = recyclerView;
            int i10 = this.f25831j;
            if (i10 > -1) {
                this.d = i10;
                this.f25827e = recyclerView.getMeasuredHeight() - i10;
                this.f25828f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f25826c = false;
            this.f25829g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f25833l);
            this.f25832k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f25826c) {
            return;
        }
        this.f25825b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f25833l);
        this.f25829g = false;
        this.h = false;
        cm0 cm0Var = this.f25832k;
        if (!cm0Var.b(i10)) {
            this.f25826c = false;
            return;
        }
        cm0Var.a(true);
        cm0Var.c(view, z10);
        this.f25826c = true;
        this.f25825b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
