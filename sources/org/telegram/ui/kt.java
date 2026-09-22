package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f35254a;
    public final boolean f35255b;
    public final ot f35256c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f35256c = otVar;
        this.f35254a = arrayList;
        this.f35255b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f35256c.f36339a;
        if (stVar.f37483w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f35254a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f37473l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f37461a0, stVar.f37470i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f37479r).addRecentSticker(2, stVar.f37463b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f35255b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f37463b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f37473l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.c5.L(stVar.f37483w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f37479r).addRecentSticker(0, stVar.f37463b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f37473l.j(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f37473l.o(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f37473l.E(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f37473l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f37463b0;
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
