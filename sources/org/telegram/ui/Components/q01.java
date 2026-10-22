package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class q01 implements TextWatcher {
    public final x01 f29454a;

    public q01(x01 x01Var) {
        this.f29454a = x01Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x01 x01Var = this.f29454a;
        q6 q6Var = x01Var.f32296n;
        if (!x01Var.f32300x) {
            String trim = editable.toString().trim();
            if (trim.length() > 16) {
                q6Var.setText("-" + (trim.length() - 16));
                trim = trim.substring(0, 16);
            } else {
                q6Var.setText("");
            }
            Utilities.Callback callback = x01Var.f32299w;
            if (callback != null) {
                callback.run(trim);
            }
            MessageObject messageObject = x01Var.f32297r;
            if (messageObject != null) {
                messageObject.forceUpdate = true;
                x01Var.d.X3(messageObject, null, false, false, false, false);
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
