package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cs implements View.OnClickListener {
    public final ArrayList f44886a;
    public final boolean f44887b;
    public final gs f44888c;

    public cs(gs gsVar, ArrayList arrayList, boolean z9) {
        this.f44888c = gsVar;
        this.f44886a = arrayList;
        this.f44887b = z9;
    }

    @Override
    public final void onClick(View view) {
        ks ksVar = this.f44888c.f46088a;
        if (ksVar.f47292w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f44886a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    is isVar = ksVar.f47282l;
                    if (isVar != null) {
                        isVar.M(ksVar.f47269a0, ksVar.f47279i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(ksVar.f47288r).d(2, ksVar.f47271b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f44887b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ksVar.W;
                    Object obj = ksVar.f47271b0;
                    String str = ksVar.Y;
                    is isVar2 = ksVar.f47282l;
                    if (isVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.v4.I(ksVar.f47292w, isVar2.a(), new a1.d(isVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(ksVar.f47288r).d(0, ksVar.f47271b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ksVar.f47282l.i(ksVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ksVar.f47282l.o(ksVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ksVar.f47282l.F(ksVar.W);
                }
            } else {
                is isVar3 = ksVar.f47282l;
                if (isVar3 != null) {
                    TLRPC.Document document2 = ksVar.W;
                    String str2 = ksVar.Y;
                    boolean z9 = true;
                    Object obj2 = ksVar.f47271b0;
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
