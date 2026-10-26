package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class di implements ek {
    public final ti f27528a;

    public di(ti tiVar) {
        this.f27528a = tiVar;
    }

    @Override
    public final void P() {
        this.f27528a.G1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ti tiVar = this.f27528a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        if (r2Var instanceof ek) {
            ((ek) r2Var).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (r2Var instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) r2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            in0Var.G1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ti tiVar = this.f27528a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        if (r2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) r2Var).m(j10, arrayList, z10, i10);
        } else if (r2Var instanceof org.telegram.ui.in0) {
            ((org.telegram.ui.in0) r2Var).G1(arrayList);
        }
    }

    @Override
    public final void x() {
        ti tiVar = this.f27528a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.x();
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        if (r2Var instanceof ek) {
            ((ek) r2Var).x();
        } else if (r2Var instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) r2Var;
            in0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                in0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
