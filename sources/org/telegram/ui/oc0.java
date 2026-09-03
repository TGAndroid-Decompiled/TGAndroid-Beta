package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class oc0 extends org.telegram.ui.ActionBar.j {
    public final bd0 f39655a;

    public oc0(bd0 bd0Var) {
        this.f39655a = bd0Var;
    }

    @Override
    public final void b(int i10) {
        bd0 bd0Var = this.f39655a;
        if (i10 == -1) {
            bd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = bd0Var.f35502y0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = bd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        } else if (i10 == 5) {
            bd0Var.s0(false);
        } else if (i10 == 6) {
            bd0Var.r0(null);
        }
    }
}
