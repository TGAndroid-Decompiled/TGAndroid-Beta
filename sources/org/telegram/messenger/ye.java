package org.telegram.messenger;

import java.util.ArrayList;
public final class ye implements Runnable {
    public final int f21913a;
    public final MessagesStorage f21914b;
    public final long f21915c;
    public final ArrayList d;

    public ye(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.f21913a = i10;
        this.f21914b = messagesStorage;
        this.f21915c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21913a) {
            case 0:
                this.f21914b.lambda$updateChannelUsers$129(this.f21915c, this.d);
                return;
            case 1:
                this.f21914b.lambda$deleteSavedDialog$57(this.f21915c, this.d);
                return;
            case 2:
                this.f21914b.lambda$createTaskForSecretChat$121(this.f21915c, this.d);
                return;
            case 3:
                this.f21914b.lambda$markVoiceMessageContentAsRead$221(this.d, this.f21915c);
                return;
            case 4:
                this.f21914b.lambda$markMessagesAsDeletedInternal$230(this.d, this.f21915c);
                return;
            case 5:
                this.f21914b.lambda$deleteUserChatHistory$89(this.d, this.f21915c);
                return;
            case 6:
                this.f21914b.lambda$removeTopics$61(this.d, this.f21915c);
                return;
            default:
                this.f21914b.lambda$emptyMessagesMedia$102(this.d, this.f21915c);
                return;
        }
    }

    public ye(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.f21913a = i10;
        this.f21914b = messagesStorage;
        this.d = arrayList;
        this.f21915c = j10;
    }
}
