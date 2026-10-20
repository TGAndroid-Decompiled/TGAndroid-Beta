package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b71 implements org.telegram.ui.ActionBar.a2 {
    public final int f35531a;
    public final SessionsActivity f35532b;

    public b71(SessionsActivity sessionsActivity, int i10) {
        this.f35531a = i10;
        this.f35532b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35531a) {
            case 0:
                SessionsActivity sessionsActivity = this.f35532b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                SessionsActivity.W(this.f35532b);
                return;
        }
    }
}
