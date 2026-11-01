package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class b90 implements org.telegram.messenger.ds {
    public final LaunchActivity f36002a;
    public final int f36003b;
    public final zx f36004c;
    public final boolean d;
    public final ArrayList e;
    public final Uri f36005f;
    public final org.telegram.ui.ActionBar.x1 h;

    public b90(LaunchActivity launchActivity, int i10, zx zxVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f36002a = launchActivity;
        this.f36003b = i10;
        this.f36004c = zxVar;
        this.d = z10;
        this.e = arrayList;
        this.f36005f = uri;
        this.h = x1Var;
    }

    @Override
    public final void run(long j10) {
        boolean z10;
        org.telegram.ui.ActionBar.x1 x1Var = this.h;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f36002a;
        boolean z11 = false;
        if (i10 != 0) {
            Pattern pattern = LaunchActivity.D1;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (!org.telegram.messenger.i0.Q1()) {
                org.telegram.messenger.at.f(this.f36003b).k(org.telegram.messenger.at.f14786t, new Object[0]);
            }
            if (org.telegram.messenger.o5.E(j10)) {
                g10.putLong("user_id", j10);
            } else {
                g10.putLong("chat_id", -j10);
            }
            un unVar = new un(g10);
            unVar.K9 = true;
            org.telegram.ui.ActionBar.z4 M = launchActivity.M();
            zx zxVar = this.f36004c;
            if (zxVar == null && !this.d) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (zxVar == null) {
                z11 = true;
            }
            ((ActionBarLayout) M).U(unVar, z10, z11);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.W = arrayList;
            if (arrayList == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, this.f36005f);
            launchActivity.j0(true);
        }
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
