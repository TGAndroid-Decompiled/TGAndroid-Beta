package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SessionsActivity$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final SessionsActivity f$0;

    public SessionsActivity$$ExternalSyntheticLambda4(SessionsActivity sessionsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                SessionsActivity sessionsActivity = this.f$0;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                this.f$0.lambda$createView$12$7();
                break;
        }
    }
}
