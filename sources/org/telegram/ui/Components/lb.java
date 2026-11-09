package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class lb extends ji0 {
    public final int f35665m1 = 0;
    public final Object n1;

    public lb(org.telegram.ui.ms msVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i7, context, null, g6Var);
        this.n1 = msVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cc ccVar;
        switch (this.f35665m1) {
            case 0:
                nb nbVar = (nb) this.n1;
                if (motionEvent.getAction() == 0) {
                    cc ccVar2 = nbVar.f36319n;
                    if (ccVar2 != null) {
                        ccVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ccVar = nbVar.f36319n) != null) {
                    ccVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f35665m1) {
            case 1:
                super.j();
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = msVar.f47981x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    msVar.f47981x.flags |= 131072;
                }
                try {
                    ((WindowManager) msVar.f47980w.getSystemService("window")).updateViewLayout(msVar.f47982y, msVar.f47981x);
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
        switch (this.f35665m1) {
            case 0:
                cc ccVar = cc.f32619w;
                if (ccVar != null) {
                    ccVar.i(false);
                }
                ((nb) this.n1).d.getReactionsWindow().f6183c.setOnClickListener(new h0(this, 3));
                return;
            default:
                return;
        }
    }

    public lb(nb nbVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i7, context, f2Var, g6Var);
        this.n1 = nbVar;
    }
}
