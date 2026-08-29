package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fh implements Utilities.Callback4 {
    public final int f28400a;
    public final KeyEvent.Callback f28401b;

    public fh(KeyEvent.Callback callback, int i10) {
        this.f28400a = i10;
        this.f28401b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f28400a) {
            case 0:
                ni niVar = (ni) this.f28401b;
                CharSequence charSequence = (CharSequence) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                th thVar = niVar.A0;
                thVar.setText(charSequence);
                thVar.w(charSequence.length(), charSequence.length());
                niVar.z1();
                return;
            case 1:
                ni niVar2 = (ni) this.f28401b;
                CharSequence charSequence2 = (CharSequence) obj;
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                wh whVar = niVar2.L0;
                whVar.setText(charSequence2);
                whVar.w(charSequence2.length(), charSequence2.length());
                niVar2.z1();
                return;
            default:
                ed edVar = (ed) this.f28401b;
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj3;
                Boolean bool3 = (Boolean) obj4;
                nh.g gVar = edVar.f18076f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                nh.e eVar = edVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
        }
    }
}
