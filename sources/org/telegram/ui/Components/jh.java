package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f36499a;
    public final KeyEvent.Callback f36500b;

    public jh(KeyEvent.Callback callback, int i7) {
        this.f36499a = i7;
        this.f36500b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36499a) {
            case 0:
                ui uiVar = (ui) this.f36500b;
                r1.g gVar = uiVar.f40407n4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) uiVar.f30176b, (r1.e) r1.g.f56352p, 0.0f);
                uiVar.f40407n4 = gVar2;
                gVar2.f56368m.a(1.5f);
                uiVar.f40407n4.f56368m.b(1500.0f);
                uiVar.f40407n4.h();
                return;
            default:
                ((View) this.f36500b).setTag(null);
                return;
        }
    }
}
