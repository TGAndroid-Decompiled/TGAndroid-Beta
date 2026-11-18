package org.telegram.ui.ActionBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
public final class w implements Runnable {
    public final int f30122a;
    public boolean f30123b;
    public Object f30124c;
    public final Object d;

    public w(Object obj, Object obj2, boolean z10, int i7) {
        this.f30122a = i7;
        this.d = obj;
        this.f30124c = obj2;
        this.f30123b = z10;
    }

    @Override
    public final void run() {
        switch (this.f30122a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.f28690e == this) {
                    actionBarLayout.f28690e = null;
                    ((h2) this.f30124c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f30123b);
                    return;
                }
                return;
            case 1:
                pi.k kVar = (pi.k) this.d;
                ArrayList arrayList = (ArrayList) this.f30124c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    kVar.T(jVar.f59161a, jVar, this.f30123b);
                }
                arrayList.clear();
                kVar.f59175u.remove(arrayList);
                return;
            default:
                try {
                    ((yc.i) this.d).f61168a.bind(new InetSocketAddress(61578));
                    this.f30123b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).f61168a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.f61170c.F(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).f61168a.isClosed());
                    return;
                } catch (IOException e11) {
                    this.f30124c = e11;
                    return;
                }
        }
    }

    public w(yc.i iVar) {
        this.f30122a = 2;
        this.d = iVar;
        this.f30123b = false;
    }
}
