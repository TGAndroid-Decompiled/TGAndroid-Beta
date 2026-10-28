package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class za1 implements cc1 {
    public volatile JSONObject f35305a;
    public volatile dc1 f35306b;
    public volatile JSONObject f35307c;
    public volatile boolean[] d;
    public final ArrayList e = new ArrayList();
    public final Object f35308f = new Object();

    @Override
    public final void d(boolean z10, boolean z11, boolean z12) {
        synchronized (this.f35308f) {
            this.d = new boolean[]{z10, z11, z12};
            this.f35308f.notifyAll();
        }
    }

    @Override
    public final void g(JSONObject jSONObject) {
        synchronized (this.e) {
            this.e.add(jSONObject);
        }
    }

    @Override
    public final void i(long j10, String str) {
        JSONObject optJSONObject;
        String str2 = null;
        if (this.f35307c == null) {
            optJSONObject = null;
        } else {
            optJSONObject = this.f35307c.optJSONObject(str);
        }
        dc1 dc1Var = this.f35306b;
        if (dc1Var == null) {
            return;
        }
        if (optJSONObject == null) {
            dc1Var.a(3, null, j10);
            return;
        }
        if (optJSONObject.has("result")) {
            str2 = optJSONObject.optString("result").replace("{n}", "1").replace("{from}", "Tester").replace("{time}", "12:00");
        }
        dc1Var.a(0, str2, j10);
    }

    public final void k(Utilities.CallbackReturn callbackReturn, long j10) {
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        synchronized (this.f35308f) {
            while (true) {
                try {
                    if (this.f35305a != null && ((Boolean) callbackReturn.run(this.f35305a)).booleanValue()) {
                        return;
                    }
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        return;
                    }
                    this.f35308f.wait(uptimeMillis2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
    }

    @Override
    public final void b(String str) {
    }

    @Override
    public final void c(String str) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(dc1 dc1Var) {
    }

    @Override
    public final void h(JSONObject jSONObject) {
    }

    @Override
    public final void j(String str, JSONObject jSONObject) {
    }
}
