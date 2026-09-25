package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f18318a;
    public final Object f18319b;
    public final Object f18320c;
    public final Object d;
    public final Object e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18318a = i10;
        this.f18320c = obj;
        this.f18319b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                ((SavedMessagesController) this.f18320c).lambda$loadDialogs$2((TLObject) this.f18319b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f18320c).lambda$performSendDelayedMessage$57((TLObject) this.f18319b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f18320c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f18319b, (ArrayList) this.d, (fj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f18320c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f18319b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f18320c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f18319b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f18320c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f18319b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18318a = 5;
        this.f18320c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f18319b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f18318a = 4;
        this.f18320c = unconfirmedAuthController;
        this.d = arrayList;
        this.f18319b = hashSet;
        this.e = arrayList2;
    }
}
