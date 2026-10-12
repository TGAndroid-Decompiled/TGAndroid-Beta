package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class e50 implements org.telegram.ui.pq0 {
    public final i50 f24616a;

    public e50(i50 i50Var) {
        this.f24616a = i50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        i50.a(this.f24616a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f24616a.f25829a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
