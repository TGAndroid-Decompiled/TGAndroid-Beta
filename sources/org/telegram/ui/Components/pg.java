package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f29355a;
    public final KeyEvent.Callback f29356b;

    public pg(KeyEvent.Callback callback, int i10) {
        this.f29355a = i10;
        this.f29356b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29355a) {
            case 0:
                bi biVar = (bi) this.f29356b;
                o1.j jVar = biVar.f24689j4;
                if (jVar != null) {
                    jVar.d();
                }
                o1.j jVar2 = new o1.j((Object) biVar.f21586b, (o1.h) o1.j.f13942p, 0.0f);
                biVar.f24689j4 = jVar2;
                jVar2.f13957m.a(1.5f);
                biVar.f24689j4.f13957m.b(1500.0f);
                biVar.f24689j4.h();
                return;
            default:
                ((View) this.f29356b).setTag(null);
                return;
        }
    }
}
