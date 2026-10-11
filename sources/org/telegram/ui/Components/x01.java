package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class x01 implements TextWatcher {
    public final e11 f32830a;

    public x01(e11 e11Var) {
        this.f32830a = e11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e11 e11Var = this.f32830a;
        r6 r6Var = e11Var.f25940n;
        if (!e11Var.f25944x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                r6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                r6Var.setText("");
            }
            Utilities.Callback callback = e11Var.f25943w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = e11Var.f25941r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                e11Var.d.X3(messageObject, null, false, false, false, false);
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
