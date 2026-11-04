package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gu0 implements org.telegram.ui.ActionBar.n0, tq0, hh.a, org.telegram.ui.Components.d8 {
    public final ProfileActivity f45719a;

    public gu0(ProfileActivity profileActivity) {
        this.f45719a = profileActivity;
    }

    @Override
    public int F() {
        return 0;
    }

    @Override
    public void G(org.telegram.messenger.zi ziVar) {
        org.telegram.ui.Components.nf0 nf0Var = this.f45719a.f41811n0;
        if (nf0Var != null && nf0Var.f36498a) {
            nf0Var.L.e(true, 0.0f);
            nf0Var.invalidate();
        }
    }

    @Override
    public void I0(org.telegram.messenger.zi ziVar) {
        ProfileActivity profileActivity = this.f45719a;
        profileActivity.f41719a.I0(true);
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && mv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f41743d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.W4.f50584f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, profileActivity.A0)));
    }

    @Override
    public int M() {
        ProfileActivity profileActivity = this.f45719a;
        hh.e eVar = profileActivity.H5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public float O() {
        return -1.0f;
    }

    @Override
    public float W() {
        return -1.0f;
    }

    @Override
    public void W0(int i3, int i10) {
        int i11;
        RectF rectF = ProfileActivity.T6;
        ProfileActivity profileActivity = this.f45719a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().I4(i3, a10);
        if (profileActivity.f41868v2 == null && profileActivity.f41861u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f41868v2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f41861u2.ttl_period;
        }
        undoView.k(a10, i10, a22, Integer.valueOf(i11), null, null);
    }

    @Override
    public float a0() {
        return 0.0f;
    }

    @Override
    public int c0() {
        return 0;
    }

    @Override
    public void dismiss() {
        this.f45719a.T0.U(null, null);
    }

    @Override
    public void g() {
        RectF rectF = ProfileActivity.T6;
        org.telegram.ui.Components.nk0.d(new c5(this.f45719a, 18));
    }

    @Override
    public void g1() {
        this.f45719a.presentFragment(new r4());
        dismiss();
    }

    @Override
    public TextureView i0() {
        return null;
    }

    @Override
    public int u0() {
        ProfileActivity profileActivity = this.f45719a;
        hh.e eVar = profileActivity.H5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.f14415b));
    }

    @Override
    public int w0() {
        ProfileActivity profileActivity = this.f45719a;
        hh.e eVar = profileActivity.H5;
        return org.telegram.ui.ActionBar.k6.r1(profileActivity.l4(), eVar.a(eVar.f14417e));
    }

    @Override
    public int x() {
        ProfileActivity profileActivity = this.f45719a;
        hh.e eVar = profileActivity.H5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.f14416c));
    }

    @Override
    public void e() {
    }
}
