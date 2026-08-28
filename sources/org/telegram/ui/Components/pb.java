package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class pb extends uj0 {
    public final int f31604h1 = 0;
    public final Object f31605i1;

    public pb(org.telegram.ui.ht htVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(4, i9, context, null, b6Var);
        this.f31605i1 = htVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gc gcVar;
        switch (this.f31604h1) {
            case 0:
                rb rbVar = (rb) this.f31605i1;
                if (motionEvent.getAction() == 0) {
                    gc gcVar2 = rbVar.f32125n;
                    if (gcVar2 != null) {
                        gcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (gcVar = rbVar.f32125n) != null) {
                    gcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f31604h1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.f31605i1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.f38934x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.f38934x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.f38933w.getSystemService("window")).updateViewLayout(htVar.f38935y, htVar.f38934x);
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
        switch (this.f31604h1) {
            case 0:
                gc gcVar = gc.f28729w;
                if (gcVar != null) {
                    gcVar.i(false);
                }
                ((rb) this.f31605i1).d.getReactionsWindow().f10576c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public pb(rb rbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(3, i9, context, o2Var, b6Var);
        this.f31605i1 = rbVar;
    }
}
