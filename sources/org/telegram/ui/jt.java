package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jt implements View.OnClickListener {
    public final ArrayList f39016a;
    public final boolean f39017b;
    public final nt f39018c;

    public jt(nt ntVar, ArrayList arrayList, boolean z10) {
        this.f39018c = ntVar;
        this.f39016a = arrayList;
        this.f39017b = z10;
    }

    @Override
    public final void onClick(View view) {
        rt rtVar = this.f39018c.f40360a;
        if (rtVar.f41506w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f39016a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    pt ptVar = rtVar.f41496l;
                    if (ptVar != null) {
                        ptVar.M(rtVar.f41483a0, rtVar.f41493i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(rtVar.f41502r).addRecentSticker(2, rtVar.f41485b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f39017b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = rtVar.W;
                    Object obj = rtVar.f41485b0;
                    String str = rtVar.Y;
                    pt ptVar2 = rtVar.f41496l;
                    if (ptVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(rtVar.f41506w, ptVar2.a(), new a1.d(ptVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(rtVar.f41502r).addRecentSticker(0, rtVar.f41485b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    rtVar.f41496l.k(rtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    rtVar.f41496l.p(rtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    rtVar.f41496l.F(rtVar.W);
                }
            } else {
                pt ptVar3 = rtVar.f41496l;
                if (ptVar3 != null) {
                    TLRPC.Document document2 = rtVar.W;
                    String str2 = rtVar.Y;
                    boolean z10 = true;
                    Object obj2 = rtVar.f41485b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ptVar3.n(document2, str2, obj2, z10, 0, 0);
                }
            }
            rtVar.p();
        }
    }
}
