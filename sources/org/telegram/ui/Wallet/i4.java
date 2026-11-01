package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;
public final class i4 implements org.telegram.ui.ActionBar.u1, p20, q20 {
    public final b6 f34715a;

    public i4(b6 b6Var) {
        this.f34715a = b6Var;
    }

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(this.f34715a.c0(b51Var, view));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        b6 b6Var = this.f34715a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
            b6Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        this.f34715a.b0((b51) obj, (View) obj2);
    }
}
