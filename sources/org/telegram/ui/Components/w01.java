package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class w01 implements TextWatcher {
    public final d11 f32504a;

    public w01(d11 d11Var) {
        this.f32504a = d11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d11 d11Var = this.f32504a;
        r6 r6Var = d11Var.f25557n;
        if (!d11Var.f25561x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                r6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                r6Var.setText("");
            }
            Utilities.Callback callback = d11Var.f25560w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = d11Var.f25558r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                d11Var.d.X3(messageObject, null, false, false, false, false);
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
