package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fb1 extends org.telegram.ui.Cells.k3 {
    public final int F;
    public final UserInfoActivity G;

    public fb1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, str, false, false, -1, i6Var);
        this.F = i7;
        this.G = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                this.G.g0(true);
                return;
            case 1:
                this.G.g0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.G;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                return;
        }
    }

    public fb1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, true, false, i7, i6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
