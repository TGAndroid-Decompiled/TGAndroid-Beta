package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class pb extends xi0 {
    public final int n1 = 0;
    public final Object f38543o1;

    public pb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(4, i7, context, null, h6Var);
        this.f38543o1 = nsVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gc gcVar;
        switch (this.n1) {
            case 0:
                rb rbVar = (rb) this.f38543o1;
                if (motionEvent.getAction() == 0) {
                    gc gcVar2 = rbVar.f39142n;
                    if (gcVar2 != null) {
                        gcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (gcVar = rbVar.f39142n) != null) {
                    gcVar.i(true);
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f38543o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = nsVar.f50309x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    nsVar.f50309x.flags |= 131072;
                }
                try {
                    ((WindowManager) nsVar.f50308w.getSystemService("window")).updateViewLayout(nsVar.f50310y, nsVar.f50309x);
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
                gc gcVar = gc.f35519w;
                if (gcVar != null) {
                    gcVar.i(false);
                }
                ((rb) this.f38543o1).d.getReactionsWindow().f5328c.setOnClickListener(new o0(this, 3));
                return;
            default:
                return;
        }
    }

    public pb(rb rbVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(3, i7, context, g2Var, h6Var);
        this.f38543o1 = rbVar;
    }
}
