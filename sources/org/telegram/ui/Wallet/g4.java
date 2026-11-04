package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.r31;
public final class g4 implements org.telegram.ui.ActionBar.p1, s10, t10 {
    public final w5 f42568a;

    public g4(w5 w5Var) {
        this.f42568a = w5Var;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f42568a.c0(r31Var, view));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        w5 w5Var = this.f42568a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
            w5Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f42568a.b0((r31) obj, (View) obj2);
    }
}
