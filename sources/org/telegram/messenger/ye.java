package org.telegram.messenger;

import java.util.ArrayList;
public final class ye implements Runnable {
    public final int f17071a = 0;
    public final MessagesStorage f17072b;
    public final boolean f17073c;
    public final ArrayList d;

    public ye(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17072b = messagesStorage;
        this.d = arrayList;
        this.f17073c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17071a) {
            case 0:
                this.f17072b.lambda$putEphemeralMessages$204(this.d, this.f17073c);
                return;
            default:
                this.f17072b.lambda$putContacts$146(this.f17073c, this.d);
                return;
        }
    }

    public ye(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17072b = messagesStorage;
        this.f17073c = z10;
        this.d = arrayList;
    }
}
