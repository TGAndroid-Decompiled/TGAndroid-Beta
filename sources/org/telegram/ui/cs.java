package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cs implements View.OnClickListener {
    public final ArrayList f44890a;
    public final boolean f44891b;
    public final gs f44892c;

    public cs(gs gsVar, ArrayList arrayList, boolean z9) {
        this.f44892c = gsVar;
        this.f44890a = arrayList;
        this.f44891b = z9;
    }

    @Override
    public final void onClick(View view) {
        ks ksVar = this.f44892c.f46089a;
        if (ksVar.f47296w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f44890a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    is isVar = ksVar.f47286l;
                    if (isVar != null) {
                        isVar.M(ksVar.f47273a0, ksVar.f47283i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(ksVar.f47292r).d(2, ksVar.f47275b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f44891b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ksVar.W;
                    Object obj = ksVar.f47275b0;
                    String str = ksVar.Y;
                    is isVar2 = ksVar.f47286l;
                    if (isVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.v4.I(ksVar.f47296w, isVar2.a(), new a1.d(isVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(ksVar.f47292r).d(0, ksVar.f47275b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ksVar.f47286l.i(ksVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ksVar.f47286l.o(ksVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ksVar.f47286l.F(ksVar.W);
                }
            } else {
                is isVar3 = ksVar.f47286l;
                if (isVar3 != null) {
                    TLRPC.Document document2 = ksVar.W;
                    String str2 = ksVar.Y;
                    boolean z9 = true;
                    Object obj2 = ksVar.f47275b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z9 = false;
                    }
                    isVar3.l(document2, str2, obj2, z9, 0, 0);
                }
            }
            ksVar.o();
        }
    }
}
