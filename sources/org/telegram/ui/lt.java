package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class lt implements View.OnClickListener {
    public final ArrayList f34769a;
    public final boolean f34770b;
    public final pt f34771c;

    public lt(pt ptVar, ArrayList arrayList, boolean z10) {
        this.f34771c = ptVar;
        this.f34769a = arrayList;
        this.f34770b = z10;
    }

    @Override
    public final void onClick(View view) {
        tt ttVar = this.f34771c.f35899a;
        if (ttVar.f37036w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f34769a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    rt rtVar = ttVar.f37026l;
                    if (rtVar != null) {
                        rtVar.M(ttVar.f37014a0, ttVar.f37023i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ttVar.f37032r).addRecentSticker(2, ttVar.f37016b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), this.f34770b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ttVar.W;
                    Object obj = ttVar.f37016b0;
                    String str = ttVar.Y;
                    rt rtVar2 = ttVar.f37026l;
                    if (rtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.d5.L(ttVar.f37036w, rtVar2.a(), new a1.d(rtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ttVar.f37032r).addRecentSticker(0, ttVar.f37016b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ttVar.f37026l.i(ttVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ttVar.f37026l.n(ttVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ttVar.f37026l.D(ttVar.W);
                }
            } else {
                rt rtVar3 = ttVar.f37026l;
                if (rtVar3 != null) {
                    TLRPC.Document document2 = ttVar.W;
                    String str2 = ttVar.Y;
                    boolean z10 = true;
                    Object obj2 = ttVar.f37016b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    rtVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            ttVar.p();
        }
    }
}
