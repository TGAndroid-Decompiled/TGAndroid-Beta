package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class pt implements View.OnClickListener {
    public final ArrayList f39286a;
    public final boolean f39287b;
    public final tt f39288c;

    public pt(tt ttVar, ArrayList arrayList, boolean z10) {
        this.f39288c = ttVar;
        this.f39286a = arrayList;
        this.f39287b = z10;
    }

    @Override
    public final void onClick(View view) {
        xt xtVar = this.f39288c.f40483a;
        if (xtVar.f41953w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f39286a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    vt vtVar = xtVar.f41943l;
                    if (vtVar != null) {
                        vtVar.M(xtVar.f41931a0, xtVar.f41940i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(xtVar.f41949r).addRecentSticker(2, xtVar.f41933b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), this.f39287b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = xtVar.W;
                    Object obj = xtVar.f41933b0;
                    String str = xtVar.Y;
                    vt vtVar2 = xtVar.f41943l;
                    if (vtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(xtVar.f41953w, vtVar2.a(), new a1.d(vtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(xtVar.f41949r).addRecentSticker(0, xtVar.f41933b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    xtVar.f41943l.j(xtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    xtVar.f41943l.o(xtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    xtVar.f41943l.F(xtVar.W);
                }
            } else {
                vt vtVar3 = xtVar.f41943l;
                if (vtVar3 != null) {
                    TLRPC.Document document2 = xtVar.W;
                    String str2 = xtVar.Y;
                    boolean z10 = true;
                    Object obj2 = xtVar.f41933b0;
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
