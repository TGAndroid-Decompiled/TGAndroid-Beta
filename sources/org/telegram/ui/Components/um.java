package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

public final class um implements sj {

    public final Utilities.Callback f33123a;

    public final qm f33124b;

    public final org.telegram.ui.ActionBar.n2 f33125c;

    public um(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, qm qmVar) {
        this.f33123a = callback;
        this.f33124b = qmVar;
        this.f33125c = n2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f33123a.run(new ah.c((String) arrayList.get(0)));
        }
        this.f33124b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f33123a.run(new ah.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f33124b.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f33125c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void O() {
    }
}
