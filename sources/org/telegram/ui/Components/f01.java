package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class f01 implements TextWatcher {
    public final m01 f23968a;

    public f01(m01 m01Var) {
        this.f23968a = m01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        m01 m01Var = this.f23968a;
        o6 o6Var = m01Var.f26286n;
        if (!m01Var.f26290x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                o6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                o6Var.setText("");
            }
            Utilities.Callback callback = m01Var.f26289w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = m01Var.f26287r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                m01Var.d.X3(messageObject, null, false, false, false, false);
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
