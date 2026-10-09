package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class i50 implements org.telegram.ui.jq0 {
    public final m50 f27244a;

    public i50(m50 m50Var) {
        this.f27244a = m50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        m50.a(this.f27244a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f27244a.f28682a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
