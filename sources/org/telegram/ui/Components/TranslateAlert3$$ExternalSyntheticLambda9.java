package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class TranslateAlert3$$ExternalSyntheticLambda9 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final TranslateAlert3 f$0;

    public TranslateAlert3$$ExternalSyntheticLambda9(TranslateAlert3 translateAlert3, int i) {
        this.$r8$classId = i;
        this.f$0 = translateAlert3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 1:
                this.f$0.lambda$requestTranslate$11((TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f$0.lambda$requestTranslate$14((TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
