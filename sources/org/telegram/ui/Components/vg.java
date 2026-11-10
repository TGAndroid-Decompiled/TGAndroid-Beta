package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class vg implements org.telegram.messenger.z10 {
    public final int f39001a;
    public final KeyEvent.Callback f39002b;

    public vg(KeyEvent.Callback callback, int i7) {
        this.f39001a = i7;
        this.f39002b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f39001a) {
            case 0:
                ci ciVar = (ci) this.f39002b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                fh fhVar = ciVar.B2;
                fhVar.setText(charSequence);
                fhVar.w(charSequence.length(), charSequence.length());
                ciVar.n1();
                return;
            case 1:
                ci ciVar2 = (ci) this.f39002b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                hh hhVar = ciVar2.M2;
                hhVar.setText(charSequence2);
                hhVar.w(charSequence2.length(), charSequence2.length());
                ciVar2.n1();
                return;
            default:
                tc tcVar = (tc) this.f39002b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                fi.g gVar = tcVar.f12367f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = tcVar.f12363c0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
