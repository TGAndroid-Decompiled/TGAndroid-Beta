package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c81 implements org.telegram.ui.ActionBar.c2 {
    public final int f33043a;
    public final SessionsActivity f33044b;

    public c81(SessionsActivity sessionsActivity, int i10) {
        this.f33043a = i10;
        this.f33044b = sessionsActivity;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33043a) {
            case 0:
                SessionsActivity sessionsActivity = this.f33044b;
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
                SessionsActivity.W(this.f33044b);
                return;
        }
    }
}
