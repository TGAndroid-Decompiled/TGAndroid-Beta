package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class d80 implements org.telegram.messenger.tr {
    public final LaunchActivity f44888a;
    public final int f44889b;
    public final yw f44890c;
    public final boolean d;
    public final ArrayList f44891e;
    public final Uri f44892f;
    public final org.telegram.ui.ActionBar.u1 h;

    public d80(LaunchActivity launchActivity, int i7, yw ywVar, boolean z9, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f44888a = launchActivity;
        this.f44889b = i7;
        this.f44890c = ywVar;
        this.d = z9;
        this.f44891e = arrayList;
        this.f44892f = uri;
        this.h = u1Var;
    }

    @Override
    public final void run(long j3) {
        boolean z9;
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f44888a;
        boolean z10 = false;
        if (i7 != 0) {
            String str = LaunchActivity.B1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.qs.f(this.f44889b).k(org.telegram.messenger.qs.f25076t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            cn cnVar = new cn(k10);
            cnVar.M9 = true;
            org.telegram.ui.ActionBar.q4 M = launchActivity.M();
            yw ywVar = this.f44890c;
            if (ywVar == null && !this.d) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (ywVar == null) {
                z10 = true;
            }
            ((ActionBarLayout) M).V(cnVar, z9, z10);
        } else {
            ArrayList arrayList = this.f44891e;
            launchActivity.W = arrayList;
            if (arrayList == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, this.f44892f);
            launchActivity.j0(true);
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
