package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f36458a;
    public final KeyEvent.Callback f36459b;

    public jh(KeyEvent.Callback callback, int i7) {
        this.f36458a = i7;
        this.f36459b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36458a) {
            case 0:
                ui uiVar = (ui) this.f36459b;
                r1.g gVar = uiVar.f40392n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) uiVar.f30142b, (r1.e) r1.g.f56317p, 0.0f);
                uiVar.f40392n4 = gVar2;
                gVar2.f56333m.a(1.5f);
                uiVar.f40392n4.f56333m.b(1500.0f);
                uiVar.f40392n4.h();
                return;
            default:
                ((View) this.f36459b).setTag(null);
                return;
        }
    }
}
