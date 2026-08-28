package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class bz0 implements TextWatcher {
    public final iz0 f27306a;

    public bz0(iz0 iz0Var) {
        this.f27306a = iz0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        iz0 iz0Var = this.f27306a;
        j6 j6Var = iz0Var.f29553n;
        if (!iz0Var.f29557x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                j6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                j6Var.setText("");
            }
            Utilities.Callback callback = iz0Var.f29556w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = iz0Var.f29554r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                iz0Var.d.X3(messageObject, null, false, false, false, false);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
