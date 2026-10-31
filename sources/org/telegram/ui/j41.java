package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class j41 implements org.telegram.ui.ActionBar.u1 {
    public final int f38427a;
    public final SessionsActivity f38428b;

    public j41(SessionsActivity sessionsActivity, int i10) {
        this.f38427a = i10;
        this.f38428b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38427a) {
            case 0:
                SessionsActivity sessionsActivity = this.f38428b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                SessionsActivity.a0(this.f38428b);
                return;
        }
    }
}
