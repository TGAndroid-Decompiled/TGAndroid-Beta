package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f22350a = 0;
    public final SendMessagesHelper f22351b;
    public final MessageObject f22352c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f22353e;
    public final boolean f22354f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f22355n;
    public final HashMap f22356r;
    public final boolean f22357s;
    public final Object v;
    public final TLObject f22358w;
    public final TLObject f22359x;

    public zi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f22351b = sendMessagesHelper;
        this.v = tLObject;
        this.f22359x = tL_messages_addPollAnswer;
        this.f22358w = tLObject2;
        this.f22352c = messageObject;
        this.d = str;
        this.f22353e = delayedMessage;
        this.f22354f = z10;
        this.h = delayedMessage2;
        this.f22355n = obj;
        this.f22356r = hashMap;
        this.f22357s = z11;
    }

    @Override
    public final void run() {
        switch (this.f22350a) {
            case 0:
                HashMap hashMap = this.f22356r;
                boolean z10 = this.f22357s;
                this.f22351b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f22359x, this.f22358w, this.f22352c, this.d, this.f22353e, this.f22354f, this.h, this.f22355n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f22356r;
                boolean z11 = this.f22357s;
                this.f22351b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f22358w, (TLRPC.TL_messages_sendMedia) this.f22359x, this.f22352c, this.d, this.f22353e, this.f22354f, this.h, this.f22355n, hashMap2, z11);
                return;
        }
    }

    public zi(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f22351b = sendMessagesHelper;
        this.v = o2Var;
        this.f22358w = tL_inputMediaStakeDice;
        this.f22359x = tL_messages_sendMedia;
        this.f22352c = messageObject;
        this.d = str;
        this.f22353e = delayedMessage;
        this.f22354f = z10;
        this.h = delayedMessage2;
        this.f22355n = obj;
        this.f22356r = hashMap;
        this.f22357s = z11;
    }
}
