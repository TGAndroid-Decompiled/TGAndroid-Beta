package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ni implements lk {
    public final aj f28801a;

    public ni(aj ajVar) {
        this.f28801a = ajVar;
    }

    @Override
    public final void O() {
        this.f28801a.E1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        aj ajVar = this.f28801a;
        lk lkVar = ajVar.X;
        if (lkVar != null) {
            lkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        if (m2Var instanceof lk) {
            ((lk) m2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (m2Var instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) m2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            pn0Var.F1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        aj ajVar = this.f28801a;
        lk lkVar = ajVar.X;
        if (lkVar != null) {
            lkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) m2Var).l(j3, arrayList, z10, i10);
        } else if (m2Var instanceof org.telegram.ui.pn0) {
            ((org.telegram.ui.pn0) m2Var).F1(arrayList);
        }
    }

    @Override
    public final void x() {
        aj ajVar = this.f28801a;
        lk lkVar = ajVar.X;
        if (lkVar != null) {
            lkVar.x();
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        if (m2Var instanceof lk) {
            ((lk) m2Var).x();
        } else if (m2Var instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) m2Var;
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
