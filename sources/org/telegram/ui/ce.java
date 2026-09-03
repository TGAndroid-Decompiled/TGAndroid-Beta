package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class ce implements TextWatcher {
    public final me f33118a;

    public ce(me meVar) {
        this.f33118a = meVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        me meVar = this.f33118a;
        qd qdVar = meVar.f36042f1;
        lh.n nVar = meVar.V0;
        if (meVar.S0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        meVar.U0 = parseLong;
        long j10 = meVar.K0.amount;
        boolean z4 = true;
        if (parseLong > j10) {
            meVar.U0 = j10;
            meVar.S0 = true;
            nVar.setText(Long.toString(j10));
            nVar.setSelection(nVar.getText().length());
            meVar.S0 = false;
        }
        if (meVar.U0 != meVar.K0.amount) {
            z4 = false;
        }
        meVar.T0 = z4;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.T0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
