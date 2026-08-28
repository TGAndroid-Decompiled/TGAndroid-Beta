package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class wm implements wj {
    public final Utilities.Callback f34290a;
    public final sm f34291b;
    public final org.telegram.ui.ActionBar.o2 f34292c;

    public wm(Utilities.Callback callback, org.telegram.ui.ActionBar.o2 o2Var, sm smVar) {
        this.f34290a = callback;
        this.f34291b = smVar;
        this.f34292c = o2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f34290a.run(new zg.c((String) arrayList.get(0)));
        }
        this.f34291b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
        if (!arrayList.isEmpty()) {
            this.f34290a.run(new zg.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f34291b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f34292c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void N() {
    }
}
