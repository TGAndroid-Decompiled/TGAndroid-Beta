package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f38340a;
    public final KeyEvent.Callback f38341b;

    public tg(KeyEvent.Callback callback, int i7) {
        this.f38340a = i7;
        this.f38341b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38340a) {
            case 0:
                di diVar = (di) this.f38341b;
                r1.g gVar = diVar.f32911j4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) diVar.f28615b, (r1.e) r1.g.f54134p, 0.0f);
                diVar.f32911j4 = gVar2;
                gVar2.f54150m.a(1.5f);
                diVar.f32911j4.f54150m.b(1500.0f);
                diVar.f32911j4.h();
                return;
            default:
                ((View) this.f38341b).setTag(null);
                return;
        }
    }
}
