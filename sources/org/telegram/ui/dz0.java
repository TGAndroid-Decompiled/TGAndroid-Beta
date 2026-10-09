package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class dz0 implements org.telegram.ui.ActionBar.s0, mv0, org.telegram.ui.Components.p8 {
    public final ProfileActivity f37112a;

    public dz0(ProfileActivity profileActivity) {
        this.f37112a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.ki0 ki0Var = this.f37112a.m0;
        if (ki0Var != null && ki0Var.f28013a) {
            ki0Var.O.d(0.0f, true);
            ki0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37112a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34361v2 == null && profileActivity.f34354u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34361v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34354u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView d0() {
        return null;
    }

    @Override
    public void dismiss() {
        this.f37112a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.gn0.d(new b5(this.f37112a, 18));
    }

    @Override
    public void h1() {
        this.f37112a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37112a;
        profileActivity.f34211a.I0(true);
        k01 k01Var = profileActivity.O;
        if (k01Var != null && k01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f34235d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f41196f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, profileActivity.f34386z0)));
    }

    @Override
    public void c() {
    }
}
