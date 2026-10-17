package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class gi implements ek {
    public final ti f26568a;

    public gi(ti tiVar) {
        this.f26568a = tiVar;
    }

    @Override
    public final void O() {
        this.f26568a.E1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ti tiVar = this.f26568a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
        if (n2Var instanceof ek) {
            ((ek) n2Var).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (n2Var instanceof org.telegram.ui.xm0) {
            org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) n2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            xm0Var.F1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ti tiVar = this.f26568a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            ((org.telegram.ui.sn) n2Var).m(j10, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.xm0) {
            ((org.telegram.ui.xm0) n2Var).F1(arrayList);
        }
    }

    @Override
    public final void y() {
        ti tiVar = this.f26568a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.y();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
        if (n2Var instanceof ek) {
            ((ek) n2Var).y();
        } else if (n2Var instanceof org.telegram.ui.xm0) {
            org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) n2Var;
            xm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                xm0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
