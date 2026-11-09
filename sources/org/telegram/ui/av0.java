package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class av0 implements jp {
    public final TLRPC.Chat f43794a;
    public final mp f43795b;
    public final ProfileActivity f43796c;

    public av0(ProfileActivity profileActivity, TLRPC.Chat chat, mp mpVar) {
        this.f43796c = profileActivity;
        this.f43794a = chat;
        this.f43795b = mpVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f43796c;
        UndoView undoView = profileActivity.L;
        long j3 = -profileActivity.f41730e1;
        if (profileActivity.D2.megagroup) {
            i7 = 10;
        } else {
            i7 = 9;
        }
        undoView.m(j3, user, i7);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f43796c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1));
        if (a22 != null && (chat = this.f43794a) != null && profileActivity.f41723d1 != 0) {
            mp mpVar = this.f43795b;
            if (mpVar.Q && mpVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.f2 f2Var : mpVar.getParentLayout().getFragmentStack()) {
                    if (f2Var instanceof mb) {
                        mb mbVar = (mb) f2Var;
                        mbVar.a1();
                        org.telegram.messenger.g0.h3(new oc0(mbVar, a22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}
