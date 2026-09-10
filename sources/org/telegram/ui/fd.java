package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f32783a;
    public final nd f32784b;

    public fd(nd ndVar, int i10) {
        this.f32783a = i10;
        this.f32784b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f32783a) {
            case 0:
                nd.X(this.f32784b, view);
                return;
            case 1:
                nd ndVar = this.f32784b;
                org.telegram.ui.Components.e50 e50Var = ndVar.v;
                if (ndVar.f35248x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e50Var.o(z10, new ed(ndVar, 1), new s5(ndVar, 2), 0);
                ndVar.J.M(0);
                ndVar.J.P(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f32784b;
                if (!ndVar2.f35231j0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.f35219a0) {
                    ndVar2.f35219a0 = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f32784b;
                if (!ndVar3.f35219a0) {
                    ndVar3.f35219a0 = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
