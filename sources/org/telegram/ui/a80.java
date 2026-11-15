package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class a80 implements org.telegram.messenger.qr {
    public final LaunchActivity f44958a;
    public final int f44959b;
    public final yw f44960c;
    public final boolean d;
    public final ArrayList f44961e;
    public final Uri f44962f;
    public final org.telegram.ui.ActionBar.t1 h;

    public a80(LaunchActivity launchActivity, int i7, yw ywVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f44958a = launchActivity;
        this.f44959b = i7;
        this.f44960c = ywVar;
        this.d = z10;
        this.f44961e = arrayList;
        this.f44962f = uri;
        this.h = t1Var;
    }

    @Override
    public final void run(long j3) {
        boolean z10;
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f44958a;
        boolean z11 = false;
        if (i7 != 0) {
            String str = LaunchActivity.C1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.ns.f(this.f44959b).k(org.telegram.messenger.ns.f25572t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            an anVar = new an(k10);
            anVar.N9 = true;
            org.telegram.ui.ActionBar.o4 M = launchActivity.M();
            yw ywVar = this.f44960c;
            if (ywVar == null && !this.d) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (ywVar == null) {
                z11 = true;
            }
            ((ActionBarLayout) M).V(anVar, z10, z11);
        } else {
            ArrayList arrayList = this.f44961e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, this.f44962f);
            launchActivity.j0(true);
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
