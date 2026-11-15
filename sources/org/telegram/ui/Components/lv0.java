package org.telegram.ui.Components;

import android.webkit.WebView;
import java.util.ArrayList;
public final class lv0 implements Runnable {
    public final int f36906a;
    public final Object f36907b;
    public final Object f36908c;
    public final Object d;

    public lv0(hi.s2 s2Var, ArrayList arrayList, String str) {
        this.f36906a = 10;
        this.f36907b = s2Var;
        this.d = arrayList;
        this.f36908c = str;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.f36907b;
        WebView webView = (WebView) this.f36908c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.f60066a) {
            if (!iVar.f60084u && iVar.f60078o == webView && iVar.f60079p == fVar && !iVar.f60081r) {
                if (iVar.f60082s) {
                    org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                    return;
                }
                iVar.f60082s = true;
                org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                iVar.h();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv0.run():void");
    }

    public lv0(Object obj, Object obj2, Object obj3, int i7) {
        this.f36906a = i7;
        this.f36907b = obj;
        this.f36908c = obj2;
        this.d = obj3;
    }
}
