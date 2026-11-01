package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f29420a;
    public final KeyEvent.Callback f29421b;

    public pg(KeyEvent.Callback callback, int i10) {
        this.f29420a = i10;
        this.f29421b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29420a) {
            case 0:
                bi biVar = (bi) this.f29421b;
                o1.j jVar = biVar.f24780j4;
                if (jVar != null) {
                    jVar.d();
                }
                o1.j jVar2 = new o1.j((Object) biVar.f21587b, (o1.h) o1.j.f13943p, 0.0f);
                biVar.f24780j4 = jVar2;
                jVar2.f13958m.a(1.5f);
                biVar.f24780j4.f13958m.b(1500.0f);
                biVar.f24780j4.h();
                return;
            default:
                ((View) this.f29421b).setTag(null);
                return;
        }
    }
}
