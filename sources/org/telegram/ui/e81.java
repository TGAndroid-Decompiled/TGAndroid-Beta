package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class e81 implements org.telegram.ui.ActionBar.z1 {
    public final int f33301a;
    public final SessionsActivity f33302b;

    public e81(SessionsActivity sessionsActivity, int i10) {
        this.f33301a = i10;
        this.f33302b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33301a) {
            case 0:
                SessionsActivity sessionsActivity = this.f33302b;
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
                SessionsActivity.W(this.f33302b);
                return;
        }
    }
}
