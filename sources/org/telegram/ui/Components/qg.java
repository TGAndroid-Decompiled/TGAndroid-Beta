package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class qg implements DialogInterface.OnCancelListener {
    public final int f37456a;
    public final KeyEvent.Callback f37457b;

    public qg(KeyEvent.Callback callback, int i3) {
        this.f37456a = i3;
        this.f37457b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37456a) {
            case 0:
                bi biVar = (bi) this.f37457b;
                q1.g gVar = biVar.f32243k4;
                if (gVar != null) {
                    gVar.d();
                }
                q1.g gVar2 = new q1.g((Object) biVar.f28586b, (q1.e) q1.g.f53637p, 0.0f);
                biVar.f32243k4 = gVar2;
                gVar2.f53653m.a(1.5f);
                biVar.f32243k4.f53653m.b(1500.0f);
                biVar.f32243k4.h();
                return;
            default:
                ((View) this.f37457b).setTag(null);
                return;
        }
    }
}
