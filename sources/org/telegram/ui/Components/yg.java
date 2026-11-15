package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class yg implements DialogInterface.OnCancelListener {
    public final int f41993a;
    public final KeyEvent.Callback f41994b;

    public yg(KeyEvent.Callback callback, int i7) {
        this.f41993a = i7;
        this.f41994b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41993a) {
            case 0:
                ki kiVar = (ki) this.f41994b;
                r1.g gVar = kiVar.f36476n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) kiVar.f29682b, (r1.e) r1.g.f55732p, 0.0f);
                kiVar.f36476n4 = gVar2;
                gVar2.f55748m.a(1.5f);
                kiVar.f36476n4.f55748m.b(1500.0f);
                kiVar.f36476n4.h();
                return;
            default:
                ((View) this.f41994b).setTag(null);
                return;
        }
    }
}
