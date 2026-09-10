package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback4 {
    public final int f26123a;
    public final KeyEvent.Callback f26124b;

    public ph(KeyEvent.Callback callback, int i10) {
        this.f26123a = i10;
        this.f26124b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f26123a) {
            case 0:
                yi yiVar = (yi) this.f26124b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                di diVar = yiVar.E0;
                diVar.setText(charSequence);
                diVar.w(charSequence.length(), charSequence.length());
                yiVar.z1();
                return;
            case 1:
                yi yiVar2 = (yi) this.f26124b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                gi giVar = yiVar2.P0;
                giVar.setText(charSequence2);
                giVar.w(charSequence2.length(), charSequence2.length());
                yiVar2.z1();
                return;
            default:
                jd jdVar = (jd) this.f26124b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                bi.i iVar = jdVar.f3268f;
                iVar.setText((CharSequence) obj);
                iVar.d();
                iVar.k(true);
                bi.e eVar = jdVar.f3265c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
