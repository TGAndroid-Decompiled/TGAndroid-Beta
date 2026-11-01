package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class lb0 extends org.telegram.ui.ActionBar.k {
    public final xb0 f39181a;

    public lb0(xb0 xb0Var) {
        this.f39181a = xb0Var;
    }

    @Override
    public final void b(int i10) {
        xb0 xb0Var = this.f39181a;
        if (i10 == -1) {
            xb0Var.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = xb0Var.J0.f16690k.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                xb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (i10 == 5) {
            xb0Var.E0(false);
        } else if (i10 == 6) {
            xb0Var.D0(null);
        } else if ((i10 == 2 || i10 == 3 || i10 == 4) && xb0Var.G != null) {
            xb0Var.F0();
            org.telegram.messenger.ha haVar = xb0Var.G;
            if (i10 != 3) {
                if (i10 == 4) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
            }
            haVar.k(i11);
        }
    }
}
