package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fz0 implements org.telegram.ui.ActionBar.r0, ov0, org.telegram.ui.Components.p8 {
    public final ProfileActivity f37875a;

    public fz0(ProfileActivity profileActivity) {
        this.f37875a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.ni0 ni0Var = this.f37875a.m0;
        if (ni0Var != null && ni0Var.f28791a) {
            ni0Var.O.d(0.0f, true);
            ni0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37875a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34200v2 == null && profileActivity.f34193u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34200v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34193u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f37875a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.mn0.d(new e5(this.f37875a, 18));
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void h1() {
        this.f37875a.presentFragment(new s4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37875a;
        profileActivity.f34050a.I0(true);
        m01 m01Var = profileActivity.O;
        if (m01Var != null && m01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f34074d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f42000f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20504a7, profileActivity.f34225z0)));
    }

    @Override
    public void c() {
    }
}
