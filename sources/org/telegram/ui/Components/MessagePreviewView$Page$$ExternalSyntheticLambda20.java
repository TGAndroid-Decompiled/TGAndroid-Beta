package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page f$0;
    public final Context f$1;

    public MessagePreviewView$Page$$ExternalSyntheticLambda20(MessagePreviewView.Page page, Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
        this.f$1 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagePreviewView.Page page = this.f$0;
                page.this$0.dismiss(false);
                AndroidUtilities.runOnUIThread(new MessagePreviewView$Page$$ExternalSyntheticLambda20(page, this.f$1, 1));
                break;
            default:
                MessagePreviewView.Page page2 = this.f$0;
                page2.getClass();
                Context context = this.f$1;
                if (AndroidUtilities.isContextSafe(context)) {
                    new PremiumFeatureBottomSheet(context, 43, page2.this$0.resourcesProvider).show();
                    break;
                }
                break;
        }
    }
}
