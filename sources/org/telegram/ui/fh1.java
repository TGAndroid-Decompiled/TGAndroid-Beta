package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class fh1 extends org.telegram.ui.Cells.i3 {
    public final int f33331x;
    public final UserInfoActivity f33332y;

    public fh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, str, false, false, -1, d6Var);
        this.f33331x = i10;
        this.f33332y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f33331x) {
            case 0:
                this.f33332y.b0(true);
                return;
            case 1:
                this.f33332y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f33332y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public fh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, true, false, i10, d6Var);
        this.f33331x = 2;
        this.f33332y = userInfoActivity;
    }
}
