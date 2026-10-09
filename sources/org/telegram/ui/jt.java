package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jt implements View.OnClickListener {
    public final ArrayList f39018a;
    public final boolean f39019b;
    public final nt f39020c;

    public jt(nt ntVar, ArrayList arrayList, boolean z10) {
        this.f39020c = ntVar;
        this.f39018a = arrayList;
        this.f39019b = z10;
    }

    @Override
    public final void onClick(View view) {
        rt rtVar = this.f39020c.f40362a;
        if (rtVar.f41508w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f39018a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    pt ptVar = rtVar.f41498l;
                    if (ptVar != null) {
                        ptVar.M(rtVar.f41485a0, rtVar.f41495i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(rtVar.f41504r).addRecentSticker(2, rtVar.f41487b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.f39019b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = rtVar.W;
                    Object obj = rtVar.f41487b0;
                    String str = rtVar.Y;
                    pt ptVar2 = rtVar.f41498l;
                    if (ptVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(rtVar.f41508w, ptVar2.a(), new a1.d(ptVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(rtVar.f41504r).addRecentSticker(0, rtVar.f41487b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    rtVar.f41498l.k(rtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    rtVar.f41498l.p(rtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    rtVar.f41498l.F(rtVar.W);
                }
            } else {
                pt ptVar3 = rtVar.f41498l;
                if (ptVar3 != null) {
                    TLRPC.Document document2 = rtVar.W;
                    String str2 = rtVar.Y;
                    boolean z10 = true;
                    Object obj2 = rtVar.f41487b0;
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
