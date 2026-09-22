package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class uz0 implements TextWatcher {
    public final b01 f28529a;

    public uz0(b01 b01Var) {
        this.f28529a = b01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        b01 b01Var = this.f28529a;
        n6 n6Var = b01Var.f22549n;
        if (!b01Var.f22553x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                n6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                n6Var.setText("");
            }
            Utilities.Callback callback = b01Var.f22552w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = b01Var.f22550r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                b01Var.d.X3(messageObject, null, false, false, false, false);
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
