package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class t40 implements org.telegram.ui.vp0 {
    public final x40 f28895a;

    public t40(x40 x40Var) {
        this.f28895a = x40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        x40.b(this.f28895a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f28895a.f30466a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
