package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
public final class n8 implements gg.f0, org.telegram.ui.ActionBar.a2 {
    public final s8 f35314a;

    public n8(s8 s8Var) {
        this.f35314a = s8Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        s8 s8Var = this.f35314a;
        ArrayList arrayList2 = s8Var.f35493r;
        if (!s8Var.f35492n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                gg.g0 g0Var = (gg.g0) obj;
                TLObject tLObject = g0Var.f10609a;
                if ((tLObject instanceof TLRPC.User) && s8.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f10609a);
                }
            }
            e71 e71Var = s8Var.f26290a;
            if (e71Var != null) {
                e71Var.W2.N(true);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        s8 s8Var = this.f35314a;
        s8Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            s8Var.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
