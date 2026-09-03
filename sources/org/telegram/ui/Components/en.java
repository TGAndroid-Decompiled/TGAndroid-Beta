package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class en implements zj {
    public final Utilities.Callback f26629a;
    public final an f26630b;
    public final org.telegram.ui.ActionBar.p2 f26631c;

    public en(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, an anVar) {
        this.f26629a = callback;
        this.f26630b = anVar;
        this.f26631c = p2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f26629a.run(new fh.c((String) arrayList.get(0)));
        }
        this.f26630b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (!arrayList.isEmpty()) {
            this.f26629a.run(new fh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f26630b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f26631c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void O() {
    }
}
