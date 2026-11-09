package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fb1 extends org.telegram.ui.Cells.k3 {
    public final int E;
    public final UserInfoActivity F;

    public fb1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, str, false, false, -1, g6Var);
        this.E = i7;
        this.F = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.g0(true);
                return;
            case 1:
                this.F.g0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                return;
        }
    }

    public fb1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i7, g6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
