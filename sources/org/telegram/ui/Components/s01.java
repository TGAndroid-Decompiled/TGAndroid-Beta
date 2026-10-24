package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class s01 implements TextWatcher {
    public final z01 f30399a;

    public s01(z01 z01Var) {
        this.f30399a = z01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        z01 z01Var = this.f30399a;
        o6 o6Var = z01Var.f33111n;
        if (!z01Var.f33115x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                o6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                o6Var.setText("");
            }
            Utilities.Callback callback = z01Var.f33114w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = z01Var.f33112r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                z01Var.d.W3(messageObject, null, false, false, false, false);
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
