package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class iw0 implements fq {
    public final TLRPC.Chat f38359a;
    public final iq f38360b;
    public final ProfileActivity f38361c;

    public iw0(ProfileActivity profileActivity, TLRPC.Chat chat, iq iqVar) {
        this.f38361c = profileActivity;
        this.f38359a = chat;
        this.f38360b = iqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f38361c;
        UndoView undoView = profileActivity.L;
        long j10 = -profileActivity.f33803e1;
        if (profileActivity.D2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f38361c;
        profileActivity.removeSelfFromStack();
        TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1));
        if (Z1 != null && (chat = this.f38359a) != null && profileActivity.f33796d1 != 0) {
            iq iqVar = this.f38360b;
            if (iqVar.Q && iqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.k2 k2Var : iqVar.getParentLayout().getFragmentStack()) {
                    if (k2Var instanceof sb) {
                        sb sbVar = (sb) k2Var;
                        sbVar.Z0();
                        org.telegram.messenger.i0.g3(new qd0(sbVar, Z1, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}
