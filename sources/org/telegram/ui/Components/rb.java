package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class rb extends pk0 {
    public final int f28435i1 = 0;
    public final Object f28436j1;

    public rb(org.telegram.ui.pt ptVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.f28436j1 = ptVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ic icVar;
        switch (this.f28435i1) {
            case 0:
                tb tbVar = (tb) this.f28436j1;
                if (motionEvent.getAction() == 0) {
                    ic icVar2 = tbVar.f28952n;
                    if (icVar2 != null) {
                        icVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (icVar = tbVar.f28952n) != null) {
                    icVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f28435i1) {
            case 1:
                super.j();
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.f28436j1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ptVar.f37535x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ptVar.f37535x.flags |= 131072;
                }
                try {
                    ((WindowManager) ptVar.f37534w.getSystemService("window")).updateViewLayout(ptVar.f37536y, ptVar.f37535x);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f28435i1) {
            case 0:
                ic icVar = ic.f25665w;
                if (icVar != null) {
                    icVar.i(false);
                }
                ((tb) this.f28436j1).d.getReactionsWindow().f13974c.setOnClickListener(new g0(this, 5));
                return;
            default:
                return;
        }
    }

    public rb(tb tbVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, p2Var, f6Var);
        this.f28436j1 = tbVar;
    }
}
