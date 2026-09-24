package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f36521a;
    public final wn f36522b;
    public final int f36523c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36524f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36525n;
    public final TLRPC.Chat f36526r;
    public final int f36527s;
    public final MessageObject v;

    public ph(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36521a = i13;
        this.f36522b = wnVar;
        this.f36523c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36524f = i11;
        this.h = messageObject;
        this.f36525n = tL_messages_getDiscussionMessage;
        this.f36526r = chat;
        this.f36527s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36521a) {
            case 0:
                wn wnVar = this.f36522b;
                wnVar.h8(new ph(wnVar, this.f36523c, this.d, this.e, this.f36524f, this.h, this.f36525n, this.f36526r, this.f36527s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f36522b;
                if (this.f36523c == wnVar2.ec) {
                    wnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.f39540lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.f39491hc = 0;
                        wnVar2.f39504ic = false;
                        wnVar2.f39680x0.f1();
                        return;
                    }
                    wnVar2.ya(wnVar2.f39529kc, wnVar2.f39540lc, this.f36524f, this.h, this.f36525n, this.f36526r, this.f36527s, this.v);
                    return;
                }
                return;
        }
    }
}
