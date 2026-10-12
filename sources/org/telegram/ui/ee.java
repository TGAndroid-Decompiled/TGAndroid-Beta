package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class ee implements TextWatcher {
    public final oe f37071a;

    public ee(oe oeVar) {
        this.f37071a = oeVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        oe oeVar = this.f37071a;
        rd rdVar = oeVar.f40666i1;
        fi.o oVar = oeVar.Y0;
        if (oeVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        oeVar.X0 = parseLong;
        long j3 = oeVar.N0.amount;
        int i10 = (parseLong > j3 ? 1 : (parseLong == j3 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            oeVar.X0 = j3;
            oeVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            oeVar.V0 = false;
        }
        if (oeVar.X0 != oeVar.N0.amount) {
            z10 = false;
        }
        oeVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(rdVar);
        rdVar.run();
        oeVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
