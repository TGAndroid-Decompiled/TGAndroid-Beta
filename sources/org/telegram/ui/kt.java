package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class kt implements View.OnClickListener {
    public final ArrayList f35169a;
    public final boolean f35170b;
    public final ot f35171c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.f35171c = otVar;
        this.f35169a = arrayList;
        this.f35170b = z10;
    }

    @Override
    public final void onClick(View view) {
        st stVar = this.f35171c.f36238a;
        if (stVar.f37492w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f35169a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    qt qtVar = stVar.f37482l;
                    if (qtVar != null) {
                        qtVar.M(stVar.f37470a0, stVar.f37479i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(stVar.f37488r).addRecentSticker(2, stVar.f37472b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.f35170b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = stVar.W;
                    Object obj = stVar.f37472b0;
                    String str = stVar.Y;
                    qt qtVar2 = stVar.f37482l;
                    if (qtVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.e5.L(stVar.f37492w, qtVar2.a(), new a1.d(qtVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(stVar.f37488r).addRecentSticker(0, stVar.f37472b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    stVar.f37482l.j(stVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    stVar.f37482l.o(stVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    stVar.f37482l.F(stVar.W);
                }
            } else {
                qt qtVar3 = stVar.f37482l;
                if (qtVar3 != null) {
                    TLRPC.Document document2 = stVar.W;
                    String str2 = stVar.Y;
                    boolean z10 = true;
                    Object obj2 = stVar.f37472b0;
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
