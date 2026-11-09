package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r9 implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final v9 f43070a;

    public r9(v9 v9Var) {
        this.f43070a = v9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        v9 v9Var = this.f43070a;
        ArrayList arrayList2 = v9Var.f43231s;
        if (!v9Var.f43230r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f16727a;
                if ((tLObject instanceof TLRPC.User) && v9.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f16727a);
                }
            }
            fi.w3 w3Var = v9Var.f36649a;
            if (w3Var != null) {
                w3Var.f37556f3.O(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        v9 v9Var = this.f43070a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
            v9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
