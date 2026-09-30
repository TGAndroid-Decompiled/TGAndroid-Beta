package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class jn implements ik {
    public final Utilities.Callback f25519a;
    public final fn f25520b;
    public final org.telegram.ui.ActionBar.m2 f25521c;

    public jn(Utilities.Callback callback, org.telegram.ui.ActionBar.m2 m2Var, fn fnVar) {
        this.f25519a = callback;
        this.f25520b = fnVar;
        this.f25521c = m2Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f25519a.run(new rh.c((String) arrayList.get(0)));
        }
        this.f25520b.dismiss(true);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f25519a.run(new rh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f25520b.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f25521c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }
}
