package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b71 implements org.telegram.ui.ActionBar.a2 {
    public final int f35541a;
    public final SessionsActivity f35542b;

    public b71(SessionsActivity sessionsActivity, int i10) {
        this.f35541a = i10;
        this.f35542b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35541a) {
            case 0:
                SessionsActivity sessionsActivity = this.f35542b;
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
                SessionsActivity.W(this.f35542b);
                return;
        }
    }
}
