package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fz0 implements org.telegram.ui.ActionBar.s0, kv0, org.telegram.ui.Components.p8 {
    public final ProfileActivity f36513a;

    public fz0(ProfileActivity profileActivity) {
        this.f36513a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36513a;
        profileActivity.f33856a.I0(true);
        m01 m01Var = profileActivity.O;
        if (m01Var != null && m01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f33880d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f39330f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, profileActivity.f34031z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.fh0 fh0Var = this.f36513a.m0;
        if (fh0Var != null && fh0Var.f26045a) {
            fh0Var.O.d(0.0f, true);
            fh0Var.invalidate();
        }
    }

    @Override
    public void Y0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f36513a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34006v2 == null && profileActivity.f33999u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34006v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f33999u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f36513a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.am0.d(new b5(this.f36513a, 18));
    }

    @Override
    public TextureView i0() {
        return null;
    }

    @Override
    public void l1() {
        this.f36513a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void d() {
    }
}
