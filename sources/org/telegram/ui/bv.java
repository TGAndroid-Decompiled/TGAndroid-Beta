package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bv implements Runnable {
    public final int f44492a;
    public final vw f44493b;

    public bv(vw vwVar, int i7) {
        this.f44492a = i7;
        this.f44493b = vwVar;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f44492a) {
            case 0:
                this.f44493b.d.f();
                return;
            case 1:
                vw vwVar = this.f44493b;
                ww wwVar = vwVar.K;
                sw swVar = vwVar.f50838a;
                if (swVar != null && swVar.getScrollState() == 0 && vwVar.f50838a.getChildCount() > 0 && vwVar.f50838a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (vwVar.f50845s == 0 && wwVar.l4() && vwVar.f50846w == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    float f10 = wwVar.N;
                    v4.b0 b0Var = (v4.b0) vwVar.f50838a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < vwVar.f50838a.getChildCount(); i12++) {
                        int R = RecyclerView.R(vwVar.f50838a.getChildAt(i12));
                        View childAt = vwVar.f50838a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vwVar.f50838a.getPaddingTop();
                        if (wwVar.K) {
                            f10 = 0.0f;
                        }
                        if (vwVar.f50838a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((vwVar.f50838a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                vw vwVar2 = this.f44493b;
                vwVar2.d.X(vwVar2.I);
                vwVar2.K.Q = true;
                sw swVar2 = vwVar2.f50838a;
                swVar2.j3 = true;
                vwVar2.H = false;
                swVar2.invalidate();
                return;
        }
    }
}
