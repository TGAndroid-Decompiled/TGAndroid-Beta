package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

public final class gc0 extends org.telegram.ui.ActionBar.j {

    public final tc0 f38389a;

    public gc0(tc0 tc0Var) {
        this.f38389a = tc0Var;
    }

    @Override
    public final void b(int i10) {
        tc0 tc0Var = this.f38389a;
        if (i10 == -1) {
            tc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                tc0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    tc0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
