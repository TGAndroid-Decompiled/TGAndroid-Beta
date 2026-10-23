package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
public final class p9 implements hg.f0, org.telegram.ui.ActionBar.z1 {
    public final s9 f35051a;

    public p9(s9 s9Var) {
        this.f35051a = s9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        s9 s9Var = this.f35051a;
        ArrayList arrayList2 = s9Var.f35186r;
        if (!s9Var.f35185n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f11893a;
                if ((tLObject instanceof TLRPC.User) && s9.c0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f11893a);
                }
            }
            d71 d71Var = s9Var.f25907a;
            if (d71Var != null) {
                d71Var.Z2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        s9 s9Var = this.f35051a;
        s9Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            s9Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
