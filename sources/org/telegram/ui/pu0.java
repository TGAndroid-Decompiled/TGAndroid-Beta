package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class pu0 implements org.telegram.ui.ActionBar.o0, dr0, gh.a, org.telegram.ui.Components.f8 {
    public final ProfileActivity f48953a;

    public pu0(ProfileActivity profileActivity) {
        this.f48953a = profileActivity;
    }

    @Override
    public int A() {
        ProfileActivity profileActivity = this.f48953a;
        gh.e eVar = profileActivity.G5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.f13970c));
    }

    @Override
    public int C0() {
        return 0;
    }

    @Override
    public void I(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Components.kf0 kf0Var = this.f48953a.m0;
        if (kf0Var != null && kf0Var.f35268a) {
            kf0Var.K.e(true, 0.0f);
            kf0Var.invalidate();
        }
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        ProfileActivity profileActivity = this.f48953a;
        profileActivity.f41687a.I0(true);
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null && vv0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f41705c1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.V4.f45703f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27793a7, profileActivity.f41865z0)));
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public int O() {
        ProfileActivity profileActivity = this.f48953a;
        gh.e eVar = profileActivity.G5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public int R0() {
        ProfileActivity profileActivity = this.f48953a;
        gh.e eVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.f13969b));
    }

    @Override
    public void X0(int i7, int i10) {
        int i11;
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.f48953a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().I4(i7, a10);
        if (profileActivity.f41829u2 == null && profileActivity.f41823t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f41829u2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f41823t2.ttl_period;
        }
        undoView.k(a10, i10, a22, Integer.valueOf(i11), null, null);
    }

    @Override
    public void dismiss() {
        this.f48953a.S0.U(null, null);
    }

    @Override
    public int e1() {
        ProfileActivity profileActivity = this.f48953a;
        gh.e eVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.f13971e));
    }

    @Override
    public void i1() {
        this.f48953a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public float j0() {
        return -1.0f;
    }

    @Override
    public TextureView l0() {
        return null;
    }

    @Override
    public void n() {
        RectF rectF = ProfileActivity.S6;
        org.telegram.ui.Components.jk0.d(new a5(this.f48953a, 19));
    }

    @Override
    public float o0() {
        return -1.0f;
    }

    @Override
    public float v0() {
        return 0.0f;
    }

    @Override
    public void i() {
    }
}
