package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f38414a;
    public final KeyEvent.Callback f38415b;

    public tg(KeyEvent.Callback callback, int i7) {
        this.f38414a = i7;
        this.f38415b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38414a) {
            case 0:
                di diVar = (di) this.f38415b;
                r1.g gVar = diVar.f33016j4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) diVar.f28624b, (r1.e) r1.g.f54264p, 0.0f);
                diVar.f33016j4 = gVar2;
                gVar2.f54280m.a(1.5f);
                diVar.f33016j4.f54280m.b(1500.0f);
                diVar.f33016j4.h();
                return;
            default:
                ((View) this.f38415b).setTag(null);
                return;
        }
    }
}
