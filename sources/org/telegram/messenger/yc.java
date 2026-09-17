package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class yc implements Utilities.Callback {
    public final int f19736a = 1;
    public final MessagesController f19737b;
    public final int f19738c;
    public final Object d;
    public final Object f19739e;
    public final TLObject f19740f;
    public final Runnable f19741g;

    public yc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19737b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f19739e = iArr;
        this.f19738c = i10;
        this.f19740f = chat;
        this.f19741g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19736a) {
            case 0:
                this.f19737b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f19739e, (TLRPC.User) this.f19740f, this.f19738c, (c3) this.f19741g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19737b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f19739e, this.f19738c, (TLRPC.Chat) this.f19740f, this.f19741g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public yc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19737b = messagesController;
        this.d = zArr;
        this.f19739e = botInfoArr;
        this.f19740f = user;
        this.f19738c = i10;
        this.f19741g = c3Var;
    }
}
