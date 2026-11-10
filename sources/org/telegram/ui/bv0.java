package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bv0 implements jp {
    public final TLRPC.Chat f44144a;
    public final mp f44145b;
    public final ProfileActivity f44146c;

    public bv0(ProfileActivity profileActivity, TLRPC.Chat chat, mp mpVar) {
        this.f44146c = profileActivity;
        this.f44144a = chat;
        this.f44145b = mpVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f44146c;
        UndoView undoView = profileActivity.L;
        long j3 = -profileActivity.f41721e1;
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
        ProfileActivity profileActivity = this.f44146c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41714d1));
        if (a22 != null && (chat = this.f44144a) != null && profileActivity.f41714d1 != 0) {
            mp mpVar = this.f44145b;
            if (mpVar.Q && mpVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.f2 f2Var : mpVar.getParentLayout().getFragmentStack()) {
                    if (f2Var instanceof mb) {
                        mb mbVar = (mb) f2Var;
                        mbVar.a1();
                        org.telegram.messenger.g0.h3(new pc0(mbVar, a22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}
