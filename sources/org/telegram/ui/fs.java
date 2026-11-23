package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f47976a;
    public final boolean f47977b;
    public final js f47978c;

    public fs(js jsVar, ArrayList arrayList, boolean z10) {
        this.f47978c = jsVar;
        this.f47976a = arrayList;
        this.f47977b = z10;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f47978c.f49201a;
        if (nsVar.f50424w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f47976a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f50414l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f50401a0, nsVar.f50411i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ri.d0(nsVar.f50420r).d(2, nsVar.f50403b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f47977b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f50403b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f50414l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.b5.I(nsVar.f50424w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ri.d0(nsVar.f50420r).d(0, nsVar.f50403b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f50414l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f50414l.n(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f50414l.E(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f50414l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z10 = true;
                    Object obj2 = nsVar.f50403b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    lsVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            nsVar.o();
        }
    }
}
