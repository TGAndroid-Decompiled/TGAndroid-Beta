package org.telegram.ui.ActionBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
public final class v implements Runnable {
    public final int f30103a;
    public boolean f30104b;
    public Object f30105c;
    public final Object d;

    public v(Object obj, Object obj2, boolean z10, int i7) {
        this.f30103a = i7;
        this.d = obj;
        this.f30105c = obj2;
        this.f30104b = z10;
    }

    @Override
    public final void run() {
        switch (this.f30103a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f28718e == this) {
                    actionBarLayout.f28718e = null;
                    ((g2) this.f30105c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f30104b);
                    return;
                }
                return;
            case 1:
                pi.k kVar = (pi.k) this.d;
                ArrayList arrayList = (ArrayList) this.f30105c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    kVar.T(jVar.f59200a, jVar, this.f30104b);
                }
                arrayList.clear();
                kVar.f59214u.remove(arrayList);
                return;
            default:
                try {
                    ((yc.i) this.d).f61210a.bind(new InetSocketAddress(61578));
                    this.f30104b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f61210a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f61212c.F(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f61210a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f30105c = e11;
                    return;
                }
        }
    }

    public v(yc.i iVar) {
        this.f30103a = 2;
        this.d = iVar;
        this.f30104b = false;
    }
}
