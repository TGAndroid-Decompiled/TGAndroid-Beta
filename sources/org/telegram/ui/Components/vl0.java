package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vl0 implements f2.y0 {
    public RecyclerView f29508a;
    public boolean f29510c;
    public int d;
    public int e;
    public int f29511f;
    public boolean f29512g;
    public boolean h;
    public int f29513i;
    public final ul0 f29515k;
    public int f29509b = -1;
    public final int f29514j = AndroidUtilities.dp(80.0f);
    public final tl0 f29516l = new tl0(this, 0);

    public vl0(ul0 ul0Var) {
        this.f29515k = ul0Var;
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
        ul0 ul0Var = this.f29515k;
        tl0 tl0Var = this.f29516l;
        if (action != 1) {
            if (action == 2) {
                if (this.f29514j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f29512g) {
                            this.f29512g = true;
                            AndroidUtilities.cancelRunOnUIThread(tl0Var);
                            AndroidUtilities.runOnUIThread(tl0Var);
                        }
                        this.f29513i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.e && y10 <= this.f29511f) {
                        this.f29512g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(tl0Var);
                            AndroidUtilities.runOnUIThread(tl0Var);
                        }
                        this.f29513i = ((int) ((y10 + this.f29511f) - (this.e + i11))) / 2;
                    } else if (this.f29512g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(tl0Var);
                        this.f29512g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f29509b != i10) {
                    this.f29509b = i10;
                    ul0Var.c(E, !ul0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f29510c = false;
        this.f29512g = false;
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
        if (this.f29510c && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f29508a = recyclerView;
            int i10 = this.f29514j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f29511f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f29510c = false;
            this.f29512g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f29516l);
            this.f29515k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z4) {
        if (this.f29510c) {
            return;
        }
        this.f29509b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f29516l);
        this.f29512g = false;
        this.h = false;
        ul0 ul0Var = this.f29515k;
        if (!ul0Var.b(i10)) {
            this.f29510c = false;
            return;
        }
        ul0Var.a(true);
        ul0Var.c(view, z4);
        this.f29510c = true;
        this.f29509b = i10;
    }

    @Override
    public final void c(boolean z4) {
    }
}
