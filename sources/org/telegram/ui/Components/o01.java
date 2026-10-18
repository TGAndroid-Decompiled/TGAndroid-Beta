package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class o01 implements TextWatcher {
    public final v01 f28859a;

    public o01(v01 v01Var) {
        this.f28859a = v01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v01 v01Var = this.f28859a;
        q6 q6Var = v01Var.f31138n;
        if (!v01Var.f31142x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                q6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                q6Var.setText("");
            }
            Utilities.Callback callback = v01Var.f31141w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = v01Var.f31139r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                v01Var.d.X3(messageObject, null, false, false, false, false);
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
