package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements Utilities.Callback4 {
    public final int f27080a;
    public final KeyEvent.Callback f27081b;

    public oh(KeyEvent.Callback callback, int i10) {
        this.f27080a = i10;
        this.f27081b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f27080a) {
            case 0:
                xi xiVar = (xi) this.f27081b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                ci ciVar = xiVar.E0;
                ciVar.setText(charSequence);
                ciVar.w(charSequence.length(), charSequence.length());
                xiVar.z1();
                return;
            case 1:
                xi xiVar2 = (xi) this.f27081b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                fi fiVar = xiVar2.P0;
                fiVar.setText(charSequence2);
                fiVar.w(charSequence2.length(), charSequence2.length());
                xiVar2.z1();
                return;
            default:
                nd ndVar = (nd) this.f27081b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = ndVar.f5128f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = ndVar.f5125c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
