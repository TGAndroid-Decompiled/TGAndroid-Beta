package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class xb extends fl0 {
    public final int f32560m1 = 0;
    public final Object f32561n1;

    public xb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i10, context, null, g6Var);
        this.f32561n1 = htVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        oc ocVar;
        switch (this.f32560m1) {
            case 0:
                zb zbVar = (zb) this.f32561n1;
                if (motionEvent.getAction() == 0) {
                    oc ocVar2 = zbVar.f33219n;
                    if (ocVar2 != null) {
                        ocVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ocVar = zbVar.f33219n) != null) {
                    ocVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f32560m1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.f32561n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.f38007x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.f38007x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.f38006w.getSystemService("window")).updateViewLayout(htVar.f38008y, htVar.f38007x);
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
        switch (this.f32560m1) {
            case 0:
                oc ocVar = oc.f29196w;
                if (ocVar != null) {
                    ocVar.i(false);
                }
                ((zb) this.f32561n1).d.getReactionsWindow().f871c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public xb(zb zbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i10, context, o2Var, g6Var);
        this.f32561n1 = zbVar;
    }
}
