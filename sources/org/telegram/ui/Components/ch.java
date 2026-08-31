package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback4 {
    public final int f25961a;
    public final KeyEvent.Callback f25962b;

    public ch(KeyEvent.Callback callback, int i10) {
        this.f25961a = i10;
        this.f25962b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f25961a) {
            case 0:
                mi miVar = (mi) this.f25962b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                qh qhVar = miVar.B0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                miVar.z1();
                return;
            case 1:
                mi miVar2 = (mi) this.f25962b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                th thVar = miVar2.M0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                miVar2.z1();
                return;
            default:
                bd bdVar = (bd) this.f25962b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                qh.f fVar = bdVar.f45517f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                qh.e eVar = bdVar.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
