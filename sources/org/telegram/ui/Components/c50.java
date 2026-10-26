package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class c50 implements org.telegram.ui.zp0 {
    public final g50 f27075a;

    public c50(g50 g50Var) {
        this.f27075a = g50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        g50.a(this.f27075a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f27075a.f28421a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
