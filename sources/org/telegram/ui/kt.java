package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f38151a;
    public final boolean f38152b;
    public final ot f38153c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f38153c = otVar;
        this.f38151a = arrayList;
        this.f38152b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f38153c.f39337a;
        if (stVar.f40576w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f38151a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f40566l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f40553a0, stVar.f40563i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f40572r).addRecentSticker(2, stVar.f40555b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f38152b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f40555b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f40566l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(stVar.f40576w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f40572r).addRecentSticker(0, stVar.f40555b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f40566l.i(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f40566l.n(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f40566l.E(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f40566l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f40555b0;
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
