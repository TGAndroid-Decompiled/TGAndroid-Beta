package org.telegram.ui.Components;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class h50 extends TimerTask {
    public final int f25317a;
    public final Object f25318b;

    public h50(Object obj, int i10) {
        this.f25317a = i10;
        this.f25318b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f25317a) {
            case 0:
                AndroidUtilities.runOnUIThread(new up(this, 24));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(this, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gl0(this, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 16));
                return;
            default:
                s5.c cVar = (s5.c) this.f25318b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f44120k == null && cVar.f44114b != 0) {
                    s5.h hVar = cVar.f44115c;
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
                    cVar.f44120k = basePendingResult;
                    basePendingResult.i(new s5.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
