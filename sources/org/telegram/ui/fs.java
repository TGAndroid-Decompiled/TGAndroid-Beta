package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f47773a;
    public final boolean f47774b;
    public final js f47775c;

    public fs(js jsVar, ArrayList arrayList, boolean z10) {
        this.f47775c = jsVar;
        this.f47773a = arrayList;
        this.f47774b = z10;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f47775c.f49050a;
        if (nsVar.f50297w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f47773a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f50287l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f50274a0, nsVar.f50284i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ri.d0(nsVar.f50293r).d(2, nsVar.f50276b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f47774b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f50276b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f50287l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.b5.I(nsVar.f50297w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ri.d0(nsVar.f50293r).d(0, nsVar.f50276b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f50287l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f50287l.n(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f50287l.F(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f50287l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z10 = true;
                    Object obj2 = nsVar.f50276b0;
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
