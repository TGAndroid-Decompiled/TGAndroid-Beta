package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ol0 implements s4.r0 {
    public RecyclerView f26773a;
    public boolean f26775c;
    public int d;
    public int e;
    public int f26776f;
    public boolean f26777g;
    public boolean h;
    public int f26778i;
    public final nl0 f26780k;
    public int f26774b = -1;
    public final int f26779j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f26781l = new org.telegram.ui.Cells.l7(this, 21);

    public ol0(nl0 nl0Var) {
        this.f26780k = nl0Var;
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
        nl0 nl0Var = this.f26780k;
        org.telegram.ui.Cells.l7 l7Var = this.f26781l;
        if (action != 1) {
            if (action == 2) {
                if (this.f26779j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f26777g) {
                            this.f26777g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f26778i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f26776f) {
                        this.f26777g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f26778i = ((int) ((y3 + this.f26776f) - (this.e + i11))) / 2;
                    } else if (this.f26777g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f26777g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f26774b != i10) {
                    this.f26774b = i10;
                    nl0Var.c(F, !nl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f26775c = false;
        this.f26777g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        nl0Var.a(false);
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
        if (this.f26775c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f26773a = recyclerView;
            int i10 = this.f26779j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f26776f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f26775c = false;
            this.f26777g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f26781l);
            this.f26780k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f26775c) {
            return;
        }
        this.f26774b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f26781l);
        this.f26777g = false;
        this.h = false;
        nl0 nl0Var = this.f26780k;
        if (!nl0Var.b(i10)) {
            this.f26775c = false;
            return;
        }
        nl0Var.a(true);
        nl0Var.c(view, z10);
        this.f26775c = true;
        this.f26774b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
