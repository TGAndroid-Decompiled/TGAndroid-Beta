package org.telegram.ui;

import android.view.View;
public final class kd implements View.OnClickListener {
    public final int f37348a;
    public final sd f37349b;

    public kd(sd sdVar, int i10) {
        this.f37348a = i10;
        this.f37349b = sdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37348a) {
            case 0:
                sd.X(this.f37349b, view);
                return;
            case 1:
                sd sdVar = this.f37349b;
                org.telegram.ui.Components.i50 i50Var = sdVar.v;
                if (sdVar.f39790x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i50Var.n(z10, new id(sdVar, 1), new v5(sdVar, 2), 0);
                sdVar.J.M(0);
                sdVar.J.P(43);
                sdVar.h.d();
                return;
            case 2:
                sd sdVar2 = this.f37349b;
                if (!sdVar2.f39773j0) {
                    sdVar2.f0();
                    return;
                } else if (sdVar2.f39761a0) {
                    sdVar2.f39761a0 = false;
                    sdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                sd sdVar3 = this.f37349b;
                if (!sdVar3.f39761a0) {
                    sdVar3.f39761a0 = true;
                    sdVar3.h0();
                    return;
                }
                return;
        }
    }
}
