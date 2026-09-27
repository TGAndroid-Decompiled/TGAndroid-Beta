package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class gi implements hk {
    public final wi f24581a;

    public gi(wi wiVar) {
        this.f24581a = wiVar;
    }

    @Override
    public final void O() {
        this.f24581a.y1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        wi wiVar = this.f24581a;
        hk hkVar = wiVar.X;
        if (hkVar != null) {
            hkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        if (o2Var instanceof hk) {
            ((hk) o2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (o2Var instanceof org.telegram.ui.jn0) {
            org.telegram.ui.jn0 jn0Var = (org.telegram.ui.jn0) o2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            jn0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        wi wiVar = this.f24581a;
        hk hkVar = wiVar.X;
        if (hkVar != null) {
            hkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) o2Var).l(j3, arrayList, z10, i10);
        } else if (o2Var instanceof org.telegram.ui.jn0) {
            ((org.telegram.ui.jn0) o2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        wi wiVar = this.f24581a;
        hk hkVar = wiVar.X;
        if (hkVar != null) {
            hkVar.w();
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        if (o2Var instanceof hk) {
            ((hk) o2Var).w();
        } else if (o2Var instanceof org.telegram.ui.jn0) {
            org.telegram.ui.jn0 jn0Var = (org.telegram.ui.jn0) o2Var;
            jn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                jn0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
