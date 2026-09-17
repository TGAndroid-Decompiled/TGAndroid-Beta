package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class fn implements fk {
    public final Utilities.Callback f26133a;
    public final bn f26134b;
    public final org.telegram.ui.ActionBar.n2 f26135c;

    public fn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, bn bnVar) {
        this.f26133a = callback;
        this.f26134b = bnVar;
        this.f26135c = n2Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f26133a.run(new sh.c((String) arrayList.get(0)));
        }
        this.f26134b.dismiss(true);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f26133a.run(new sh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f26134b.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f26135c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void O() {
    }
}
