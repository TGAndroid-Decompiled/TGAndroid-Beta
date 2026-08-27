package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class yi implements Runnable {

    public final int f22264a;

    public final Object f22265b;

    public final Object f22266c;
    public final Object d;

    public final Object f22267e;

    public yi(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f22264a = i10;
        this.f22265b = obj;
        this.f22266c = obj2;
        this.d = obj3;
        this.f22267e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f22264a) {
            case 0:
                ((SendMessagesHelper) this.f22265b).lambda$performSendDelayedMessage$57((TLObject) this.f22266c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f22267e);
                break;
            case 1:
                ((SendMessagesHelper) this.f22265b).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f22266c, (ArrayList) this.d, (cj) this.f22267e);
                break;
            case 2:
                ((SendMessagesHelper) this.f22265b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.d, (File) this.f22266c, (MessageObject) this.f22267e);
                break;
            case 3:
                ((TelegramMediaSession) this.f22265b).lambda$loadBrowseChildren$4((MessagesStorage) this.f22266c, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f22267e);
                break;
            case 4:
                ((UnconfirmedAuthController) this.f22265b).lambda$readCache$0((ArrayList) this.f22266c, (HashSet) this.d, (ArrayList) this.f22267e);
                break;
            default:
                ((UserNameResolver) this.f22265b).lambda$resolve$0((String) this.f22267e, (TLRPC.TL_error) this.d, (TLObject) this.f22266c);
                break;
        }
    }

    public yi(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f22264a = 5;
        this.f22265b = userNameResolver;
        this.f22267e = str;
        this.d = tL_error;
        this.f22266c = tLObject;
    }

    public yi(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        this.f22264a = 2;
        this.f22265b = sendMessagesHelper;
        this.d = delayedMessage;
        this.f22266c = file;
        this.f22267e = messageObject;
    }
}
