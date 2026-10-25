package org.telegram.ui.Components;

import java.util.ArrayList;
import org.json.JSONObject;
public final class pa1 implements xb1 {
    public volatile JSONObject f31514a;
    public volatile String f31515b;
    public final ArrayList f31516c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    @Override
    public final void c(String str) {
        synchronized (this.e) {
            this.f31515b = str;
            this.e.notifyAll();
        }
    }

    @Override
    public final void e(JSONObject jSONObject) {
        synchronized (this.f31516c) {
            this.f31516c.add(jSONObject);
        }
    }

    @Override
    public final void f(JSONObject jSONObject) {
        synchronized (this.e) {
            this.f31514a = jSONObject;
            this.e.notifyAll();
        }
    }

    public final int h() {
        int size;
        synchronized (this.f31516c) {
            size = this.f31516c.size();
        }
        return size;
    }

    public final String i() {
        String obj;
        synchronized (this.f31516c) {
            obj = this.f31516c.toString();
        }
        return obj;
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pa1.j():void");
    }

    @Override
    public final void a(String str) {
    }

    @Override
    public final void d(yb1 yb1Var) {
    }

    @Override
    public final void g(String str, JSONObject jSONObject) {
    }

    @Override
    public final void b(boolean z10, boolean z11, boolean z12) {
    }
}
