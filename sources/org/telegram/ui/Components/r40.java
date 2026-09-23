package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class r40 implements org.telegram.ui.cq0 {
    public final v40 f27551a;

    public r40(v40 v40Var) {
        this.f27551a = v40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        v40.b(this.f27551a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f27551a.f28645a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
