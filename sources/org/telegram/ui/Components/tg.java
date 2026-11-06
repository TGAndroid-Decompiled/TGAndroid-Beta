package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class tg implements DialogInterface.OnCancelListener {
    public final int f38320a;
    public final KeyEvent.Callback f38321b;

    public tg(KeyEvent.Callback callback, int i7) {
        this.f38320a = i7;
        this.f38321b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38320a) {
            case 0:
                di diVar = (di) this.f38321b;
                r1.g gVar = diVar.f32953j4;
                if (gVar != null) {
                    gVar.d();
                }
                r1.g gVar2 = new r1.g((Object) diVar.f28616b, (r1.e) r1.g.f54158p, 0.0f);
                diVar.f32953j4 = gVar2;
                gVar2.f54174m.a(1.5f);
                diVar.f32953j4.f54174m.b(1500.0f);
                diVar.f32953j4.h();
                return;
            default:
                ((View) this.f38321b).setTag(null);
                return;
        }
    }
}
