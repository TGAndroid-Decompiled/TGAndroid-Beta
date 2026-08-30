package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ly0 implements org.telegram.ui.ActionBar.t0, ru0, org.telegram.ui.Components.g8 {
    public final ProfileActivity f36155a;

    public ly0(ProfileActivity profileActivity) {
        this.f36155a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.mh0 mh0Var = this.f36155a.f32092j0;
        if (mh0Var != null && mh0Var.f27020a) {
            mh0Var.L.d(0.0f, true);
            mh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f36155a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f32158s2 == null && profileActivity.f32150r2 == null) {
            return;
        }
        UndoView undoView = profileActivity.J;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f32158s2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f32150r2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f36155a.Q0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.im0.d(new d5(this.f36155a, 18));
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void i1() {
        this.f36155a.presentFragment(new s4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36155a;
        profileActivity.f32028a.I0(true);
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null && sz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.f32030a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f39252f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, profileActivity.f32181w0)));
    }

    @Override
    public void c() {
    }
}
