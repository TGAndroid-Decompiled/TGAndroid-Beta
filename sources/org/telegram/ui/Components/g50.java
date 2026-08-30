package org.telegram.ui.Components;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class g50 extends TimerTask {
    public final int f25048a;
    public final Object f25049b;

    public g50(Object obj, int i10) {
        this.f25048a = i10;
        this.f25049b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f25048a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vp(this, 24));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(this, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el0(this, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o0(this, 16));
                return;
            default:
                s5.c cVar = (s5.c) this.f25049b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f44055k == null && cVar.f44049b != 0) {
                    s5.h hVar = cVar.f44050c;
                    int[] e = u5.a.e(arrayDeque);
                    hVar.getClass();
                    b6.m.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = s5.h.t();
                    } else {
                        s5.j jVar = new s5.j(hVar, e);
                        s5.h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f44055k = basePendingResult;
                    basePendingResult.i(new s5.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
