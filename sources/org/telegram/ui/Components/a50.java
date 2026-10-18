package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class a50 implements org.telegram.ui.tp0 {
    public final e50 f24498a;

    public a50(e50 e50Var) {
        this.f24498a = e50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        e50.a(this.f24498a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f24498a.f25805a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
