package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bv implements Runnable {
    public final int f44495a;
    public final vw f44496b;

    public bv(vw vwVar, int i7) {
        this.f44495a = i7;
        this.f44496b = vwVar;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f44495a) {
            case 0:
                this.f44496b.d.f();
                return;
            case 1:
                vw vwVar = this.f44496b;
                ww wwVar = vwVar.K;
                sw swVar = vwVar.f50782a;
                if (swVar != null && swVar.getScrollState() == 0 && vwVar.f50782a.getChildCount() > 0 && vwVar.f50782a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (vwVar.f50789s == 0 && wwVar.l4() && vwVar.f50790w == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    float f10 = wwVar.N;
                    v4.b0 b0Var = (v4.b0) vwVar.f50782a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < vwVar.f50782a.getChildCount(); i12++) {
                        int R = RecyclerView.R(vwVar.f50782a.getChildAt(i12));
                        View childAt = vwVar.f50782a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vwVar.f50782a.getPaddingTop();
                        if (wwVar.K) {
                            f10 = 0.0f;
                        }
                        if (vwVar.f50782a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((vwVar.f50782a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            b0Var.h1(i7, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vw vwVar2 = this.f44496b;
                vwVar2.d.X(vwVar2.I);
                vwVar2.K.Q = true;
                sw swVar2 = vwVar2.f50782a;
                swVar2.j3 = true;
                vwVar2.H = false;
                swVar2.invalidate();
                return;
        }
    }
}
