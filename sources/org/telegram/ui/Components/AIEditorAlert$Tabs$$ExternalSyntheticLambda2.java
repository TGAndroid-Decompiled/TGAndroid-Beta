package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class AIEditorAlert$Tabs$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final int f$1;

    public AIEditorAlert$Tabs$$ExternalSyntheticLambda2(int i, int i2, Utilities.Callback callback) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AIEditorAlert.Tabs.lambda$addTab$0(this.f$0, this.f$1, view);
                break;
            default:
                AIEditorAlert.Tabs.lambda$addTab$1(this.f$0, this.f$1, view);
                break;
        }
    }
}
