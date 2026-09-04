package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nl0 implements s4.r0 {
    public RecyclerView f28781a;
    public boolean f28783c;
    public int d;
    public int f28784e;
    public int f28785f;
    public boolean f28786g;
    public boolean h;
    public int f28787i;
    public final ml0 f28789k;
    public int f28782b = -1;
    public final int f28788j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f28790l = new org.telegram.ui.Cells.l7(this, 21);

    public nl0(ml0 ml0Var) {
        this.f28789k = ml0Var;
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
        ml0 ml0Var = this.f28789k;
        org.telegram.ui.Cells.l7 l7Var = this.f28790l;
        if (action != 1) {
            if (action == 2) {
                if (this.f28788j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f28786g) {
                            this.f28786g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f28787i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f28784e && y3 <= this.f28785f) {
                        this.f28786g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f28787i = ((int) ((y3 + this.f28785f) - (this.f28784e + i11))) / 2;
                    } else if (this.f28786g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f28786g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f28782b != i10) {
                    this.f28782b = i10;
                    ml0Var.c(E, !ml0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f28783c = false;
        this.f28786g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        ml0Var.a(false);
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
        if (this.f28783c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f28781a = recyclerView;
            int i10 = this.f28788j;
            if (i10 > -1) {
                this.d = i10;
                this.f28784e = recyclerView.getMeasuredHeight() - i10;
                this.f28785f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f28783c = false;
            this.f28786g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f28790l);
            this.f28789k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f28783c) {
            return;
        }
        this.f28782b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f28790l);
        this.f28786g = false;
        this.h = false;
        ml0 ml0Var = this.f28789k;
        if (!ml0Var.b(i10)) {
            this.f28783c = false;
            return;
        }
        ml0Var.a(true);
        ml0Var.c(view, z10);
        this.f28783c = true;
        this.f28782b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
