package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20017a;
    public final Object f20018b;
    public final Object f20019c;
    public final Object d;
    public final Object f20020e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20017a = i10;
        this.f20019c = obj;
        this.f20018b = obj2;
        this.d = obj3;
        this.f20020e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20017a) {
            case 0:
                ((SavedMessagesController) this.f20019c).lambda$loadDialogs$2((TLObject) this.f20018b, (ArrayList) this.d, (TLRPC.TL_error) this.f20020e);
                return;
            case 1:
                ((SendMessagesHelper) this.f20019c).lambda$performSendDelayedMessage$57((TLObject) this.f20018b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20020e);
                return;
            case 2:
                ((SendMessagesHelper) this.f20019c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f20018b, (ArrayList) this.d, (fj) this.f20020e);
                return;
            case 3:
                ((SendMessagesHelper) this.f20019c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f20018b, (File) this.d, (MessageObject) this.f20020e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f20019c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f20018b, (ArrayList) this.f20020e);
                return;
            default:
                ((UserNameResolver) this.f20019c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f20020e, (TLObject) this.f20018b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20017a = 5;
        this.f20019c = userNameResolver;
        this.d = str;
        this.f20020e = tL_error;
        this.f20018b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f20017a = 4;
        this.f20019c = unconfirmedAuthController;
        this.d = arrayList;
        this.f20018b = hashSet;
        this.f20020e = arrayList2;
    }
}
