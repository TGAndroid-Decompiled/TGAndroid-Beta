package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

public final class eg1 extends org.telegram.ui.Cells.g3 {

    public final int f37758x;

    public final UserInfoActivity f37759y;

    public eg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, str, false, false, -1, c6Var);
        this.f37758x = i10;
        this.f37759y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f37758x) {
            case 0:
                this.f37759y.b0(true);
                break;
            case 1:
                this.f37759y.b0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.f37759y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                break;
        }
    }

    public eg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, true, false, i10, c6Var);
        this.f37758x = 2;
        this.f37759y = userInfoActivity;
    }
}
