package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mh implements Utilities.Callback4 {
    public final int f28520a;
    public final KeyEvent.Callback f28521b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f28520a = i10;
        this.f28521b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f28520a) {
            case 0:
                ti tiVar = (ti) this.f28521b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                zh zhVar = tiVar.H0;
                zhVar.setText(charSequence);
                zhVar.w(charSequence.length(), charSequence.length());
                tiVar.C1();
                return;
            case 1:
                ti tiVar2 = (ti) this.f28521b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ci ciVar = tiVar2.S0;
                ciVar.setText(charSequence2);
                ciVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.C1();
                return;
            default:
                kd kdVar = (kd) this.f28521b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ei.g gVar = kdVar.f9402f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ei.e eVar = kdVar.f9399c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
