package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends k7.c6 {
    public MessageObject f36134a;
    public int f36135b = 0;
    public boolean f36136c = true;
    public int d = 0;
    public int e;
    public boolean f36137f;
    public int f36138g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36134a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.f40800x0.T();
            int indexOf = znVar.f40730r6.indexOf(this.f36134a) + znVar.f40800x0.G;
            if (indexOf >= 0) {
                znVar.f40786w0.i1(indexOf, (int) ((this.e + this.f36138g) - znVar.f40707p9), this.f36137f);
            }
        } else {
            znVar.f40800x0.T();
            znVar.f40786w0.i1(this.f36135b, this.d, this.f36136c);
        }
        this.f36134a = null;
        znVar.f40628j3 = true;
        znVar.Wc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.F9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.F9, zn.Kc);
        uk ukVar = znVar.f40756ta;
        if (ukVar.f33235n) {
            ukVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
