package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ki implements ik {
    public final xi f25775a;

    public ki(xi xiVar) {
        this.f25775a = xiVar;
    }

    @Override
    public final void O() {
        this.f25775a.B1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        xi xiVar = this.f25775a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        if (m2Var instanceof ik) {
            ((ik) m2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (m2Var instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) m2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            fn0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        xi xiVar = this.f25775a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) m2Var).l(j3, arrayList, z10, i10);
        } else if (m2Var instanceof org.telegram.ui.fn0) {
            ((org.telegram.ui.fn0) m2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        xi xiVar = this.f25775a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.w();
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        if (m2Var instanceof ik) {
            ((ik) m2Var).w();
        } else if (m2Var instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) m2Var;
            fn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                fn0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
