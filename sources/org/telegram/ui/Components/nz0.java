package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class nz0 implements TextWatcher {
    public final uz0 f31201a;

    public nz0(uz0 uz0Var) {
        this.f31201a = uz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        uz0 uz0Var = this.f31201a;
        o6 o6Var = uz0Var.f33402n;
        if (!uz0Var.f33406x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                o6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                o6Var.setText("");
            }
            Utilities.Callback callback = uz0Var.f33405w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = uz0Var.f33403r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                uz0Var.d.X3(messageObject, null, false, false, false, false);
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
