package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
public final class s9 implements hg.f0, org.telegram.ui.ActionBar.a2 {
    public final w9 f34921a;

    public s9(w9 w9Var) {
        this.f34921a = w9Var;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        w9 w9Var = this.f34921a;
        ArrayList arrayList2 = w9Var.f35048r;
        if (!w9Var.f35047n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f11869a;
                if ((tLObject instanceof TLRPC.User) && w9.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f11869a);
                }
            }
            u61 u61Var = w9Var.f31197a;
            if (u61Var != null) {
                u61Var.W2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        w9 w9Var = this.f34921a;
        w9Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            w9Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
