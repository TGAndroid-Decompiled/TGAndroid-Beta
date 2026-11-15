package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v9 implements jg.f0, org.telegram.ui.ActionBar.q1 {
    public final z9 f44610a;

    public v9(z9 z9Var) {
        this.f44610a = z9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        z9 z9Var = this.f44610a;
        ArrayList arrayList2 = z9Var.f44862s;
        if (!z9Var.f44861r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                jg.g0 g0Var = (jg.g0) obj;
                TLObject tLObject = g0Var.f17077a;
                if ((tLObject instanceof TLRPC.User) && z9.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f17077a);
                }
            }
            bi.v3 v3Var = z9Var.f38882a;
            if (v3Var != null) {
                v3Var.f39895g3.O(true);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        z9 z9Var = this.f44610a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26600b.getPackageName()));
            z9Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
