package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class kh implements Utilities.Callback4 {
    public final int f28017a;
    public final KeyEvent.Callback f28018b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f28017a = i10;
        this.f28018b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f28017a) {
            case 0:
                ri riVar = (ri) this.f28018b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                xh xhVar = riVar.H0;
                xhVar.setText(charSequence);
                xhVar.w(charSequence.length(), charSequence.length());
                riVar.F1();
                return;
            case 1:
                ri riVar2 = (ri) this.f28018b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ai aiVar = riVar2.S0;
                aiVar.setText(charSequence2);
                aiVar.w(charSequence2.length(), charSequence2.length());
                riVar2.F1();
                return;
            default:
                id idVar = (id) this.f28018b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ei.g gVar = idVar.f9410f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ei.e eVar = idVar.f9407c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
