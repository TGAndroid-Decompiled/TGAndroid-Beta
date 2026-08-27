package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class bl0 implements f2.a1 {

    public RecyclerView f27127a;

    public boolean f27129c;
    public int d;

    public int f27130e;

    public int f27131f;

    public boolean f27132g;
    public boolean h;

    public int f27133i;

    public final al0 f27135k;

    public int f27128b = -1;

    public final int f27134j = AndroidUtilities.dp(80.0f);

    public final m.i3 f27136l = new m.i3(this, 28);

    public bl0(al0 al0Var) {
        this.f27135k = al0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewE = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int iR = viewE != null ? RecyclerView.R(viewE) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        al0 al0Var = this.f27135k;
        m.i3 i3Var = this.f27136l;
        if (action == 1) {
            this.f27129c = false;
            this.f27132g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            al0Var.a(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.f27134j > -1) {
            float f10 = 0;
            if (y10 >= f10 && y10 <= this.d) {
                this.h = false;
                if (!this.f27132g) {
                    this.f27132g = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                }
                this.f27133i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.f27130e && y10 <= this.f27131f) {
                this.f27132g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                }
                int i10 = this.f27131f;
                this.f27133i = ((int) ((y10 + i10) - (this.f27130e + i10))) / 2;
            } else if (this.f27132g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                this.f27132g = false;
                this.h = false;
            }
        }
        if (iR == -1 || this.f27128b == iR) {
            return;
        }
        this.f27128b = iR;
        al0Var.c(viewE, !al0Var.d(iR));
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.f27129c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().h() == 0);
        if (z10) {
            this.f27127a = recyclerView;
            int i10 = this.f27134j;
            if (i10 > -1) {
                this.d = i10;
                this.f27130e = recyclerView.getMeasuredHeight() - i10;
                this.f27131f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f27129c = false;
            this.f27132g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f27136l);
            this.f27135k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f27129c) {
            return;
        }
        this.f27128b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f27136l);
        this.f27132g = false;
        this.h = false;
        al0 al0Var = this.f27135k;
        if (!al0Var.b(i10)) {
            this.f27129c = false;
            return;
        }
        al0Var.a(true);
        al0Var.c(view, z10);
        this.f27129c = true;
        this.f27128b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
