package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f21934a;
    public final Object f21935b;
    public final Object f21936c;
    public final Object d;
    public final Object e;

    public yj(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21934a = i10;
        this.f21935b = obj;
        this.f21936c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21934a) {
            case 0:
                ((SendMessagesHelper) this.f21935b).lambda$sendMessage$22((TLRPC.TL_messages_forwardMessages) this.f21936c, (ArrayList) this.d, (tj) this.e);
                return;
            case 1:
                ((SendMessagesHelper) this.f21935b).lambda$didReceivedNotification$4((SendMessagesHelper.DelayedMessage) this.f21936c, (File) this.d, (MessageObject) this.e);
                return;
            case 2:
                ((UnconfirmedAuthController) this.f21935b).lambda$readCache$0((ArrayList) this.d, (HashSet) this.f21936c, (ArrayList) this.e);
                return;
            default:
                ((UserNameResolver) this.f21935b).lambda$resolve$0((String) this.f21936c, (TLRPC.TL_error) this.d, (TLObject) this.e);
                return;
        }
    }

    public yj(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        this.f21934a = 2;
        this.f21935b = unconfirmedAuthController;
        this.d = arrayList;
        this.f21936c = hashSet;
        this.e = arrayList2;
    }
}
