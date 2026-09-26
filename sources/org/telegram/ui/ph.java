package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f36531a;
    public final wn f36532b;
    public final int f36533c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36534f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36535n;
    public final TLRPC.Chat f36536r;
    public final int f36537s;
    public final MessageObject v;

    public ph(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36531a = i13;
        this.f36532b = wnVar;
        this.f36533c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36534f = i11;
        this.h = messageObject;
        this.f36535n = tL_messages_getDiscussionMessage;
        this.f36536r = chat;
        this.f36537s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36531a) {
            case 0:
                wn wnVar = this.f36532b;
                wnVar.h8(new ph(wnVar, this.f36533c, this.d, this.e, this.f36534f, this.h, this.f36535n, this.f36536r, this.f36537s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f36532b;
                if (this.f36533c == wnVar2.ec) {
                    wnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.f39554lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.f39505hc = 0;
                        wnVar2.f39518ic = false;
                        wnVar2.f39694x0.f1();
                        return;
                    }
                    wnVar2.ya(wnVar2.f39543kc, wnVar2.f39554lc, this.f36534f, this.h, this.f36535n, this.f36536r, this.f36537s, this.v);
                    return;
                }
                return;
        }
    }
}
