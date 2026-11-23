package org.telegram.ui.ActionBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
public final class v implements Runnable {
    public final int f30106a;
    public boolean f30107b;
    public Object f30108c;
    public final Object d;

    public v(Object obj, Object obj2, boolean z10, int i7) {
        this.f30106a = i7;
        this.d = obj;
        this.f30108c = obj2;
        this.f30107b = z10;
    }

    @Override
    public final void run() {
        switch (this.f30106a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f28721e == this) {
                    actionBarLayout.f28721e = null;
                    ((g2) this.f30108c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f30107b);
                    return;
                }
                return;
            case 1:
                pi.k kVar = (pi.k) this.d;
                ArrayList arrayList = (ArrayList) this.f30108c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    kVar.T(jVar.f59204a, jVar, this.f30107b);
                }
                arrayList.clear();
                kVar.f59218u.remove(arrayList);
                return;
            default:
                try {
                    ((yc.i) this.d).f61214a.bind(new InetSocketAddress(61578));
                    this.f30107b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f61214a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f61216c.F(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f61214a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f30108c = e11;
                    return;
                }
        }
    }

    public v(yc.i iVar) {
        this.f30106a = 2;
        this.d = iVar;
        this.f30107b = false;
    }
}
