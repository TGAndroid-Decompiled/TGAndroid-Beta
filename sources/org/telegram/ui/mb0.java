package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class mb0 extends org.telegram.ui.ActionBar.k {
    public final yb0 f39625a;

    public mb0(yb0 yb0Var) {
        this.f39625a = yb0Var;
    }

    @Override
    public final void b(int i10) {
        yb0 yb0Var = this.f39625a;
        if (i10 == -1) {
            yb0Var.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = yb0Var.J0.f16337k.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (i10 == 5) {
            yb0Var.D0(false);
        } else if (i10 == 6) {
            yb0Var.C0(null);
        } else if ((i10 == 2 || i10 == 3 || i10 == 4) && yb0Var.G != null) {
            yb0Var.E0();
            org.telegram.messenger.ga gaVar = yb0Var.G;
            if (i10 != 3) {
                if (i10 == 4) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
            }
            gaVar.k(i11);
        }
    }
}
