package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f20013a;
    public final Object f20014b;
    public final Object f20015c;
    public final Object d;
    public final Object f20016e;

    public zi(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20013a = i10;
        this.f20014b = obj;
        this.f20015c = obj2;
        this.d = obj3;
        this.f20016e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20013a) {
            case 0:
                ((SendMessagesHelper) this.f20014b).lambda$performSendDelayedMessage$60((TLObject) this.f20015c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20016e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20014b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f20015c, (ArrayList) this.d, (sj) this.f20016e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20014b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f20015c, (MessageObject) this.f20016e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f20014b).lambda$readCache$0((ArrayList) this.f20015c, (HashSet) this.d, (ArrayList) this.f20016e);
                return;
            default:
                ((UserNameResolver) this.f20014b).lambda$resolve$0((String) this.f20016e, (TLRPC.TL_error) this.d, (TLObject) this.f20015c);
                return;
        }
    }

    public zi(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20013a = 4;
        this.f20014b = userNameResolver;
        this.f20016e = str;
        this.d = tL_error;
        this.f20015c = tLObject;
    }

    public zi(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f20013a = 2;
        this.f20014b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f20015c = file;
        this.f20016e = messageObject;
    }
}
