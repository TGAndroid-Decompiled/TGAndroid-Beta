package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class fc0 extends org.telegram.ui.ActionBar.j {
    public final sc0 f37302a;

    public fc0(sc0 sc0Var) {
        this.f37302a = sc0Var;
    }

    @Override
    public final void b(int i10) {
        sc0 sc0Var = this.f37302a;
        if (i10 == -1) {
            sc0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = sc0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            sc0Var.s0(false);
        } else if (i10 == 6) {
            sc0Var.r0(null);
        }
    }
}
