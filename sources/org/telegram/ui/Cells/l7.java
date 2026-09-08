package org.telegram.ui.Cells;

import android.util.Log;
public final class l7 implements Runnable {
    public final int f22281a;
    public final Object f22282b;

    public l7(Object obj, int i10) {
        this.f22281a = i10;
        this.f22282b = obj;
    }

    private final void a() {
        p8.a aVar = (p8.a) this.f22282b;
        synchronized (aVar.f44022a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f44029j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f44024c = 1;
                aVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l7.run():void");
    }
}
