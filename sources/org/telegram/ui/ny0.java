package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ny0 implements org.telegram.ui.ActionBar.t0, tu0, org.telegram.ui.Components.g8 {
    public final ProfileActivity f39545a;

    public ny0(ProfileActivity profileActivity) {
        this.f39545a = profileActivity;
    }

    @Override
    public void G(MessageObject messageObject) {
        org.telegram.ui.Components.oh0 oh0Var = this.f39545a.f34625j0;
        if (oh0Var != null && oh0Var.f29760a) {
            oh0Var.L.d(0.0f, true);
            oh0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f39545a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34691s2 == null && profileActivity.f34683r2 == null) {
            return;
        }
        UndoView undoView = profileActivity.J;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34691s2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34683r2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f39545a.Q0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.jm0.d(new d5(this.f39545a, 18));
    }

    @Override
    public TextureView h0() {
        return null;
    }

    @Override
    public void h1() {
        this.f39545a.presentFragment(new s4());
        dismiss();
    }

    @Override
    public void y0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f39545a;
        profileActivity.f34560a.I0(true);
        uz0 uz0Var = profileActivity.L;
        if (uz0Var != null && uz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.f34562a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f43464f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, profileActivity.f34714w0)));
    }

    @Override
    public void c() {
    }
}
