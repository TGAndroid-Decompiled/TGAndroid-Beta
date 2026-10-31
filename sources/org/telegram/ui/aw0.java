package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class aw0 implements org.telegram.ui.ActionBar.q0, os0, wg.a, org.telegram.ui.Components.a8 {
    public final ProfileActivity f35765a;

    public aw0(ProfileActivity profileActivity) {
        this.f35765a = profileActivity;
    }

    @Override
    public int E() {
        ProfileActivity profileActivity = this.f35765a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.k4(), 352321535, dVar.a(dVar.d));
    }

    @Override
    public void H0(org.telegram.messenger.jj jjVar) {
        ProfileActivity profileActivity = this.f35765a;
        profileActivity.f33772a.I0(true);
        ix0 ix0Var = profileActivity.N;
        if (ix0Var != null && ix0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f33789c1.setBackgroundColor(i0.b.f(0.1f, profileActivity.e4(profileActivity.V4.f41046f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, profileActivity.f33950z0)));
    }

    @Override
    public void I(org.telegram.messenger.jj jjVar) {
        org.telegram.ui.Components.mg0 mg0Var = this.f35765a.m0;
        if (mg0Var != null && mg0Var.f28436a) {
            mg0Var.K.e(true, 0.0f);
            mg0Var.invalidate();
        }
    }

    @Override
    public float N() {
        return -1.0f;
    }

    @Override
    public float X() {
        return -1.0f;
    }

    @Override
    public void Y0(int i10, int i11) {
        int i12;
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f35765a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().F4(i10, a2);
        if (profileActivity.f33915u2 == null && profileActivity.f33908t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f33915u2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f33908t2.ttl_period;
        }
        undoView.k(a2, i11, Z1, Integer.valueOf(i12), null, null);
    }

    @Override
    public float b0() {
        return 0.0f;
    }

    @Override
    public void dismiss() {
        this.f35765a.S0.U(null, null);
    }

    @Override
    public void e() {
        RectF rectF = ProfileActivity.R6;
        org.telegram.ui.Components.nl0.d(new z4(this.f35765a, 18));
    }

    @Override
    public int h0() {
        return 0;
    }

    @Override
    public int j0() {
        ProfileActivity profileActivity = this.f35765a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.k4(), dVar.a(dVar.f52846b));
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public int n0() {
        ProfileActivity profileActivity = this.f35765a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.k4(), dVar.a(dVar.e));
    }

    @Override
    public void t1() {
        this.f35765a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public int u() {
        ProfileActivity profileActivity = this.f35765a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.k4(), 553648127, dVar.a(dVar.f52847c));
    }

    @Override
    public int w() {
        return 0;
    }

    @Override
    public void a() {
    }
}
