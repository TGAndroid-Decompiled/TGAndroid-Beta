package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vz0 implements TextWatcher {
    public final c01 f29448a;

    public vz0(c01 c01Var) {
        this.f29448a = c01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        c01 c01Var = this.f29448a;
        n6 n6Var = c01Var.f22864n;
        if (!c01Var.f22868x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                n6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                n6Var.setText("");
            }
            Utilities.Callback callback = c01Var.f22867w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = c01Var.f22865r;
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
