package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fg1 extends org.telegram.ui.Cells.h3 {
    public final int E;
    public final UserInfoActivity F;

    public fg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, str, false, false, -1, g6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.b0(true);
                return;
            case 1:
                this.F.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public fg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i10, g6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
