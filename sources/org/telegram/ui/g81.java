package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class g81 implements org.telegram.ui.ActionBar.a2 {
    public final int f36531a;
    public final SessionsActivity f36532b;

    public g81(SessionsActivity sessionsActivity, int i10) {
        this.f36531a = i10;
        this.f36532b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36531a) {
            case 0:
                SessionsActivity sessionsActivity = this.f36532b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                SessionsActivity.U(this.f36532b);
                return;
        }
    }
}
