package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.Theme;

public final class ReportBottomSheet$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final Context f$1;
    public final Theme.ResourcesProvider f$2;
    public final MessageObject f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda26(ChatActivity chatActivity, Context context, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = context;
        this.f$2 = resourcesProvider;
        this.f$3 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsored$11(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ReportBottomSheet.AnonymousClass4.lambda$onReported$1(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ReportBottomSheet.lambda$openSponsored$14(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
