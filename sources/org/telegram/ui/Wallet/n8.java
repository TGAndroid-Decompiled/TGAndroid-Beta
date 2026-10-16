package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
public final class n8 implements hg.f0, org.telegram.ui.ActionBar.z1 {
    public final s8 f33261a;

    public n8(s8 s8Var) {
        this.f33261a = s8Var;
    }

    @Override
    public void b(a0.h hVar, ArrayList arrayList) {
        s8 s8Var = this.f33261a;
        ArrayList arrayList2 = s8Var.f33437r;
        if (!s8Var.f33436n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hg.g0 g0Var = (hg.g0) obj;
                TLObject tLObject = g0Var.f10562a;
                if ((tLObject instanceof TLRPC.User) && s8.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f10562a);
                }
            }
            c71 c71Var = s8Var.f24003a;
            if (c71Var != null) {
                c71Var.W2.N(true);
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        s8 s8Var = this.f33261a;
        s8Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            s8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
