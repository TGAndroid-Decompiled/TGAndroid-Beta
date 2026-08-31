package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class xh implements zj {
    public final mi f33082a;

    public xh(mi miVar) {
        this.f33082a = miVar;
    }

    @Override
    public final void O() {
        this.f33082a.B1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        mi miVar = this.f33082a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        if (p2Var instanceof zj) {
            ((zj) p2Var).l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
        } else if (p2Var instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) p2Var;
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
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        mi miVar = this.f33082a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.m(j10, arrayList, z4, i10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).m(j10, arrayList, z4, i10);
        } else if (p2Var instanceof org.telegram.ui.fn0) {
            ((org.telegram.ui.fn0) p2Var).G1(arrayList);
        }
    }

    @Override
    public final void x() {
        mi miVar = this.f33082a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.x();
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        if (p2Var instanceof zj) {
            ((zj) p2Var).x();
        } else if (p2Var instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) p2Var;
            fn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                fn0Var.startActivityForResult(intent, 21);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }
}
