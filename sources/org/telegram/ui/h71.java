package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class h71 implements org.telegram.ui.ActionBar.b2 {
    public final int f38776a;
    public final SessionsActivity f38777b;

    public h71(SessionsActivity sessionsActivity, int i10) {
        this.f38776a = i10;
        this.f38777b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38776a) {
            case 0:
                SessionsActivity sessionsActivity = this.f38777b;
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
                SessionsActivity.W(this.f38777b);
                return;
        }
    }
}
