package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ji implements gk {
    public final wi f25306a;

    public ji(wi wiVar) {
        this.f25306a = wiVar;
    }

    @Override
    public final void O() {
        this.f25306a.B1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        wi wiVar = this.f25306a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        if (n2Var instanceof gk) {
            ((gk) n2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (n2Var instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) n2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            in0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        wi wiVar = this.f25306a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.in0) {
            ((org.telegram.ui.in0) n2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        wi wiVar = this.f25306a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.w();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        if (n2Var instanceof gk) {
            ((gk) n2Var).w();
        } else if (n2Var instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) n2Var;
            in0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                in0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
