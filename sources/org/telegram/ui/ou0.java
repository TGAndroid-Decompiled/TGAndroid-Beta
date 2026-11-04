package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ou0 implements fp {
    public final TLRPC.Chat f48354a;
    public final ip f48355b;
    public final ProfileActivity f48356c;

    public ou0(ProfileActivity profileActivity, TLRPC.Chat chat, ip ipVar) {
        this.f48356c = profileActivity;
        this.f48354a = chat;
        this.f48355b = ipVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i3;
        ProfileActivity profileActivity = this.f48356c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f41759f1;
        if (profileActivity.E2.megagroup) {
            i3 = 10;
        } else {
            i3 = 9;
        }
        undoView.m(j10, user, i3);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f48356c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1));
        if (a22 != null && (chat = this.f48354a) != null && profileActivity.f41751e1 != 0) {
            ip ipVar = this.f48355b;
            if (ipVar.R && ipVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.d2 d2Var : ipVar.getParentLayout().getFragmentStack()) {
                    if (d2Var instanceof kb) {
                        kb kbVar = (kb) d2Var;
                        kbVar.a1();
                        org.telegram.messenger.g0.h3(new hc0(kbVar, a22, chat, 29));
                        return;
                    }
                }
            }
        }
    }
}
