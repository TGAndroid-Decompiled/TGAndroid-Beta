package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class y40 implements org.telegram.ui.tp0 {
    public final c50 f32818a;

    public y40(c50 c50Var) {
        this.f32818a = c50Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        c50.a(this.f32818a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f32818a.f25185a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
