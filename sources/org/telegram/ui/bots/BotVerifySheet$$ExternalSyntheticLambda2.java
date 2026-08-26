package org.telegram.ui.bots;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class BotVerifySheet$$ExternalSyntheticLambda2 implements View.OnFocusChangeListener {
    public final int $r8$classId;
    public final OutlineTextContainerView f$0;
    public final EditTextBoldCursor f$1;

    public BotVerifySheet$$ExternalSyntheticLambda2(int i, EditTextBoldCursor editTextBoldCursor, OutlineTextContainerView outlineTextContainerView) {
        this.$r8$classId = i;
        this.f$0 = outlineTextContainerView;
        this.f$1 = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.animateSelection(z, !TextUtils.isEmpty(this.f$1.getText()));
                break;
            default:
                this.f$0.animateSelection(z, !TextUtils.isEmpty(this.f$1.getText()));
                break;
        }
    }
}
