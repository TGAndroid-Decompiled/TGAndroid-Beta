package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f47183a;
    public final boolean f47184b;
    public final js f47185c;

    public fs(js jsVar, ArrayList arrayList, boolean z10) {
        this.f47185c = jsVar;
        this.f47183a = arrayList;
        this.f47184b = z10;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f47185c.f48452a;
        if (nsVar.f49676w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f47183a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f49666l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f49653a0, nsVar.f49663i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.si.b0(nsVar.f49672r).d(2, nsVar.f49655b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f47184b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f49655b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f49666l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.t4.I(nsVar.f49676w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.si.b0(nsVar.f49672r).d(0, nsVar.f49655b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f49666l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f49666l.n(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f49666l.F(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f49666l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z10 = true;
                    Object obj2 = nsVar.f49655b0;
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
