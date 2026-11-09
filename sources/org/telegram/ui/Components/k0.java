package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
public final class k0 implements org.telegram.ui.ActionBar.r1 {
    public final int f35199a;
    public final Context f35200b;

    public k0(Context context, int i7) {
        this.f35199a = i7;
        this.f35200b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f35199a) {
            case 0:
                Context context = this.f35200b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                vf.c.t(this.f35200b, org.telegram.messenger.r2.f25217g);
                return;
            default:
                Context context2 = this.f35200b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    context2.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
