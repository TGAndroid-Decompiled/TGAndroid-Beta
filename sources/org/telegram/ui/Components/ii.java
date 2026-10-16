package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ii implements gk {
    public final vi f25642a;

    public ii(vi viVar) {
        this.f25642a = viVar;
    }

    @Override
    public final void O() {
        this.f25642a.E1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        vi viVar = this.f25642a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if (m2Var instanceof gk) {
            ((gk) m2Var).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (m2Var instanceof org.telegram.ui.sn0) {
            org.telegram.ui.sn0 sn0Var = (org.telegram.ui.sn0) m2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            sn0Var.F1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        vi viVar = this.f25642a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).m(j10, arrayList, z10, i10);
        } else if (m2Var instanceof org.telegram.ui.sn0) {
            ((org.telegram.ui.sn0) m2Var).F1(arrayList);
        }
    }

    @Override
    public final void y() {
        vi viVar = this.f25642a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.y();
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if (m2Var instanceof gk) {
            ((gk) m2Var).y();
        } else if (m2Var instanceof org.telegram.ui.sn0) {
            org.telegram.ui.sn0 sn0Var = (org.telegram.ui.sn0) m2Var;
            sn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                sn0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
