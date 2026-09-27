package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ht implements View.OnClickListener {
    public final ArrayList f34280a;
    public final boolean f34281b;
    public final mt f34282c;

    public ht(mt mtVar, ArrayList arrayList, boolean z10) {
        this.f34282c = mtVar;
        this.f34280a = arrayList;
        this.f34281b = z10;
    }

    @Override
    public final void onClick(View view) {
        qt qtVar = this.f34282c.f35750a;
        if (qtVar.f36906w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f34280a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ot otVar = qtVar.f36896l;
                    if (otVar != null) {
                        otVar.M(qtVar.f36884a0, qtVar.f36893i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(qtVar.f36902r).addRecentSticker(2, qtVar.f36886b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.f34281b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = qtVar.W;
                    Object obj = qtVar.f36886b0;
                    String str = qtVar.Y;
                    ot otVar2 = qtVar.f36896l;
                    if (otVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(qtVar.f36906w, otVar2.a(), new a1.d(otVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(qtVar.f36902r).addRecentSticker(0, qtVar.f36886b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    qtVar.f36896l.k(qtVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    qtVar.f36896l.p(qtVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    qtVar.f36896l.F(qtVar.W);
                }
            } else {
                ot otVar3 = qtVar.f36896l;
                if (otVar3 != null) {
                    TLRPC.Document document2 = qtVar.W;
                    String str2 = qtVar.Y;
                    boolean z10 = true;
                    Object obj2 = qtVar.f36886b0;
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
