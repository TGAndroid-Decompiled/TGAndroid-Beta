package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public final class r2 implements Runnable {

    public final int f32047a;

    public final int f32048b;

    public final long f32049c;
    public final long d;

    public final Utilities.Callback f32050e;

    public final long f32051f;

    public r2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f32047a = i11;
        this.f32048b = i10;
        this.f32049c = j10;
        this.d = j11;
        this.f32050e = callback;
        this.f32051f = j12;
    }

    @Override
    public final void run() {
        switch (this.f32047a) {
            case 0:
                int i10 = this.f32048b;
                r2 r2Var = new r2(i10, this.f32049c, this.d, this.f32050e, this.f32051f, 1);
                if (!hh.u7.y(i10, false).f10154e) {
                    hh.u7 u7VarY = hh.u7.y(i10, false);
                    u7VarY.f10154e = false;
                    u7VarY.q(false, true, r2Var);
                    u7VarY.f10154e = true;
                } else {
                    r2Var.run();
                }
                break;
            default:
                int i11 = this.f32048b;
                long j10 = hh.u7.y(i11, false).p().amount;
                long j11 = this.f32049c;
                Utilities.Callback callback = this.f32050e;
                long j12 = this.f32051f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (n2VarU != null && n2VarU.hasShownSheet())) ? new jh.b() : n2VarU != null ? n2VarU.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new hh.ea(activity, bVar, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
