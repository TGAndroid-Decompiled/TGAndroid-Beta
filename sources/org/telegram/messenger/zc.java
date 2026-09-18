package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class zc implements Utilities.Callback {
    public final int f18250a = 1;
    public final MessagesController f18251b;
    public final int f18252c;
    public final Object d;
    public final Object e;
    public final TLObject f18253f;
    public final Runnable f18254g;

    public zc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18251b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.f18252c = i10;
        this.f18253f = chat;
        this.f18254g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f18253f, this.f18252c, (c3) this.f18254g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18251b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.f18252c, (TLRPC.Chat) this.f18253f, this.f18254g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18251b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f18253f = user;
        this.f18252c = i10;
        this.f18254g = c3Var;
    }
}
