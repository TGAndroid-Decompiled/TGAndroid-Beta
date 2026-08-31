package org.telegram.ui.Components;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class i50 extends TimerTask {
    public final int f27673a;
    public final Object f27674b;

    public i50(Object obj, int i10) {
        this.f27673a = i10;
        this.f27674b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f27673a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xp(this, 24));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(this, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gl0(this, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 17));
                return;
            default:
                s5.c cVar = (s5.c) this.f27674b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f47027k == null && cVar.f47020b != 0) {
                    s5.h hVar = cVar.f47021c;
                    int[] e6 = u5.a.e(arrayDeque);
                    hVar.getClass();
                    b6.m.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = s5.h.t();
                    } else {
                        s5.j jVar = new s5.j(hVar, e6);
                        s5.h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f47027k = basePendingResult;
                    basePendingResult.i(new s5.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
