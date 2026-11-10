package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ja0 extends org.telegram.ui.ActionBar.k {
    public final sa0 f46886a;

    public ja0(sa0 sa0Var) {
        this.f46886a = sa0Var;
    }

    @Override
    public final void b(int i7) {
        sa0 sa0Var = this.f46886a;
        if (i7 == -1) {
            sa0Var.finishFragment();
            return;
        }
        int i10 = 1;
        if (i7 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = sa0Var.D0.f23266k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 5) {
            sa0Var.C0(false);
        } else if (i7 == 6) {
            sa0Var.B0(null);
        } else if ((i7 == 2 || i7 == 3 || i7 == 4) && sa0Var.E != null) {
            sa0Var.D0();
            org.telegram.messenger.fa faVar = sa0Var.E;
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
