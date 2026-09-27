package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class be implements TextWatcher {
    public final me f32340a;

    public be(me meVar) {
        this.f32340a = meVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        me meVar = this.f32340a;
        qd qdVar = meVar.f35649i1;
        fi.o oVar = meVar.Y0;
        if (meVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        meVar.X0 = parseLong;
        long j3 = meVar.N0.amount;
        boolean z10 = true;
        if (parseLong > j3) {
            meVar.X0 = j3;
            meVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            meVar.V0 = false;
        }
        if (meVar.X0 != meVar.N0.amount) {
            z10 = false;
        }
        meVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
