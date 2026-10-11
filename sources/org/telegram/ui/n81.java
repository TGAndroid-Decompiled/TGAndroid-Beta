package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class n81 implements org.telegram.ui.ActionBar.z1 {
    public final int f40149a;
    public final SessionsActivity f40150b;

    public n81(SessionsActivity sessionsActivity, int i10) {
        this.f40149a = i10;
        this.f40150b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40149a) {
            case 0:
                SessionsActivity sessionsActivity = this.f40150b;
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
                SessionsActivity.W(this.f40150b);
                return;
        }
    }
}
