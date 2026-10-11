package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class cz0 implements org.telegram.ui.ActionBar.r0, lv0, org.telegram.ui.Components.p8 {
    public final ProfileActivity f36857a;

    public cz0(ProfileActivity profileActivity) {
        this.f36857a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.mi0 mi0Var = this.f36857a.m0;
        if (mi0Var != null && mi0Var.f28712a) {
            mi0Var.O.d(0.0f, true);
            mi0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f36857a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34389v2 == null && profileActivity.f34382u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34389v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34382u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView d0() {
        return null;
    }

    @Override
    public void dismiss() {
        this.f36857a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.in0.d(new a5(this.f36857a, 18));
    }

    @Override
    public void h1() {
        this.f36857a.presentFragment(new o4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36857a;
        profileActivity.f34239a.I0(true);
        j01 j01Var = profileActivity.O;
        if (j01Var != null && j01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f34263d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f40969f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, profileActivity.f34414z0)));
    }

    @Override
    public void c() {
    }
}
