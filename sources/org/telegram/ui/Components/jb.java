package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
public final class jb extends li0 {
    public final int f35013n1 = 0;
    public final Object f35014o1;

    public jb(org.telegram.ui.is isVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i3, context, null, e6Var);
        this.f35014o1 = isVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ac acVar;
        switch (this.f35013n1) {
            case 0:
                lb lbVar = (lb) this.f35014o1;
                if (motionEvent.getAction() == 0) {
                    ac acVar2 = lbVar.f35675n;
                    if (acVar2 != null) {
                        acVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (acVar = lbVar.f35675n) != null) {
                    acVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f35013n1) {
            case 1:
                super.j();
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.f35014o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = isVar.f46407x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    isVar.f46407x.flags |= 131072;
                }
                try {
                    ((WindowManager) isVar.f46406w.getSystemService("window")).updateViewLayout(isVar.f46408y, isVar.f46407x);
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
        switch (this.f35013n1) {
            case 0:
                ac acVar = ac.f31784w;
                if (acVar != null) {
                    acVar.i(false);
                }
                ((lb) this.f35014o1).d.getReactionsWindow().f8933c.setOnClickListener(new f0(this, 3));
                return;
            default:
                return;
        }
    }

    public jb(lb lbVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i3, context, d2Var, e6Var);
        this.f35014o1 = lbVar;
    }
}
