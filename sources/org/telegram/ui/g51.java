package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g51 implements View.OnFocusChangeListener {
    public final int f37354a;
    public final Object f37355b;
    public final EditTextBoldCursor f37356c;

    public g51(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f37354a = i10;
        this.f37355b = obj;
        this.f37356c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f37354a) {
            case 0:
                ((org.telegram.ui.Components.ec0) this.f37355b).c(z10, !TextUtils.isEmpty(this.f37356c.getText()));
                return;
            case 1:
                ((org.telegram.ui.Components.ec0) this.f37355b).c(z10, !TextUtils.isEmpty(this.f37356c.getText()));
                return;
            case 2:
                ((org.telegram.ui.Components.ec0) this.f37355b).c(z10, !TextUtils.isEmpty(this.f37356c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37355b;
                passcodeActivity.f33431w.setEditText((bs) this.f37356c);
                passcodeActivity.f33431w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
