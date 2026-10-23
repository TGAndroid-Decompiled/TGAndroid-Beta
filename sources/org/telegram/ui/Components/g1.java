package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.z1 {
    public final int f26499a;
    public final LaunchActivity f26500b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f26499a = i10;
        this.f26500b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26499a) {
            case 0:
                this.f26500b.u0(new LanguageSelectActivity());
                return;
            case 1:
                this.f26500b.u0(new org.telegram.ui.c7());
                return;
            default:
                LaunchActivity launchActivity = this.f26500b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
