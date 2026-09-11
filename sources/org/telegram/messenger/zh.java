package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f19853a;
    public final Object f19854b;
    public final Object f19855c;
    public final Object d;
    public final Object f19856e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19853a = i10;
        this.f19855c = obj;
        this.f19854b = obj2;
        this.d = obj3;
        this.f19856e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19853a) {
            case 0:
                ((SavedMessagesController) this.f19855c).lambda$loadDialogs$2((TLObject) this.f19854b, (ArrayList) this.d, (TLRPC.TL_error) this.f19856e);
                return;
            case 1:
                ((SendMessagesHelper) this.f19855c).lambda$performSendDelayedMessage$57((TLObject) this.f19854b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19856e);
                return;
            case 2:
                ((SendMessagesHelper) this.f19855c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f19854b, (ArrayList) this.d, (fj) this.f19856e);
                return;
            case 3:
                ((SendMessagesHelper) this.f19855c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f19854b, (File) this.d, (MessageObject) this.f19856e);
                return;
            case 4:
                ((TelegramMediaSession) this.f19855c).lambda$loadBrowseChildren$4((MessagesStorage) this.f19854b, (TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.f19856e);
                return;
            case 5:
                ((UnconfirmedAuthController) this.f19855c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f19854b, (ArrayList) this.f19856e);
                return;
            default:
                ((UserNameResolver) this.f19855c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.f19856e, (TLObject) this.f19854b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19853a = 6;
        this.f19855c = userNameResolver;
        this.d = str;
        this.f19856e = tL_error;
        this.f19854b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f19853a = 5;
        this.f19855c = unconfirmedAuthController;
        this.d = arrayList;
        this.f19854b = hashSet;
        this.f19856e = arrayList2;
    }
}
