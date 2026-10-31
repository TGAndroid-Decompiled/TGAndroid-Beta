package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class fb extends mj0 {
    public final int f26022m1 = 0;
    public final Object f26023n1;

    public fb(org.telegram.ui.lt ltVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(4, i10, context, null, p6Var);
        this.f26023n1 = ltVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wb wbVar;
        switch (this.f26022m1) {
            case 0:
                hb hbVar = (hb) this.f26023n1;
                if (motionEvent.getAction() == 0) {
                    wb wbVar2 = hbVar.f26685n;
                    if (wbVar2 != null) {
                        wbVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (wbVar = hbVar.f26685n) != null) {
                    wbVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f26022m1) {
            case 1:
                super.j();
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) this.f26023n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ltVar.f39407x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ltVar.f39407x.flags |= 131072;
                }
                try {
                    ((WindowManager) ltVar.f39406w.getSystemService("window")).updateViewLayout(ltVar.f39408y, ltVar.f39407x);
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
        switch (this.f26022m1) {
            case 0:
                wb wbVar = wb.f32128w;
                if (wbVar != null) {
                    wbVar.i(false);
                }
                ((hb) this.f26023n1).d.getReactionsWindow().f48277c.setOnClickListener(new h0(this, 3));
                return;
            default:
                return;
        }
    }

    public fb(hb hbVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(3, i10, context, k2Var, p6Var);
        this.f26023n1 = hbVar;
    }
}
