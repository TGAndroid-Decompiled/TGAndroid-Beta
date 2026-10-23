package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class t01 implements TextWatcher {
    public final a11 f30589a;

    public t01(a11 a11Var) {
        this.f30589a = a11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        a11 a11Var = this.f30589a;
        q6 q6Var = a11Var.f24598n;
        if (!a11Var.f24602x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                q6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                q6Var.setText("");
            }
            Utilities.Callback callback = a11Var.f24601w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = a11Var.f24599r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                a11Var.d.W3(messageObject, null, false, false, false, false);
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
