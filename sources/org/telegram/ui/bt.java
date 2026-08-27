package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class bt implements View.OnClickListener {

    public final ArrayList f36878a;

    public final boolean f36879b;

    public final ft f36880c;

    public bt(ft ftVar, ArrayList arrayList, boolean z10) {
        this.f36880c = ftVar;
        this.f36878a = arrayList;
        this.f36879b = z10;
    }

    @Override
    public final void onClick(View view) {
        kt ktVar = this.f36880c.f38203a;
        if (ktVar.f39878w == null) {
            return;
        }
        int iIntValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.f36878a;
        if (((Integer) arrayList.get(iIntValue)).intValue() == 0 || ((Integer) arrayList.get(iIntValue)).intValue() == 6) {
            ht htVar = ktVar.f39868l;
            if (htVar != null) {
                htVar.l(ktVar.W, ktVar.Y, ktVar.f39857b0, ((Integer) arrayList.get(iIntValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 1) {
            ht htVar2 = ktVar.f39868l;
            if (htVar2 != null) {
                htVar2.M(ktVar.f39855a0, ktVar.f39865i);
            }
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 2) {
            MediaDataController.getInstance(ktVar.f39874r).addRecentSticker(2, ktVar.f39857b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.f36879b);
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 3) {
            TLRPC.Document document = ktVar.W;
            Object obj = ktVar.f39857b0;
            String str = ktVar.Y;
            ht htVar3 = ktVar.f39868l;
            if (htVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.y4.L(ktVar.f39878w, htVar3.a(), new a1.d(htVar3, document, str, obj, 12));
            }
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 4) {
            MediaDataController.getInstance(ktVar.f39874r).addRecentSticker(0, ktVar.f39857b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 5) {
            ktVar.f39868l.i(ktVar.X);
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 7) {
            ktVar.f39868l.n(ktVar.W);
        } else if (((Integer) arrayList.get(iIntValue)).intValue() == 8) {
            ktVar.f39868l.D(ktVar.W);
        }
        ktVar.p();
    }
}
