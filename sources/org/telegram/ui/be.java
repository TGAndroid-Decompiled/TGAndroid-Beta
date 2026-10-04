package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class be implements TextWatcher {
    public final me f35068a;

    public be(me meVar) {
        this.f35068a = meVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        me meVar = this.f35068a;
        qd qdVar = meVar.f38556i2;
        fi.o oVar = meVar.R1;
        if (meVar.O1) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        meVar.Q1 = parseLong;
        long j3 = meVar.G1.amount;
        boolean z10 = true;
        if (parseLong > j3) {
            meVar.Q1 = j3;
            meVar.O1 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            meVar.O1 = false;
        }
        if (meVar.Q1 != meVar.G1.amount) {
            z10 = false;
        }
        meVar.P1 = z10;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.P1 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
