package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
public final class xm implements nj {
    public final org.telegram.messenger.r20 f32602a;
    public final ag.v f32603b;
    public final org.telegram.ui.ActionBar.k2 f32604c;

    public xm(ag.v vVar, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f32602a = r20Var;
        this.f32603b = vVar;
        this.f32604c = k2Var;
    }

    @Override
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f32604c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f32602a.a(new jh.c((String) arrayList.get(0)));
        }
        this.f32603b.a(true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f32602a.a(new jh.d((org.telegram.messenger.qz) arrayList.get(0)));
        }
        this.f32603b.a(true);
    }

    @Override
    public final void T() {
    }
}
