package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class km0 implements s4.q0 {
    public RecyclerView f27938a;
    public boolean f27940c;
    public int d;
    public int e;
    public int f27941f;
    public boolean f27942g;
    public boolean h;
    public int f27943i;
    public final jm0 f27945k;
    public int f27939b = -1;
    public final int f27944j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.k7 f27946l = new org.telegram.ui.Cells.k7(this, 20);

    public km0(jm0 jm0Var) {
        this.f27945k = jm0Var;
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
        jm0 jm0Var = this.f27945k;
        org.telegram.ui.Cells.k7 k7Var = this.f27946l;
        if (action != 1) {
            if (action == 2) {
                if (this.f27944j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f27942g) {
                            this.f27942g = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f27943i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f27941f) {
                        this.f27942g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var);
                        }
                        this.f27943i = ((int) ((y3 + this.f27941f) - (this.e + i11))) / 2;
                    } else if (this.f27942g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        this.f27942g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f27939b != i10) {
                    this.f27939b = i10;
                    jm0Var.c(E, !jm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f27940c = false;
        this.f27942g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        jm0Var.a(false);
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
        if (this.f27940c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f27938a = recyclerView;
            int i10 = this.f27944j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f27941f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f27940c = false;
            this.f27942g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f27946l);
            this.f27945k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f27940c) {
            return;
        }
        this.f27939b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f27946l);
        this.f27942g = false;
        this.h = false;
        jm0 jm0Var = this.f27945k;
        if (!jm0Var.b(i10)) {
            this.f27940c = false;
            return;
        }
        jm0Var.a(true);
        jm0Var.c(view, z10);
        this.f27940c = true;
        this.f27939b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
