package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ga0 extends org.telegram.ui.ActionBar.j {
    public final pa0 f45930a;

    public ga0(pa0 pa0Var) {
        this.f45930a = pa0Var;
    }

    @Override
    public final void b(int i7) {
        pa0 pa0Var = this.f45930a;
        if (i7 == -1) {
            pa0Var.finishFragment();
            return;
        }
        int i10 = 1;
        if (i7 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = pa0Var.D0.f23244k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                pa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 5) {
            pa0Var.C0(false);
        } else if (i7 == 6) {
            pa0Var.B0(null);
        } else if ((i7 == 2 || i7 == 3 || i7 == 4) && pa0Var.E != null) {
            pa0Var.D0();
            org.telegram.messenger.fa faVar = pa0Var.E;
            if (i7 != 3) {
                if (i7 == 4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            }
            faVar.j(i10);
        }
    }
}
