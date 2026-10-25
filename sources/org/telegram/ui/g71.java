package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class g71 implements org.telegram.ui.ActionBar.b2 {
    public final int f39558a;
    public final SessionsActivity f39559b;

    public g71(SessionsActivity sessionsActivity, int i10) {
        this.f39558a = i10;
        this.f39559b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39558a) {
            case 0:
                SessionsActivity sessionsActivity = this.f39559b;
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
                SessionsActivity.X(this.f39559b);
                return;
        }
    }
}
