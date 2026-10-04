package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class p01 implements TextWatcher {
    public final w01 f29478a;

    public p01(w01 w01Var) {
        this.f29478a = w01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w01 w01Var = this.f29478a;
        p6 p6Var = w01Var.f32424n;
        if (!w01Var.f32428x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                p6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                p6Var.setText("");
            }
            Utilities.Callback callback = w01Var.f32427w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = w01Var.f32425r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                w01Var.d.X3(messageObject, null, false, false, false, false);
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
