package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class dn implements xj {
    public final Utilities.Callback f24304a;
    public final zm f24305b;
    public final org.telegram.ui.ActionBar.p2 f24306c;

    public dn(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, zm zmVar) {
        this.f24304a = callback;
        this.f24305b = zmVar;
        this.f24306c = p2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f24304a.run(new eh.c((String) arrayList.get(0)));
        }
        this.f24305b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (!arrayList.isEmpty()) {
            this.f24304a.run(new eh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f24305b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f24306c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }
}
