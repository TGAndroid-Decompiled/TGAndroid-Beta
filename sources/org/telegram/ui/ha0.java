package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ha0 extends org.telegram.ui.ActionBar.j {
    public final qa0 f48268a;

    public ha0(qa0 qa0Var) {
        this.f48268a = qa0Var;
    }

    @Override
    public final void b(int i7) {
        qa0 qa0Var = this.f48268a;
        if (i7 == -1) {
            qa0Var.finishFragment();
            return;
        }
        int i10 = 1;
        if (i7 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = qa0Var.J0.f24177k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 5) {
            qa0Var.C0(false);
        } else if (i7 == 6) {
            qa0Var.B0(null);
        } else if ((i7 == 2 || i7 == 3 || i7 == 4) && qa0Var.F != null) {
            qa0Var.D0();
            org.telegram.messenger.ea eaVar = qa0Var.F;
            if (i7 != 3) {
                if (i7 == 4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            }
            eaVar.j(i10);
        }
    }
}
