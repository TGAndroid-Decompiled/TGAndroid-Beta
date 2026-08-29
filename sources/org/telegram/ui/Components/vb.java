package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class vb extends fk0 {
    public final int f33511h1 = 0;
    public final Object f33512i1;

    public vb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.f33512i1 = htVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mc mcVar;
        switch (this.f33511h1) {
            case 0:
                xb xbVar = (xb) this.f33512i1;
                if (motionEvent.getAction() == 0) {
                    mc mcVar2 = xbVar.f34672n;
                    if (mcVar2 != null) {
                        mcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (mcVar = xbVar.f34672n) != null) {
                    mcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f33511h1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.f33512i1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.f39043x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.f39043x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.f39042w.getSystemService("window")).updateViewLayout(htVar.f39044y, htVar.f39043x);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f33511h1) {
            case 0:
                mc mcVar = mc.f30644w;
                if (mcVar != null) {
                    mcVar.i(false);
                }
                ((xb) this.f33512i1).d.getReactionsWindow().f13683c.setOnClickListener(new h0(this, 5));
                return;
            default:
                return;
        }
    }

    public vb(xb xbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, o2Var, c6Var);
        this.f33512i1 = xbVar;
    }
}
