package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class qc0 extends org.telegram.ui.ActionBar.j {
    public final dd0 f36394a;

    public qc0(dd0 dd0Var) {
        this.f36394a = dd0Var;
    }

    @Override
    public final void b(int i10) {
        dd0 dd0Var = this.f36394a;
        if (i10 == -1) {
            dd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = dd0Var.B0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = dd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            dd0Var.s0(false);
        } else if (i10 == 6) {
            dd0Var.r0(null);
        }
    }
}
