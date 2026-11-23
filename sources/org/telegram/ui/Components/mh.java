package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class mh implements org.telegram.messenger.v10 {
    public final int f37472a;
    public final KeyEvent.Callback f37473b;

    public mh(KeyEvent.Callback callback, int i7) {
        this.f37472a = i7;
        this.f37473b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f37472a) {
            case 0:
                ui uiVar = (ui) this.f37473b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                xh xhVar = uiVar.C2;
                xhVar.setText(charSequence);
                xhVar.w(charSequence.length(), charSequence.length());
                uiVar.o1();
                return;
            case 1:
                ui uiVar2 = (ui) this.f37473b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                zh zhVar = uiVar2.N2;
                zhVar.setText(charSequence2);
                zhVar.w(charSequence2.length(), charSequence2.length());
                uiVar2.o1();
                return;
            default:
                yc ycVar = (yc) this.f37473b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                hi.g gVar = ycVar.f14971f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                hi.e eVar = ycVar.f14968d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
