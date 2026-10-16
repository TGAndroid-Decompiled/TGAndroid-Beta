package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class tn implements gk {
    public final Utilities.Callback f29169a;
    public final pn f29170b;
    public final org.telegram.ui.ActionBar.m2 f29171c;

    public tn(Utilities.Callback callback, org.telegram.ui.ActionBar.m2 m2Var, pn pnVar) {
        this.f29169a = callback;
        this.f29170b = pnVar;
        this.f29171c = m2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f29169a.run(new sh.c((String) arrayList.get(0)));
        }
        this.f29170b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f29169a.run(new sh.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f29170b.dismiss(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f29171c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }
}
