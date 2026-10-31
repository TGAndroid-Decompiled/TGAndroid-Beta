package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;
public final class x9 implements zf.x, org.telegram.ui.ActionBar.u1 {
    public final ba f35395a;

    public x9(ba baVar) {
        this.f35395a = baVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        ba baVar = this.f35395a;
        ArrayList arrayList2 = baVar.f34286s;
        if (!baVar.f34285r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                zf.y yVar = (zf.y) obj;
                TLObject tLObject = yVar.f55678a;
                if ((tLObject instanceof TLRPC.User) && ba.g0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) yVar.f55678a);
                }
            }
            ii iiVar = baVar.f29837a;
            if (iiVar != null) {
                iiVar.f30819f3.O(true);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ba baVar = this.f35395a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
            baVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
