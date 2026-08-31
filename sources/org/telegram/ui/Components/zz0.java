package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class zz0 implements TextWatcher {
    public final g01 f34050a;

    public zz0(g01 g01Var) {
        this.f34050a = g01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g01 g01Var = this.f34050a;
        k6 k6Var = g01Var.f27062n;
        if (!g01Var.f27066x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                k6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                k6Var.setText("");
            }
            Utilities.Callback callback = g01Var.f27065w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = g01Var.f27063r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                g01Var.d.X3(messageObject, null, false, false, false, false);
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
