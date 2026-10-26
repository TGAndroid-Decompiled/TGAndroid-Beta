package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mh implements Utilities.Callback4 {
    public final int f30584a;
    public final KeyEvent.Callback f30585b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f30584a = i10;
        this.f30585b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f30584a) {
            case 0:
                ti tiVar = (ti) this.f30585b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                wh whVar = tiVar.H0;
                whVar.setText(charSequence);
                whVar.w(charSequence.length(), charSequence.length());
                tiVar.E1();
                return;
            case 1:
                ti tiVar2 = (ti) this.f30585b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                yh yhVar = tiVar2.S0;
                yhVar.setText(charSequence2);
                yhVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.E1();
                return;
            default:
                jd jdVar = (jd) this.f30585b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                fi.g gVar = jdVar.f11199f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = jdVar.f11196c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
