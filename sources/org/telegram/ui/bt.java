package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bt implements View.OnClickListener {
    public final ArrayList f36108a;
    public final boolean f36109b;
    public final ft f36110c;

    public bt(ft ftVar, ArrayList arrayList, boolean z10) {
        this.f36110c = ftVar;
        this.f36108a = arrayList;
        this.f36109b = z10;
    }

    @Override
    public final void onClick(View view) {
        kt ktVar = this.f36110c.f37231a;
        if (ktVar.f38996w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f36108a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ht htVar = ktVar.f38986l;
                    if (htVar != null) {
                        htVar.L(ktVar.f38974a0, ktVar.f38983i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.vi.b0(ktVar.f38992r).d(2, ktVar.f38976b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.f36109b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ktVar.W;
                    Object obj = ktVar.f38976b0;
                    String str = ktVar.Y;
                    ht htVar2 = ktVar.f38986l;
                    if (htVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.s4.K(ktVar.f38996w, htVar2.a(), new a1.d(htVar2, document, str, obj, 9));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.vi.b0(ktVar.f38992r).d(0, ktVar.f38976b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ktVar.f38986l.i(ktVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ktVar.f38986l.n(ktVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ktVar.f38986l.E(ktVar.W);
                }
            } else {
                ht htVar3 = ktVar.f38986l;
                if (htVar3 != null) {
                    TLRPC.Document document2 = ktVar.W;
                    String str2 = ktVar.Y;
                    boolean z10 = true;
                    Object obj2 = ktVar.f38976b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    htVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            ktVar.o();
        }
    }
}
