package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class cc0 extends org.telegram.ui.ActionBar.j {
    public final pc0 f37166a;

    public cc0(pc0 pc0Var) {
        this.f37166a = pc0Var;
    }

    @Override
    public final void b(int i9) {
        pc0 pc0Var = this.f37166a;
        if (i9 == -1) {
            pc0Var.finishFragment();
        } else if (i9 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = pc0Var.f41473x0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d9 = geoPoint._long;
                Activity parentActivity = pc0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (i9 == 5) {
            pc0Var.r0(false);
        } else if (i9 == 6) {
            pc0Var.q0(null);
        }
    }
}
