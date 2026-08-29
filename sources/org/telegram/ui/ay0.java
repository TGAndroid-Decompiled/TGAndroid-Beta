package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ay0 implements org.telegram.ui.ActionBar.t0, hu0, org.telegram.ui.Components.l8 {
    public final ProfileActivity f36635a;

    public ay0(ProfileActivity profileActivity) {
        this.f36635a = profileActivity;
    }

    @Override
    public void D(MessageObject messageObject) {
        org.telegram.ui.Components.bh0 bh0Var = this.f36635a.f36042i0;
        if (bh0Var != null && bh0Var.f27100a) {
            bh0Var.K.d(0.0f, true);
            bh0Var.invalidate();
        }
    }

    @Override
    public void T0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f36635a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f36106r2 == null && profileActivity.f36099q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f36106r2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f36099q2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView b0() {
        return null;
    }

    @Override
    public void dismiss() {
        this.f36635a.P0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.yl0.d(new b5(this.f36635a, 18));
    }

    @Override
    public void e1() {
        this.f36635a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void x0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36635a;
        profileActivity.f35984a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.R4.f40293f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, profileActivity.f36129v0)));
    }

    @Override
    public void b() {
    }
}
