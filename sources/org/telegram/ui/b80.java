package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class b80 implements org.telegram.messenger.tr {
    public final LaunchActivity f44217a;
    public final int f44218b;
    public final ww f44219c;
    public final boolean d;
    public final ArrayList f44220e;
    public final Uri f44221f;
    public final org.telegram.ui.ActionBar.u1 h;

    public b80(LaunchActivity launchActivity, int i7, ww wwVar, boolean z9, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f44217a = launchActivity;
        this.f44218b = i7;
        this.f44219c = wwVar;
        this.d = z9;
        this.f44220e = arrayList;
        this.f44221f = uri;
        this.h = u1Var;
    }

    @Override
    public final void run(long j3) {
        boolean z9;
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f44217a;
        boolean z10 = false;
        if (i7 != 0) {
            String str = LaunchActivity.B1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.qs.f(this.f44218b).k(org.telegram.messenger.qs.f25067t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            an anVar = new an(k10);
            anVar.K9 = true;
            org.telegram.ui.ActionBar.q4 M = launchActivity.M();
            ww wwVar = this.f44219c;
            if (wwVar == null && !this.d) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (wwVar == null) {
                z10 = true;
            }
            ((ActionBarLayout) M).V(anVar, z9, z10);
        } else {
            ArrayList arrayList = this.f44220e;
            launchActivity.W = arrayList;
            if (arrayList == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, this.f44221f);
            launchActivity.j0(true);
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
