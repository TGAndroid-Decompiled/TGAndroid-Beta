package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20031a;
    public final Object f20032b;
    public final Object f20033c;
    public final Object d;
    public final Object f20034e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20031a = i10;
        this.f20033c = obj;
        this.f20032b = obj2;
        this.d = obj3;
        this.f20034e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20031a) {
            case 0:
                ((SavedMessagesController) this.f20033c).lambda$loadDialogs$2((TLObject) this.f20032b, (ArrayList) this.d, (TLRPC.TL_error) this.f20034e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20033c).lambda$performSendDelayedMessage$57((TLObject) this.f20032b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20034e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20033c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f20032b, (ArrayList) this.d, (gj) this.f20034e);
                return;
            case 3:
                ((SendMessagesHelper) this.f20033c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f20032b, (File) this.d, (MessageObject) this.f20034e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f20033c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f20032b, (ArrayList) this.f20034e);
                return;
            default:
                ((UserNameResolver) this.f20033c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f20034e, (TLObject) this.f20032b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20031a = 5;
        this.f20033c = userNameResolver;
        this.d = str;
        this.f20034e = tL_error;
        this.f20032b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f20031a = 4;
        this.f20033c = unconfirmedAuthController;
        this.d = arrayList;
        this.f20032b = hashSet;
        this.f20034e = arrayList2;
    }
}
