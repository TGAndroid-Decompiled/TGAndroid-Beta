package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f47799a;
    public final boolean f47800b;
    public final js f47801c;

    public fs(js jsVar, ArrayList arrayList, boolean z10) {
        this.f47801c = jsVar;
        this.f47799a = arrayList;
        this.f47800b = z10;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f47801c.f49052a;
        if (nsVar.f50312w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f47799a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f50302l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f50289a0, nsVar.f50299i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.si.d0(nsVar.f50308r).d(2, nsVar.f50291b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f47800b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f50291b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f50302l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.c5.I(nsVar.f50312w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.si.d0(nsVar.f50308r).d(0, nsVar.f50291b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f50302l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f50302l.n(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f50302l.F(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f50302l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z10 = true;
                    Object obj2 = nsVar.f50291b0;
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
