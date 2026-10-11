package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class j50 implements org.telegram.ui.iq0 {
    public final n50 f27569a;

    public j50(n50 n50Var) {
        this.f27569a = n50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        n50.a(this.f27569a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f27569a.f28948a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
