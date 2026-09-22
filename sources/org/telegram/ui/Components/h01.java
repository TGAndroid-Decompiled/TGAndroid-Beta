package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class h01 implements TextWatcher {
    public final o01 f24666a;

    public h01(o01 o01Var) {
        this.f24666a = o01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        o01 o01Var = this.f24666a;
        o6 o6Var = o01Var.f26945n;
        if (!o01Var.f26949x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                o6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                o6Var.setText("");
            }
            Utilities.Callback callback = o01Var.f26948w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = o01Var.f26946r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                o01Var.d.X3(messageObject, null, false, false, false, false);
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
