package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback4 {
    public final int f26816a;
    public final KeyEvent.Callback f26817b;

    public nh(KeyEvent.Callback callback, int i10) {
        this.f26816a = i10;
        this.f26817b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f26816a) {
            case 0:
                wi wiVar = (wi) this.f26817b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                yh yhVar = wiVar.E0;
                yhVar.setText(charSequence);
                yhVar.w(charSequence.length(), charSequence.length());
                wiVar.w1();
                return;
            case 1:
                wi wiVar2 = (wi) this.f26817b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ai aiVar = wiVar2.P0;
                aiVar.setText(charSequence2);
                aiVar.w(charSequence2.length(), charSequence2.length());
                wiVar2.w1();
                return;
            default:
                ld ldVar = (ld) this.f26817b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = ldVar.f5122f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = ldVar.f5119c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
