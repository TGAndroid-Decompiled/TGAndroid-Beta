package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback4 {
    public final int f26721a;
    public final KeyEvent.Callback f26722b;

    public nh(KeyEvent.Callback callback, int i10) {
        this.f26721a = i10;
        this.f26722b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f26721a) {
            case 0:
                wi wiVar = (wi) this.f26722b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                bi biVar = wiVar.E0;
                biVar.setText(charSequence);
                biVar.w(charSequence.length(), charSequence.length());
                wiVar.z1();
                return;
            case 1:
                wi wiVar2 = (wi) this.f26722b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ei eiVar = wiVar2.P0;
                eiVar.setText(charSequence2);
                eiVar.w(charSequence2.length(), charSequence2.length());
                wiVar2.z1();
                return;
            default:
                md mdVar = (md) this.f26722b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = mdVar.f5121f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = mdVar.f5118c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
