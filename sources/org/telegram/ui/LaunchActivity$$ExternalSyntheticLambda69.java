package org.telegram.ui;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLObject;

public final class LaunchActivity$$ExternalSyntheticLambda69 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;
    public final boolean f$4;

    public LaunchActivity$$ExternalSyntheticLambda69(BaseController baseController, long j, List list, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$3 = j;
        this.f$1 = list;
        this.f$4 = z;
        this.f$2 = i;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$openStory$179((TLObject) this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                ((MessagesStorage) this.f$0).lambda$saveTopics$47(this.f$3, (List) this.f$1, this.f$4, this.f$2);
                break;
            default:
                ((TopicsController) this.f$0).lambda$loadTopics$0(this.f$3, (ArrayList) this.f$1, this.f$4, this.f$2);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda69(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = z;
    }
}
