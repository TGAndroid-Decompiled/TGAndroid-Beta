package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class hh1 extends org.telegram.ui.Cells.j3 {
    public final int f37083x;
    public final UserInfoActivity f37084y;

    public hh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, str, false, false, -1, d6Var);
        this.f37083x = i10;
        this.f37084y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f37083x) {
            case 0:
                this.f37084y.b0(true);
                return;
            case 1:
                this.f37084y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f37084y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public hh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, true, false, i10, d6Var);
        this.f37083x = 2;
        this.f37084y = userInfoActivity;
    }
}
