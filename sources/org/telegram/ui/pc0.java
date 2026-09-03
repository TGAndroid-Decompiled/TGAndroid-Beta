package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class pc0 extends org.telegram.ui.ActionBar.j {
    public final cd0 f37073a;

    public pc0(cd0 cd0Var) {
        this.f37073a = cd0Var;
    }

    @Override
    public final void b(int i10) {
        cd0 cd0Var = this.f37073a;
        if (i10 == -1) {
            cd0Var.finishFragment();
        } else if (i10 == 1) {
            try {
                TLRPC.GeoPoint geoPoint = cd0Var.f33116y0.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Activity parentActivity = cd0Var.getParentActivity();
                parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 5) {
            cd0Var.s0(false);
        } else if (i10 == 6) {
            cd0Var.r0(null);
        }
    }
}
