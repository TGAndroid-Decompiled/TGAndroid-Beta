package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements jg.f0, org.telegram.ui.ActionBar.r1 {
    public final x9 f43183a;

    public t9(x9 x9Var) {
        this.f43183a = x9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        x9 x9Var = this.f43183a;
        ArrayList arrayList2 = x9Var.f43345s;
        if (!x9Var.f43344r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f16724a;
                if ((tLObject instanceof TLRPC.User) && x9.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f16724a);
                }
            }
            fi.w3 w3Var = x9Var.f35844a;
            if (w3Var != null) {
                w3Var.f36781f3.O(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x9 x9Var = this.f43183a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
            x9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
