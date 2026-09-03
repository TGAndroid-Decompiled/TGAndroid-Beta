package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bz0 implements iq {
    public final TLRPC.Chat f32963a;
    public final lq f32964b;
    public final ProfileActivity f32965c;

    public bz0(ProfileActivity profileActivity, TLRPC.Chat chat, lq lqVar) {
        this.f32965c = profileActivity;
        this.f32963a = chat;
        this.f32964b = lqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f32965c;
        UndoView undoView = profileActivity.J;
        long j10 = -profileActivity.f32019c1;
        if (profileActivity.B2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f32965c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32011b1));
        if (user != null && (chat = this.f32963a) != null && profileActivity.f32011b1 != 0) {
            lq lqVar = this.f32964b;
            if (lqVar.N && lqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.p2 p2Var : lqVar.getParentLayout().getFragmentStack()) {
                    if (p2Var instanceof ub) {
                        ub ubVar = (ub) p2Var;
                        ubVar.W0();
                        AndroidUtilities.runOnUIThread(new jf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
