package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sr0 extends f2.x {
    public final int f32548c;
    public final Object d;
    public final ViewGroup f32549e;

    public sr0(ViewGroup viewGroup, Object obj, int i9) {
        this.f32548c = i9;
        this.f32549e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i9) {
        int i10;
        switch (this.f32548c) {
            case 0:
                xs0 xs0Var = (xs0) this.d;
                f2.r0 adapter = xs0Var.f34761r.getAdapter();
                eu0 eu0Var = (eu0) this.f32549e;
                yt0 yt0Var = eu0Var.E;
                if (adapter == yt0Var) {
                    if (yt0Var.j(i9) != 2) {
                        return 1;
                    }
                    return xs0Var.f34762s.J;
                } else if (eu0.v(eu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((bu0) adapter).getClass();
                    return 1;
                }
            default:
                jh.h hVar = (jh.h) this.d;
                z41 z41Var = ((i51) this.f32549e).U2;
                if (z41Var == null) {
                    return hVar.J;
                }
                l41 G = z41Var.G(i9);
                if (G == null || (i10 = G.f30348u) == -1) {
                    return hVar.J;
                }
                return i10;
        }
    }
}
