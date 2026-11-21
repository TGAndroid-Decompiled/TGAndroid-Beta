package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class d80 implements org.telegram.messenger.or {
    public final LaunchActivity f46893a;
    public final int f46894b;
    public final cx f46895c;
    public final boolean d;
    public final ArrayList f46896e;
    public final Uri f46897f;
    public final org.telegram.ui.ActionBar.t1 h;

    public d80(LaunchActivity launchActivity, int i7, cx cxVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f46893a = launchActivity;
        this.f46894b = i7;
        this.f46895c = cxVar;
        this.d = z10;
        this.f46896e = arrayList;
        this.f46897f = uri;
        this.h = t1Var;
    }

    @Override
    public final void run(long j3) {
        boolean z10;
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.f46893a;
        boolean z11 = false;
        if (i7 != 0) {
            String str = LaunchActivity.C1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.ks.f(this.f46894b).k(org.telegram.messenger.ks.f25218t, new Object[0]);
            }
            if (org.telegram.messenger.n5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            bn bnVar = new bn(k10);
            bnVar.O9 = true;
            org.telegram.ui.ActionBar.r4 M = launchActivity.M();
            cx cxVar = this.f46895c;
            if (cxVar == null && !this.d) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (cxVar == null) {
                z11 = true;
            }
            ((ActionBarLayout) M).V(bnVar, z10, z11);
        } else {
            ArrayList arrayList = this.f46896e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, this.f46897f);
            launchActivity.j0(true);
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
