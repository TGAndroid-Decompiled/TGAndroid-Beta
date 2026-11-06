package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f38331a;
    public final KeyEvent.Callback f38332b;

    public tg(KeyEvent.Callback callback, int i7) {
        this.f38331a = i7;
        this.f38332b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38331a) {
            case 0:
                di diVar = (di) this.f38332b;
                r1.g gVar = diVar.f32924j4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) diVar.f28615b, (r1.e) r1.g.f54159p, 0.0f);
                diVar.f32924j4 = gVar2;
                gVar2.f54175m.a(1.5f);
                diVar.f32924j4.f54175m.b(1500.0f);
                diVar.f32924j4.h();
                return;
            default:
                ((View) this.f38332b).setTag(null);
                return;
        }
    }
}
