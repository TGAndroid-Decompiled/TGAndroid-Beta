package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class ge implements TextWatcher {
    public final qe f36173a;

    public ge(qe qeVar) {
        this.f36173a = qeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        qe qeVar = this.f36173a;
        td tdVar = qeVar.f39125i1;
        gi.o oVar = qeVar.Y0;
        if (qeVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        qeVar.X0 = parseLong;
        long j10 = qeVar.N0.amount;
        int i10 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            qeVar.X0 = j10;
            qeVar.V0 = true;
            oVar.setText(Long.toString(j10));
            oVar.setSelection(oVar.getText().length());
            qeVar.V0 = false;
        }
        if (qeVar.X0 != qeVar.N0.amount) {
            z10 = false;
        }
        qeVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(tdVar);
        tdVar.run();
        qeVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
