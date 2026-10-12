package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class mt implements View.OnClickListener {
    public final ArrayList f40128a;
    public final boolean f40129b;
    public final qt f40130c;

    public mt(qt qtVar, ArrayList arrayList, boolean z10) {
        this.f40130c = qtVar;
        this.f40128a = arrayList;
        this.f40129b = z10;
    }

    @Override
    public final void onClick(View view) {
        ut utVar = this.f40130c.f41429a;
        if (utVar.f42588w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f40128a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    st stVar = utVar.f42578l;
                    if (stVar != null) {
                        stVar.M(utVar.f42565a0, utVar.f42575i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(utVar.f42584r).addRecentSticker(2, utVar.f42567b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.f40129b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = utVar.W;
                    Object obj = utVar.f42567b0;
                    String str = utVar.Y;
                    st stVar2 = utVar.f42578l;
                    if (stVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.g5.K(utVar.f42588w, stVar2.a(), new a1.d(stVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(utVar.f42584r).addRecentSticker(0, utVar.f42567b0, utVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    utVar.f42578l.k(utVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    utVar.f42578l.p(utVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    utVar.f42578l.F(utVar.W);
                }
            } else {
                st stVar3 = utVar.f42578l;
                if (stVar3 != null) {
                    TLRPC.Document document2 = utVar.W;
                    String str2 = utVar.Y;
                    boolean z10 = true;
                    Object obj2 = utVar.f42567b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    stVar3.n(document2, str2, obj2, z10, 0, 0);
                }
            }
            utVar.p();
        }
    }
}
