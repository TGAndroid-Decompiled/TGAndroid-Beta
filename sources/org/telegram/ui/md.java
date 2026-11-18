package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class md implements TextWatcher {
    public final xd f49836a;

    public md(xd xdVar) {
        this.f49836a = xdVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        xd xdVar = this.f49836a;
        dd ddVar = xdVar.f53798g1;
        di.q qVar = xdVar.P0;
        if (xdVar.M0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        xdVar.O0 = parseLong;
        long j3 = xdVar.E0.amount;
        int i7 = (parseLong > j3 ? 1 : (parseLong == j3 ? 0 : -1));
        boolean z10 = true;
        if (i7 > 0) {
            xdVar.O0 = j3;
            xdVar.M0 = true;
            qVar.setText(Long.toString(j3));
            qVar.setSelection(qVar.getText().length());
            xdVar.M0 = false;
        }
        if (xdVar.O0 != xdVar.E0.amount) {
            z10 = false;
        }
        xdVar.N0 = z10;
        org.telegram.messenger.g0.r(ddVar);
        ddVar.run();
        xdVar.N0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
