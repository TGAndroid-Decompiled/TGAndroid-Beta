package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
public final class t0 implements org.telegram.ui.ActionBar.q1 {
    public final int f39765a;
    public final Context f39766b;

    public t0(Context context, int i7) {
        this.f39765a = i7;
        this.f39766b = context;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f39765a) {
            case 0:
                Context context = this.f39766b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                vf.c.t(this.f39766b, org.telegram.messenger.s2.f26834g);
                return;
            default:
                Context context2 = this.f39766b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    context2.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
