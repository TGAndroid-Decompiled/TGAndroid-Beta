package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class yz0 implements TextWatcher {
    public final f01 f33695a;

    public yz0(f01 f01Var) {
        this.f33695a = f01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f01 f01Var = this.f33695a;
        k6 k6Var = f01Var.f26737n;
        if (!f01Var.f26741x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                k6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                k6Var.setText("");
            }
            Utilities.Callback callback = f01Var.f26740w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = f01Var.f26738r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                f01Var.d.X3(messageObject, null, false, false, false, false);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
