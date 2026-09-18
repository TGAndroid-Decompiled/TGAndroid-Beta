package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class p21 implements org.telegram.ui.ActionBar.a2, r0.n {
    public final e31 f36306a;

    public p21(e31 e31Var) {
        this.f36306a = e31Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        e31 e31Var = this.f36306a;
        e31Var.Q = defaultWindowInsets;
        e31Var.fragmentView.requestLayout();
        return r0.m1.f42108b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        e31 e31Var = this.f36306a;
        e31Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            e31Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
