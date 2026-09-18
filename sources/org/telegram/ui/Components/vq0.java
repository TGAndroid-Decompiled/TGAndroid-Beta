package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class vq0 implements View.OnClickListener {
    public final int f29393a;
    public final boolean f29394b;
    public final int f29395c;
    public final FrameLayout d;

    public vq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f29393a = i11;
        this.d = frameLayout;
        this.f29394b = z10;
        this.f29395c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29393a) {
            case 0:
                zu0 zu0Var = (zu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
                if (this.f29394b) {
                    zu0Var.O0(o2Var, zu0Var.f30634j1, this.f29395c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
            default:
                or0 or0Var = (or0) this.d;
                if (or0Var.e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    return;
                }
                boolean z10 = this.f29394b;
                int i10 = this.f29395c;
                if (z10) {
                    xh.q1 q1Var = new xh.q1(or0Var.getContext(), i10, or0Var.f46135c, null, null);
                    q1Var.V(BirthdayController.getInstance(i10).isToday(or0Var.f46135c));
                    q1Var.show();
                    return;
                }
                tg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
