package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class zc implements Utilities.Callback {
    public final int f18064a = 1;
    public final MessagesController f18065b;
    public final int f18066c;
    public final Object d;
    public final Object e;
    public final TLObject f18067f;
    public final Runnable f18068g;

    public zc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18065b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.f18066c = i10;
        this.f18067f = chat;
        this.f18068g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18064a) {
            case 0:
                this.f18065b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f18067f, this.f18066c, (c3) this.f18068g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18065b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.f18066c, (TLRPC.Chat) this.f18067f, this.f18068g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18065b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f18067f = user;
        this.f18066c = i10;
        this.f18068g = c3Var;
    }
}
