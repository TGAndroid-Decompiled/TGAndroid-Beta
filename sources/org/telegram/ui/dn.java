package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class dn extends g7.f6 {
    public MessageObject f37564a;
    public int f37565b = 0;
    public boolean f37566c = true;
    public int d = 0;
    public int f37567e;
    public boolean f37568f;
    public int f37569g;
    public final qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37564a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.f42114w0.T();
            int indexOf = qnVar.f42042q6.indexOf(this.f37564a) + qnVar.f42114w0.F;
            if (indexOf >= 0) {
                qnVar.f42103v0.i1(indexOf, (int) ((this.f37567e + this.f37569g) - qnVar.o9), this.f37568f);
            }
        } else {
            qnVar.f42114w0.T();
            qnVar.f42103v0.i1(this.f37565b, this.d, this.f37566c);
        }
        this.f37564a = null;
        qnVar.f41945i3 = true;
        qnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ri(this, 8));
    }

    @Override
    public final void c() {
        qn qnVar = this.h;
        qnVar.E9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.E9, qn.Jc);
        jk jkVar = qnVar.f42074sa;
        if (jkVar.f40824n) {
            jkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
