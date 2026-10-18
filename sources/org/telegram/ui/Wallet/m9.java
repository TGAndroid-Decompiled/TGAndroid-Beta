package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
public final class m9 implements hg.f0, org.telegram.ui.ActionBar.a2 {
    public final r9 f34559a;

    public m9(r9 r9Var) {
        this.f34559a = r9Var;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        r9 r9Var = this.f34559a;
        ArrayList arrayList2 = r9Var.f34792r;
        if (!r9Var.f34791n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f11867a;
                if ((tLObject instanceof TLRPC.User) && r9.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f11867a);
                }
            }
            u61 u61Var = r9Var.f31190a;
            if (u61Var != null) {
                u61Var.W2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        r9 r9Var = this.f34559a;
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
