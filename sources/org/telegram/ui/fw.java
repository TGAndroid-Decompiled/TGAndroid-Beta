package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fw implements Runnable {
    public final int f37242a;
    public final yx f37243b;

    public fw(yx yxVar, int i10) {
        this.f37242a = i10;
        this.f37243b = yxVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37242a) {
            case 0:
                this.f37243b.d.f();
                return;
            case 1:
                yx yxVar = this.f37243b;
                zx zxVar = yxVar.K;
                vx vxVar = yxVar.f43733a;
                if (vxVar != null && vxVar.getScrollState() == 0 && yxVar.f43733a.getChildCount() > 0 && yxVar.f43733a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (yxVar.f43739s == 0 && zxVar.l4() && yxVar.f43740w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = zxVar.N;
                    s4.a0 a0Var = (s4.a0) yxVar.f43733a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < yxVar.f43733a.getChildCount(); i13++) {
                        int R = RecyclerView.R(yxVar.f43733a.getChildAt(i13));
                        View childAt = yxVar.f43733a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - yxVar.f43733a.getPaddingTop();
                        if (zxVar.K) {
                            f7 = 0.0f;
                        }
                        if (yxVar.f43733a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((yxVar.f43733a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            a0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                yx yxVar2 = this.f37243b;
                yxVar2.d.X(yxVar2.I);
                yxVar2.K.Q = true;
                vx vxVar2 = yxVar2.f43733a;
                vxVar2.f42617j3 = true;
                yxVar2.H = false;
                vxVar2.invalidate();
                return;
        }
    }
}
