package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

public final class uz extends yk0 {

    public final Context f33229c;
    public final yz d;

    public uz(yz yzVar, Context context) {
        this.d = yzVar;
        this.f33229c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final long i(int i10) {
        return this.d.f35079g0.get(i10);
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        wz wzVar = (wz) o1Var.f5789a;
        int id2 = wzVar.f34380b != null ? wzVar.getId() : -1;
        vz vzVar = (vz) this.d.h.get(i10);
        wzVar.f34380b = vzVar;
        wzVar.f34385e = i10;
        wzVar.setContentDescription(vzVar.f34073b);
        wzVar.requestLayout();
        boolean z10 = wzVar.f34392n;
        vz vzVar2 = wzVar.f34380b;
        if (z10 != (vzVar2 != null && vzVar2.f34077g)) {
            t5.release(wzVar, wzVar.f34393r);
            t5.release(wzVar, wzVar.K);
            t5.release(wzVar, wzVar.M);
            t5.release(wzVar, wzVar.O);
            if (wzVar.f34390h0) {
                wzVar.f34393r = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.f34393r, wzVar.f34394s);
                wzVar.K = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.K, wzVar.L);
                wzVar.M = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.M, wzVar.N);
                wzVar.O = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.O, wzVar.P);
            }
            wzVar.f34392n = wzVar.f34380b.f34077g;
        }
        if (id2 != wzVar.getId()) {
            wzVar.f34389g0 = wzVar.f34380b.f34076f ? 1.0f : 0.0f;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new wz(this.d, this.f33229c));
    }
}
