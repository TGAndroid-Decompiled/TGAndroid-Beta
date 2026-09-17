package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vz0 implements TextWatcher {
    public final c01 f29445a;

    public vz0(c01 c01Var) {
        this.f29445a = c01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        c01 c01Var = this.f29445a;
        n6 n6Var = c01Var.f22861n;
        if (!c01Var.f22865x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                n6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                n6Var.setText("");
            }
            Utilities.Callback callback = c01Var.f22864w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = c01Var.f22862r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                c01Var.d.X3(messageObject, null, false, false, false, false);
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
