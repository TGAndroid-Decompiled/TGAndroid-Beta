package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
public final class m8 implements hg.f0, org.telegram.ui.ActionBar.z1 {
    public final r8 f33487a;

    public m8(r8 r8Var) {
        this.f33487a = r8Var;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        r8 r8Var = this.f33487a;
        ArrayList arrayList2 = r8Var.f33663r;
        if (!r8Var.f33662n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f10558a;
                if ((tLObject instanceof TLRPC.User) && r8.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f10558a);
                }
            }
            b71 b71Var = r8Var.f23964a;
            if (b71Var != null) {
                b71Var.W2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        r8 r8Var = this.f33487a;
        r8Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            r8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
