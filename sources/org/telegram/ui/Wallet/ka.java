package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ka implements jg.f0, org.telegram.ui.ActionBar.q1 {
    public final oa f44597a;

    public ka(oa oaVar) {
        this.f44597a = oaVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        oa oaVar = this.f44597a;
        ArrayList arrayList2 = oaVar.f44844s;
        if (!oaVar.f44843r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f17556a;
                if ((tLObject instanceof TLRPC.User) && oa.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f17556a);
                }
            }
            bi.i6 i6Var = oaVar.f34213a;
            if (i6Var != null) {
                i6Var.f35323g3.O(true);
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        oa oaVar = this.f44597a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
            oaVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
