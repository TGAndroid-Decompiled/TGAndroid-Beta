package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class fb extends nj0 {
    public final int f26121m1 = 0;
    public final Object f26122n1;

    public fb(org.telegram.ui.kt ktVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(4, i10, context, null, p6Var);
        this.f26122n1 = ktVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wb wbVar;
        switch (this.f26121m1) {
            case 0:
                hb hbVar = (hb) this.f26122n1;
                if (motionEvent.getAction() == 0) {
                    wb wbVar2 = hbVar.f26743n;
                    if (wbVar2 != null) {
                        wbVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (wbVar = hbVar.f26743n) != null) {
                    wbVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f26121m1) {
            case 1:
                super.j();
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.f26122n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ktVar.f38997x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ktVar.f38997x.flags |= 131072;
                }
                try {
                    ((WindowManager) ktVar.f38996w.getSystemService("window")).updateViewLayout(ktVar.f38998y, ktVar.f38997x);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f26121m1) {
            case 0:
                wb wbVar = wb.f32194w;
                if (wbVar != null) {
                    wbVar.i(false);
                }
                ((hb) this.f26122n1).d.getReactionsWindow().f48288c.setOnClickListener(new h0(this, 3));
                return;
            default:
                return;
        }
    }

    public fb(hb hbVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(3, i10, context, k2Var, p6Var);
        this.f26122n1 = hbVar;
    }
}
