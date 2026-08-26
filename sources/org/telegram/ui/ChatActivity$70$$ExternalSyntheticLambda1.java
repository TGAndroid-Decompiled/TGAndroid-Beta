package org.telegram.ui;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

public final class ChatActivity$70$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final int f$3;

    public ChatActivity$70$$ExternalSyntheticLambda1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationCenterDelegate;
        this.f$2 = obj;
        this.f$3 = i;
        this.f$1 = z;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity.AnonymousClass70) this.f$0).lambda$onUnpin$1(this.f$1, (ArrayList) this.f$2, this.f$3);
                break;
            case 1:
                ((GroupCallActivity) this.f$0).lambda$getLink$57((TLObject) this.f$2, this.f$3, this.f$1);
                break;
            default:
                ((PassportActivity) this.f$0).lambda$processSelectedFiles$72((ArrayList) this.f$2, this.f$3, this.f$1);
                break;
        }
    }

    public ChatActivity$70$$ExternalSyntheticLambda1(ChatActivity.AnonymousClass70 anonymousClass70, boolean z, ArrayList arrayList, int i) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass70;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = i;
    }
}
