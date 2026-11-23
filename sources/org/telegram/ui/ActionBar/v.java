package org.telegram.ui.ActionBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
public final class v implements Runnable {
    public final int f30166a;
    public boolean f30167b;
    public Object f30168c;
    public final Object d;

    public v(Object obj, Object obj2, boolean z10, int i7) {
        this.f30166a = i7;
        this.d = obj;
        this.f30168c = obj2;
        this.f30167b = z10;
    }

    @Override
    public final void run() {
        switch (this.f30166a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f28779e == this) {
                    actionBarLayout.f28779e = null;
                    ((g2) this.f30168c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f30167b);
                    return;
                }
                return;
            case 1:
                pi.k kVar = (pi.k) this.d;
                ArrayList arrayList = (ArrayList) this.f30168c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.k kVar2 = (v4.k) obj;
                    kVar.T(kVar2.f59292a, kVar2, this.f30167b);
                }
                arrayList.clear();
                kVar.f59302u.remove(arrayList);
                return;
            default:
                try {
                    ((yc.i) this.d).f61298a.bind(new InetSocketAddress(61578));
                    this.f30167b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f61298a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f61300c.D(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f61298a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f30168c = e11;
                    return;
                }
        }
    }

    public v(yc.i iVar) {
        this.f30166a = 2;
        this.d = iVar;
        this.f30167b = false;
    }
}
