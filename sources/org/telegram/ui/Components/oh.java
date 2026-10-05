package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements Utilities.Callback4 {
    public final int f29454a;
    public final KeyEvent.Callback f29455b;

    public oh(KeyEvent.Callback callback, int i10) {
        this.f29454a = i10;
        this.f29455b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f29454a) {
            case 0:
                xi xiVar = (xi) this.f29455b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                zh zhVar = xiVar.E0;
                zhVar.setText(charSequence);
                zhVar.w(charSequence.length(), charSequence.length());
                xiVar.y1();
                return;
            case 1:
                xi xiVar2 = (xi) this.f29455b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                bi biVar = xiVar2.P0;
                biVar.setText(charSequence2);
                biVar.w(charSequence2.length(), charSequence2.length());
                xiVar2.y1();
                return;
            default:
                md mdVar = (md) this.f29455b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ci.g gVar = mdVar.f5518f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                ci.e eVar = mdVar.f5514c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
