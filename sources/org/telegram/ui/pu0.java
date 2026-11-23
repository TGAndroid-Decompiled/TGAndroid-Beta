package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class pu0 implements org.telegram.ui.ActionBar.n0, dr0, gh.a, org.telegram.ui.Components.j8 {
    public final ProfileActivity f50991a;

    public pu0(ProfileActivity profileActivity) {
        this.f50991a = profileActivity;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        ProfileActivity profileActivity = this.f50991a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.m6.r1(profileActivity.l4(), eVar.a(eVar.f13657e));
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void G0(org.telegram.messenger.gj gjVar) {
        ProfileActivity profileActivity = this.f50991a;
        profileActivity.f43553a.I0(true);
        vv0 vv0Var = profileActivity.O;
        if (vv0Var != null && vv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f43578d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.Z4.f47825f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, profileActivity.A0)));
    }

    @Override
    public void H(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Components.zf0 zf0Var = this.f50991a.f43646n0;
        if (zf0Var != null && zf0Var.f42796a) {
            zf0Var.L.e(true, 0.0f);
            zf0Var.invalidate();
        }
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public void R0(int i7, int i10) {
        int i11;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.f50991a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().T4(i7, a10);
        if (profileActivity.f43710w2 == null && profileActivity.f43702v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f43710w2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f43702v2.ttl_period;
        }
        undoView.k(a10, i10, c22, Integer.valueOf(i11), null, null);
    }

    @Override
    public int U0() {
        ProfileActivity profileActivity = this.f50991a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public int W1() {
        ProfileActivity profileActivity = this.f50991a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.m6.r1(profileActivity.l4(), eVar.a(eVar.f13655b));
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
    public void d1() {
        this.f50991a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void dismiss() {
        this.f50991a.T0.V(null, null);
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void k() {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.ui.Components.yk0.d(new a5(this.f50991a, 19));
    }

    @Override
    public int t0() {
        ProfileActivity profileActivity = this.f50991a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.f13656c));
    }

    @Override
    public void j() {
    }
}
