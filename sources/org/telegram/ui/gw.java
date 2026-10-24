package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw implements Runnable {
    public final int f37669a;
    public final dy f37670b;

    public gw(dy dyVar, int i10) {
        this.f37669a = i10;
        this.f37670b = dyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37669a) {
            case 0:
                this.f37670b.d.l();
                return;
            case 1:
                dy dyVar = this.f37670b;
                ey eyVar = dyVar.K;
                zx zxVar = dyVar.f36737a;
                if (zxVar != null && zxVar.getScrollState() == 0 && dyVar.f36737a.getChildCount() > 0 && dyVar.f36737a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (dyVar.f36743s == 0 && eyVar.X3() && dyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = eyVar.N;
                    s4.b0 b0Var = (s4.b0) dyVar.f36737a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < dyVar.f36737a.getChildCount(); i13++) {
                        int R = RecyclerView.R(dyVar.f36737a.getChildAt(i13));
                        View childAt = dyVar.f36737a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - dyVar.f36737a.getPaddingTop();
                        if (eyVar.K) {
                            f7 = 0.0f;
                        }
                        if (dyVar.f36737a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((dyVar.f36737a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            b0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                dy dyVar2 = this.f37670b;
                dyVar2.d.X(dyVar2.I);
                dyVar2.K.Q = true;
                zx zxVar2 = dyVar2.f36737a;
                zxVar2.f44223e3 = true;
                dyVar2.H = false;
                zxVar2.invalidate();
                return;
        }
    }
}
