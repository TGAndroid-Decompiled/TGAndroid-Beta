package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class h41 implements org.telegram.ui.ActionBar.u1 {
    public final int f37699a;
    public final SessionsActivity f37700b;

    public h41(SessionsActivity sessionsActivity, int i10) {
        this.f37699a = i10;
        this.f37700b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37699a) {
            case 0:
                SessionsActivity sessionsActivity = this.f37700b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f37700b);
                return;
        }
    }
}
