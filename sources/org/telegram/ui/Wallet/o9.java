package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w61;
public final class o9 implements hg.f0, org.telegram.ui.ActionBar.a2 {
    public final r9 f34682a;

    public o9(r9 r9Var) {
        this.f34682a = r9Var;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        r9 r9Var = this.f34682a;
        ArrayList arrayList2 = r9Var.f34820r;
        if (!r9Var.f34819n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f11866a;
                if ((tLObject instanceof TLRPC.User) && r9.c0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f11866a);
                }
            }
            w61 w61Var = r9Var.f32359a;
            if (w61Var != null) {
                w61Var.W2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        r9 r9Var = this.f34682a;
        r9Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            r9Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
