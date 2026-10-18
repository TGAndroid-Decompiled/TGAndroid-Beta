package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class cg1 extends org.telegram.ui.Cells.i3 {
    public final int f35956x;
    public final UserInfoActivity f35957y;

    public cg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, str, false, false, -1, d6Var);
        this.f35956x = i10;
        this.f35957y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f35956x) {
            case 0:
                this.f35957y.b0(true);
                return;
            case 1:
                this.f35957y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f35957y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public cg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, true, false, i10, d6Var);
        this.f35956x = 2;
        this.f35957y = userInfoActivity;
    }
}
