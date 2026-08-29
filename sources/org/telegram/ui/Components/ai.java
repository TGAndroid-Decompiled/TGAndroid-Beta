package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ai implements zj {
    public final ni f26773a;

    public ai(ni niVar) {
        this.f26773a = niVar;
    }

    @Override
    public final void O() {
        this.f26773a.B1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ni niVar = this.f26773a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if (o2Var instanceof zj) {
            ((zj) o2Var).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (o2Var instanceof org.telegram.ui.vm0) {
            org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) o2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            vm0Var.G1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ni niVar = this.f26773a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) o2Var).m(j10, arrayList, z10, i10);
        } else if (o2Var instanceof org.telegram.ui.vm0) {
            ((org.telegram.ui.vm0) o2Var).G1(arrayList);
        }
    }

    @Override
    public final void x() {
        ni niVar = this.f26773a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.x();
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if (o2Var instanceof zj) {
            ((zj) o2Var).x();
        } else if (o2Var instanceof org.telegram.ui.vm0) {
            org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) o2Var;
            vm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                vm0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
