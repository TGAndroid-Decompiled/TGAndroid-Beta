package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ec0 extends org.telegram.ui.ActionBar.k {
    public final rc0 f37789a;

    public ec0(rc0 rc0Var) {
        this.f37789a = rc0Var;
    }

    @Override
    public final void b(int i10) {
        rc0 rc0Var = this.f37789a;
        if (i10 == -1) {
            rc0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = rc0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (i10 == 5) {
            rc0Var.s0(false);
        } else if (i10 == 6) {
            rc0Var.r0(null);
        }
    }
}
