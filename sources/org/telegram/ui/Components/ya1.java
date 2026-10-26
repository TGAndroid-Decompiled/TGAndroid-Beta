package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class ya1 implements xb1 {
    public volatile JSONObject f34997a;
    public volatile boolean[] f34998b;
    public final ArrayList f34999c = new ArrayList();
    public final Object d = new Object();

    @Override
    public final void b(boolean z10, boolean z11, boolean z12) {
        synchronized (this.d) {
            this.f34998b = new boolean[]{z10, z11, z12};
            this.d.notifyAll();
        }
    }

    @Override
    public final void e(JSONObject jSONObject) {
        synchronized (this.f34999c) {
            this.f34999c.add(jSONObject);
        }
    }

    public final void h(Utilities.CallbackReturn callbackReturn, long j10) {
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        synchronized (this.d) {
            while (true) {
                try {
                    if (this.f34997a != null && ((Boolean) callbackReturn.run(this.f34997a)).booleanValue()) {
                        return;
                    }
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        return;
                    }
                    this.d.wait(uptimeMillis2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void a(String str) {
    }

    @Override
    public final void c(String str) {
    }

    @Override
    public final void d(yb1 yb1Var) {
    }

    @Override
    public final void f(JSONObject jSONObject) {
    }

    @Override
    public final void g(String str, JSONObject jSONObject) {
    }
}
