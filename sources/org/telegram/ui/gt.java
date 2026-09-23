package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class gt implements View.OnClickListener {
    public final ArrayList f33650a;
    public final boolean f33651b;
    public final lt f33652c;

    public gt(lt ltVar, ArrayList arrayList, boolean z10) {
        this.f33652c = ltVar;
        this.f33650a = arrayList;
        this.f33651b = z10;
    }

    @Override
    public final void onClick(View view) {
        pt ptVar = this.f33652c.f35086a;
        if (ptVar.f36203w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f33650a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    nt ntVar = ptVar.f36193l;
                    if (ntVar != null) {
                        ntVar.M(ptVar.f36181a0, ptVar.f36190i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ptVar.f36199r).addRecentSticker(2, ptVar.f36183b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.f33651b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = ptVar.W;
                    Object obj = ptVar.f36183b0;
                    String str = ptVar.Y;
                    nt ntVar2 = ptVar.f36193l;
                    if (ntVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(ptVar.f36203w, ntVar2.a(), new a1.d(ntVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ptVar.f36199r).addRecentSticker(0, ptVar.f36183b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    ptVar.f36193l.k(ptVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    ptVar.f36193l.p(ptVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    ptVar.f36193l.F(ptVar.W);
                }
            } else {
                nt ntVar3 = ptVar.f36193l;
                if (ntVar3 != null) {
                    TLRPC.Document document2 = ptVar.W;
                    String str2 = ptVar.Y;
                    boolean z10 = true;
                    Object obj2 = ptVar.f36183b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    ntVar3.n(document2, str2, obj2, z10, 0, 0);
                }
            }
            ptVar.p();
        }
    }
}
