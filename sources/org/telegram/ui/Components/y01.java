package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class y01 implements TextWatcher {
    public final f11 f33064a;

    public y01(f11 f11Var) {
        this.f33064a = f11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f11 f11Var = this.f33064a;
        r6 r6Var = f11Var.f26193n;
        if (!f11Var.f26197x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                r6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                r6Var.setText("");
            }
            Utilities.Callback callback = f11Var.f26196w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = f11Var.f26194r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                f11Var.d.X3(messageObject, null, false, false, false, false);
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
