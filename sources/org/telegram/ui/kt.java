package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f38150a;
    public final boolean f38151b;
    public final ot f38152c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f38152c = otVar;
        this.f38150a = arrayList;
        this.f38151b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f38152c.f39336a;
        if (stVar.f40575w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f38150a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f40565l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f40552a0, stVar.f40562i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f40571r).addRecentSticker(2, stVar.f40554b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f38151b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f40554b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f40565l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(stVar.f40575w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f40571r).addRecentSticker(0, stVar.f40554b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f40565l.i(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f40565l.n(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f40565l.E(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f40565l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f40554b0;
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
