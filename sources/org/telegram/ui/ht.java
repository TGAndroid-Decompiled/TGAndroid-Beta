package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ht implements View.OnClickListener {
    public final ArrayList f38535a;
    public final boolean f38536b;
    public final mt f38537c;

    public ht(mt mtVar, ArrayList arrayList, boolean z10) {
        this.f38537c = mtVar;
        this.f38535a = arrayList;
        this.f38536b = z10;
    }

    @Override
    public final void onClick(View view) {
        qt qtVar = this.f38537c.f40107a;
        if (qtVar.f41288w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f38535a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ot otVar = qtVar.f41278l;
                    if (otVar != null) {
                        otVar.M(qtVar.f41265a0, qtVar.f41275i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(qtVar.f41284r).addRecentSticker(2, qtVar.f41267b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f38536b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = qtVar.W;
                    Object obj = qtVar.f41267b0;
                    String str = qtVar.Y;
                    ot otVar2 = qtVar.f41278l;
                    if (otVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(qtVar.f41288w, otVar2.a(), new a1.d(otVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(qtVar.f41284r).addRecentSticker(0, qtVar.f41267b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    qtVar.f41278l.k(qtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    qtVar.f41278l.p(qtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    qtVar.f41278l.F(qtVar.W);
                }
            } else {
                ot otVar3 = qtVar.f41278l;
                if (otVar3 != null) {
                    TLRPC.Document document2 = qtVar.W;
                    String str2 = qtVar.Y;
                    boolean z10 = true;
                    Object obj2 = qtVar.f41267b0;
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
