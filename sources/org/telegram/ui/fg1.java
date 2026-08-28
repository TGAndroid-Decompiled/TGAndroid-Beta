package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fg1 extends org.telegram.ui.Cells.j3 {
    public final int f38284x;
    public final UserInfoActivity f38285y;

    public fg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, str, false, false, -1, b6Var);
        this.f38284x = i9;
        this.f38285y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f38284x) {
            case 0:
                this.f38285y.a0(true);
                return;
            case 1:
                this.f38285y.a0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f38285y;
                userInfoActivity.a0(true);
                userInfoActivity.d0();
                return;
        }
    }

    public fg1(UserInfoActivity userInfoActivity, Context context, String str, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, str, true, false, i9, b6Var);
        this.f38284x = 2;
        this.f38285y = userInfoActivity;
    }
}
