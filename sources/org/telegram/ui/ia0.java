package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ia0 extends org.telegram.ui.ActionBar.j {
    public final ra0 f46547a;

    public ia0(ra0 ra0Var) {
        this.f46547a = ra0Var;
    }

    @Override
    public final void b(int i7) {
        ra0 ra0Var = this.f46547a;
        if (i7 == -1) {
            ra0Var.finishFragment();
            return;
        }
        int i10 = 1;
        if (i7 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = ra0Var.D0.f23262k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                ra0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 5) {
            ra0Var.C0(false);
        } else if (i7 == 6) {
            ra0Var.B0(null);
        } else if ((i7 == 2 || i7 == 3 || i7 == 4) && ra0Var.E != null) {
            ra0Var.D0();
            org.telegram.messenger.fa faVar = ra0Var.E;
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
