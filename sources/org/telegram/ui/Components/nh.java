package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class nh implements mj {
    public final di f36348a;

    public nh(di diVar) {
        this.f36348a = diVar;
    }

    @Override
    public final void A() {
        di diVar = this.f36348a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.A();
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var instanceof mj) {
            ((mj) f2Var).A();
        } else if (f2Var instanceof org.telegram.ui.bk0) {
            org.telegram.ui.bk0 bk0Var = (org.telegram.ui.bk0) f2Var;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                bk0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void S() {
        this.f36348a.p1(true);
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        di diVar = this.f36348a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var instanceof mj) {
            ((mj) f2Var).n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
        } else if (f2Var instanceof org.telegram.ui.bk0) {
            org.telegram.ui.bk0 bk0Var = (org.telegram.ui.bk0) f2Var;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ?? obj = new Object();
                obj.f22512c = (String) arrayList.get(i10);
                arrayList4.add(obj);
            }
            bk0Var.K1(arrayList4);
        }
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        di diVar = this.f36348a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.p(arrayList, z9, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) f2Var).p(arrayList, z9, i7, j3);
        } else if (f2Var instanceof org.telegram.ui.bk0) {
            ((org.telegram.ui.bk0) f2Var).K1(arrayList);
        }
    }
}
