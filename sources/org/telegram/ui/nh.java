package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f39356a;
    public final xn f39357b;
    public final int f39358c;
    public final TLObject d;
    public final TLRPC.TL_error f39359e;
    public final int f39360f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f39361n;
    public final TLRPC.Chat f39362r;
    public final int f39363s;
    public final MessageObject v;

    public nh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f39356a = i13;
        this.f39357b = xnVar;
        this.f39358c = i10;
        this.d = tLObject;
        this.f39359e = tL_error;
        this.f39360f = i11;
        this.h = messageObject;
        this.f39361n = tL_messages_getDiscussionMessage;
        this.f39362r = chat;
        this.f39363s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f39356a) {
            case 0:
                xn xnVar = this.f39357b;
                xnVar.h8(new nh(xnVar, this.f39358c, this.d, this.f39359e, this.f39360f, this.h, this.f39361n, this.f39362r, this.f39363s, this.v, 1));
                return;
            default:
                xn xnVar2 = this.f39357b;
                if (this.f39358c == xnVar2.f43129cc) {
                    xnVar2.f43155ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        xnVar2.jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f39359e.text)) {
                        MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        xnVar2.f43168fc = 0;
                        xnVar2.f43181gc = false;
                        xnVar2.f43340u0.e1();
                        return;
                    }
                    xnVar2.ya(xnVar2.ic, xnVar2.jc, this.f39360f, this.h, this.f39361n, this.f39362r, this.f39363s, this.v);
                    return;
                }
                return;
        }
    }
}
