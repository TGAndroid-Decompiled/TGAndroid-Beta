package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class q40 implements org.telegram.ui.jq0 {
    public final u40 f29567a;

    public q40(u40 u40Var) {
        this.f29567a = u40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        u40.b(this.f29567a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f29567a.f30800a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
