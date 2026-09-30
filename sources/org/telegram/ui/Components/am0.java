package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class am0 implements s4.r0 {
    public RecyclerView f22685a;
    public boolean f22687c;
    public int d;
    public int e;
    public int f22688f;
    public boolean f22689g;
    public boolean h;
    public int f22690i;
    public final zl0 f22692k;
    public int f22686b = -1;
    public final int f22691j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f22693l = new org.telegram.ui.Cells.t6(this, 22);

    public am0(zl0 zl0Var) {
        this.f22692k = zl0Var;
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
        zl0 zl0Var = this.f22692k;
        org.telegram.ui.Cells.t6 t6Var = this.f22693l;
        if (action != 1) {
            if (action == 2) {
                if (this.f22691j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f22689g) {
                            this.f22689g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22690i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f22688f) {
                        this.f22689g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22690i = ((int) ((y3 + this.f22688f) - (this.e + i11))) / 2;
                    } else if (this.f22689g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f22689g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f22686b != i10) {
                    this.f22686b = i10;
                    zl0Var.c(E, !zl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f22687c = false;
        this.f22689g = false;
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
        if (this.f22687c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22685a = recyclerView;
            int i10 = this.f22691j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f22688f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f22687c = false;
            this.f22689g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f22693l);
            this.f22692k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f22687c) {
            return;
        }
        this.f22686b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f22693l);
        this.f22689g = false;
        this.h = false;
        zl0 zl0Var = this.f22692k;
        if (!zl0Var.b(i10)) {
            this.f22687c = false;
            return;
        }
        zl0Var.a(true);
        zl0Var.c(view, z10);
        this.f22687c = true;
        this.f22686b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
