package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f36505a;
    public final KeyEvent.Callback f36506b;

    public jh(KeyEvent.Callback callback, int i7) {
        this.f36505a = i7;
        this.f36506b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36505a) {
            case 0:
                ui uiVar = (ui) this.f36506b;
                r1.g gVar = uiVar.f40415n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) uiVar.f30173b, (r1.e) r1.g.f56348p, 0.0f);
                uiVar.f40415n4 = gVar2;
                gVar2.f56364m.a(1.5f);
                uiVar.f40415n4.f56364m.b(1500.0f);
                uiVar.f40415n4.h();
                return;
            default:
                ((View) this.f36506b).setTag(null);
                return;
        }
    }
}
