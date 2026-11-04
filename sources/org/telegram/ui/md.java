package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class md implements TextWatcher {
    public final xd f47652a;

    public md(xd xdVar) {
        this.f47652a = xdVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        xd xdVar = this.f47652a;
        dd ddVar = xdVar.f51920g1;
        ci.s sVar = xdVar.P0;
        if (xdVar.M0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        xdVar.O0 = parseLong;
        long j10 = xdVar.E0.amount;
        int i3 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i3 > 0) {
            xdVar.O0 = j10;
            xdVar.M0 = true;
            sVar.setText(Long.toString(j10));
            sVar.setSelection(sVar.getText().length());
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
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
