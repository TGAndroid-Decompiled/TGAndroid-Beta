package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;
public final class k0 implements org.telegram.ui.ActionBar.u1 {
    public final int f27675a;
    public final Context f27676b;

    public k0(Context context, int i10) {
        this.f27675a = i10;
        this.f27676b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f27675a) {
            case 0:
                Context context = this.f27676b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Context context2 = this.f27676b;
                if (context2 != null) {
                    try {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context2.getPackageName()));
                        Activity W = org.telegram.messenger.i0.W(context2);
                        if (W instanceof LaunchActivity) {
                            W.startActivityForResult(intent, 105);
                        } else {
                            context2.startActivity(intent);
                        }
                        return;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                }
                return;
            case 2:
                gf.f.r(this.f27676b, org.telegram.messenger.v2.f18582g);
                return;
            default:
                Context context3 = this.f27676b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    context3.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
        }
    }
}
