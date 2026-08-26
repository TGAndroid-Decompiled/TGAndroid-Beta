package org.telegram.ui.Components;

import java.io.FileNotFoundException;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final ChatAttachAlertPhotoLayout.BasePhotoProvider f$0;
    public final boolean f$1;
    public final int f$2;
    public final boolean f$3;

    public ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout.AnonymousClass15 anonymousClass15, boolean z, boolean z2, int i) {
        this.f$0 = anonymousClass15;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj) throws FileNotFoundException {
        Long l = (Long) obj;
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlertPhotoLayout.AnonymousClass1) this.f$0).lambda$sendButtonPressed$1(this.f$1, this.f$2, this.f$3, l);
                break;
            default:
                ((ChatAttachAlertPhotoLayout.AnonymousClass15) this.f$0).lambda$sendButtonPressed$1(this.f$1, this.f$3, this.f$2, l);
                break;
        }
    }

    public ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout.AnonymousClass1 anonymousClass1, boolean z, int i, boolean z2) {
        this.f$0 = anonymousClass1;
        this.f$1 = z;
        this.f$2 = i;
        this.f$3 = z2;
    }
}
