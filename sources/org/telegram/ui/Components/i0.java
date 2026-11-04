package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;
public final class i0 implements org.telegram.ui.ActionBar.p1 {
    public final int f34556a;
    public final Context f34557b;

    public i0(Context context, int i3) {
        this.f34556a = i3;
        this.f34557b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f34556a) {
            case 0:
                Context context = this.f34557b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                Context context2 = this.f34557b;
                if (context2 != null) {
                    try {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context2.getPackageName()));
                        Activity W = org.telegram.messenger.g0.W(context2);
                        if (W instanceof LaunchActivity) {
                            W.startActivityForResult(intent, 105);
                        } else {
                            context2.startActivity(intent);
                        }
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            case 2:
                sf.c.t(this.f34557b, org.telegram.messenger.r2.f25045g);
                return;
            default:
                Context context3 = this.f34557b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    context3.startActivity(intent2);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
