package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class be implements TextWatcher {
    public final me f35120a;

    public be(me meVar) {
        this.f35120a = meVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        me meVar = this.f35120a;
        qd qdVar = meVar.f38585f1;
        fi.o oVar = meVar.O0;
        if (meVar.L0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        meVar.N0 = parseLong;
        long j3 = meVar.D0.amount;
        boolean z10 = true;
        if (parseLong > j3) {
            meVar.N0 = j3;
            meVar.L0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            meVar.L0 = false;
        }
        if (meVar.N0 != meVar.D0.amount) {
            z10 = false;
        }
        meVar.M0 = z10;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.M0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
