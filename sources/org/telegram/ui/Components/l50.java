package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class l50 implements org.telegram.ui.lq0 {
    public final p50 f28052a;

    public l50(p50 p50Var) {
        this.f28052a = p50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        p50.a(this.f28052a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f28052a.f29378a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
