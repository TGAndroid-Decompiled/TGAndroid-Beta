package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class mn implements kk {
    public final Utilities.Callback f25255a;
    public final in f25256b;
    public final org.telegram.ui.ActionBar.p2 f25257c;

    public mn(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, in inVar) {
        this.f25255a = callback;
        this.f25256b = inVar;
        this.f25257c = p2Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f25255a.run(new qh.c((String) arrayList.get(0)));
        }
        this.f25256b.dismiss(true);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f25255a.run(new qh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f25256b.dismiss(true);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f25257c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }
}
