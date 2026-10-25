package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class ig1 extends org.telegram.ui.Cells.g3 {
    public final int E;
    public final UserInfoActivity F;

    public ig1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, str, false, false, -1, u6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.c0(true);
                return;
            case 1:
                this.F.c0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.c0(true);
                userInfoActivity.f0();
                return;
        }
    }

    public ig1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, str, true, false, i10, u6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
