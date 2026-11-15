package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fs implements View.OnClickListener {
    public final ArrayList f47173a;
    public final boolean f47174b;
    public final js f47175c;

    public fs(js jsVar, ArrayList arrayList, boolean z10) {
        this.f47175c = jsVar;
        this.f47173a = arrayList;
        this.f47174b = z10;
    }

    @Override
    public final void onClick(View view) {
        ns nsVar = this.f47175c.f48406a;
        if (nsVar.f49666w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f47173a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ls lsVar = nsVar.f49656l;
                    if (lsVar != null) {
                        lsVar.M(nsVar.f49643a0, nsVar.f49653i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.si.b0(nsVar.f49662r).d(2, nsVar.f49645b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.f47174b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = nsVar.W;
                    Object obj = nsVar.f49645b0;
                    String str = nsVar.Y;
                    ls lsVar2 = nsVar.f49656l;
                    if (lsVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.t4.I(nsVar.f49666w, lsVar2.a(), new a1.d(lsVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.si.b0(nsVar.f49662r).d(0, nsVar.f49645b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    nsVar.f49656l.i(nsVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    nsVar.f49656l.n(nsVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    nsVar.f49656l.F(nsVar.W);
                }
            } else {
                ls lsVar3 = nsVar.f49656l;
                if (lsVar3 != null) {
                    TLRPC.Document document2 = nsVar.W;
                    String str2 = nsVar.Y;
                    boolean z10 = true;
                    Object obj2 = nsVar.f49645b0;
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
