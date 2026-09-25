package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f36533a;
    public final wn f36534b;
    public final int f36535c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36536f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36537n;
    public final TLRPC.Chat f36538r;
    public final int f36539s;
    public final MessageObject v;

    public ph(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36533a = i13;
        this.f36534b = wnVar;
        this.f36535c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36536f = i11;
        this.h = messageObject;
        this.f36537n = tL_messages_getDiscussionMessage;
        this.f36538r = chat;
        this.f36539s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36533a) {
            case 0:
                wn wnVar = this.f36534b;
                wnVar.h8(new ph(wnVar, this.f36535c, this.d, this.e, this.f36536f, this.h, this.f36537n, this.f36538r, this.f36539s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f36534b;
                if (this.f36535c == wnVar2.ec) {
                    wnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.f39556lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.f39507hc = 0;
                        wnVar2.f39520ic = false;
                        wnVar2.f39696x0.f1();
                        return;
                    }
                    wnVar2.ya(wnVar2.f39545kc, wnVar2.f39556lc, this.f36536f, this.h, this.f36537n, this.f36538r, this.f36539s, this.v);
                    return;
                }
                return;
        }
    }
}
