package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ca0 extends org.telegram.ui.ActionBar.j {
    public final la0 f44281a;

    public ca0(la0 la0Var) {
        this.f44281a = la0Var;
    }

    @Override
    public final void b(int i3) {
        la0 la0Var = this.f44281a;
        if (i3 == -1) {
            la0Var.finishFragment();
            return;
        }
        int i10 = 1;
        if (i3 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = la0Var.E0.f26868k.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i3 == 5) {
            la0Var.C0(false);
        } else if (i3 == 6) {
            la0Var.B0(null);
        } else if ((i3 == 2 || i3 == 3 || i3 == 4) && la0Var.F != null) {
            la0Var.D0();
            org.telegram.messenger.z9 z9Var = la0Var.F;
            if (i3 != 3) {
                if (i3 == 4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            }
            z9Var.j(i10);
        }
    }
}
