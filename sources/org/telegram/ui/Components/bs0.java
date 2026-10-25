package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class bs0 implements View.OnClickListener {
    public final int f26954a;
    public final boolean f26955b;
    public final int f26956c;
    public final FrameLayout d;

    public bs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f26954a = i11;
        this.d = frameLayout;
        this.f26955b = z10;
        this.f26956c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26954a) {
            case 0:
                aw0 aw0Var = (aw0) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
                if (this.f26955b) {
                    aw0Var.U0(r2Var, aw0Var.l1, this.f26956c);
                    return;
                }
                r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                return;
            default:
                vs0 vs0Var = (vs0) this.d;
                if (vs0Var.e.h() && vs0Var.h.getCurrentPosition() != 0) {
                    vs0Var.a();
                    return;
                }
                boolean z10 = this.f26955b;
                int i10 = this.f26956c;
                if (z10) {
                    zh.p1 p1Var = new zh.p1(vs0Var.getContext(), i10, vs0Var.f53229c, null, null);
                    p1Var.V(BirthdayController.getInstance(i10).isToday(vs0Var.f53229c));
                    p1Var.show();
                    return;
                }
                vg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
