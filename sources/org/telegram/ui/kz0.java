package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class kz0 implements org.telegram.ui.ActionBar.r0, sv0, org.telegram.ui.Components.r8 {
    public final ProfileActivity f37790a;

    public kz0(ProfileActivity profileActivity) {
        this.f37790a = profileActivity;
    }

    @Override
    public void D0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37790a;
        profileActivity.f32528a.I0(true);
        r01 r01Var = profileActivity.O;
        if (r01Var != null && r01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f32552d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f41667f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, profileActivity.f32703z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gi0 gi0Var = this.f37790a.m0;
        if (gi0Var != null && gi0Var.f25287a) {
            gi0Var.O.d(0.0f, true);
            gi0Var.invalidate();
        }
    }

    @Override
    public void X0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37790a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f32678v2 == null && profileActivity.f32671u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f32678v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f32671u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f37790a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.cn0.d(new f5(this.f37790a, 18));
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void l1() {
        this.f37790a.presentFragment(new u4());
        dismiss();
    }

    @Override
    public void d() {
    }
}
