package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class nu0 implements org.telegram.ui.ActionBar.n0, br0, gh.a, org.telegram.ui.Components.c8 {
    public final ProfileActivity f49698a;

    public nu0(ProfileActivity profileActivity) {
        this.f49698a = profileActivity;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        ProfileActivity profileActivity = this.f49698a;
        gh.e eVar = profileActivity.K5;
        return org.telegram.ui.ActionBar.j6.r1(profileActivity.k4(), eVar.a(eVar.f13313e));
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void G0(org.telegram.messenger.gj gjVar) {
        ProfileActivity profileActivity = this.f49698a;
        profileActivity.f43062a.I0(true);
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && uv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f43087d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.e4(profileActivity.X4.f46462f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, profileActivity.A0)));
    }

    @Override
    public void I(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Components.nf0 nf0Var = this.f49698a.f43155n0;
        if (nf0Var != null && nf0Var.f37569a) {
            nf0Var.L.e(true, 0.0f);
            nf0Var.invalidate();
        }
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public void R0(int i7, int i10) {
        int i11;
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.f49698a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().J4(i7, a10);
        if (profileActivity.f43219w2 == null && profileActivity.f43211v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f43219w2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f43211v2.ttl_period;
        }
        undoView.k(a10, i10, a22, Integer.valueOf(i11), null, null);
    }

    @Override
    public int U0() {
        ProfileActivity profileActivity = this.f49698a;
        gh.e eVar = profileActivity.K5;
        return i0.a.f(profileActivity.k4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public int W1() {
        ProfileActivity profileActivity = this.f49698a;
        gh.e eVar = profileActivity.K5;
        return org.telegram.ui.ActionBar.j6.r1(profileActivity.k4(), eVar.a(eVar.f13311b));
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public void dismiss() {
        this.f49698a.T0.V(null, null);
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void g1() {
        this.f49698a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void k() {
        RectF rectF = ProfileActivity.X6;
        org.telegram.ui.Components.ok0.d(new a5(this.f49698a, 19));
    }

    @Override
    public int t0() {
        ProfileActivity profileActivity = this.f49698a;
        gh.e eVar = profileActivity.K5;
        return i0.a.f(profileActivity.k4(), 553648127, eVar.a(eVar.f13312c));
    }

    @Override
    public void i() {
    }
}
