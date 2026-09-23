package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh implements Runnable {
    public final int f36434a;
    public final xn f36435b;
    public final int f36436c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36437f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36438n;
    public final TLRPC.Chat f36439r;
    public final int f36440s;
    public final MessageObject v;

    public qh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36434a = i13;
        this.f36435b = xnVar;
        this.f36436c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36437f = i11;
        this.h = messageObject;
        this.f36438n = tL_messages_getDiscussionMessage;
        this.f36439r = chat;
        this.f36440s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36434a) {
            case 0:
                xn xnVar = this.f36435b;
                xnVar.h8(new qh(xnVar, this.f36436c, this.d, this.e, this.f36437f, this.h, this.f36438n, this.f36439r, this.f36440s, this.v, 1));
                return;
            default:
                xn xnVar2 = this.f36435b;
                if (this.f36436c == xnVar2.ec) {
                    xnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        xnVar2.f39456lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        xnVar2.f39407hc = 0;
                        xnVar2.f39420ic = false;
                        xnVar2.f39596x0.f1();
                        return;
                    }
                    xnVar2.ya(xnVar2.f39445kc, xnVar2.f39456lc, this.f36437f, this.h, this.f36438n, this.f36439r, this.f36440s, this.v);
                    return;
                }
                return;
        }
    }
}
