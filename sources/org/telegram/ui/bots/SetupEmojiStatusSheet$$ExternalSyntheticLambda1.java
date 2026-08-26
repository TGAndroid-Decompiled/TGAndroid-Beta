package org.telegram.ui.bots;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;

public final class SetupEmojiStatusSheet$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final BotWebViewContainer$$ExternalSyntheticLambda12 f$0;
    public final TLRPC.Document f$1;

    public SetupEmojiStatusSheet$$ExternalSyntheticLambda1(BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12, TLRPC.Document document, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer$$ExternalSyntheticLambda12;
        this.f$1 = document;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(str, this.f$1);
                break;
            default:
                this.f$0.run(str, this.f$1);
                break;
        }
    }
}
