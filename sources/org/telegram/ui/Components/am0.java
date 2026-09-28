package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class am0 implements s4.r0 {
    public RecyclerView f22687a;
    public boolean f22689c;
    public int d;
    public int e;
    public int f22690f;
    public boolean f22691g;
    public boolean h;
    public int f22692i;
    public final zl0 f22694k;
    public int f22688b = -1;
    public final int f22693j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f22695l = new org.telegram.ui.Cells.t6(this, 22);

    public am0(zl0 zl0Var) {
        this.f22694k = zl0Var;
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
        zl0 zl0Var = this.f22694k;
        org.telegram.ui.Cells.t6 t6Var = this.f22695l;
        if (action != 1) {
            if (action == 2) {
                if (this.f22693j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f22691g) {
                            this.f22691g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22692i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f22690f) {
                        this.f22691g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22692i = ((int) ((y3 + this.f22690f) - (this.e + i11))) / 2;
                    } else if (this.f22691g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f22691g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f22688b != i10) {
                    this.f22688b = i10;
                    zl0Var.c(E, !zl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f22689c = false;
        this.f22691g = false;
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
        if (this.f22689c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22687a = recyclerView;
            int i10 = this.f22693j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f22690f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f22689c = false;
            this.f22691g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f22695l);
            this.f22694k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f22689c) {
            return;
        }
        this.f22688b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f22695l);
        this.f22691g = false;
        this.h = false;
        zl0 zl0Var = this.f22694k;
        if (!zl0Var.b(i10)) {
            this.f22689c = false;
            return;
        }
        zl0Var.a(true);
        zl0Var.c(view, z10);
        this.f22689c = true;
        this.f22688b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
