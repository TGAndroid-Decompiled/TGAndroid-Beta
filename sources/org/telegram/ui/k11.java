package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class k11 extends org.telegram.ui.Components.m81 {
    public final int Q = 1;
    public Object R;
    public final FrameLayout S;

    public k11(org.telegram.ui.Components.tr0 tr0Var, Context context, org.telegram.ui.Components.sr0 sr0Var) {
        super(context, null);
        this.S = tr0Var;
        this.R = sr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 1:
                return !((org.telegram.ui.Components.or0) this.S).D.f34021z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                ((org.telegram.ui.Components.sr0) this.R).d.J0(((org.telegram.ui.Components.tr0) this.S).f38931n.getAnimatingIndicatorProgress());
                return;
            default:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.Q) {
            case 1:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
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
                int i11 = ((org.telegram.ui.Components.tr0) this.S).f38931n.V.get(i10, -1);
                org.telegram.ui.Components.zu0 zu0Var = ((org.telegram.ui.Components.sr0) this.R).d;
                if (i11 <= 0) {
                    org.telegram.ui.Components.zu0.t(zu0Var, 8, z4);
                    return;
                } else {
                    org.telegram.ui.Components.zu0.t(zu0Var, zu0Var.i1(i11).f33579a, z4);
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
                ((org.telegram.ui.Components.tr0) this.S).f38931n.V.get(i10, -1);
                ((org.telegram.ui.Components.sr0) this.R).d.J0(1.0f);
                return;
            default:
                org.telegram.ui.Components.or0 or0Var = (org.telegram.ui.Components.or0) this.S;
                String currentLang = or0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    or0Var.D.L0();
                    return;
                }
                return;
        }
    }

    public k11(org.telegram.ui.Components.or0 or0Var, Context context) {
        super(context, null);
        this.S = or0Var;
    }
}
