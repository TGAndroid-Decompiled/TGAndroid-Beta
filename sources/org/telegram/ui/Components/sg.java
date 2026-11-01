package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class sg implements org.telegram.messenger.o20 {
    public final int f30283a;
    public final KeyEvent.Callback f30284b;

    public sg(KeyEvent.Callback callback, int i10) {
        this.f30283a = i10;
        this.f30284b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f30283a) {
            case 0:
                bi biVar = (bi) this.f30284b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                dh dhVar = biVar.f24836y2;
                dhVar.setText(charSequence);
                dhVar.w(charSequence.length(), charSequence.length());
                biVar.m1();
                return;
            case 1:
                bi biVar2 = (bi) this.f30284b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                fh fhVar = biVar2.J2;
                fhVar.setText(charSequence2);
                fhVar.w(charSequence2.length(), charSequence2.length());
                biVar2.m1();
                return;
            default:
                nc ncVar = (nc) this.f30284b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                vh.f fVar = ncVar.f51355f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                vh.e eVar = ncVar.f51352c0;
                org.telegram.messenger.i0.r(eVar);
                eVar.run();
                return;
        }
    }
}
