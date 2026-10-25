package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class b11 implements TextWatcher {
    public final i11 f26720a;

    public b11(i11 i11Var) {
        this.f26720a = i11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        i11 i11Var = this.f26720a;
        s6 s6Var = i11Var.f29144n;
        if (!i11Var.f29148x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                s6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                s6Var.setText("");
            }
            Utilities.Callback callback = i11Var.f29147w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = i11Var.f29145r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                i11Var.d.Z3(messageObject, null, false, false, false, false);
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
