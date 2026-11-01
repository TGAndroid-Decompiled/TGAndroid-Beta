package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class ae implements TextWatcher {
    public final le f35765a;

    public ae(le leVar) {
        this.f35765a = leVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        le leVar = this.f35765a;
        nd ndVar = leVar.f39206f1;
        zd zdVar = leVar.O0;
        if (leVar.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        leVar.N0 = parseLong;
        long j10 = leVar.D0.amount;
        int i10 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            leVar.N0 = j10;
            leVar.L0 = true;
            zdVar.setText(Long.toString(j10));
            zdVar.setSelection(zdVar.getText().length());
            leVar.L0 = false;
        }
        if (leVar.N0 != leVar.D0.amount) {
            z10 = false;
        }
        leVar.M0 = z10;
        org.telegram.messenger.i0.r(ndVar);
        ndVar.run();
        leVar.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
