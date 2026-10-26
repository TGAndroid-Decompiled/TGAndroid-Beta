package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class rn implements ek {
    public final Utilities.Callback f32272a;
    public final nn f32273b;
    public final org.telegram.ui.ActionBar.r2 f32274c;

    public rn(Utilities.Callback callback, org.telegram.ui.ActionBar.r2 r2Var, nn nnVar) {
        this.f32272a = callback;
        this.f32273b = nnVar;
        this.f32274c = r2Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f32272a.run(new th.c((String) arrayList.get(0)));
        }
        this.f32273b.dismiss(true);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        if (!arrayList.isEmpty()) {
            this.f32272a.run(new th.d((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
        }
        this.f32273b.dismiss(true);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f32274c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void P() {
    }
}
