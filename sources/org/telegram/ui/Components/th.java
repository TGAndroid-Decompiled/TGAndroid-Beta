package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

public final class th implements sj {

    public final gi f32781a;

    public th(gi giVar) {
        this.f32781a = giVar;
    }

    @Override
    public final void O() {
        this.f32781a.B1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        gi giVar = this.f32781a;
        sj sjVar = giVar.T;
        if (sjVar != null) {
            sjVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = giVar.f28635b0;
        if (obj instanceof sj) {
            ((sj) obj).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.xm0) {
            org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            xm0Var.G1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        gi giVar = this.f32781a;
        sj sjVar = giVar.T;
        if (sjVar != null) {
            sjVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) n2Var).m(j10, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.xm0) {
            ((org.telegram.ui.xm0) n2Var).G1(arrayList);
        }
    }

    @Override
    public final void y() {
        gi giVar = this.f32781a;
        sj sjVar = giVar.T;
        if (sjVar != null) {
            sjVar.y();
            return;
        }
        Object obj = giVar.f28635b0;
        if (obj instanceof sj) {
            ((sj) obj).y();
            return;
        }
        if (obj instanceof org.telegram.ui.xm0) {
            org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) obj;
            xm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                xm0Var.startActivityForResult(intent, 21);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }
}
