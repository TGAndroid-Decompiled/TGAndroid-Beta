package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class tg implements org.telegram.messenger.r10 {
    public final int f38407a;
    public final KeyEvent.Callback f38408b;

    public tg(KeyEvent.Callback callback, int i3) {
        this.f38407a = i3;
        this.f38408b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f38407a) {
            case 0:
                bi biVar = (bi) this.f38408b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                dh dhVar = biVar.f32299z2;
                dhVar.setText(charSequence);
                dhVar.w(charSequence.length(), charSequence.length());
                biVar.n1();
                return;
            case 1:
                bi biVar2 = (bi) this.f38408b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                fh fhVar = biVar2.K2;
                fhVar.setText(charSequence2);
                fhVar.w(charSequence2.length(), charSequence2.length());
                biVar2.n1();
                return;
            default:
                sc scVar = (sc) this.f38408b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                gi.g gVar = scVar.f13144f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                gi.e eVar = scVar.f13141d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
