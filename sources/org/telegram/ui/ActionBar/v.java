package org.telegram.ui.ActionBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
public final class v implements Runnable {
    public final int f29748a;
    public boolean f29749b;
    public Object f29750c;
    public final Object d;

    public v(Object obj, Object obj2, boolean z10, int i7) {
        this.f29748a = i7;
        this.d = obj;
        this.f29750c = obj2;
        this.f29749b = z10;
    }

    @Override
    public final void run() {
        switch (this.f29748a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f28336e == this) {
                    actionBarLayout.f28336e = null;
                    ((e2) this.f29750c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f29749b);
                    return;
                }
                return;
            case 1:
                pi.k kVar = (pi.k) this.d;
                ArrayList arrayList = (ArrayList) this.f29750c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    kVar.T(jVar.f58582a, jVar, this.f29749b);
                }
                arrayList.clear();
                kVar.f58592u.remove(arrayList);
                return;
            default:
                try {
                    ((yc.i) this.d).f60603a.bind(new InetSocketAddress(61578));
                    this.f29749b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f60603a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f60605c.s(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f60603a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f29750c = e11;
                    return;
                }
        }
    }

    public v(yc.i iVar) {
        this.f29748a = 2;
        this.d = iVar;
        this.f29749b = false;
    }
}
