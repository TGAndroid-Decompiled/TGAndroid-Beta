package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ou0 implements org.telegram.ui.ActionBar.n0, dr0, gh.a, org.telegram.ui.Components.i8 {
    public final ProfileActivity f50769a;

    public ou0(ProfileActivity profileActivity) {
        this.f50769a = profileActivity;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public void B0(int i7, int i10) {
        int i11;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.f50769a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().T4(i7, a10);
        if (profileActivity.f43791w2 == null && profileActivity.f43783v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f43791w2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f43783v2.ttl_period;
        }
        undoView.k(a10, i10, c22, Integer.valueOf(i11), null, null);
    }

    @Override
    public int D0() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void G(org.telegram.messenger.fj fjVar) {
        org.telegram.ui.Components.yf0 yf0Var = this.f50769a.f43727n0;
        if (yf0Var != null && yf0Var.f42443a) {
            yf0Var.L.e(true, 0.0f);
            yf0Var.invalidate();
        }
    }

    @Override
    public int Q0() {
        ProfileActivity profileActivity = this.f50769a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public TextureView T() {
        return null;
    }

    @Override
    public float T0() {
        return -1.0f;
    }

    @Override
    public float V0() {
        return -1.0f;
    }

    @Override
    public void X0() {
        this.f50769a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public int X1() {
        ProfileActivity profileActivity = this.f50769a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.n6.r1(profileActivity.l4(), eVar.a(eVar.f13618b));
    }

    @Override
    public void d() {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.ui.Components.yk0.d(new a5(this.f50769a, 19));
    }

    @Override
    public void dismiss() {
        this.f50769a.T0.V(null, null);
    }

    @Override
    public int i0() {
        ProfileActivity profileActivity = this.f50769a;
        gh.e eVar = profileActivity.M5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.f13619c));
    }

    @Override
    public void u0(org.telegram.messenger.fj fjVar) {
        ProfileActivity profileActivity = this.f50769a;
        profileActivity.f43634a.I0(true);
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && uv0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f43659d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.Z4.f47957f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, profileActivity.A0)));
    }

    @Override
    public int x2() {
        ProfileActivity profileActivity = this.f50769a;
        gh.e eVar = profileActivity.M5;
        return org.telegram.ui.ActionBar.n6.r1(profileActivity.l4(), eVar.a(eVar.f13620e));
    }

    @Override
    public void a() {
    }
}
