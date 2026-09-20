package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f35232a;
    public final boolean f35233b;
    public final ot f35234c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f35234c = otVar;
        this.f35232a = arrayList;
        this.f35233b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f35234c.f36366a;
        if (stVar.f37547w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f35232a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f37537l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f37525a0, stVar.f37534i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f37543r).addRecentSticker(2, stVar.f37527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f35233b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f37527b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f37537l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.d5.L(stVar.f37547w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f37543r).addRecentSticker(0, stVar.f37527b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f37537l.j(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f37537l.o(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f37537l.F(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f37537l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f37527b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    qtVar3.m(document2, str2, obj2, z10, 0, 0);
                }
            }
            stVar.p();
        }
    }
}
