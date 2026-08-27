package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class e71 implements org.telegram.ui.ActionBar.a2 {

    public final int f37651a;

    public final SessionsActivity f37652b;

    public e71(SessionsActivity sessionsActivity, int i10) {
        this.f37651a = i10;
        this.f37652b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37651a) {
            case 0:
                SessionsActivity sessionsActivity = this.f37652b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                SessionsActivity.W(this.f37652b);
                break;
        }
    }
}
