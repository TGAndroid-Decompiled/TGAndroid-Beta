package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20026a;
    public final Object f20027b;
    public final Object f20028c;
    public final Object d;
    public final Object f20029e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20026a = i10;
        this.f20028c = obj;
        this.f20027b = obj2;
        this.d = obj3;
        this.f20029e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20026a) {
            case 0:
                ((SavedMessagesController) this.f20028c).lambda$loadDialogs$2((TLObject) this.f20027b, (ArrayList) this.d, (TLRPC.TL_error) this.f20029e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20028c).lambda$performSendDelayedMessage$57((TLObject) this.f20027b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20029e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20028c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f20027b, (ArrayList) this.d, (gj) this.f20029e);
                return;
            case 3:
                ((SendMessagesHelper) this.f20028c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f20027b, (File) this.d, (MessageObject) this.f20029e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f20028c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f20027b, (ArrayList) this.f20029e);
                return;
            default:
                ((UserNameResolver) this.f20028c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f20029e, (TLObject) this.f20027b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20026a = 5;
        this.f20028c = userNameResolver;
        this.d = str;
        this.f20029e = tL_error;
        this.f20027b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f20026a = 4;
        this.f20028c = unconfirmedAuthController;
        this.d = arrayList;
        this.f20027b = hashSet;
        this.f20029e = arrayList2;
    }
}
