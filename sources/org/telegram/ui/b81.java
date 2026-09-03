package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class b81 implements org.telegram.ui.ActionBar.c2 {
    public final int f35401a;
    public final SessionsActivity f35402b;

    public b81(SessionsActivity sessionsActivity, int i10) {
        this.f35401a = i10;
        this.f35402b = sessionsActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35401a) {
            case 0:
                SessionsActivity sessionsActivity = this.f35402b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                SessionsActivity.W(this.f35402b);
                return;
        }
    }
}
