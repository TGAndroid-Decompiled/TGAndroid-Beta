package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class kb extends ii0 {
    public final int f35267m1 = 0;
    public final Object n1;

    public kb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(4, i7, context, null, h6Var);
        this.n1 = nsVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bc bcVar;
        switch (this.f35267m1) {
            case 0:
                mb mbVar = (mb) this.n1;
                if (motionEvent.getAction() == 0) {
                    bc bcVar2 = mbVar.f35916n;
                    if (bcVar2 != null) {
                        bcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (bcVar = mbVar.f35916n) != null) {
                    bcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f35267m1) {
            case 1:
                super.j();
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = nsVar.f48278x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    nsVar.f48278x.flags |= 131072;
                }
                try {
                    ((WindowManager) nsVar.f48277w.getSystemService("window")).updateViewLayout(nsVar.f48279y, nsVar.f48278x);
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
        switch (this.f35267m1) {
            case 0:
                bc bcVar = bc.f32195w;
                if (bcVar != null) {
                    bcVar.i(false);
                }
                ((mb) this.n1).d.getReactionsWindow().f6188c.setOnClickListener(new g0(this, 3));
                return;
            default:
                return;
        }
    }

    public kb(mb mbVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(3, i7, context, f2Var, h6Var);
        this.n1 = mbVar;
    }
}
