package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f45837a;
    public final boolean f45838b;
    public final js f45839c;

    public fs(js jsVar, ArrayList arrayList, boolean z9) {
        this.f45839c = jsVar;
        this.f45837a = arrayList;
        this.f45838b = z9;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f45839c.f47066a;
        if (nsVar.f48277w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45837a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f48267l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f48254a0, nsVar.f48264i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(nsVar.f48273r).d(2, nsVar.f48256b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f45838b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f48256b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f48267l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.u4.I(nsVar.f48277w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(nsVar.f48273r).d(0, nsVar.f48256b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f48267l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f48267l.o(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f48267l.F(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f48267l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z9 = true;
                    Object obj2 = nsVar.f48256b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z9 = false;
                    }
                    lsVar3.l(document2, str2, obj2, z9, 0, 0);
                }
            }
            nsVar.o();
        }
    }
}
