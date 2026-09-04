package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class zc implements Utilities.Callback {
    public final int f19819a = 1;
    public final MessagesController f19820b;
    public final int f19821c;
    public final Object d;
    public final Object f19822e;
    public final TLObject f19823f;
    public final Runnable f19824g;

    public zc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19820b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f19822e = iArr;
        this.f19821c = i10;
        this.f19823f = chat;
        this.f19824g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19819a) {
            case 0:
                this.f19820b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f19822e, (TLRPC.User) this.f19823f, this.f19821c, (c3) this.f19824g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19820b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f19822e, this.f19821c, (TLRPC.Chat) this.f19823f, this.f19824g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19820b = messagesController;
        this.d = zArr;
        this.f19822e = botInfoArr;
        this.f19823f = user;
        this.f19821c = i10;
        this.f19824g = c3Var;
    }
}
