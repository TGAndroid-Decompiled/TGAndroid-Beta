package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class o11 extends org.telegram.ui.Components.l81 {
    public final int Q = 1;
    public Object R;
    public final FrameLayout S;

    public o11(org.telegram.ui.Components.sr0 sr0Var, Context context, org.telegram.ui.Components.rr0 rr0Var) {
        super(context, null);
        this.S = sr0Var;
        this.R = rr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 1:
                return !((org.telegram.ui.Components.nr0) this.S).D.f33666z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                ((org.telegram.ui.Components.rr0) this.R).d.J0(((org.telegram.ui.Components.sr0) this.S).f40297n.getAnimatingIndicatorProgress());
                return;
            default:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.Q) {
            case 1:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i10, boolean z4) {
        switch (this.Q) {
            case 0:
                int i11 = ((org.telegram.ui.Components.sr0) this.S).f40297n.V.get(i10, -1);
                org.telegram.ui.Components.yu0 yu0Var = ((org.telegram.ui.Components.rr0) this.R).d;
                if (i11 <= 0) {
                    org.telegram.ui.Components.yu0.t(yu0Var, 8, z4);
                    return;
                } else {
                    org.telegram.ui.Components.yu0.t(yu0Var, yu0Var.i1(i11).f33177a, z4);
                    return;
                }
            default:
                super.y(i10, z4);
                return;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.Q) {
            case 0:
                ((org.telegram.ui.Components.sr0) this.S).f40297n.V.get(i10, -1);
                ((org.telegram.ui.Components.rr0) this.R).d.J0(1.0f);
                return;
            default:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
        }
    }

    public o11(org.telegram.ui.Components.nr0 nr0Var, Context context) {
        super(context, null);
        this.S = nr0Var;
    }
}
