package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class bh1 extends org.telegram.ui.Cells.h3 {
    public final int f32889x;
    public final UserInfoActivity f32890y;

    public bh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, str, false, false, -1, f6Var);
        this.f32889x = i10;
        this.f32890y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f32889x) {
            case 0:
                this.f32890y.b0(true);
                return;
            case 1:
                this.f32890y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f32890y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public bh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i10, f6Var);
        this.f32889x = 2;
        this.f32890y = userInfoActivity;
    }
}
