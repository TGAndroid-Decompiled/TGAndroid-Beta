package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class yc implements Utilities.Callback {
    public final int f19763a = 1;
    public final MessagesController f19764b;
    public final int f19765c;
    public final Object d;
    public final Object f19766e;
    public final TLObject f19767f;
    public final Runnable f19768g;

    public yc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19764b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f19766e = iArr;
        this.f19765c = i10;
        this.f19767f = chat;
        this.f19768g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19763a) {
            case 0:
                this.f19764b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f19766e, (TLRPC.User) this.f19767f, this.f19765c, (c3) this.f19768g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19764b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f19766e, this.f19765c, (TLRPC.Chat) this.f19767f, this.f19768g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public yc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19764b = messagesController;
        this.d = zArr;
        this.f19766e = botInfoArr;
        this.f19767f = user;
        this.f19765c = i10;
        this.f19768g = c3Var;
    }
}
