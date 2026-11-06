package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class wg implements org.telegram.messenger.z10 {
    public final int f39964a;
    public final KeyEvent.Callback f39965b;

    public wg(KeyEvent.Callback callback, int i7) {
        this.f39964a = i7;
        this.f39965b = callback;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f39964a) {
            case 0:
                di diVar = (di) this.f39965b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                gh ghVar = diVar.f32979y2;
                ghVar.setText(charSequence);
                ghVar.w(charSequence.length(), charSequence.length());
                diVar.n1();
                return;
            case 1:
                di diVar2 = (di) this.f39965b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ih ihVar = diVar2.J2;
                ihVar.setText(charSequence2);
                ihVar.w(charSequence2.length(), charSequence2.length());
                diVar2.n1();
                return;
            default:
                uc ucVar = (uc) this.f39965b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                fi.g gVar = ucVar.f12365f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = ucVar.f12361c0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
        }
    }
}
