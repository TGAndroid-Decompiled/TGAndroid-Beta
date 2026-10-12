package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rh implements Utilities.Callback4 {
    public final int f30156a;
    public final KeyEvent.Callback f30157b;

    public rh(KeyEvent.Callback callback, int i10) {
        this.f30156a = i10;
        this.f30157b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f30156a) {
            case 0:
                aj ajVar = (aj) this.f30157b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                fi fiVar = ajVar.H0;
                fiVar.setText(charSequence);
                fiVar.w(charSequence.length(), charSequence.length());
                ajVar.C1();
                return;
            case 1:
                aj ajVar2 = (aj) this.f30157b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ii iiVar = ajVar2.S0;
                iiVar.setText(charSequence2);
                iiVar.w(charSequence2.length(), charSequence2.length());
                ajVar2.C1();
                return;
            default:
                od odVar = (od) this.f30157b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = odVar.f5553f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = odVar.f5549c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
