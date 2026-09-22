package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ez0 implements org.telegram.ui.ActionBar.s0, lv0, org.telegram.ui.Components.m8 {
    public final ProfileActivity f33448a;

    public ez0(ProfileActivity profileActivity) {
        this.f33448a = profileActivity;
    }

    @Override
    public void D0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f33448a;
        profileActivity.f31543a.J0(true);
        l01 l01Var = profileActivity.O;
        if (l01Var != null && l01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.f31567d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f36718f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, profileActivity.f31717z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.sh0 sh0Var = this.f33448a.m0;
        if (sh0Var != null && sh0Var.f28189a) {
            sh0Var.O.d(0.0f, true);
            sh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f33448a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31692v2 == null && profileActivity.f31685u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31692v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31685u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f33448a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.om0.d(new b5(this.f33448a, 18));
    }

    @Override
    public TextureView h0() {
        return null;
    }

    @Override
    public void j1() {
        this.f33448a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
