package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw implements Runnable {
    public final int f37656a;
    public final zx f37657b;

    public gw(zx zxVar, int i10) {
        this.f37656a = i10;
        this.f37657b = zxVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37656a) {
            case 0:
                this.f37657b.d.f();
                return;
            case 1:
                zx zxVar = this.f37657b;
                ay ayVar = zxVar.K;
                wx wxVar = zxVar.f44239a;
                if (wxVar != null && wxVar.getScrollState() == 0 && zxVar.f44239a.getChildCount() > 0 && zxVar.f44239a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (zxVar.f44245s == 0 && ayVar.k4() && zxVar.f44246w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = ayVar.N;
                    s4.a0 a0Var = (s4.a0) zxVar.f44239a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < zxVar.f44239a.getChildCount(); i13++) {
                        int R = RecyclerView.R(zxVar.f44239a.getChildAt(i13));
                        View childAt = zxVar.f44239a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - zxVar.f44239a.getPaddingTop();
                        if (ayVar.K) {
                            f7 = 0.0f;
                        }
                        if (zxVar.f44239a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((zxVar.f44239a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                zx zxVar2 = this.f37657b;
                zxVar2.d.X(zxVar2.I);
                zxVar2.K.Q = true;
                wx wxVar2 = zxVar2.f44239a;
                wxVar2.f43379j3 = true;
                zxVar2.H = false;
                wxVar2.invalidate();
                return;
        }
    }
}
