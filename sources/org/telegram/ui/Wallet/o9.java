package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m71;
public final class o9 implements ig.g0, org.telegram.ui.ActionBar.b2 {
    public final r9 f37093a;

    public o9(r9 r9Var) {
        this.f37093a = r9Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        r9 r9Var = this.f37093a;
        ArrayList arrayList2 = r9Var.f37227s;
        if (!r9Var.f37226r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ig.h0 h0Var = (ig.h0) obj;
                TLObject tLObject = h0Var.f14063a;
                if ((tLObject instanceof TLRPC.User) && r9.d0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) h0Var.f14063a);
                }
            }
            m71 m71Var = r9Var.f30764a;
            if (m71Var != null) {
                m71Var.f32504g3.O(true);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        r9 r9Var = this.f37093a;
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
