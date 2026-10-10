package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class li implements jk {
    public final yi f28345a;

    public li(yi yiVar) {
        this.f28345a = yiVar;
    }

    @Override
    public final void O() {
        this.f28345a.E1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        yi yiVar = this.f28345a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
        if (n2Var instanceof jk) {
            ((jk) n2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (n2Var instanceof org.telegram.ui.nn0) {
            org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) n2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            nn0Var.F1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        yi yiVar = this.f28345a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.nn0) {
            ((org.telegram.ui.nn0) n2Var).F1(arrayList);
        }
    }

    @Override
    public final void x() {
        yi yiVar = this.f28345a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.x();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
        if (n2Var instanceof jk) {
            ((jk) n2Var).x();
        } else if (n2Var instanceof org.telegram.ui.nn0) {
            org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) n2Var;
            nn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                nn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
