package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i51 implements View.OnFocusChangeListener {
    public final int f38179a;
    public final Object f38180b;
    public final EditTextBoldCursor f38181c;

    public i51(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f38179a = i10;
        this.f38180b = obj;
        this.f38181c = editTextBoldCursor;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f38179a) {
            case 0:
                ((org.telegram.ui.Components.ec0) this.f38180b).c(z10, !TextUtils.isEmpty(this.f38181c.getText()));
                return;
            case 1:
                ((org.telegram.ui.Components.ec0) this.f38180b).c(z10, !TextUtils.isEmpty(this.f38181c.getText()));
                return;
            case 2:
                ((org.telegram.ui.Components.ec0) this.f38180b).c(z10, !TextUtils.isEmpty(this.f38181c.getText()));
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38180b;
                passcodeActivity.f33424w.setEditText((bs) this.f38181c);
                passcodeActivity.f33424w.setDispatchBackWhenEmpty(true);
                return;
        }
    }
}
