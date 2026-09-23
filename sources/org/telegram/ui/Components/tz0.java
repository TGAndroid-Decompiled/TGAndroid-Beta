package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class tz0 implements TextWatcher {
    public final a01 f28340a;

    public tz0(a01 a01Var) {
        this.f28340a = a01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        a01 a01Var = this.f28340a;
        p6 p6Var = a01Var.f22280n;
        if (!a01Var.f22284x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                p6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                p6Var.setText("");
            }
            Utilities.Callback callback = a01Var.f22283w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = a01Var.f22281r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                a01Var.d.X3(messageObject, null, false, false, false, false);
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
