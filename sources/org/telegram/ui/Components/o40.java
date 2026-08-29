package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class o40 implements org.telegram.ui.gp0 {
    public final s40 f31253a;

    public o40(s40 s40Var) {
        this.f31253a = s40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        s40.b(this.f31253a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f31253a.f32469a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
