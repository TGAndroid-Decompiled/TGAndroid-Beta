package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class bh implements org.telegram.messenger.w10 {
    public final int f33277a;
    public final KeyEvent.Callback f33278b;

    public bh(KeyEvent.Callback callback, int i7) {
        this.f33277a = i7;
        this.f33278b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f33277a) {
            case 0:
                ki kiVar = (ki) this.f33278b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                nh nhVar = kiVar.C2;
                nhVar.setText(charSequence);
                nhVar.w(charSequence.length(), charSequence.length());
                kiVar.n1();
                return;
            case 1:
                ki kiVar2 = (ki) this.f33278b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ph phVar = kiVar2.N2;
                phVar.setText(charSequence2);
                phVar.w(charSequence2.length(), charSequence2.length());
                kiVar2.n1();
                return;
            default:
                pc pcVar = (pc) this.f33278b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                hi.g gVar = pcVar.f14623f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                hi.e eVar = pcVar.f14620d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
