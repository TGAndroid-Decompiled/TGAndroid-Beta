package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class dz0 implements org.telegram.ui.ActionBar.s0, mv0, org.telegram.ui.Components.p8 {
    public final ProfileActivity f37158a;

    public dz0(ProfileActivity profileActivity) {
        this.f37158a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.li0 li0Var = this.f37158a.m0;
        if (li0Var != null && li0Var.f28346a) {
            li0Var.O.d(0.0f, true);
            li0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f37158a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34399v2 == null && profileActivity.f34392u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34399v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34392u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView d0() {
        return null;
    }

    @Override
    public void dismiss() {
        this.f37158a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.hn0.d(new b5(this.f37158a, 18));
    }

    @Override
    public void h1() {
        this.f37158a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f37158a;
        profileActivity.f34249a.I0(true);
        k01 k01Var = profileActivity.O;
        if (k01Var != null && k01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f34273d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f41242f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, profileActivity.f34424z0)));
    }

    @Override
    public void c() {
    }
}
