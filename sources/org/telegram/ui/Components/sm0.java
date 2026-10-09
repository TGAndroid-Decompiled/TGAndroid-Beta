package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 implements s4.s0 {
    public RecyclerView f30845a;
    public boolean f30847c;
    public int d;
    public int f30848e;
    public int f30849f;
    public boolean f30850g;
    public boolean h;
    public int f30851i;
    public final rm0 f30853k;
    public int f30846b = -1;
    public final int f30852j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30854l = new org.telegram.ui.Cells.t6(this, 21);

    public sm0(rm0 rm0Var) {
        this.f30853k = rm0Var;
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
        rm0 rm0Var = this.f30853k;
        org.telegram.ui.Cells.t6 t6Var = this.f30854l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30852j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30850g) {
                            this.f30850g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30851i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f30848e && y3 <= this.f30849f) {
                        this.f30850g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30851i = ((int) ((y3 + this.f30849f) - (this.f30848e + i11))) / 2;
                    } else if (this.f30850g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30850g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30846b != i10) {
                    this.f30846b = i10;
                    rm0Var.c(E, !rm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30847c = false;
        this.f30850g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        rm0Var.a(false);
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
        if (this.f30847c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30845a = recyclerView;
            int i10 = this.f30852j;
            if (i10 > -1) {
                this.d = i10;
                this.f30848e = recyclerView.getMeasuredHeight() - i10;
                this.f30849f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30847c = false;
            this.f30850g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30854l);
            this.f30853k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30847c) {
            return;
        }
        this.f30846b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30854l);
        this.f30850g = false;
        this.h = false;
        rm0 rm0Var = this.f30853k;
        if (!rm0Var.b(i10)) {
            this.f30847c = false;
            return;
        }
        rm0Var.a(true);
        rm0Var.c(view, z10);
        this.f30847c = true;
        this.f30846b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
