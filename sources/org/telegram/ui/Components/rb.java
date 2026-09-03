package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class rb extends qk0 {
    public final int f30717i1 = 0;
    public final Object f30718j1;

    public rb(org.telegram.ui.qt qtVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i10, context, null, g6Var);
        this.f30718j1 = qtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ic icVar;
        switch (this.f30717i1) {
            case 0:
                tb tbVar = (tb) this.f30718j1;
                if (motionEvent.getAction() == 0) {
                    ic icVar2 = tbVar.f31326n;
                    if (icVar2 != null) {
                        icVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (icVar = tbVar.f31326n) != null) {
                    icVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f30717i1) {
            case 1:
                super.j();
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) this.f30718j1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = qtVar.f40668x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    qtVar.f40668x.flags |= 131072;
                }
                try {
                    ((WindowManager) qtVar.f40667w.getSystemService("window")).updateViewLayout(qtVar.f40669y, qtVar.f40668x);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f30717i1) {
            case 0:
                ic icVar = ic.f27770w;
                if (icVar != null) {
                    icVar.i(false);
                }
                ((tb) this.f30718j1).d.getReactionsWindow().f16037c.setOnClickListener(new g0(this, 5));
                return;
            default:
                return;
        }
    }

    public rb(tb tbVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i10, context, p2Var, g6Var);
        this.f30718j1 = tbVar;
    }
}
