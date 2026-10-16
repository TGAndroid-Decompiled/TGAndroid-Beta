package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class pt implements View.OnClickListener {
    public final ArrayList f39006a;
    public final boolean f39007b;
    public final tt f39008c;

    public pt(tt ttVar, ArrayList arrayList, boolean z10) {
        this.f39008c = ttVar;
        this.f39006a = arrayList;
        this.f39007b = z10;
    }

    @Override
    public final void onClick(View view) {
        xt xtVar = this.f39008c.f40207a;
        if (xtVar.f41657w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f39006a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    vt vtVar = xtVar.f41647l;
                    if (vtVar != null) {
                        vtVar.M(xtVar.f41635a0, xtVar.f41644i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(xtVar.f41653r).addRecentSticker(2, xtVar.f41637b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), this.f39007b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = xtVar.W;
                    Object obj = xtVar.f41637b0;
                    String str = xtVar.Y;
                    vt vtVar2 = xtVar.f41647l;
                    if (vtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(xtVar.f41657w, vtVar2.a(), new a1.d(vtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(xtVar.f41653r).addRecentSticker(0, xtVar.f41637b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    xtVar.f41647l.j(xtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    xtVar.f41647l.o(xtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    xtVar.f41647l.F(xtVar.W);
                }
            } else {
                vt vtVar3 = xtVar.f41647l;
                if (vtVar3 != null) {
                    TLRPC.Document document2 = xtVar.W;
                    String str2 = xtVar.Y;
                    boolean z10 = true;
                    Object obj2 = xtVar.f41637b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    vtVar3.m(document2, str2, obj2, z10, 0, 0);
                }
            }
            xtVar.p();
        }
    }
}
