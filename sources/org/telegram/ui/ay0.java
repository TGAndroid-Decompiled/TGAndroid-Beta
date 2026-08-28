package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ay0 implements org.telegram.ui.ActionBar.t0, ju0, org.telegram.ui.Components.g8 {
    public final ProfileActivity f36577a;

    public ay0(ProfileActivity profileActivity) {
        this.f36577a = profileActivity;
    }

    @Override
    public TextureView G() {
        return null;
    }

    @Override
    public void V0(int i9, int i10) {
        int i11;
        ProfileActivity profileActivity = this.f36577a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i9);
        if (profileActivity.f36040r2 == null && profileActivity.f36032q2 == null) {
            return;
        }
        UndoView undoView = profileActivity.I;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f36040r2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f36032q2.ttl_period;
        }
        undoView.k(a2, i10, user, Integer.valueOf(i11), null, null);
    }

    @Override
    public void d() {
        org.telegram.ui.Components.ll0.d(new a5(this.f36577a, 18));
    }

    @Override
    public void dismiss() {
        this.f36577a.P0.M(null, null);
    }

    @Override
    public void h1() {
        this.f36577a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void x0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f36577a;
        profileActivity.f35918a.I0(true);
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && hz0Var.getCurrentListView() != null) {
            profileActivity.K.getCurrentListView().I0(true);
        }
        profileActivity.Z0.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.R4.f40817f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, profileActivity.f36064v0)));
    }

    @Override
    public void y(MessageObject messageObject) {
        org.telegram.ui.Components.rg0 rg0Var = this.f36577a.f35977i0;
        if (rg0Var != null && rg0Var.f32161a) {
            rg0Var.K.d(0.0f, true);
            rg0Var.invalidate();
        }
    }

    @Override
    public void c() {
    }
}
