package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class e01 implements TextWatcher {
    public final l01 f23803a;

    public e01(l01 l01Var) {
        this.f23803a = l01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        l01 l01Var = this.f23803a;
        p6 p6Var = l01Var.f25973n;
        if (!l01Var.f25977x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                p6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                p6Var.setText("");
            }
            Utilities.Callback callback = l01Var.f25976w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = l01Var.f25974r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                l01Var.d.X3(messageObject, null, false, false, false, false);
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
