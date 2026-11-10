package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ev implements Runnable {
    public final int f45450a;
    public final yw f45451b;

    public ev(yw ywVar, int i7) {
        this.f45450a = i7;
        this.f45451b = ywVar;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f45450a) {
            case 0:
                this.f45451b.d.f();
                return;
            case 1:
                yw ywVar = this.f45451b;
                zw zwVar = ywVar.K;
                vw vwVar = ywVar.f52125a;
                if (vwVar != null && vwVar.getScrollState() == 0 && ywVar.f52125a.getChildCount() > 0 && ywVar.f52125a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (ywVar.f52132s == 0 && zwVar.l4() && ywVar.f52133w == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    float f10 = zwVar.N;
                    v4.b0 b0Var = (v4.b0) ywVar.f52125a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < ywVar.f52125a.getChildCount(); i12++) {
                        int R = RecyclerView.R(ywVar.f52125a.getChildAt(i12));
                        View childAt = ywVar.f52125a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ywVar.f52125a.getPaddingTop();
                        if (zwVar.K) {
                            f10 = 0.0f;
                        }
                        if (ywVar.f52125a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((ywVar.f52125a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                yw ywVar2 = this.f45451b;
                ywVar2.d.X(ywVar2.I);
                ywVar2.K.Q = true;
                vw vwVar2 = ywVar2.f52125a;
                vwVar2.j3 = true;
                ywVar2.H = false;
                vwVar2.invalidate();
                return;
        }
    }
}
