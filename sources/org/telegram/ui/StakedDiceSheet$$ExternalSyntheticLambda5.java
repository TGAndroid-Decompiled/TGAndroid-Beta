package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class StakedDiceSheet$$ExternalSyntheticLambda5 implements View.OnFocusChangeListener {
    public final int $r8$classId;
    public final Object f$0;
    public final EditTextBoldCursor f$1;

    public StakedDiceSheet$$ExternalSyntheticLambda5(Object obj, EditTextBoldCursor editTextBoldCursor, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((OutlineTextContainerView) this.f$0).animateSelection(z, !TextUtils.isEmpty(this.f$1.getText()));
                break;
            case 1:
                ((OutlineTextContainerView) this.f$0).animateSelection(z, !TextUtils.isEmpty(this.f$1.getText()));
                break;
            case 2:
                ((OutlineTextContainerView) this.f$0).animateSelection(z, !TextUtils.isEmpty(this.f$1.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                passcodeActivity.keyboardView.setEditText((CodeNumberField) this.f$1);
                passcodeActivity.keyboardView.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
