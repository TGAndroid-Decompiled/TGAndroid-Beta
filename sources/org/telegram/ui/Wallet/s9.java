package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final w9 f43152a;

    public s9(w9 w9Var) {
        this.f43152a = w9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        w9 w9Var = this.f43152a;
        ArrayList arrayList2 = w9Var.f43313s;
        if (!w9Var.f43312r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f16727a;
                if ((tLObject instanceof TLRPC.User) && w9.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f16727a);
                }
            }
            fi.w3 w3Var = w9Var.f36243a;
            if (w3Var != null) {
                w3Var.f37190f3.O(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        w9 w9Var = this.f43152a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
            w9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
