package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class BotWebViewSheet$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda4(BotWebViewSheet botWebViewSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewSheet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewSheet botWebViewSheet = this.f$0;
                botWebViewSheet.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(1, botWebViewSheet, (TLRPC.UserFull) obj));
                break;
            default:
                Boolean bool = (Boolean) obj;
                BotWebViewSheet.AnonymousClass2 anonymousClass2 = this.f$0.webViewContainer;
                if (anonymousClass2 != null) {
                    if (!bool.booleanValue()) {
                        anonymousClass2.lastClickMs = System.currentTimeMillis();
                        anonymousClass2.notifyEvent("secondary_button_pressed", null);
                    } else {
                        anonymousClass2.lastClickMs = System.currentTimeMillis();
                        anonymousClass2.notifyEvent("main_button_pressed", null);
                    }
                }
                break;
        }
    }
}
