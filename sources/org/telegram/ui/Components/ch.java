package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback4 {
    public final int f23944a;
    public final KeyEvent.Callback f23945b;

    public ch(KeyEvent.Callback callback, int i10) {
        this.f23944a = i10;
        this.f23945b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f23944a) {
            case 0:
                li liVar = (li) this.f23945b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                qh qhVar = liVar.B0;
                qhVar.setText(charSequence);
                qhVar.w(charSequence.length(), charSequence.length());
                liVar.z1();
                return;
            case 1:
                li liVar2 = (li) this.f23945b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                th thVar = liVar2.M0;
                thVar.setText(charSequence2);
                thVar.w(charSequence2.length(), charSequence2.length());
                liVar2.z1();
                return;
            default:
                bd bdVar = (bd) this.f23945b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                ph.f fVar = bdVar.f41842f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                ph.e eVar = bdVar.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
