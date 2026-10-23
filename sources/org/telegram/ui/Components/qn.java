package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class qn implements ek {
    public final Utilities.Callback f29683a;
    public final mn f29684b;
    public final org.telegram.ui.ActionBar.n2 f29685c;

    public qn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, mn mnVar) {
        this.f29683a = callback;
        this.f29684b = mnVar;
        this.f29685c = n2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f29683a.run(new sh.c((String) arrayList.get(0)));
        }
        this.f29684b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f29683a.run(new sh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f29684b.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f29685c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }
}
