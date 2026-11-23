package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class lh implements org.telegram.messenger.t10 {
    public final int f37130a;
    public final KeyEvent.Callback f37131b;

    public lh(KeyEvent.Callback callback, int i7) {
        this.f37130a = i7;
        this.f37131b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f37130a) {
            case 0:
                ti tiVar = (ti) this.f37131b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                wh whVar = tiVar.C2;
                whVar.setText(charSequence);
                whVar.w(charSequence.length(), charSequence.length());
                tiVar.o1();
                return;
            case 1:
                ti tiVar2 = (ti) this.f37131b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                yh yhVar = tiVar2.N2;
                yhVar.setText(charSequence2);
                yhVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.o1();
                return;
            default:
                yc ycVar = (yc) this.f37131b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                hi.h hVar = ycVar.f14936f;
                hVar.setText((CharSequence) obj);
                hVar.d();
                hVar.k(true);
                hi.f fVar = ycVar.f14933d0;
                org.telegram.messenger.g0.r(fVar);
                fVar.run();
                return;
        }
    }
}
