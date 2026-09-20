package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class yb extends pk0 {
    public final int l1 = 0;
    public final Object f30492m1;

    public yb(org.telegram.ui.st stVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.f30492m1 = stVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pc pcVar;
        switch (this.l1) {
            case 0:
                ac acVar = (ac) this.f30492m1;
                if (motionEvent.getAction() == 0) {
                    pc pcVar2 = acVar.f22646n;
                    if (pcVar2 != null) {
                        pcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (pcVar = acVar.f22646n) != null) {
                    pcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.f30492m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = stVar.f37548x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    stVar.f37548x.flags |= 131072;
                }
                try {
                    ((WindowManager) stVar.f37547w.getSystemService("window")).updateViewLayout(stVar.f37549y, stVar.f37548x);
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
        switch (this.l1) {
            case 0:
                pc pcVar = pc.f27245w;
                if (pcVar != null) {
                    pcVar.i(false);
                }
                ((ac) this.f30492m1).d.getReactionsWindow().f49274c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public yb(ac acVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, n2Var, f6Var);
        this.f30492m1 = acVar;
    }
}
