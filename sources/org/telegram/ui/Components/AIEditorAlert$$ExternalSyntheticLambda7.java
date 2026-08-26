package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Stories.recorder.HintView2;

public final class AIEditorAlert$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda7(AIEditorAlert aIEditorAlert, int i) {
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
                this.f$0.lambda$selectStyle$23((TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                AIEditorAlert aIEditorAlert = this.f$0;
                aIEditorAlert.getClass();
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    aIEditorAlert.tonesController.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                aIEditorAlert.updateStyles();
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                AIEditorAlert aIEditorAlert2 = this.f$0;
                AIEditorAlert.Tabs tabs = aIEditorAlert2.tabs;
                if (tabs.getSelectedTab() != iIntValue) {
                    HintView2 hintView2 = aIEditorAlert2.styleHint;
                    if (hintView2 != null) {
                        hintView2.hide(true);
                    }
                    tabs.selectTab(iIntValue);
                    aIEditorAlert2.request();
                    aIEditorAlert2.adapter.update(true);
                    break;
                }
                break;
        }
    }
}
