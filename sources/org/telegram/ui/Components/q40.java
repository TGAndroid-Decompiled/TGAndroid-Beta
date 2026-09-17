package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class q40 implements org.telegram.ui.kq0 {
    public final u40 f27208a;

    public q40(u40 u40Var) {
        this.f27208a = u40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        u40.b(this.f27208a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f27208a.f28272a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
