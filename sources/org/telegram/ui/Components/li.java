package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class li implements jk {
    public final yi f28421a;

    public li(yi yiVar) {
        this.f28421a = yiVar;
    }

    @Override
    public final void O() {
        this.f28421a.E1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        yi yiVar = this.f28421a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        if (m2Var instanceof jk) {
            ((jk) m2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (m2Var instanceof org.telegram.ui.mn0) {
            org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) m2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            mn0Var.F1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        yi yiVar = this.f28421a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) m2Var).l(j3, arrayList, z10, i10);
        } else if (m2Var instanceof org.telegram.ui.mn0) {
            ((org.telegram.ui.mn0) m2Var).F1(arrayList);
        }
    }

    @Override
    public final void x() {
        yi yiVar = this.f28421a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.x();
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        if (m2Var instanceof jk) {
            ((jk) m2Var).x();
        } else if (m2Var instanceof org.telegram.ui.mn0) {
            org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) m2Var;
            mn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                mn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
