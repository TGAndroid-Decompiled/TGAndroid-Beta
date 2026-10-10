package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f71;
public final class o8 implements gg.f0, org.telegram.ui.ActionBar.a2 {
    public final t8 f35402a;

    public o8(t8 t8Var) {
        this.f35402a = t8Var;
    }

    @Override
    public void a(a0.i iVar, ArrayList arrayList) {
        t8 t8Var = this.f35402a;
        ArrayList arrayList2 = t8Var.f35586r;
        if (!t8Var.f35585n) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                gg.g0 g0Var = (gg.g0) obj;
                TLObject tLObject = g0Var.f10609a;
                if ((tLObject instanceof TLRPC.User) && t8.b0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) g0Var.f10609a);
                }
            }
            f71 f71Var = t8Var.f26629a;
            if (f71Var != null) {
                f71Var.W2.N(true);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        t8 t8Var = this.f35402a;
        t8Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            t8Var.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
