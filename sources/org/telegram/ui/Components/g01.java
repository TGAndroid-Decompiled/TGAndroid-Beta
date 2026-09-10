package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class g01 implements TextWatcher {
    public final n01 f23192a;

    public g01(n01 n01Var) {
        this.f23192a = n01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        n01 n01Var = this.f23192a;
        o6 o6Var = n01Var.f25358n;
        if (!n01Var.f25362x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                o6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                o6Var.setText("");
            }
            Utilities.Callback callback = n01Var.f25361w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = n01Var.f25359r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                n01Var.d.X3(messageObject, null, false, false, false, false);
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
