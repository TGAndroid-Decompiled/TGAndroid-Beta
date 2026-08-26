package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class AIEditorAlert$$ExternalSyntheticLambda3 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;
    public final Object f$1;
    public final Object f$2;

    public AIEditorAlert$$ExternalSyntheticLambda3(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Bool bool = (TLRPC.Bool) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((AIEditorAlert) this.f$0).lambda$new$5((Browser.Progress) this.f$1, (TL_aicompose.TL_aiComposeTone) this.f$2, bool, tL_error);
                break;
            case 1:
                ((AIEditorAlert.AiStyleAlert) this.f$0).lambda$new$2((Theme.ResourcesProvider) this.f$1, (TL_aicompose.AiComposeTone) this.f$2, bool, tL_error);
                break;
            default:
                ((AIEditorAlert.CreateAiStyleAlert) this.f$0).lambda$new$3((Browser.Progress) this.f$1, (AlertDialog) this.f$2, bool, tL_error);
                break;
        }
    }
}
