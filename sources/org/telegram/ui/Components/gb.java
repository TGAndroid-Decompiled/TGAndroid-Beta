package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class gb extends mi0 {
    public final int n1 = 0;
    public final Object f34879o1;

    public gb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i7, context, null, e6Var);
        this.f34879o1 = nsVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xb xbVar;
        switch (this.n1) {
            case 0:
                ib ibVar = (ib) this.f34879o1;
                if (motionEvent.getAction() == 0) {
                    xb xbVar2 = ibVar.f35544n;
                    if (xbVar2 != null) {
                        xbVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (xbVar = ibVar.f35544n) != null) {
                    xbVar.i(true);
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f34879o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = nsVar.f49677x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    nsVar.f49677x.flags |= 131072;
                }
                try {
                    ((WindowManager) nsVar.f49676w.getSystemService("window")).updateViewLayout(nsVar.f49678y, nsVar.f49677x);
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
                xb xbVar = xb.f41635w;
                if (xbVar != null) {
                    xbVar.i(false);
                }
                ((ib) this.f34879o1).d.getReactionsWindow().f5010c.setOnClickListener(new e0(this, 3));
                return;
            default:
                return;
        }
    }

    public gb(ib ibVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i7, context, e2Var, e6Var);
        this.f34879o1 = ibVar;
    }
}
