package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

public final class yc implements Utilities.Callback {

    public final int f22234a = 1;

    public final MessagesController f22235b;

    public final int f22236c;
    public final Object d;

    public final Object f22237e;

    public final TLObject f22238f;

    public final Runnable f22239g;

    public yc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f22235b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f22237e = iArr;
        this.f22236c = i10;
        this.f22238f = chat;
        this.f22239g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22234a) {
            case 0:
                this.f22235b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f22237e, (TLRPC.User) this.f22238f, this.f22236c, (d3) this.f22239g, (TL_bots.BotInfo) obj);
                break;
            default:
                this.f22235b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f22237e, this.f22236c, (TLRPC.Chat) this.f22238f, this.f22239g, (TLRPC.TL_messages_invitedUsers) obj);
                break;
        }
    }

    public yc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, d3 d3Var) {
        this.f22235b = messagesController;
        this.d = zArr;
        this.f22237e = botInfoArr;
        this.f22238f = user;
        this.f22236c = i10;
        this.f22239g = d3Var;
    }
}
