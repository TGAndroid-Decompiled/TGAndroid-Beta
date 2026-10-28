package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class j71 implements org.telegram.ui.ActionBar.b2 {
    public final int f40458a;
    public final SessionsActivity f40459b;

    public j71(SessionsActivity sessionsActivity, int i10) {
        this.f40458a = i10;
        this.f40459b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40458a) {
            case 0:
                SessionsActivity sessionsActivity = this.f40459b;
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
                SessionsActivity.X(this.f40459b);
                return;
        }
    }
}
