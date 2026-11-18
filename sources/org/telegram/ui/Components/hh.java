package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f35869a;
    public final KeyEvent.Callback f35870b;

    public hh(KeyEvent.Callback callback, int i7) {
        this.f35869a = i7;
        this.f35870b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35869a) {
            case 0:
                si siVar = (si) this.f35870b;
                r1.g gVar = siVar.f39699n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) siVar.f30190b, (r1.e) r1.g.f56307p, 0.0f);
                siVar.f39699n4 = gVar2;
                gVar2.f56323m.a(1.5f);
                siVar.f39699n4.f56323m.b(1500.0f);
                siVar.f39699n4.h();
                return;
            default:
                ((View) this.f35870b).setTag(null);
                return;
        }
    }
}
