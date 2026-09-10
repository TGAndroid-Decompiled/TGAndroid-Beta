package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class q81 implements org.telegram.ui.ActionBar.c2 {
    public final int f35992a;
    public final SessionsActivity f35993b;

    public q81(SessionsActivity sessionsActivity, int i10) {
        this.f35992a = i10;
        this.f35993b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35992a) {
            case 0:
                SessionsActivity sessionsActivity = this.f35993b;
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
                SessionsActivity.W(this.f35993b);
                return;
        }
    }
}
