package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aj implements kl0, gj {
    public final qj f23408a;

    public aj(qj qjVar) {
        this.f23408a = qjVar;
    }

    @Override
    public void a(TLRPC.User user, boolean z4, int i10, long j10) {
        qj qjVar = this.f23408a;
        qjVar.f24278b.dismiss(true);
        qjVar.G.a(user, z4, i10, j10);
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        qj qjVar = this.f23408a;
        f2.o0 adapter = qjVar.f28142s.getAdapter();
        mj mjVar = qjVar.C;
        if (adapter == mjVar) {
            O = mjVar.E(i10);
        } else {
            jj jjVar = qjVar.B;
            O = jjVar.O(jjVar.S(i10), jjVar.Q(i10));
        }
        if (O != null) {
            qjVar.K((pj) view, O);
            return true;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
    }
}
