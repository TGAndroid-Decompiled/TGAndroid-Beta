package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class fn implements zj {
    public final Utilities.Callback f26960a;
    public final bn f26961b;
    public final org.telegram.ui.ActionBar.p2 f26962c;

    public fn(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, bn bnVar) {
        this.f26960a = callback;
        this.f26961b = bnVar;
        this.f26962c = p2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f26960a.run(new fh.c((String) arrayList.get(0)));
        }
        this.f26961b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (!arrayList.isEmpty()) {
            this.f26960a.run(new fh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f26961b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f26962c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void O() {
    }
}
