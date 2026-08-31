package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class ae implements TextWatcher {
    public final ke f35138a;

    public ae(ke keVar) {
        this.f35138a = keVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ke keVar = this.f35138a;
        od odVar = keVar.f38363f1;
        mh.m mVar = keVar.V0;
        if (keVar.S0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        keVar.U0 = parseLong;
        long j10 = keVar.K0.amount;
        boolean z4 = true;
        if (parseLong > j10) {
            keVar.U0 = j10;
            keVar.S0 = true;
            mVar.setText(Long.toString(j10));
            mVar.setSelection(mVar.getText().length());
            keVar.S0 = false;
        }
        if (keVar.U0 != keVar.K0.amount) {
            z4 = false;
        }
        keVar.T0 = z4;
        AndroidUtilities.cancelRunOnUIThread(odVar);
        odVar.run();
        keVar.T0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
