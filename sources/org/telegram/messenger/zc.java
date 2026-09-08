package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class zc implements Utilities.Callback {
    public final int f19846a = 1;
    public final MessagesController f19847b;
    public final int f19848c;
    public final Object d;
    public final Object f19849e;
    public final TLObject f19850f;
    public final Runnable f19851g;

    public zc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19847b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f19849e = iArr;
        this.f19848c = i10;
        this.f19850f = chat;
        this.f19851g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19846a) {
            case 0:
                this.f19847b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f19849e, (TLRPC.User) this.f19850f, this.f19848c, (c3) this.f19851g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19847b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f19849e, this.f19848c, (TLRPC.Chat) this.f19850f, this.f19851g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19847b = messagesController;
        this.d = zArr;
        this.f19849e = botInfoArr;
        this.f19850f = user;
        this.f19848c = i10;
        this.f19851g = c3Var;
    }
}
