package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class m81 implements org.telegram.ui.ActionBar.b2 {
    public final int f35705a;
    public final SessionsActivity f35706b;

    public m81(SessionsActivity sessionsActivity, int i10) {
        this.f35705a = i10;
        this.f35706b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35705a) {
            case 0:
                SessionsActivity sessionsActivity = this.f35706b;
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
                SessionsActivity.W(this.f35706b);
                return;
        }
    }
}
