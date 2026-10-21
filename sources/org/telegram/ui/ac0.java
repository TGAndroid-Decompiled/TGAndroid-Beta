package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ac0 extends org.telegram.ui.ActionBar.j {
    public final nc0 f35341a;

    public ac0(nc0 nc0Var) {
        this.f35341a = nc0Var;
    }

    @Override
    public final void b(int i10) {
        nc0 nc0Var = this.f35341a;
        if (i10 == -1) {
            nc0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = nc0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = nc0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            nc0Var.r0(false);
        } else if (i10 == 6) {
            nc0Var.q0(null);
        }
    }
}
