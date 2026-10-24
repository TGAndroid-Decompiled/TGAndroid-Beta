package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class ur0 implements View.OnClickListener {
    public final int f31214a;
    public final boolean f31215b;
    public final int f31216c;
    public final FrameLayout d;

    public ur0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f31214a = i11;
        this.d = frameLayout;
        this.f31215b = z10;
        this.f31216c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31214a) {
            case 0:
                wv0 wv0Var = (wv0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
                if (this.f31215b) {
                    wv0Var.R0(o2Var, wv0Var.f32385j1, this.f31216c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ms0 ms0Var = (ms0) this.d;
                if (ms0Var.e.h() && ms0Var.h.getCurrentPosition() != 0) {
                    ms0Var.a();
                    return;
                }
                boolean z10 = this.f31215b;
                int i10 = this.f31216c;
                if (z10) {
                    yh.o1 o1Var = new yh.o1(ms0Var.getContext(), i10, ms0Var.f50925c, null, null);
                    o1Var.V(BirthdayController.getInstance(i10).isToday(ms0Var.f50925c));
                    o1Var.show();
                    return;
                }
                ug.l1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
