package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class oh1 extends org.telegram.ui.Cells.j3 {
    public final int f40536x;
    public final UserInfoActivity f40537y;

    public oh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, str, false, false, -1, e6Var);
        this.f40536x = i10;
        this.f40537y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f40536x) {
            case 0:
                this.f40537y.b0(true);
                return;
            case 1:
                this.f40537y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f40537y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public oh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, true, false, i10, e6Var);
        this.f40536x = 2;
        this.f40537y = userInfoActivity;
    }
}
