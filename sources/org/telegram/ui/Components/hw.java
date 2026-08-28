package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hw extends f2.x {
    public final wy f29205c;

    public hw(wy wyVar) {
        this.f29205c = wyVar;
    }

    @Override
    public final int i(int i9) {
        wy wyVar = this.f29205c;
        ry ryVar = wyVar.f34451v0;
        f2.r0 adapter = wyVar.f34466z0.getAdapter();
        ny nyVar = wyVar.f34448u0;
        if (adapter == nyVar) {
            if (i9 == 0) {
                return nyVar.d;
            }
            if (i9 == nyVar.f31217s || (nyVar.h.get(i9) != null && !(nyVar.h.get(i9) instanceof TLRPC.Document))) {
                return nyVar.d;
            }
            return 1;
        } else if (i9 != ryVar.f32308x && (ryVar.f32305r.get(i9) == null || (ryVar.f32305r.get(i9) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return nyVar.d;
        }
    }
}
