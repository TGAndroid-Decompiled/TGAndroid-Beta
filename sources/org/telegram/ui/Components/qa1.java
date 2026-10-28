package org.telegram.ui.Components;

import java.util.ArrayList;
import org.json.JSONObject;
public final class qa1 implements cc1 {
    public volatile JSONObject f31848a;
    public volatile String f31849b;
    public final ArrayList f31850c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    @Override
    public final void e(String str) {
        synchronized (this.e) {
            this.f31849b = str;
            this.e.notifyAll();
        }
    }

    @Override
    public final void g(JSONObject jSONObject) {
        synchronized (this.f31850c) {
            this.f31850c.add(jSONObject);
        }
    }

    @Override
    public final void h(JSONObject jSONObject) {
        synchronized (this.e) {
            this.f31848a = jSONObject;
            this.e.notifyAll();
        }
    }

    public final int k() {
        int size;
        synchronized (this.f31850c) {
            size = this.f31850c.size();
        }
        return size;
    }

    public final String l() {
        String obj;
        synchronized (this.f31850c) {
            obj = this.f31850c.toString();
        }
        return obj;
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa1.m():void");
    }

    public final int n() {
        int i10;
        synchronized (this.f31850c) {
            try {
                ArrayList arrayList = this.f31850c;
                int size = arrayList.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if ("haptic".equals(((JSONObject) obj).optString("kind"))) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final int o(int i10) {
        int i11;
        synchronized (this.f31850c) {
            i11 = 0;
            while (i10 < this.f31850c.size()) {
                try {
                    if ("haptic".equals(((JSONObject) this.f31850c.get(i10)).optString("kind"))) {
                        i11++;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return i11;
    }

    public final int p(int i10) {
        int i11;
        synchronized (this.f31850c) {
            i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                try {
                    if (i12 >= this.f31850c.size()) {
                        break;
                    }
                    if ("haptic".equals(((JSONObject) this.f31850c.get(i12)).optString("kind"))) {
                        i11++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return i11;
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
    public final void f(dc1 dc1Var) {
    }

    @Override
    public final void i(long j10, String str) {
    }

    @Override
    public final void j(String str, JSONObject jSONObject) {
    }

    @Override
    public final void d(boolean z10, boolean z11, boolean z12) {
    }
}
