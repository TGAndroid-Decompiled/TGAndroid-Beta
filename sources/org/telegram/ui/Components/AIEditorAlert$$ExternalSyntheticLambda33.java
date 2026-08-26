package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

public final class AIEditorAlert$$ExternalSyntheticLambda33 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Runnable f$2;

    public AIEditorAlert$$ExternalSyntheticLambda33(ItemOptions itemOptions, boolean z, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
        this.f$1 = z;
        this.f$2 = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AIEditorAlert.lambda$addChecked$30((ItemOptions) this.f$0, this.f$1, this.f$2, view);
                break;
            case 1:
                TranslateAlert3.lambda$addChecked$7((ItemOptions) this.f$0, this.f$1, this.f$2, view);
                break;
            default:
                MessagePrivateSeenView.lambda$showSheet$8(this.f$1, (BottomSheet) this.f$0, this.f$2, view);
                break;
        }
    }

    public AIEditorAlert$$ExternalSyntheticLambda33(boolean z, BottomSheet bottomSheet, Runnable runnable) {
        this.$r8$classId = 2;
        this.f$1 = z;
        this.f$0 = bottomSheet;
        this.f$2 = runnable;
    }
}
