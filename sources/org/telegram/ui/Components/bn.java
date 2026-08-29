package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class bn implements zj {
    public final Utilities.Callback f27185a;
    public final xm f27186b;
    public final org.telegram.ui.ActionBar.o2 f27187c;

    public bn(Utilities.Callback callback, org.telegram.ui.ActionBar.o2 o2Var, xm xmVar) {
        this.f27185a = callback;
        this.f27186b = xmVar;
        this.f27187c = o2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f27185a.run(new ch.c((String) arrayList.get(0)));
        }
        this.f27186b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f27185a.run(new ch.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f27186b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f27187c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void O() {
    }
}
