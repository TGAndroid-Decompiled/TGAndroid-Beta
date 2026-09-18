package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class zc implements Utilities.Callback {
    public final int f18076a = 1;
    public final MessagesController f18077b;
    public final int f18078c;
    public final Object d;
    public final Object e;
    public final TLObject f18079f;
    public final Runnable f18080g;

    public zc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18077b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.f18078c = i10;
        this.f18079f = chat;
        this.f18080g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18076a) {
            case 0:
                this.f18077b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f18079f, this.f18078c, (c3) this.f18080g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18077b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.f18078c, (TLRPC.Chat) this.f18079f, this.f18080g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18077b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f18079f = user;
        this.f18078c = i10;
        this.f18080g = c3Var;
    }
}
