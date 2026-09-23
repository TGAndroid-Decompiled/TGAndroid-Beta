package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f18069a;
    public final Object f18070b;
    public final Object f18071c;
    public final Object d;
    public final Object e;

    public zh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18069a = i10;
        this.f18071c = obj;
        this.f18070b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18069a) {
            case 0:
                ((SavedMessagesController) this.f18071c).lambda$loadDialogs$2((TLObject) this.f18070b, (ArrayList) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f18071c).lambda$performSendDelayedMessage$57((TLObject) this.f18070b, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e);
                return;
            case 2:
                ((SendMessagesHelper) this.f18071c).lambda$sendMessage$19((TLRPC.TL_messages_forwardMessages) this.f18070b, (ArrayList) this.d, (fj) this.e);
                return;
            case 3:
                ((SendMessagesHelper) this.f18071c).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f18070b, (File) this.d, (MessageObject) this.e);
                return;
            case 4:
                ((UnconfirmedAuthController) this.f18071c).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f18070b, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f18071c).lambda$resolve$0((String) this.d, (TLRPC.TL_error) this.e, (TLObject) this.f18070b);
                return;
        }
    }

    public zh(String str, UserNameResolver userNameResolver, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18069a = 5;
        this.f18071c = userNameResolver;
        this.d = str;
        this.e = tL_error;
        this.f18070b = tLObject;
    }

    public zh(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f18069a = 4;
        this.f18071c = unconfirmedAuthController;
        this.d = arrayList;
        this.f18070b = hashSet;
        this.e = arrayList2;
    }
}
