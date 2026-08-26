package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class StakedDiceSheet$$ExternalSyntheticLambda6 implements View.OnFocusChangeListener {
    public final int $r8$classId;
    public final Object f$0;
    public final EditTextBoldCursor f$1;

    public StakedDiceSheet$$ExternalSyntheticLambda6(Object obj, EditTextBoldCursor editTextBoldCursor, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                StakedDiceSheet.lambda$new$2((OutlineTextContainerView) this.f$0, this.f$1, view, z);
                break;
            default:
                ((PasscodeActivity) this.f$0).lambda$createView$11((CodeNumberField) this.f$1, view, z);
                break;
        }
    }
}
