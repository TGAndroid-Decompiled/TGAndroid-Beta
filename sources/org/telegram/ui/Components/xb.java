package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class xb extends gk0 {
    public final int l1 = 0;
    public final Object f29891m1;

    public xb(org.telegram.ui.ut utVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.f29891m1 = utVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        oc ocVar;
        switch (this.l1) {
            case 0:
                zb zbVar = (zb) this.f29891m1;
                if (motionEvent.getAction() == 0) {
                    oc ocVar2 = zbVar.f30461n;
                    if (ocVar2 != null) {
                        ocVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ocVar = zbVar.f30461n) != null) {
                    ocVar.i(true);
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
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f29891m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = utVar.f38219x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    utVar.f38219x.flags |= 131072;
                }
                try {
                    ((WindowManager) utVar.f38218w.getSystemService("window")).updateViewLayout(utVar.f38220y, utVar.f38219x);
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
                oc ocVar = oc.f26695w;
                if (ocVar != null) {
                    ocVar.i(false);
                }
                ((zb) this.f29891m1).d.getReactionsWindow().f49008c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public xb(zb zbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, o2Var, f6Var);
        this.f29891m1 = zbVar;
    }
}
