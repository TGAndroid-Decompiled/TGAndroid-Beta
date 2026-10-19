package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class a50 implements org.telegram.ui.rp0 {
    public final e50 f24500a;

    public a50(e50 e50Var) {
        this.f24500a = e50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        e50.a(this.f24500a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f24500a.f25777a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
