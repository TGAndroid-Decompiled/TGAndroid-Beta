package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class f71 implements org.telegram.ui.ActionBar.b2 {
    public final int f38150a;
    public final SessionsActivity f38151b;

    public f71(SessionsActivity sessionsActivity, int i9) {
        this.f38150a = i9;
        this.f38151b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38150a) {
            case 0:
                SessionsActivity sessionsActivity = this.f38151b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                SessionsActivity.V(this.f38151b);
                return;
        }
    }
}
