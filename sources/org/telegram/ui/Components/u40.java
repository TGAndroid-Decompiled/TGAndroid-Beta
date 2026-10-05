package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class u40 implements org.telegram.ui.eq0 {
    public final y40 f31336a;

    public u40(y40 y40Var) {
        this.f31336a = y40Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        y40.b(this.f31336a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f31336a.f33170a.startActivityForResult(intent, 14);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
