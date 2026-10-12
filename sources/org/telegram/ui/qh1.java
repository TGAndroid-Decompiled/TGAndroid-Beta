package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class qh1 extends org.telegram.ui.Cells.j3 {
    public final int f41337x;
    public final UserInfoActivity f41338y;

    public qh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, str, false, false, -1, c6Var);
        this.f41337x = i10;
        this.f41338y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f41337x) {
            case 0:
                this.f41338y.b0(true);
                return;
            case 1:
                this.f41338y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f41338y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public qh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, true, false, i10, c6Var);
        this.f41337x = 2;
        this.f41338y = userInfoActivity;
    }
}
