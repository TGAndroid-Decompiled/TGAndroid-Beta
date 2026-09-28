package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class am0 implements s4.r0 {
    public RecyclerView f22688a;
    public boolean f22690c;
    public int d;
    public int e;
    public int f22691f;
    public boolean f22692g;
    public boolean h;
    public int f22693i;
    public final zl0 f22695k;
    public int f22689b = -1;
    public final int f22694j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f22696l = new org.telegram.ui.Cells.t6(this, 22);

    public am0(zl0 zl0Var) {
        this.f22695k = zl0Var;
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
        zl0 zl0Var = this.f22695k;
        org.telegram.ui.Cells.t6 t6Var = this.f22696l;
        if (action != 1) {
            if (action == 2) {
                if (this.f22694j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f22692g) {
                            this.f22692g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22693i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f22691f) {
                        this.f22692g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22693i = ((int) ((y3 + this.f22691f) - (this.e + i11))) / 2;
                    } else if (this.f22692g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f22692g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f22689b != i10) {
                    this.f22689b = i10;
                    zl0Var.c(E, !zl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f22690c = false;
        this.f22692g = false;
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
        if (this.f22690c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22688a = recyclerView;
            int i10 = this.f22694j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f22691f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f22690c = false;
            this.f22692g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f22696l);
            this.f22695k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f22690c) {
            return;
        }
        this.f22689b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f22696l);
        this.f22692g = false;
        this.h = false;
        zl0 zl0Var = this.f22695k;
        if (!zl0Var.b(i10)) {
            this.f22690c = false;
            return;
        }
        zl0Var.a(true);
        zl0Var.c(view, z10);
        this.f22690c = true;
        this.f22689b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
