package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class ah1 extends org.telegram.ui.Cells.i3 {
    public final int f35189x;
    public final UserInfoActivity f35190y;

    public ah1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, str, false, false, -1, g6Var);
        this.f35189x = i10;
        this.f35190y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f35189x) {
            case 0:
                this.f35190y.b0(true);
                return;
            case 1:
                this.f35190y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f35190y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public ah1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i10, g6Var);
        this.f35189x = 2;
        this.f35190y = userInfoActivity;
    }
}
