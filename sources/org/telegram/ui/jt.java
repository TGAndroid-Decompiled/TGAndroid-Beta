package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jt implements View.OnClickListener {
    public final ArrayList f35364a;
    public final boolean f35365b;
    public final nt f35366c;

    public jt(nt ntVar, ArrayList arrayList, boolean z4) {
        this.f35366c = ntVar;
        this.f35364a = arrayList;
        this.f35365b = z4;
    }

    @Override
    public final void onClick(View view) {
        rt rtVar = this.f35366c.f36580a;
        if (rtVar.f38050w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f35364a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    pt ptVar = rtVar.f38040l;
                    if (ptVar != null) {
                        ptVar.M(rtVar.f38028a0, rtVar.f38037i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(rtVar.f38046r).addRecentSticker(2, rtVar.f38030b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f35365b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = rtVar.W;
                    Object obj = rtVar.f38030b0;
                    String str = rtVar.Y;
                    pt ptVar2 = rtVar.f38040l;
                    if (ptVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.z4.L(rtVar.f38050w, ptVar2.a(), new a1.d(ptVar2, document, str, obj, 11));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(rtVar.f38046r).addRecentSticker(0, rtVar.f38030b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    rtVar.f38040l.j(rtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    rtVar.f38040l.o(rtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    rtVar.f38040l.F(rtVar.W);
                }
            } else {
                pt ptVar3 = rtVar.f38040l;
                if (ptVar3 != null) {
                    TLRPC.Document document2 = rtVar.W;
                    String str2 = rtVar.Y;
                    boolean z4 = true;
                    Object obj2 = rtVar.f38030b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z4 = false;
                    }
                    ptVar3.m(document2, str2, obj2, z4, 0, 0);
                }
            }
            rtVar.p();
        }
    }
}
