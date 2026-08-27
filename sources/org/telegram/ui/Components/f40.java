package org.telegram.ui.Components;

import android.content.Intent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

public final class f40 implements org.telegram.ui.ip0 {

    public final j40 f28251a;

    public f40(j40 j40Var) {
        this.f28251a = j40Var;
    }

    @Override
    public final void a(ArrayList arrayList) throws FileNotFoundException {
        j40.b(this.f28251a, false, arrayList);
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f28251a.f29569a.startActivityForResult(intent, 14);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
