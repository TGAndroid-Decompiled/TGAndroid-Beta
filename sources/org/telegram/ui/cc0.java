package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class cc0 extends org.telegram.ui.ActionBar.j {
    public final pc0 f35877a;

    public cc0(pc0 pc0Var) {
        this.f35877a = pc0Var;
    }

    @Override
    public final void b(int i10) {
        pc0 pc0Var = this.f35877a;
        if (i10 == -1) {
            pc0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = pc0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = pc0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            pc0Var.r0(false);
        } else if (i10 == 6) {
            pc0Var.q0(null);
        }
    }
}
