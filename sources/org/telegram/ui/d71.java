package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d71 implements org.telegram.ui.ActionBar.a2 {
    public final int f36115a;
    public final SessionsActivity f36116b;

    public d71(SessionsActivity sessionsActivity, int i10) {
        this.f36115a = i10;
        this.f36116b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36115a) {
            case 0:
                SessionsActivity sessionsActivity = this.f36116b;
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
                SessionsActivity.W(this.f36116b);
                return;
        }
    }
}
