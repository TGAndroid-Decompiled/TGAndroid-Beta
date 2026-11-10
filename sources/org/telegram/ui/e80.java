package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e80 implements org.telegram.messenger.tr {
    public final LaunchActivity f45202a;
    public final int f45203b;
    public final zw f45204c;
    public final boolean d;
    public final ArrayList f45205e;
    public final Uri f45206f;
    public final org.telegram.ui.ActionBar.u1 h;

    public e80(LaunchActivity launchActivity, int i7, zw zwVar, boolean z9, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f45202a = launchActivity;
        this.f45203b = i7;
        this.f45204c = zwVar;
        this.d = z9;
        this.f45205e = arrayList;
        this.f45206f = uri;
        this.h = u1Var;
    }

    @Override
    public final void run(long j3) {
        boolean z9;
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f45202a;
        boolean z10 = false;
        if (i7 != 0) {
            String str = LaunchActivity.B1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.qs.f(this.f45203b).k(org.telegram.messenger.qs.f25080t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            cn cnVar = new cn(k10);
            cnVar.M9 = true;
            org.telegram.ui.ActionBar.r4 M = launchActivity.M();
            zw zwVar = this.f45204c;
            if (zwVar == null && !this.d) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (zwVar == null) {
                z10 = true;
            }
            ((ActionBarLayout) M).V(cnVar, z9, z10);
        } else {
            ArrayList arrayList = this.f45205e;
            launchActivity.W = arrayList;
            if (arrayList == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, this.f45206f);
            launchActivity.j0(true);
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
