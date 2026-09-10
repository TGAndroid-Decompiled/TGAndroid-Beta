package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class li implements kk {
    public final yi f24994a;

    public li(yi yiVar) {
        this.f24994a = yiVar;
    }

    @Override
    public final void O() {
        this.f24994a.B1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        yi yiVar = this.f24994a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if (p2Var instanceof kk) {
            ((kk) p2Var).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
        } else if (p2Var instanceof org.telegram.ui.on0) {
            org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) p2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            on0Var.G1(arrayList4);
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        yi yiVar = this.f24994a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).l(j3, arrayList, z10, i10);
        } else if (p2Var instanceof org.telegram.ui.on0) {
            ((org.telegram.ui.on0) p2Var).G1(arrayList);
        }
    }

    @Override
    public final void w() {
        yi yiVar = this.f24994a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.w();
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if (p2Var instanceof kk) {
            ((kk) p2Var).w();
        } else if (p2Var instanceof org.telegram.ui.on0) {
            org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) p2Var;
            on0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                on0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
