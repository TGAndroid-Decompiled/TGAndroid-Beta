package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback4 {
    public final int f27481a;
    public final KeyEvent.Callback f27482b;

    public ch(KeyEvent.Callback callback, int i9) {
        this.f27481a = i9;
        this.f27482b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f27481a) {
            case 0:
                ki kiVar = (ki) this.f27482b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                qh qhVar = kiVar.A0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                kiVar.z1();
                return;
            case 1:
                ki kiVar2 = (ki) this.f27482b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                th thVar = kiVar2.L0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                kiVar2.z1();
                return;
            default:
                ad adVar = (ad) this.f27482b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                kh.g gVar = adVar.f15632f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                kh.e eVar = adVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
