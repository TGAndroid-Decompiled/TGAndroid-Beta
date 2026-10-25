package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class gn extends org.telegram.ui.Components.gb1 {
    public MessageObject f39717c;
    public int d = 0;
    public boolean e = true;
    public int f39718f = 0;
    public int f39719g;
    public boolean h;
    public int f39720i;
    public final un f39721j;

    public gn(un unVar) {
        this.f39721j = unVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f39717c;
        un unVar = this.f39721j;
        if (messageObject != null) {
            unVar.A0.T();
            int indexOf = unVar.G6.indexOf(this.f39717c) + unVar.A0.J;
            if (indexOf >= 0) {
                unVar.f44493z0.i1(indexOf, (int) ((this.f39719g + this.f39720i) - unVar.E9), this.h);
            }
        } else {
            unVar.A0.T();
            unVar.f44493z0.i1(this.d, this.f39718f, this.e);
        }
        this.f39717c = null;
        unVar.y3 = true;
        unVar.jd(false);
        AndroidUtilities.runOnUIThread(new ui(this, 9));
    }

    @Override
    public final void Q() {
        un unVar = this.f39721j;
        unVar.U9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.U9, un.f44173hd);
        qk qkVar = unVar.Ia;
        if (qkVar.f38541n) {
            qkVar.d();
        }
    }

    @Override
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
