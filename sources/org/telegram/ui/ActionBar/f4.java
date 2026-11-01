package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.on0;
public final class f4 implements View.OnLayoutChangeListener {
    public final int f20321a;
    public final Object f20322b;
    public final Object f20323c;
    public final Object d;

    public f4(on0 on0Var, on0 on0Var2, on0 on0Var3) {
        this.f20321a = 1;
        this.f20322b = on0Var;
        this.f20323c = on0Var2;
        this.d = on0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20321a) {
            case 0:
                Rect rect = (Rect) this.f20322b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20323c;
                rect2.set(i14, i15, i16, i17);
                s4 s4Var = (s4) this.d;
                q4 q4Var = s4Var.f20777b;
                if (q4Var.f() && !rect.equals(rect2)) {
                    s4Var.h = true;
                    if (q4Var.f()) {
                        s4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((on0) this.f20322b).setProgress(org.telegram.ui.g5.f37351j1);
                ((on0) this.f20323c).setProgress(org.telegram.ui.g5.f37352k1);
                ((on0) this.d).setProgress(org.telegram.ui.g5.l1);
                return;
        }
    }

    public f4(s4 s4Var) {
        this.f20321a = 0;
        this.d = s4Var;
        this.f20322b = new Rect();
        this.f20323c = new Rect();
    }
}
