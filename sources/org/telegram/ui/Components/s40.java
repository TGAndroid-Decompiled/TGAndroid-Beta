package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class s40 implements org.telegram.ui.op0 {
    public final w40 f28626a;

    public s40(w40 w40Var) {
        this.f28626a = w40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        w40.b(this.f28626a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f28626a.f30190a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
