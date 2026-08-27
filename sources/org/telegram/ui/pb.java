package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class pb extends h7.a6 {

    public MessageObject f41314a;

    public int f41315b = 0;

    public boolean f41316c = true;
    public int d = 0;

    public int f41317e;

    public final qb f41318f;

    public pb(qb qbVar) {
        this.f41318f = qbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41314a;
        qb qbVar = this.f41318f;
        if (messageObject != null) {
            int iIndexOf = qbVar.f41609o0.indexOf(messageObject) + qbVar.E.f40427f;
            if (iIndexOf >= 0) {
                qbVar.C.i1(iIndexOf, this.f41317e, false);
            }
        } else {
            qbVar.C.i1(this.f41315b, this.d, this.f41316c);
        }
        this.f41314a = null;
        qbVar.V = true;
        qbVar.e1();
        AndroidUtilities.runOnUIThread(new lt0(this, 21));
    }

    @Override
    public final void c() {
        qb qbVar = this.f41318f;
        qbVar.K0 = qbVar.getNotificationCenter().setAnimationInProgress(qbVar.K0, qb.U0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f41318f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
