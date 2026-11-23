package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f36009a;
    public final KeyEvent.Callback f36010b;

    public ih(KeyEvent.Callback callback, int i7) {
        this.f36009a = i7;
        this.f36010b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36009a) {
            case 0:
                ti tiVar = (ti) this.f36010b;
                r1.g gVar = tiVar.f39996n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) tiVar.f30226b, (r1.e) r1.g.f56430p, 0.0f);
                tiVar.f39996n4 = gVar2;
                gVar2.f56446m.a(1.5f);
                tiVar.f39996n4.f56446m.b(1500.0f);
                tiVar.f39996n4.h();
                return;
            default:
                ((View) this.f36010b).setTag(null);
                return;
        }
    }
}
