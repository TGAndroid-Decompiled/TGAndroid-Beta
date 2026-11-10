package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class od implements TextWatcher {
    public final zd f48500a;

    public od(zd zdVar) {
        this.f48500a = zdVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        zd zdVar = this.f48500a;
        ed edVar = zdVar.f52416f1;
        bi.v vVar = zdVar.O0;
        if (zdVar.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        zdVar.N0 = parseLong;
        long j3 = zdVar.D0.amount;
        int i7 = (parseLong > j3 ? 1 : (parseLong == j3 ? 0 : -1));
        boolean z9 = true;
        if (i7 > 0) {
            zdVar.N0 = j3;
            zdVar.L0 = true;
            vVar.setText(Long.toString(j3));
            vVar.setSelection(vVar.getText().length());
            zdVar.L0 = false;
        }
        if (zdVar.N0 != zdVar.D0.amount) {
            z9 = false;
        }
        zdVar.M0 = z9;
        org.telegram.messenger.g0.r(edVar);
        edVar.run();
        zdVar.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
