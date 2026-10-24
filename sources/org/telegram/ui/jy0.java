package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jy0 implements org.telegram.ui.ActionBar.r0, tu0, org.telegram.ui.Components.m8 {
    public final ProfileActivity f38703a;

    public jy0(ProfileActivity profileActivity) {
        this.f38703a = profileActivity;
    }

    @Override
    public void H0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f38703a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34042w2 == null && profileActivity.f34034v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34042w2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34034v2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView U() {
        return null;
    }

    @Override
    public void Y0() {
        this.f38703a.presentFragment(new u4());
        dismiss();
    }

    @Override
    public void d() {
        org.telegram.ui.Components.bn0.d(new f5(this.f38703a, 18));
    }

    @Override
    public void dismiss() {
        this.f38703a.U0.M(null, null);
    }

    @Override
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f38703a;
        profileActivity.f33884a.I0(true);
        qz0 qz0Var = profileActivity.O;
        if (qz0Var != null && qz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f33915e1.setBackgroundColor(i0.a.f(0.1f, profileActivity.R3(profileActivity.X4.f43680f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, profileActivity.A0)));
    }

    @Override
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.ei0 ei0Var = this.f38703a.f33976n0;
        if (ei0Var != null && ei0Var.f26051a) {
            ei0Var.O.d(0.0f, true);
            ei0Var.invalidate();
        }
    }

    @Override
    public void c() {
    }
}
