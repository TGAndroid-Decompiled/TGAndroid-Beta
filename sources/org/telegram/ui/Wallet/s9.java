package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements kg.c0, org.telegram.ui.ActionBar.p1 {
    public final w9 f43176a;

    public s9(w9 w9Var) {
        this.f43176a = w9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        w9 w9Var = this.f43176a;
        ArrayList arrayList2 = w9Var.f43366s;
        if (!w9Var.f43365r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                kg.d0 d0Var = (kg.d0) obj;
                TLObject tLObject = d0Var.f16946a;
                if ((tLObject instanceof TLRPC.User) && w9.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) d0Var.f16946a);
                }
            }
            ai.h4 h4Var = w9Var.f34298a;
            if (h4Var != null) {
                h4Var.f35594g3.O(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        w9 w9Var = this.f43176a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
            w9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
