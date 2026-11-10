package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class sg implements DialogInterface.OnCancelListener {
    public final int f37988a;
    public final KeyEvent.Callback f37989b;

    public sg(KeyEvent.Callback callback, int i7) {
        this.f37988a = i7;
        this.f37989b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37988a) {
            case 0:
                ci ciVar = (ci) this.f37989b;
                r1.g gVar = ciVar.f32628m4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) ciVar.f28672b, (r1.e) r1.g.f54263p, 0.0f);
                ciVar.f32628m4 = gVar2;
                gVar2.f54279m.a(1.5f);
                ciVar.f32628m4.f54279m.b(1500.0f);
                ciVar.f32628m4.h();
                return;
            default:
                ((View) this.f37989b).setTag(null);
                return;
        }
    }
}
