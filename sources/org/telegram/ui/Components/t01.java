package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class t01 implements TextWatcher {
    public final a11 f28942a;

    public t01(a11 a11Var) {
        this.f28942a = a11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        a11 a11Var = this.f28942a;
        s6 s6Var = a11Var.f23097n;
        if (!a11Var.f23101x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                s6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                s6Var.setText("");
            }
            Utilities.Callback callback = a11Var.f23100w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = a11Var.f23098r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                a11Var.d.X3(messageObject, null, false, false, false, false);
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
