package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f36532a;
    public final wn f36533b;
    public final int f36534c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36535f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36536n;
    public final TLRPC.Chat f36537r;
    public final int f36538s;
    public final MessageObject v;

    public ph(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36532a = i13;
        this.f36533b = wnVar;
        this.f36534c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36535f = i11;
        this.h = messageObject;
        this.f36536n = tL_messages_getDiscussionMessage;
        this.f36537r = chat;
        this.f36538s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36532a) {
            case 0:
                wn wnVar = this.f36533b;
                wnVar.h8(new ph(wnVar, this.f36534c, this.d, this.e, this.f36535f, this.h, this.f36536n, this.f36537r, this.f36538s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f36533b;
                if (this.f36534c == wnVar2.ec) {
                    wnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.f39555lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.f39506hc = 0;
                        wnVar2.f39519ic = false;
                        wnVar2.f39695x0.f1();
                        return;
                    }
                    wnVar2.ya(wnVar2.f39544kc, wnVar2.f39555lc, this.f36535f, this.h, this.f36536n, this.f36537r, this.f36538s, this.v);
                    return;
                }
                return;
        }
    }
}
