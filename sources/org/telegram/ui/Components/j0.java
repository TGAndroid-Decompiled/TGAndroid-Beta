package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
public final class j0 implements org.telegram.ui.ActionBar.r1 {
    public final int f34806a;
    public final Context f34807b;

    public j0(Context context, int i7) {
        this.f34806a = i7;
        this.f34807b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f34806a) {
            case 0:
                Context context = this.f34807b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                vf.c.t(this.f34807b, org.telegram.messenger.r2.f25221g);
                return;
            default:
                Context context2 = this.f34807b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    context2.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
