package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20012a;
    public final Object f20013b;
    public final Object f20014c;
    public final Object d;
    public final Object f20015e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20012a = i10;
        this.f20014c = obj;
        this.f20013b = obj2;
        this.d = obj3;
        this.f20015e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20012a) {
            case 0:
                ((SavedMessagesController) this.f20014c).lambda$loadDialogs$2((TLObject) this.f20013b, (ArrayList) this.d, (TLRPC.TL_error) this.f20015e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20014c).lambda$performSendDelayedMessage$60((TLObject) this.f20013b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20015e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20014c).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f20013b, (ArrayList) this.d, (sj) this.f20015e);
                return;
            case 3:
                ((SendMessagesHelper) this.f20014c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f20013b, (File) this.d, (MessageObject) this.f20015e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f20014c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f20013b, (ArrayList) this.f20015e);
                return;
            default:
                ((UserNameResolver) this.f20014c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f20015e, (TLObject) this.f20013b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20012a = 5;
        this.f20014c = userNameResolver;
        this.d = str;
        this.f20015e = tL_error;
        this.f20013b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f20012a = 4;
        this.f20014c = unconfirmedAuthController;
        this.d = arrayList;
        this.f20013b = hashSet;
        this.f20015e = arrayList2;
    }
}
