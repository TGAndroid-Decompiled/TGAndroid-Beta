package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public final class dz0 implements TextWatcher {

    public final kz0 f27875a;

    public dz0(kz0 kz0Var) {
        this.f27875a = kz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        kz0 kz0Var = this.f27875a;
        j6 j6Var = kz0Var.f30232n;
        if (kz0Var.f30236x) {
            return;
        }
        String strTrim = editable.toString().trim();
        if (strTrim.length() > 16) {
            j6Var.setText("-" + (strTrim.length() - 16));
            strTrim = strTrim.substring(0, 16);
        } else {
            j6Var.setText("");
        }
        Utilities.Callback callback = kz0Var.f30235w;
        if (callback != null) {
            callback.run(strTrim);
        }
        MessageObject messageObject = kz0Var.f30233r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            kz0Var.d.W3(messageObject, null, false, false, false, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
