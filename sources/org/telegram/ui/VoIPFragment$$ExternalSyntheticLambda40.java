package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class VoIPFragment$$ExternalSyntheticLambda40 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public VoIPFragment$$ExternalSyntheticLambda40(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPFragment) this.f$0).lambda$createView$13((Context) this.f$1, view);
                break;
            default:
                WearAuthSheet.lambda$show$5((ButtonWithCounterView) this.f$0, (int[]) this.f$1, view);
                break;
        }
    }
}
