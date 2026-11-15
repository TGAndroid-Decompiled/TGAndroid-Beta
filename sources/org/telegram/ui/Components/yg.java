package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class yg implements DialogInterface.OnCancelListener {
    public final int f41995a;
    public final KeyEvent.Callback f41996b;

    public yg(KeyEvent.Callback callback, int i7) {
        this.f41995a = i7;
        this.f41996b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f41995a) {
            case 0:
                ki kiVar = (ki) this.f41996b;
                r1.g gVar = kiVar.f36464n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) kiVar.f29682b, (r1.e) r1.g.f55732p, 0.0f);
                kiVar.f36464n4 = gVar2;
                gVar2.f55748m.a(1.5f);
                kiVar.f36464n4.f55748m.b(1500.0f);
                kiVar.f36464n4.h();
                return;
            default:
                ((View) this.f41996b).setTag(null);
                return;
        }
    }
}
