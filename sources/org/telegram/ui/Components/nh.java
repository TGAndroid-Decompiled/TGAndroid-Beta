package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback4 {
    public final int f27667a;
    public final KeyEvent.Callback f27668b;

    public nh(KeyEvent.Callback callback, int i10) {
        this.f27667a = i10;
        this.f27668b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f27667a) {
            case 0:
                vi viVar = (vi) this.f27668b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                ai aiVar = viVar.H0;
                aiVar.setText(charSequence);
                aiVar.w(charSequence.length(), charSequence.length());
                viVar.C1();
                return;
            case 1:
                vi viVar2 = (vi) this.f27668b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                di diVar = viVar2.S0;
                diVar.setText(charSequence2);
                diVar.w(charSequence2.length(), charSequence2.length());
                viVar2.C1();
                return;
            default:
                md mdVar = (md) this.f27668b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                di.g gVar = mdVar.f7382f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                di.e eVar = mdVar.f7379c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
