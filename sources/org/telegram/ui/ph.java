package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f36637a;
    public final wn f36638b;
    public final int f36639c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36640f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36641n;
    public final TLRPC.Chat f36642r;
    public final int f36643s;
    public final MessageObject v;

    public ph(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36637a = i13;
        this.f36638b = wnVar;
        this.f36639c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36640f = i11;
        this.h = messageObject;
        this.f36641n = tL_messages_getDiscussionMessage;
        this.f36642r = chat;
        this.f36643s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36637a) {
            case 0:
                wn wnVar = this.f36638b;
                wnVar.h8(new ph(wnVar, this.f36639c, this.d, this.e, this.f36640f, this.h, this.f36641n, this.f36642r, this.f36643s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f36638b;
                if (this.f36639c == wnVar2.ec) {
                    wnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.f39648lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.f39599hc = 0;
                        wnVar2.f39612ic = false;
                        wnVar2.f39788x0.h1();
                        return;
                    }
                    wnVar2.ya(wnVar2.f39637kc, wnVar2.f39648lc, this.f36640f, this.h, this.f36641n, this.f36642r, this.f36643s, this.v);
                    return;
                }
                return;
        }
    }
}
