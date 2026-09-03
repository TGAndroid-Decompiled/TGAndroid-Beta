package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vl0 implements f2.z0 {
    public RecyclerView f31905a;
    public boolean f31907c;
    public int d;
    public int f31908e;
    public int f31909f;
    public boolean f31910g;
    public boolean h;
    public int f31911i;
    public final ul0 f31913k;
    public int f31906b = -1;
    public final int f31912j = AndroidUtilities.dp(80.0f);
    public final tl0 f31914l = new tl0(this, 0);

    public vl0(ul0 ul0Var) {
        this.f31913k = ul0Var;
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
        ul0 ul0Var = this.f31913k;
        tl0 tl0Var = this.f31914l;
        if (action != 1) {
            if (action == 2) {
                if (this.f31912j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f31910g) {
                            this.f31910g = true;
                            AndroidUtilities.cancelRunOnUIThread(tl0Var);
                            AndroidUtilities.runOnUIThread(tl0Var);
                        }
                        this.f31911i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f31908e && y10 <= this.f31909f) {
                        this.f31910g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(tl0Var);
                            AndroidUtilities.runOnUIThread(tl0Var);
                        }
                        this.f31911i = ((int) ((y10 + this.f31909f) - (this.f31908e + i11))) / 2;
                    } else if (this.f31910g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(tl0Var);
                        this.f31910g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f31906b != i10) {
                    this.f31906b = i10;
                    ul0Var.c(E, !ul0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f31907c = false;
        this.f31910g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(tl0Var);
        ul0Var.a(false);
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
        if (this.f31907c && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f31905a = recyclerView;
            int i10 = this.f31912j;
            if (i10 > -1) {
                this.d = i10;
                this.f31908e = recyclerView.getMeasuredHeight() - i10;
                this.f31909f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f31907c = false;
            this.f31910g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31914l);
            this.f31913k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z4) {
        if (this.f31907c) {
            return;
        }
        this.f31906b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f31914l);
        this.f31910g = false;
        this.h = false;
        ul0 ul0Var = this.f31913k;
        if (!ul0Var.b(i10)) {
            this.f31907c = false;
            return;
        }
        ul0Var.a(true);
        ul0Var.c(view, z4);
        this.f31907c = true;
        this.f31906b = i10;
    }

    @Override
    public final void c(boolean z4) {
    }
}
