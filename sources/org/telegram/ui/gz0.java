package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gz0 implements org.telegram.ui.ActionBar.t0, nv0, org.telegram.ui.Components.l8 {
    public final ProfileActivity f34069a;

    public gz0(ProfileActivity profileActivity) {
        this.f34069a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f34069a;
        profileActivity.f31251a.J0(true);
        n01 n01Var = profileActivity.O;
        if (n01Var != null && n01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.f31275d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f37314f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18806a7, profileActivity.f31425z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gh0 gh0Var = this.f34069a.m0;
        if (gh0Var != null && gh0Var.f24216a) {
            gh0Var.O.d(0.0f, true);
            gh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f34069a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31400v2 == null && profileActivity.f31393u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31400v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31393u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f34069a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.bm0.d(new b5(this.f34069a, 18));
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void j1() {
        this.f34069a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
