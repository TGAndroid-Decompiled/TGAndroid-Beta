package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f38123a;
    public final boolean f38124b;
    public final ot f38125c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f38125c = otVar;
        this.f38123a = arrayList;
        this.f38124b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f38125c.f39309a;
        if (stVar.f40548w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f38123a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f40538l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f40525a0, stVar.f40535i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f40544r).addRecentSticker(2, stVar.f40527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f38124b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f40527b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f40538l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(stVar.f40548w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f40544r).addRecentSticker(0, stVar.f40527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f40538l.i(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f40538l.n(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f40538l.E(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f40538l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f40527b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    qtVar3.l(document2, str2, obj2, z10, 0, 0);
                }
            }
            stVar.p();
        }
    }
}
