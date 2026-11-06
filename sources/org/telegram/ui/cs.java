package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cs implements View.OnClickListener {
    public final ArrayList f44885a;
    public final boolean f44886b;
    public final gs f44887c;

    public cs(gs gsVar, ArrayList arrayList, boolean z9) {
        this.f44887c = gsVar;
        this.f44885a = arrayList;
        this.f44886b = z9;
    }

    @Override
    public final void onClick(View view) {
        ks ksVar = this.f44887c.f46087a;
        if (ksVar.f47291w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f44885a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    is isVar = ksVar.f47281l;
                    if (isVar != null) {
                        isVar.M(ksVar.f47268a0, ksVar.f47278i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(ksVar.f47287r).d(2, ksVar.f47270b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.f44886b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ksVar.W;
                    Object obj = ksVar.f47270b0;
                    String str = ksVar.Y;
                    is isVar2 = ksVar.f47281l;
                    if (isVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.v4.I(ksVar.f47291w, isVar2.a(), new a1.d(isVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(ksVar.f47287r).d(0, ksVar.f47270b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ksVar.f47281l.i(ksVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ksVar.f47281l.o(ksVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ksVar.f47281l.F(ksVar.W);
                }
            } else {
                is isVar3 = ksVar.f47281l;
                if (isVar3 != null) {
                    TLRPC.Document document2 = ksVar.W;
                    String str2 = ksVar.Y;
                    boolean z9 = true;
                    Object obj2 = ksVar.f47270b0;
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
