package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class a40 implements org.telegram.ui.hp0 {
    public final e40 f26660a;

    public a40(e40 e40Var) {
        this.f26660a = e40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        e40.b(this.f26660a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f26660a.f27909a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
