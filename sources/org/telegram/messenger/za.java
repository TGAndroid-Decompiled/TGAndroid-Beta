package org.telegram.messenger;

import java.util.ArrayList;
public final class za implements Runnable {
    public final int f21981a;
    public final MessagesController f21982b;
    public final ArrayList f21983c;

    public za(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.f21981a = i10;
        this.f21982b = messagesController;
        this.f21983c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21981a) {
            case 0:
                this.f21982b.lambda$processUpdates$384(this.f21983c);
                return;
            case 1:
                this.f21982b.lambda$processUpdateArray$404(this.f21983c);
                return;
            case 2:
                this.f21982b.lambda$processUpdateArray$403(this.f21983c);
                return;
            case 3:
                this.f21982b.lambda$checkChatInviter$374(this.f21983c);
                return;
            case 4:
                this.f21982b.lambda$processUpdates$383(this.f21983c);
                return;
            case 5:
                this.f21982b.lambda$getChannelDifference$342(this.f21983c);
                return;
            case 6:
                this.f21982b.lambda$reloadMentionsCountForChannels$221(this.f21983c);
                return;
            default:
                this.f21982b.lambda$checkChatInviter$373(this.f21983c);
                return;
        }
    }
}
