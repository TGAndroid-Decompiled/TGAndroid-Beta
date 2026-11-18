package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class kh implements org.telegram.messenger.u10 {
    public final int f36761a;
    public final KeyEvent.Callback f36762b;

    public kh(KeyEvent.Callback callback, int i7) {
        this.f36761a = i7;
        this.f36762b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f36761a) {
            case 0:
                si siVar = (si) this.f36762b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                vh vhVar = siVar.C2;
                vhVar.setText(charSequence);
                vhVar.w(charSequence.length(), charSequence.length());
                siVar.o1();
                return;
            case 1:
                si siVar2 = (si) this.f36762b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                xh xhVar = siVar2.N2;
                xhVar.setText(charSequence2);
                xhVar.w(charSequence2.length(), charSequence2.length());
                siVar2.o1();
                return;
            default:
                yc ycVar = (yc) this.f36762b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                hi.g gVar = ycVar.f15051f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                hi.e eVar = ycVar.f15048d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
