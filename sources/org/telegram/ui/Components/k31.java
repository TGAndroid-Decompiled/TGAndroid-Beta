package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class k31 extends g.p {
    public final t31 f35162c;

    public k31(t31 t31Var) {
        this.f35162c = t31Var;
    }

    @Override
    public final int i(int i7) {
        t31 t31Var = this.f35162c;
        v4.g0 adapter = t31Var.f38155n.getAdapter();
        s31 s31Var = t31Var.f38157s;
        if (adapter == s31Var) {
            if ((s31Var.d.get(i7) instanceof Integer) || i7 >= s31Var.f37854x) {
                return s31Var.f37853w;
            }
            return 1;
        }
        jg.d2 d2Var = t31Var.f38158w;
        SparseArray sparseArray = d2Var.f16704s;
        if (i7 != d2Var.D && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.f16700e.a();
    }
}
