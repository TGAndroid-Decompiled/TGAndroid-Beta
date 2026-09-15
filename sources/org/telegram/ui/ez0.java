package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ez0 implements org.telegram.ui.ActionBar.s0, lv0, org.telegram.ui.Components.l8 {
    public final ProfileActivity f33430a;

    public ez0(ProfileActivity profileActivity) {
        this.f33430a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f33430a;
        profileActivity.f31238a.I0(true);
        l01 l01Var = profileActivity.O;
        if (l01Var != null && l01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f31262d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f36689f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18780a7, profileActivity.f31412z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.fh0 fh0Var = this.f33430a.m0;
        if (fh0Var != null && fh0Var.f23937a) {
            fh0Var.O.d(0.0f, true);
            fh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f33430a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31387v2 == null && profileActivity.f31380u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31387v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31380u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f33430a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.am0.d(new b5(this.f33430a, 18));
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void j1() {
        this.f33430a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
