package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gy0 implements org.telegram.ui.ActionBar.r0, ru0, org.telegram.ui.Components.o8 {
    public final ProfileActivity f37438a;

    public gy0(ProfileActivity profileActivity) {
        this.f37438a = profileActivity;
    }

    @Override
    public void H0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37438a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f33742w2 == null && profileActivity.f33734v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f33742w2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f33734v2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView U() {
        return null;
    }

    @Override
    public void Y0() {
        this.f37438a.presentFragment(new v4());
        dismiss();
    }

    @Override
    public void dismiss() {
        this.f37438a.U0.M(null, null);
    }

    @Override
    public void f() {
        org.telegram.ui.Components.zm0.d(new g5(this.f37438a, 18));
    }

    @Override
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37438a;
        profileActivity.f33584a.I0(true);
        nz0 nz0Var = profileActivity.O;
        if (nz0Var != null && nz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f33615e1.setBackgroundColor(i0.a.f(0.1f, profileActivity.P3(profileActivity.X4.f42384f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, profileActivity.A0)));
    }

    @Override
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.ci0 ci0Var = this.f37438a.f33676n0;
        if (ci0Var != null && ci0Var.f25198a) {
            ci0Var.O.d(0.0f, true);
            ci0Var.invalidate();
        }
    }

    @Override
    public void e() {
    }
}
