package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ht implements View.OnClickListener {
    public final ArrayList f37472a;
    public final boolean f37473b;
    public final mt f37474c;

    public ht(mt mtVar, ArrayList arrayList, boolean z4) {
        this.f37474c = mtVar;
        this.f37472a = arrayList;
        this.f37473b = z4;
    }

    @Override
    public final void onClick(View view) {
        qt qtVar = this.f37474c.f39067a;
        if (qtVar.f40667w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f37472a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ot otVar = qtVar.f40657l;
                    if (otVar != null) {
                        otVar.M(qtVar.f40644a0, qtVar.f40654i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(qtVar.f40663r).addRecentSticker(2, qtVar.f40646b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f37473b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = qtVar.W;
                    Object obj = qtVar.f40646b0;
                    String str = qtVar.Y;
                    ot otVar2 = qtVar.f40657l;
                    if (otVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.z4.L(qtVar.f40667w, otVar2.a(), new a1.d(otVar2, document, str, obj, 11));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(qtVar.f40663r).addRecentSticker(0, qtVar.f40646b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    qtVar.f40657l.i(qtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    qtVar.f40657l.n(qtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    qtVar.f40657l.E(qtVar.W);
                }
            } else {
                ot otVar3 = qtVar.f40657l;
                if (otVar3 != null) {
                    TLRPC.Document document2 = qtVar.W;
                    String str2 = qtVar.Y;
                    boolean z4 = true;
                    Object obj2 = qtVar.f40646b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z4 = false;
                    }
                    otVar3.l(document2, str2, obj2, z4, 0, 0);
                }
            }
            qtVar.p();
        }
    }
}
