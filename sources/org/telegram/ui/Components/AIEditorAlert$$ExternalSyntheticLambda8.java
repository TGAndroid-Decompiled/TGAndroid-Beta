package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;

public final class AIEditorAlert$$ExternalSyntheticLambda8 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public AIEditorAlert$$ExternalSyntheticLambda8(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                AIEditorAlert aIEditorAlert = (AIEditorAlert) this.f$0;
                SimpleTextView simpleTextView = (SimpleTextView) this.f$1;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) this.f$3;
                aIEditorAlert.lambda$request$31(simpleTextView, this.f$2, tL_messages_composeMessageWithAI, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                AIEditorAlert aIEditorAlert2 = (AIEditorAlert) this.f$0;
                SimpleTextView simpleTextView2 = (SimpleTextView) this.f$1;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) this.f$3;
                aIEditorAlert2.lambda$requestRich$32(simpleTextView2, this.f$2, tL_messages_composeRichMessageWithAI, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                boolean[] zArr = (boolean[]) this.f$0;
                ArrayList arrayList = (ArrayList) this.f$1;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$3;
                TranslateAlert2.lambda$alternativeTranslate$9(zArr, arrayList, this.f$2, callback2, (String) obj, (Boolean) obj2);
                break;
        }
    }
}
