package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ky0 implements org.telegram.ui.ActionBar.r0, uu0, org.telegram.ui.Components.o8 {
    public final ProfileActivity f39088a;

    public ky0(ProfileActivity profileActivity) {
        this.f39088a = profileActivity;
    }

    @Override
    public void H0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f39088a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34040w2 == null && profileActivity.f34032v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34040w2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34032v2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public TextureView U() {
        return null;
    }

    @Override
    public void Y0() {
        this.f39088a.presentFragment(new u4());
        dismiss();
    }

    @Override
    public void d() {
        org.telegram.ui.Components.cn0.d(new f5(this.f39088a, 18));
    }

    @Override
    public void dismiss() {
        this.f39088a.U0.M(null, null);
    }

    @Override
    public void m0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f39088a;
        profileActivity.f33882a.I0(true);
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null && rz0Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f33913e1.setBackgroundColor(i0.a.f(0.1f, profileActivity.R3(profileActivity.X4.f43978f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, profileActivity.A0)));
    }

    @Override
    public void z(MessageObject messageObject) {
        org.telegram.ui.Components.fi0 fi0Var = this.f39088a.f33974n0;
        if (fi0Var != null && fi0Var.f26333a) {
            fi0Var.O.d(0.0f, true);
            fi0Var.invalidate();
        }
    }

    @Override
    public void c() {
    }
}
