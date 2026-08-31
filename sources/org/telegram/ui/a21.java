package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class a21 implements org.telegram.ui.ActionBar.c2, r0.o {
    public final o21 f34997a;

    public a21(o21 o21Var) {
        this.f34997a = o21Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        o21 o21Var = this.f34997a;
        o21Var.N = defaultWindowInsets;
        o21Var.fragmentView.requestLayout();
        return r0.m1.f46451b;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        o21 o21Var = this.f34997a;
        o21Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            o21Var.getParentActivity().startActivity(intent);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
