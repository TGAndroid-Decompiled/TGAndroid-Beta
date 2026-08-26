package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ActionIntroActivity$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ActionIntroActivity f$0;

    public ActionIntroActivity$$ExternalSyntheticLambda2(ActionIntroActivity actionIntroActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = actionIntroActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ActionIntroActivity actionIntroActivity = this.f$0;
                actionIntroActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    actionIntroActivity.getParentActivity().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                ActionIntroActivity actionIntroActivity2 = this.f$0;
                actionIntroActivity2.getClass();
                LoginActivity loginActivity = new LoginActivity();
                loginActivity.activityMode = 2;
                actionIntroActivity2.presentFragment(loginActivity, true);
                break;
        }
    }
}
