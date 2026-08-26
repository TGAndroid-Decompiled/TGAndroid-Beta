package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

public final class AIEditorAlert$$ExternalSyntheticLambda9 implements Utilities.Callback {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda9(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.selectStyle((TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                this.f$0.lambda$new$1((TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                this.f$0.selectTab(((Integer) obj).intValue());
                break;
            default:
                this.f$0.lambda$selectStyle$23((TL_aicompose.AiComposeTone) obj);
                break;
        }
    }
}
