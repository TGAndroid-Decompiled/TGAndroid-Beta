package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class be implements TextWatcher {
    public final le f31240a;

    public be(le leVar) {
        this.f31240a = leVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        le leVar = this.f31240a;
        od odVar = leVar.f34670i1;
        ei.o oVar = leVar.Y0;
        if (leVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        leVar.X0 = parseLong;
        long j3 = leVar.N0.amount;
        boolean z10 = true;
        if (parseLong > j3) {
            leVar.X0 = j3;
            leVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            leVar.V0 = false;
        }
        if (leVar.X0 != leVar.N0.amount) {
            z10 = false;
        }
        leVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(odVar);
        odVar.run();
        leVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
