package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class f71 implements org.telegram.ui.ActionBar.z1 {
    public final int f37239a;
    public final SessionsActivity f37240b;

    public f71(SessionsActivity sessionsActivity, int i10) {
        this.f37239a = i10;
        this.f37240b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37239a) {
            case 0:
                SessionsActivity sessionsActivity = this.f37240b;
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
                SessionsActivity.W(this.f37240b);
                return;
        }
    }
}
