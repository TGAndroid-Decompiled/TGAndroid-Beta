package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class nc0 extends org.telegram.ui.ActionBar.j {
    public final ad0 f36575a;

    public nc0(ad0 ad0Var) {
        this.f36575a = ad0Var;
    }

    @Override
    public final void b(int i10) {
        ad0 ad0Var = this.f36575a;
        if (i10 == -1) {
            ad0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = ad0Var.f32554y0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = ad0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            ad0Var.s0(false);
        } else if (i10 == 6) {
            ad0Var.r0(null);
        }
    }
}
