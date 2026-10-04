package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jt implements View.OnClickListener {
    public final ArrayList f37748a;
    public final boolean f37749b;
    public final nt f37750c;

    public jt(nt ntVar, ArrayList arrayList, boolean z10) {
        this.f37750c = ntVar;
        this.f37748a = arrayList;
        this.f37749b = z10;
    }

    @Override
    public final void onClick(View view) {
        rt rtVar = this.f37750c.f39036a;
        if (rtVar.f40281w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f37748a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    pt ptVar = rtVar.f40271l;
                    if (ptVar != null) {
                        ptVar.M(rtVar.f40258a0, rtVar.f40268i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(rtVar.f40277r).addRecentSticker(2, rtVar.f40260b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f37749b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = rtVar.W;
                    Object obj = rtVar.f40260b0;
                    String str = rtVar.Y;
                    pt ptVar2 = rtVar.f40271l;
                    if (ptVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(rtVar.f40281w, ptVar2.a(), new a1.d(ptVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(rtVar.f40277r).addRecentSticker(0, rtVar.f40260b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    rtVar.f40271l.k(rtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    rtVar.f40271l.p(rtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    rtVar.f40271l.F(rtVar.W);
                }
            } else {
                pt ptVar3 = rtVar.f40271l;
                if (ptVar3 != null) {
                    TLRPC.Document document2 = rtVar.W;
                    String str2 = rtVar.Y;
                    boolean z10 = true;
                    Object obj2 = rtVar.f40260b0;
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
