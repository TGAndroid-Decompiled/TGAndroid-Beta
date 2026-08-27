package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class yg implements Utilities.Callback4 {

    public final int f34894a;

    public final KeyEvent.Callback f34895b;

    public yg(KeyEvent.Callback callback, int i10) {
        this.f34894a = i10;
        this.f34895b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f34894a) {
            case 0:
                gi giVar = (gi) this.f34895b;
                CharSequence charSequence = (CharSequence) obj;
                mh mhVar = giVar.A0;
                mhVar.setText(charSequence);
                mhVar.w(charSequence.length(), charSequence.length());
                giVar.z1();
                break;
            case 1:
                gi giVar2 = (gi) this.f34895b;
                CharSequence charSequence2 = (CharSequence) obj;
                ph phVar = giVar2.L0;
                phVar.setText(charSequence2);
                phVar.w(charSequence2.length(), charSequence2.length());
                giVar2.z1();
                break;
            default:
                xc xcVar = (xc) this.f34895b;
                lh.g gVar = xcVar.f16338f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                lh.e eVar = xcVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
        }
    }
}
