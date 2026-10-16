package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jz0 implements org.telegram.ui.ActionBar.r0, rv0, org.telegram.ui.Components.r8 {
    public final ProfileActivity f37189a;

    public jz0(ProfileActivity profileActivity) {
        this.f37189a = profileActivity;
    }

    @Override
    public void C0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37189a;
        profileActivity.f32230a.I0(true);
        q01 q01Var = profileActivity.O;
        if (q01Var != null && q01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f32254d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f40772f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, profileActivity.f32405z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gi0 gi0Var = this.f37189a.m0;
        if (gi0Var != null && gi0Var.f24975a) {
            gi0Var.O.d(0.0f, true);
            gi0Var.invalidate();
        }
    }

    @Override
    public void X0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37189a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f32380v2 == null && profileActivity.f32373u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f32380v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f32373u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f37189a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.cn0.d(new f5(this.f37189a, 18));
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void k1() {
        this.f37189a.presentFragment(new u4());
        dismiss();
    }

    @Override
    public void d() {
    }
}
