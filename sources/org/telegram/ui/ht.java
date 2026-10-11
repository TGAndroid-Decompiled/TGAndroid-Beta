package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ht implements View.OnClickListener {
    public final ArrayList f38501a;
    public final boolean f38502b;
    public final mt f38503c;

    public ht(mt mtVar, ArrayList arrayList, boolean z10) {
        this.f38503c = mtVar;
        this.f38501a = arrayList;
        this.f38502b = z10;
    }

    @Override
    public final void onClick(View view) {
        qt qtVar = this.f38503c.f40073a;
        if (qtVar.f41254w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f38501a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ot otVar = qtVar.f41244l;
                    if (otVar != null) {
                        otVar.M(qtVar.f41231a0, qtVar.f41241i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(qtVar.f41250r).addRecentSticker(2, qtVar.f41233b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f38502b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = qtVar.W;
                    Object obj = qtVar.f41233b0;
                    String str = qtVar.Y;
                    ot otVar2 = qtVar.f41244l;
                    if (otVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(qtVar.f41254w, otVar2.a(), new a1.d(otVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(qtVar.f41250r).addRecentSticker(0, qtVar.f41233b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    qtVar.f41244l.k(qtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    qtVar.f41244l.p(qtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    qtVar.f41244l.F(qtVar.W);
                }
            } else {
                ot otVar3 = qtVar.f41244l;
                if (otVar3 != null) {
                    TLRPC.Document document2 = qtVar.W;
                    String str2 = qtVar.Y;
                    boolean z10 = true;
                    Object obj2 = qtVar.f41233b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    otVar3.n(document2, str2, obj2, z10, 0, 0);
                }
            }
            qtVar.p();
        }
    }
}
