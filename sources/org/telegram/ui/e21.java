package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class e21 implements org.telegram.ui.ActionBar.c2, r0.o {
    public final u21 f36347a;

    public e21(u21 u21Var) {
        this.f36347a = u21Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        u21 u21Var = this.f36347a;
        u21Var.N = defaultWindowInsets;
        u21Var.fragmentView.requestLayout();
        return r0.m1.f46482b;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        u21 u21Var = this.f36347a;
        u21Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            u21Var.getParentActivity().startActivity(intent);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
