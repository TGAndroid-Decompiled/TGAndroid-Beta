package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ii implements fk {
    public final vi f27144a;

    public ii(vi viVar) {
        this.f27144a = viVar;
    }

    @Override
    public final void O() {
        this.f27144a.B1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        vi viVar = this.f27144a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        if (n2Var instanceof fk) {
            ((fk) n2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (n2Var instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) n2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            pn0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        vi viVar = this.f27144a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        if (n2Var instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.pn0) {
            ((org.telegram.ui.pn0) n2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        vi viVar = this.f27144a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.w();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        if (n2Var instanceof fk) {
            ((fk) n2Var).w();
        } else if (n2Var instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) n2Var;
            pn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                pn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
