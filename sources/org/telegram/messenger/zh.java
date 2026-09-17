package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f19880a;
    public final Object f19881b;
    public final Object f19882c;
    public final Object d;
    public final Object f19883e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19880a = i10;
        this.f19882c = obj;
        this.f19881b = obj2;
        this.d = obj3;
        this.f19883e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19880a) {
            case 0:
                ((SavedMessagesController) this.f19882c).lambda$loadDialogs$2((TLObject) this.f19881b, (ArrayList) this.d, (TLRPC.TL_error) this.f19883e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19882c).lambda$performSendDelayedMessage$57((TLObject) this.f19881b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19883e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19882c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f19881b, (ArrayList) this.d, (fj) this.f19883e);
                return;
            case 3:
                ((SendMessagesHelper) this.f19882c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f19881b, (File) this.d, (MessageObject) this.f19883e);
                return;
            case 4:
                ((TelegramMediaSession) this.f19882c).lambda$loadBrowseChildren$4((MessagesStorage) this.f19881b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19883e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f19882c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f19881b, (ArrayList) this.f19883e);
                return;
            default:
                ((UserNameResolver) this.f19882c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f19883e, (TLObject) this.f19881b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19880a = 6;
        this.f19882c = userNameResolver;
        this.d = str;
        this.f19883e = tL_error;
        this.f19881b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f19880a = 5;
        this.f19882c = unconfirmedAuthController;
        this.d = arrayList;
        this.f19881b = hashSet;
        this.f19883e = arrayList2;
    }
}
