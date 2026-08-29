package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class hg1 extends org.telegram.ui.Cells.g3 {
    public final int f38907x;
    public final UserInfoActivity f38908y;

    public hg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, str, false, false, -1, c6Var);
        this.f38907x = i10;
        this.f38908y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f38907x) {
            case 0:
                this.f38908y.b0(true);
                return;
            case 1:
                this.f38908y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f38908y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public hg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, true, false, i10, c6Var);
        this.f38907x = 2;
        this.f38908y = userInfoActivity;
    }
}
