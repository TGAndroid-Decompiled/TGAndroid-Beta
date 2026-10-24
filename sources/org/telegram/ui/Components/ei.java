package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
public final class ei implements ck {
    public final ri f26050a;

    public ei(ri riVar) {
        this.f26050a = riVar;
    }

    @Override
    public final void O() {
        this.f26050a.H1(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ri riVar = this.f26050a;
        ck ckVar = riVar.X;
        if (ckVar != null) {
            ckVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        if (o2Var instanceof ck) {
            ((ck) o2Var).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
        } else if (o2Var instanceof org.telegram.ui.zm0) {
            org.telegram.ui.zm0 zm0Var = (org.telegram.ui.zm0) o2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            zm0Var.F1(arrayList4);
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ri riVar = this.f26050a;
        ck ckVar = riVar.X;
        if (ckVar != null) {
            ckVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            ((org.telegram.ui.sn) o2Var).m(j10, arrayList, z10, i10);
        } else if (o2Var instanceof org.telegram.ui.zm0) {
            ((org.telegram.ui.zm0) o2Var).F1(arrayList);
        }
    }

    @Override
    public final void y() {
        ri riVar = this.f26050a;
        ck ckVar = riVar.X;
        if (ckVar != null) {
            ckVar.y();
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        if (o2Var instanceof ck) {
            ((ck) o2Var).y();
        } else if (o2Var instanceof org.telegram.ui.zm0) {
            org.telegram.ui.zm0 zm0Var = (org.telegram.ui.zm0) o2Var;
            zm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                zm0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
