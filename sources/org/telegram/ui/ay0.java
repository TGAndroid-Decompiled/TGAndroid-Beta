package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

public final class ay0 implements org.telegram.ui.ActionBar.s0, ku0, org.telegram.ui.Components.f8 {

    public final ProfileActivity f36652a;

    public ay0(ProfileActivity profileActivity) {
        this.f36652a = profileActivity;
    }

    @Override
    public TextureView K() {
        return null;
    }

    @Override
    public void V0(int i10, int i11) {
        ProfileActivity profileActivity = this.f36652a;
        long jA = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(jA, i10);
        if (profileActivity.f36043r2 == null && profileActivity.f36036q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(jA));
        TLRPC.UserFull userFull = profileActivity.f36043r2;
        undoView.k(jA, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.f36036q2.ttl_period), null, null);
    }

    @Override
    public void d() {
        org.telegram.ui.Components.ol0.d(new b5(this.f36652a, 18));
    }

    @Override
    public void dismiss() {
        this.f36652a.P0.M(null, null);
    }

    @Override
    public void j1() {
        this.f36652a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36652a;
        profileActivity.f35921a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.b.d(0.1f, profileActivity.P3(profileActivity.R4.f41173f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, profileActivity.f36067v0)));
    }

    @Override
    public void y(MessageObject messageObject) {
        org.telegram.ui.Components.tg0 tg0Var = this.f36652a.f35980i0;
        if (tg0Var == null || !tg0Var.f32770a) {
            return;
        }
        tg0Var.K.d(0.0f, true);
        tg0Var.invalidate();
    }

    @Override
    public void c() {
    }
}
