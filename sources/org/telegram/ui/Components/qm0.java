package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qm0 implements s4.t0 {
    public RecyclerView f31960a;
    public boolean f31962c;
    public int d;
    public int e;
    public int f31963f;
    public boolean f31964g;
    public boolean h;
    public int f31965i;
    public final pm0 f31967k;
    public int f31961b = -1;
    public final int f31966j = AndroidUtilities.dp(80.0f);
    public final m.g3 f31968l = new m.g3(this, 26);

    public qm0(pm0 pm0Var) {
        this.f31967k = pm0Var;
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
        pm0 pm0Var = this.f31967k;
        m.g3 g3Var = this.f31968l;
        if (action != 1) {
            if (action == 2) {
                if (this.f31966j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f31964g) {
                            this.f31964g = true;
                            AndroidUtilities.cancelRunOnUIThread(g3Var);
                            AndroidUtilities.runOnUIThread(g3Var);
                        }
                        this.f31965i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f31963f) {
                        this.f31964g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(g3Var);
                            AndroidUtilities.runOnUIThread(g3Var);
                        }
                        this.f31965i = ((int) ((y3 + this.f31963f) - (this.e + i11))) / 2;
                    } else if (this.f31964g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        this.f31964g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f31961b != i10) {
                    this.f31961b = i10;
                    pm0Var.c(E, !pm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f31962c = false;
        this.f31964g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        pm0Var.a(false);
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
        if (this.f31962c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f31960a = recyclerView;
            int i10 = this.f31966j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f31963f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f31962c = false;
            this.f31964g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31968l);
            this.f31967k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f31962c) {
            return;
        }
        this.f31961b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f31968l);
        this.f31964g = false;
        this.h = false;
        pm0 pm0Var = this.f31967k;
        if (!pm0Var.b(i10)) {
            this.f31962c = false;
            return;
        }
        pm0Var.a(true);
        pm0Var.c(view, z10);
        this.f31962c = true;
        this.f31961b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
