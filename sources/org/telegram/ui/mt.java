package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class mt implements View.OnClickListener {
    public final ArrayList f35880a;
    public final boolean f35881b;
    public final qt f35882c;

    public mt(qt qtVar, ArrayList arrayList, boolean z10) {
        this.f35882c = qtVar;
        this.f35880a = arrayList;
        this.f35881b = z10;
    }

    @Override
    public final void onClick(View view) {
        ut utVar = this.f35882c.f37017a;
        if (utVar.f38218w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f35880a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    st stVar = utVar.f38208l;
                    if (stVar != null) {
                        stVar.M(utVar.f38196a0, utVar.f38205i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(utVar.f38214r).addRecentSticker(2, utVar.f38198b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.f35881b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = utVar.W;
                    Object obj = utVar.f38198b0;
                    String str = utVar.Y;
                    st stVar2 = utVar.f38208l;
                    if (stVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.c5.L(utVar.f38218w, stVar2.a(), new a1.d(stVar2, document, str, obj, 10));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(utVar.f38214r).addRecentSticker(0, utVar.f38198b0, utVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    utVar.f38208l.j(utVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    utVar.f38208l.o(utVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    utVar.f38208l.E(utVar.W);
                }
            } else {
                st stVar3 = utVar.f38208l;
                if (stVar3 != null) {
                    TLRPC.Document document2 = utVar.W;
                    String str2 = utVar.Y;
                    boolean z10 = true;
                    Object obj2 = utVar.f38198b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z10 = false;
                    }
                    stVar3.m(document2, str2, obj2, z10, 0, 0);
                }
            }
            utVar.p();
        }
    }
}
