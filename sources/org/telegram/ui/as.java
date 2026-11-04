package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class as implements View.OnClickListener {
    public final ArrayList f43833a;
    public final boolean f43834b;
    public final es f43835c;

    public as(es esVar, ArrayList arrayList, boolean z10) {
        this.f43835c = esVar;
        this.f43833a = arrayList;
        this.f43834b = z10;
    }

    @Override
    public final void onClick(View view) {
        is isVar = this.f43835c.f45025a;
        if (isVar.f46406w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f43833a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    gs gsVar = isVar.f46396l;
                    if (gsVar != null) {
                        gsVar.M(isVar.f46383a0, isVar.f46393i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.li.b0(isVar.f46402r).d(2, isVar.f46385b0, isVar.W, (int) (System.currentTimeMillis() / 1000), this.f43834b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = isVar.W;
                    Object obj = isVar.f46385b0;
                    String str = isVar.Y;
                    gs gsVar2 = isVar.f46396l;
                    if (gsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.t4.K(isVar.f46406w, gsVar2.a(), new a1.d(gsVar2, document, str, obj, 12));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.li.b0(isVar.f46402r).d(0, isVar.f46385b0, isVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    isVar.f46396l.i(isVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    isVar.f46396l.o(isVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    isVar.f46396l.E(isVar.W);
                }
            } else {
                gs gsVar3 = isVar.f46396l;
                if (gsVar3 != null) {
                    TLRPC.Document document2 = isVar.W;
                    String str2 = isVar.Y;
                    boolean z10 = true;
                    Object obj2 = isVar.f46385b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    gsVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            isVar.o();
        }
    }
}
