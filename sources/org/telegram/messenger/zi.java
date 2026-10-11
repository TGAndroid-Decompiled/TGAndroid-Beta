package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f20049a;
    public final Object f20050b;
    public final Object f20051c;
    public final Object d;
    public final Object f20052e;

    public zi(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20049a = i10;
        this.f20050b = obj;
        this.f20051c = obj2;
        this.d = obj3;
        this.f20052e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20049a) {
            case 0:
                ((SendMessagesHelper) this.f20050b).lambda$performSendDelayedMessage$60((TLObject) this.f20051c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20052e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20050b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f20051c, (ArrayList) this.d, (sj) this.f20052e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20050b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f20051c, (MessageObject) this.f20052e);
                return;
            case 3:
                ((UnconfirmedAuthController) this.f20050b).lambda$readCache$0((ArrayList) this.f20051c, (HashSet) this.d, (ArrayList) this.f20052e);
                return;
            default:
                ((UserNameResolver) this.f20050b).lambda$resolve$0((String) this.f20052e, (TLRPC.TL_error) this.d, (TLObject) this.f20051c);
                return;
        }
    }

    public zi(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20049a = 4;
        this.f20050b = userNameResolver;
        this.f20052e = str;
        this.d = tL_error;
        this.f20051c = tLObject;
    }

    public zi(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f20049a = 2;
        this.f20050b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f20051c = file;
        this.f20052e = messageObject;
    }
}
