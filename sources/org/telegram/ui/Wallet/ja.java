package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ja implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final na f44426a;

    public ja(na naVar) {
        this.f44426a = naVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        na naVar = this.f44426a;
        ArrayList arrayList2 = naVar.f44672s;
        if (!naVar.f44671r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f17463a;
                if ((tLObject instanceof TLRPC.User) && na.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f17463a);
                }
            }
            bi.d6 d6Var = naVar.f33530a;
            if (d6Var != null) {
                d6Var.f34607g3.O(true);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        na naVar = this.f44426a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
            naVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
