package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

public final class nb extends wj0 {

    public final int f30913h1 = 0;

    public final Object f30914i1;

    public nb(org.telegram.ui.kt ktVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.f30914i1 = ktVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ec ecVar;
        switch (this.f30913h1) {
            case 0:
                pb pbVar = (pb) this.f30914i1;
                if (motionEvent.getAction() == 0) {
                    ec ecVar2 = pbVar.f31577n;
                    if (ecVar2 != null) {
                        ecVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ecVar = pbVar.f31577n) != null) {
                    ecVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void j() {
        switch (this.f30913h1) {
            case 1:
                super.j();
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.f30914i1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ktVar.f39879x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ktVar.f39879x.flags |= 131072;
                }
                try {
                    ((WindowManager) ktVar.f39878w.getSystemService("window")).updateViewLayout(ktVar.f39880y, ktVar.f39879x);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                super.j();
                break;
        }
    }

    @Override
    public void m() {
        switch (this.f30913h1) {
            case 0:
                ec ecVar = ec.f28012w;
                if (ecVar != null) {
                    ecVar.i(false);
                }
                ((pb) this.f30914i1).d.getReactionsWindow().f11270c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    public nb(pb pbVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, n2Var, c6Var);
        this.f30914i1 = pbVar;
    }
}
