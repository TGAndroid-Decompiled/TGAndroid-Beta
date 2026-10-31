package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ct implements View.OnClickListener {
    public final ArrayList f36544a;
    public final boolean f36545b;
    public final gt f36546c;

    public ct(gt gtVar, ArrayList arrayList, boolean z10) {
        this.f36546c = gtVar;
        this.f36544a = arrayList;
        this.f36545b = z10;
    }

    @Override
    public final void onClick(View view) {
        lt ltVar = this.f36546c.f37643a;
        if (ltVar.f39406w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f36544a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    jt jtVar = ltVar.f39396l;
                    if (jtVar != null) {
                        jtVar.L(ltVar.f39384a0, ltVar.f39393i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(ltVar.f39402r).d(2, ltVar.f39386b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), this.f36545b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ltVar.W;
                    Object obj = ltVar.f39386b0;
                    String str = ltVar.Y;
                    jt jtVar2 = ltVar.f39396l;
                    if (jtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.s4.K(ltVar.f39406w, jtVar2.a(), new a1.d(jtVar2, document, str, obj, 9));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(ltVar.f39402r).d(0, ltVar.f39386b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ltVar.f39396l.i(ltVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ltVar.f39396l.n(ltVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ltVar.f39396l.E(ltVar.W);
                }
            } else {
                jt jtVar3 = ltVar.f39396l;
                if (jtVar3 != null) {
                    TLRPC.Document document2 = ltVar.W;
                    String str2 = ltVar.Y;
                    boolean z10 = true;
                    Object obj2 = ltVar.f39386b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    jtVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            ltVar.o();
        }
    }
}
