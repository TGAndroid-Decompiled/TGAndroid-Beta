package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tm0 implements s4.s0 {
    public RecyclerView f31293a;
    public boolean f31295c;
    public int d;
    public int f31296e;
    public int f31297f;
    public boolean f31298g;
    public boolean h;
    public int f31299i;
    public final sm0 f31301k;
    public int f31294b = -1;
    public final int f31300j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f31302l = new org.telegram.ui.Cells.t6(this, 21);

    public tm0(sm0 sm0Var) {
        this.f31301k = sm0Var;
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
        sm0 sm0Var = this.f31301k;
        org.telegram.ui.Cells.t6 t6Var = this.f31302l;
        if (action != 1) {
            if (action == 2) {
                if (this.f31300j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f31298g) {
                            this.f31298g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31299i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f31296e && y3 <= this.f31297f) {
                        this.f31298g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31299i = ((int) ((y3 + this.f31297f) - (this.f31296e + i11))) / 2;
                    } else if (this.f31298g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f31298g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f31294b != i10) {
                    this.f31294b = i10;
                    sm0Var.c(E, !sm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f31295c = false;
        this.f31298g = false;
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
        if (this.f31295c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f31293a = recyclerView;
            int i10 = this.f31300j;
            if (i10 > -1) {
                this.d = i10;
                this.f31296e = recyclerView.getMeasuredHeight() - i10;
                this.f31297f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f31295c = false;
            this.f31298g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31302l);
            this.f31301k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f31295c) {
            return;
        }
        this.f31294b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f31302l);
        this.f31298g = false;
        this.h = false;
        sm0 sm0Var = this.f31301k;
        if (!sm0Var.b(i10)) {
            this.f31295c = false;
            return;
        }
        sm0Var.a(true);
        sm0Var.c(view, z10);
        this.f31295c = true;
        this.f31294b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
