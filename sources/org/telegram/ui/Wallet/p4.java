package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.n41;
public final class p4 implements org.telegram.ui.ActionBar.q1, u10, v10 {
    public final o6 f44873a;

    public p4(o6 o6Var) {
        this.f44873a = o6Var;
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f44873a.c0(n41Var, view));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        o6 o6Var = this.f44873a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
            o6Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f44873a.b0((n41) obj, (View) obj2);
    }
}
