package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g71;
public final class p8 implements gg.f0, org.telegram.ui.ActionBar.z1 {
    public final u8 f35432a;

    public p8(u8 u8Var) {
        this.f35432a = u8Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        u8 u8Var = this.f35432a;
        ArrayList arrayList2 = u8Var.f35616r;
        if (!u8Var.f35615n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                gg.g0 g0Var = (gg.g0) obj;
                TLObject tLObject = g0Var.f10608a;
                if ((tLObject instanceof TLRPC.User) && u8.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f10608a);
                }
            }
            g71 g71Var = u8Var.f26922a;
            if (g71Var != null) {
                g71Var.W2.N(true);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        u8 u8Var = this.f35432a;
        u8Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            u8Var.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
