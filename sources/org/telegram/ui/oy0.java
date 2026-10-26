package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oy0 implements org.telegram.ui.ActionBar.t0, yu0, org.telegram.ui.Components.q8 {
    public final ProfileActivity f42314a;

    public oy0(ProfileActivity profileActivity) {
        this.f42314a = profileActivity;
    }

    @Override
    public void B0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f42314a;
        profileActivity.f35948a.I0(true);
        vz0 vz0Var = profileActivity.N;
        if (vz0Var != null && vz0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f35972d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.Y3(profileActivity.f35961b5.f38537f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23299a7, profileActivity.f36126z0)));
    }

    @Override
    public void E(MessageObject messageObject) {
        org.telegram.ui.Components.ei0 ei0Var = this.f42314a.m0;
        if (ei0Var != null && ei0Var.f27873a) {
            ei0Var.O.d(0.0f, true);
            ei0Var.invalidate();
        }
    }

    @Override
    public void T0(int i10, int i11) {
        int i12;
        int i13 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f42314a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f36098v2 == null && profileActivity.f36091u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f36098v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f36091u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void b() {
        int i10 = ProfileActivity.R6;
        org.telegram.ui.Components.hn0.d(new e5(this.f42314a, 18));
    }

    @Override
    public void dismiss() {
        this.f42314a.T0.U(null, null);
    }

    @Override
    public void e1() {
        this.f42314a.presentFragment(new t4());
        dismiss();
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void a() {
    }
}
