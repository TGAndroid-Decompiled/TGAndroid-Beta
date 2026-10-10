package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oj implements hm0, tj {
    public final ck f29480a;

    public oj(ck ckVar) {
        this.f29480a = ckVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        ck ckVar = this.f29480a;
        ckVar.f30211b.dismiss(true);
        ckVar.J.a(user, z10, i10, j3);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ck ckVar = this.f29480a;
        s4.i0 adapter = ckVar.f25313s.getAdapter();
        yj yjVar = ckVar.F;
        if (adapter == yjVar) {
            O = yjVar.E(i10);
        } else {
            wj wjVar = ckVar.E;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        if (O != null) {
            ckVar.O((bk) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
