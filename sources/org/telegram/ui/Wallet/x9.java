package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;
public final class x9 implements zf.x, org.telegram.ui.ActionBar.u1 {
    public final ba f35401a;

    public x9(ba baVar) {
        this.f35401a = baVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        ba baVar = this.f35401a;
        ArrayList arrayList2 = baVar.f34288s;
        if (!baVar.f34287r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                zf.y yVar = (zf.y) obj;
                TLObject tLObject = yVar.f55696a;
                if ((tLObject instanceof TLRPC.User) && ba.h0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) yVar.f55696a);
                }
            }
            ii iiVar = baVar.f30217a;
            if (iiVar != null) {
                iiVar.f31183f3.O(true);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ba baVar = this.f35401a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
            baVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
