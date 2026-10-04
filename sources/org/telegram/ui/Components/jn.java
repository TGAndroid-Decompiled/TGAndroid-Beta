package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class jn implements ik {
    public final Utilities.Callback f27863a;
    public final fn f27864b;
    public final org.telegram.ui.ActionBar.n2 f27865c;

    public jn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, fn fnVar) {
        this.f27863a = callback;
        this.f27864b = fnVar;
        this.f27865c = n2Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f27863a.run(new rh.c((String) arrayList.get(0)));
        }
        this.f27864b.dismiss(true);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f27863a.run(new rh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f27864b.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f27865c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void M() {
    }
}
