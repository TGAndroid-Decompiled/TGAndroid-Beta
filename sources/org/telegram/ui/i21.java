package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class i21 implements org.telegram.ui.ActionBar.p1 {
    public final int f46040a;
    public final SessionsActivity f46041b;

    public i21(SessionsActivity sessionsActivity, int i3) {
        this.f46040a = i3;
        this.f46041b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f46040a) {
            case 0:
                SessionsActivity sessionsActivity = this.f46041b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f46041b);
                return;
        }
    }
}
