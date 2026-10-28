package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class cs0 implements View.OnClickListener {
    public final int f27242a;
    public final boolean f27243b;
    public final int f27244c;
    public final FrameLayout d;

    public cs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f27242a = i11;
        this.d = frameLayout;
        this.f27243b = z10;
        this.f27244c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27242a) {
            case 0:
                bw0 bw0Var = (bw0) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
                if (this.f27243b) {
                    bw0Var.U0(r2Var, bw0Var.l1, this.f27244c);
                    return;
                }
                r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ws0 ws0Var = (ws0) this.d;
                if (ws0Var.e.h() && ws0Var.h.getCurrentPosition() != 0) {
                    ws0Var.a();
                    return;
                }
                boolean z10 = this.f27243b;
                int i10 = this.f27244c;
                if (z10) {
                    zh.p1 p1Var = new zh.p1(ws0Var.getContext(), i10, ws0Var.f53290c, null, null);
                    p1Var.V(BirthdayController.getInstance(i10).isToday(ws0Var.f53290c));
                    p1Var.show();
                    return;
                }
                vg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
