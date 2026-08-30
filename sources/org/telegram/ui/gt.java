package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class gt implements View.OnClickListener {
    public final ArrayList f34673a;
    public final boolean f34674b;
    public final lt f34675c;

    public gt(lt ltVar, ArrayList arrayList, boolean z4) {
        this.f34675c = ltVar;
        this.f34673a = arrayList;
        this.f34674b = z4;
    }

    @Override
    public final void onClick(View view) {
        pt ptVar = this.f34675c.f36133a;
        if (ptVar.f37534w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f34673a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    nt ntVar = ptVar.f37524l;
                    if (ntVar != null) {
                        ntVar.M(ptVar.f37512a0, ptVar.f37521i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ptVar.f37530r).addRecentSticker(2, ptVar.f37514b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.f34674b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ptVar.W;
                    Object obj = ptVar.f37514b0;
                    String str = ptVar.Y;
                    nt ntVar2 = ptVar.f37524l;
                    if (ntVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.z4.L(ptVar.f37534w, ntVar2.a(), new a1.d(ntVar2, document, str, obj, 11));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ptVar.f37530r).addRecentSticker(0, ptVar.f37514b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ptVar.f37524l.j(ptVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ptVar.f37524l.o(ptVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ptVar.f37524l.F(ptVar.W);
                }
            } else {
                nt ntVar3 = ptVar.f37524l;
                if (ntVar3 != null) {
                    TLRPC.Document document2 = ptVar.W;
                    String str2 = ptVar.Y;
                    boolean z4 = true;
                    Object obj2 = ptVar.f37514b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z4 = false;
                    }
                    ntVar3.m(document2, str2, obj2, z4, 0, 0);
                }
            }
            ptVar.p();
        }
    }
}
