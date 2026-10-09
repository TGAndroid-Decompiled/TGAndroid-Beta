package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback4 {
    public final int f29863a;
    public final KeyEvent.Callback f29864b;

    public ph(KeyEvent.Callback callback, int i10) {
        this.f29863a = i10;
        this.f29864b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f29863a) {
            case 0:
                yi yiVar = (yi) this.f29864b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                di diVar = yiVar.H0;
                diVar.setText(charSequence);
                diVar.w(charSequence.length(), charSequence.length());
                yiVar.C1();
                return;
            case 1:
                yi yiVar2 = (yi) this.f29864b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                gi giVar = yiVar2.S0;
                giVar.setText(charSequence2);
                giVar.w(charSequence2.length(), charSequence2.length());
                yiVar2.C1();
                return;
            default:
                od odVar = (od) this.f29864b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = odVar.f5555f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = odVar.f5551c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
