package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class et implements View.OnClickListener {
    public final ArrayList f33550a;
    public final boolean f33551b;
    public final jt f33552c;

    public et(jt jtVar, ArrayList arrayList, boolean z10) {
        this.f33552c = jtVar;
        this.f33550a = arrayList;
        this.f33551b = z10;
    }

    @Override
    public final void onClick(View view) {
        nt ntVar = this.f33552c.f34957a;
        if (ntVar.f36133w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f33550a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    lt ltVar = ntVar.f36123l;
                    if (ltVar != null) {
                        ltVar.M(ntVar.f36111a0, ntVar.f36120i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ntVar.f36129r).addRecentSticker(2, ntVar.f36113b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.f33551b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ntVar.W;
                    Object obj = ntVar.f36113b0;
                    String str = ntVar.Y;
                    lt ltVar2 = ntVar.f36123l;
                    if (ltVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(ntVar.f36133w, ltVar2.a(), new a1.d(ltVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ntVar.f36129r).addRecentSticker(0, ntVar.f36113b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ntVar.f36123l.k(ntVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ntVar.f36123l.p(ntVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ntVar.f36123l.F(ntVar.W);
                }
            } else {
                lt ltVar3 = ntVar.f36123l;
                if (ltVar3 != null) {
                    TLRPC.Document document2 = ntVar.W;
                    String str2 = ntVar.Y;
                    boolean z10 = true;
                    Object obj2 = ntVar.f36113b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ltVar3.n(document2, str2, obj2, z10, 0, 0);
                }
            }
            ntVar.p();
        }
    }
}
