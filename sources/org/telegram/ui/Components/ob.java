package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class ob extends xi0 {
    public final int n1 = 0;
    public final Object f38082o1;

    public ob(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(4, i7, context, null, i6Var);
        this.f38082o1 = nsVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fc fcVar;
        switch (this.n1) {
            case 0:
                qb qbVar = (qb) this.f38082o1;
                if (motionEvent.getAction() == 0) {
                    fc fcVar2 = qbVar.f38755n;
                    if (fcVar2 != null) {
                        fcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (fcVar = qbVar.f38755n) != null) {
                    fcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.n1) {
            case 1:
                super.j();
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f38082o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = nsVar.f50425x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    nsVar.f50425x.flags |= 131072;
                }
                try {
                    ((WindowManager) nsVar.f50424w.getSystemService("window")).updateViewLayout(nsVar.f50426y, nsVar.f50425x);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.n1) {
            case 0:
                fc fcVar = fc.f35083w;
                if (fcVar != null) {
                    fcVar.i(false);
                }
                ((qb) this.f38082o1).d.getReactionsWindow().f5291c.setOnClickListener(new n0(this, 3));
                return;
            default:
                return;
        }
    }

    public ob(qb qbVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(3, i7, context, g2Var, i6Var);
        this.f38082o1 = qbVar;
    }
}
