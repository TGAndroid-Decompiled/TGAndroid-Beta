package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fh1 extends org.telegram.ui.Cells.j3 {
    public final int f36322x;
    public final UserInfoActivity f36323y;

    public fh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, str, false, false, -1, d6Var);
        this.f36322x = i10;
        this.f36323y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f36322x) {
            case 0:
                this.f36323y.b0(true);
                return;
            case 1:
                this.f36323y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f36323y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public fh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, true, false, i10, d6Var);
        this.f36322x = 2;
        this.f36323y = userInfoActivity;
    }
}
