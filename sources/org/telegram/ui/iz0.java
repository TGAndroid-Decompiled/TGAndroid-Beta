package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class iz0 implements org.telegram.ui.ActionBar.t0, nv0, org.telegram.ui.Components.n8 {
    public final ProfileActivity f33825a;

    public iz0(ProfileActivity profileActivity) {
        this.f33825a = profileActivity;
    }

    @Override
    public void D0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f33825a;
        profileActivity.f30350a.I0(true);
        r01 r01Var = profileActivity.O;
        if (r01Var != null && r01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f30374d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f36461f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, profileActivity.f30524z0)));
    }

    @Override
    public void G(MessageObject messageObject) {
        org.telegram.ui.Components.ph0 ph0Var = this.f33825a.m0;
        if (ph0Var != null && ph0Var.f26125a) {
            ph0Var.O.d(0.0f, true);
            ph0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f33825a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f30499v2 == null && profileActivity.f30492u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f30499v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f30492u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f33825a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.km0.d(new b5(this.f33825a, 18));
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void i1() {
        this.f33825a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
