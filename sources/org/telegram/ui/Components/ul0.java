package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ul0 implements f2.y0 {
    public RecyclerView f29234a;
    public boolean f29236c;
    public int d;
    public int e;
    public int f29237f;
    public boolean f29238g;
    public boolean h;
    public int f29239i;
    public final tl0 f29241k;
    public int f29235b = -1;
    public final int f29240j = AndroidUtilities.dp(80.0f);
    public final sl0 f29242l = new sl0(this, 0);

    public ul0(tl0 tl0Var) {
        this.f29241k = tl0Var;
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
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        tl0 tl0Var = this.f29241k;
        sl0 sl0Var = this.f29242l;
        if (action != 1) {
            if (action == 2) {
                if (this.f29240j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f29238g) {
                            this.f29238g = true;
                            AndroidUtilities.cancelRunOnUIThread(sl0Var);
                            AndroidUtilities.runOnUIThread(sl0Var);
                        }
                        this.f29239i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.e && y10 <= this.f29237f) {
                        this.f29238g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(sl0Var);
                            AndroidUtilities.runOnUIThread(sl0Var);
                        }
                        this.f29239i = ((int) ((y10 + this.f29237f) - (this.e + i11))) / 2;
                    } else if (this.f29238g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(sl0Var);
                        this.f29238g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f29235b != i10) {
                    this.f29235b = i10;
                    tl0Var.c(E, !tl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f29236c = false;
        this.f29238g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(sl0Var);
        tl0Var.a(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().h() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f29236c && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f29234a = recyclerView;
            int i10 = this.f29240j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f29237f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f29236c = false;
            this.f29238g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f29242l);
            this.f29241k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z4) {
        if (this.f29236c) {
            return;
        }
        this.f29235b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f29242l);
        this.f29238g = false;
        this.h = false;
        tl0 tl0Var = this.f29241k;
        if (!tl0Var.b(i10)) {
            this.f29236c = false;
            return;
        }
        tl0Var.a(true);
        tl0Var.c(view, z4);
        this.f29236c = true;
        this.f29235b = i10;
    }

    @Override
    public final void c(boolean z4) {
    }
}
