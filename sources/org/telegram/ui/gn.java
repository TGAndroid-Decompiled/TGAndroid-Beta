package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class gn extends org.telegram.ui.Components.gb1 {
    public MessageObject f39720c;
    public int d = 0;
    public boolean e = true;
    public int f39721f = 0;
    public int f39722g;
    public boolean h;
    public int f39723i;
    public final un f39724j;

    public gn(un unVar) {
        this.f39724j = unVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f39720c;
        un unVar = this.f39724j;
        if (messageObject != null) {
            unVar.A0.T();
            int indexOf = unVar.G6.indexOf(this.f39720c) + unVar.A0.J;
            if (indexOf >= 0) {
                unVar.f44496z0.i1(indexOf, (int) ((this.f39722g + this.f39723i) - unVar.E9), this.h);
            }
        } else {
            unVar.A0.T();
            unVar.f44496z0.i1(this.d, this.f39721f, this.e);
        }
        this.f39720c = null;
        unVar.y3 = true;
        unVar.jd(false);
        AndroidUtilities.runOnUIThread(new ui(this, 9));
    }

    @Override
    public final void Q() {
        un unVar = this.f39724j;
        unVar.U9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.U9, un.f44176hd);
        qk qkVar = unVar.Ia;
        if (qkVar.f38544n) {
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
