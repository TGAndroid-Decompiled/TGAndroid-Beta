package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class c11 implements TextWatcher {
    public final j11 f27029a;

    public c11(j11 j11Var) {
        this.f27029a = j11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        j11 j11Var = this.f27029a;
        s6 s6Var = j11Var.f29474n;
        if (!j11Var.f29478x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                s6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                s6Var.setText("");
            }
            Utilities.Callback callback = j11Var.f29477w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = j11Var.f29475r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                j11Var.d.Z3(messageObject, null, false, false, false, false);
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
