package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class q40 implements org.telegram.ui.jq0 {
    public final u40 f29594a;

    public q40(u40 u40Var) {
        this.f29594a = u40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        u40.b(this.f29594a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f29594a.f30827a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
