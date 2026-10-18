package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class iy0 implements org.telegram.ui.ActionBar.r0, tu0, org.telegram.ui.Components.o8 {
    public final ProfileActivity f37995a;

    public iy0(ProfileActivity profileActivity) {
        this.f37995a = profileActivity;
    }

    @Override
    public void H0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37995a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f33726w2 == null && profileActivity.f33718v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f33726w2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f33718v2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView U() {
        return null;
    }

    @Override
    public void Y0() {
        this.f37995a.presentFragment(new v4());
        dismiss();
    }

    @Override
    public void dismiss() {
        this.f37995a.U0.M(null, null);
    }

    @Override
    public void f() {
        org.telegram.ui.Components.ym0.d(new g5(this.f37995a, 18));
    }

    @Override
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37995a;
        profileActivity.f33568a.I0(true);
        pz0 pz0Var = profileActivity.O;
        if (pz0Var != null && pz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f33599e1.setBackgroundColor(i0.a.f(0.1f, profileActivity.P3(profileActivity.X4.f43245f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, profileActivity.A0)));
    }

    @Override
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.bi0 bi0Var = this.f37995a.f33660n0;
        if (bi0Var != null && bi0Var.f24975a) {
            bi0Var.O.d(0.0f, true);
            bi0Var.invalidate();
        }
    }

    @Override
    public void e() {
    }
}
