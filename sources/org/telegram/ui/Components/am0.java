package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class am0 implements s4.r0 {
    public RecyclerView f22710a;
    public boolean f22712c;
    public int d;
    public int e;
    public int f22713f;
    public boolean f22714g;
    public boolean h;
    public int f22715i;
    public final zl0 f22717k;
    public int f22711b = -1;
    public final int f22716j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f22718l = new org.telegram.ui.Cells.t6(this, 22);

    public am0(zl0 zl0Var) {
        this.f22717k = zl0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10;
        int i11;
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        if (F != null) {
            i10 = RecyclerView.S(F);
        } else {
            i10 = -1;
        }
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        zl0 zl0Var = this.f22717k;
        org.telegram.ui.Cells.t6 t6Var = this.f22718l;
        if (action != 1) {
            if (action == 2) {
                if (this.f22716j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f22714g) {
                            this.f22714g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22715i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f22713f) {
                        this.f22714g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22715i = ((int) ((y3 + this.f22713f) - (this.e + i11))) / 2;
                    } else if (this.f22714g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f22714g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f22711b != i10) {
                    this.f22711b = i10;
                    zl0Var.c(F, !zl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f22712c = false;
        this.f22714g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        zl0Var.a(false);
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
        if (this.f22712c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22710a = recyclerView;
            int i10 = this.f22716j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f22713f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f22712c = false;
            this.f22714g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f22718l);
            this.f22717k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f22712c) {
            return;
        }
        this.f22711b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f22718l);
        this.f22714g = false;
        this.h = false;
        zl0 zl0Var = this.f22717k;
        if (!zl0Var.b(i10)) {
            this.f22712c = false;
            return;
        }
        zl0Var.a(true);
        zl0Var.c(view, z10);
        this.f22712c = true;
        this.f22711b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
