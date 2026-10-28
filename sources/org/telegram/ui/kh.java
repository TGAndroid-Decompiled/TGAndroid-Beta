package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f40797a;
    public final wn f40798b;
    public final int f40799c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f40800f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f40801n;
    public final TLRPC.Chat f40802r;
    public final int f40803s;
    public final MessageObject v;

    public kh(wn wnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f40797a = i13;
        this.f40798b = wnVar;
        this.f40799c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f40800f = i11;
        this.h = messageObject;
        this.f40801n = tL_messages_getDiscussionMessage;
        this.f40802r = chat;
        this.f40803s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f40797a) {
            case 0:
                wn wnVar = this.f40798b;
                wnVar.q8(new kh(wnVar, this.f40799c, this.d, this.e, this.f40800f, this.h, this.f40801n, this.f40802r, this.f40803s, this.v, 1));
                return;
            default:
                wn wnVar2 = this.f40798b;
                if (this.f40799c == wnVar2.Fc) {
                    wnVar2.Hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wnVar2.Mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(wnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        wnVar2.Ic = 0;
                        wnVar2.Jc = false;
                        wnVar2.f45339x0.g1();
                        return;
                    }
                    wnVar2.Ka(wnVar2.Lc, wnVar2.Mc, this.f40800f, this.h, this.f40801n, this.f40802r, this.f40803s, this.v);
                    return;
                }
                return;
        }
    }
}
