package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class oh1 extends org.telegram.ui.Cells.k3 {
    public final int f36315x;
    public final UserInfoActivity f36316y;

    public oh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, str, false, false, -1, f6Var);
        this.f36315x = i10;
        this.f36316y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f36315x) {
            case 0:
                this.f36316y.b0(true);
                return;
            case 1:
                this.f36316y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f36316y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public oh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i10, f6Var);
        this.f36315x = 2;
        this.f36316y = userInfoActivity;
    }
}
