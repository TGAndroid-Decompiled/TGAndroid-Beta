package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class yb extends pk0 {
    public final int l1 = 0;
    public final Object f29289m1;

    public yb(org.telegram.ui.tt ttVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.f29289m1 = ttVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pc pcVar;
        switch (this.l1) {
            case 0:
                ac acVar = (ac) this.f29289m1;
                if (motionEvent.getAction() == 0) {
                    pc pcVar2 = acVar.f21460n;
                    if (pcVar2 != null) {
                        pcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (pcVar = acVar.f21460n) != null) {
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
                org.telegram.ui.tt ttVar = (org.telegram.ui.tt) this.f29289m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ttVar.f37037x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ttVar.f37037x.flags |= 131072;
                }
                try {
                    ((WindowManager) ttVar.f37036w.getSystemService("window")).updateViewLayout(ttVar.f37038y, ttVar.f37037x);
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
                pc pcVar = pc.f26074w;
                if (pcVar != null) {
                    pcVar.i(false);
                }
                ((ac) this.f29289m1).d.getReactionsWindow().f46952c.setOnClickListener(new h0(this, 5));
                return;
            default:
                return;
        }
    }

    public yb(ac acVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, p2Var, f6Var);
        this.f29289m1 = acVar;
    }
}
