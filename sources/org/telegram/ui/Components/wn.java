package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class wn implements jk {
    public final Utilities.Callback f32642a;
    public final sn f32643b;
    public final org.telegram.ui.ActionBar.n2 f32644c;

    public wn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, sn snVar) {
        this.f32642a = callback;
        this.f32643b = snVar;
        this.f32644c = n2Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f32642a.run(new rh.c((String) arrayList.get(0)));
        }
        this.f32643b.dismiss(true);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f32642a.run(new rh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f32643b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f32644c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void O() {
    }
}
