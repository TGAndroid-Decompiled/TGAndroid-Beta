package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class hi implements ik {
    public final xi f27143a;

    public hi(xi xiVar) {
        this.f27143a = xiVar;
    }

    @Override
    public final void M() {
        this.f27143a.y1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        xi xiVar = this.f27143a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32813f0;
        if (n2Var instanceof ik) {
            ((ik) n2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (n2Var instanceof org.telegram.ui.kn0) {
            org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) n2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            kn0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        xi xiVar = this.f27143a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32813f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            ((org.telegram.ui.yn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.kn0) {
            ((org.telegram.ui.kn0) n2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        xi xiVar = this.f27143a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.w();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32813f0;
        if (n2Var instanceof ik) {
            ((ik) n2Var).w();
        } else if (n2Var instanceof org.telegram.ui.kn0) {
            org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) n2Var;
            kn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                kn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
