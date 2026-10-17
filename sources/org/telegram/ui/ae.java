package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class ae implements TextWatcher {
    public final ke f35411a;

    public ae(ke keVar) {
        this.f35411a = keVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        ke keVar = this.f35411a;
        pd pdVar = keVar.f38486i1;
        ai.t tVar = keVar.Y0;
        if (keVar.V0) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(editable.toString());
        }
        keVar.X0 = parseLong;
        long j10 = keVar.N0.amount;
        int i10 = (parseLong > j10 ? 1 : (parseLong == j10 ? 0 : -1));
        boolean z10 = true;
        if (i10 > 0) {
            keVar.X0 = j10;
            keVar.V0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            keVar.V0 = false;
        }
        if (keVar.X0 != keVar.N0.amount) {
            z10 = false;
        }
        keVar.W0 = z10;
        AndroidUtilities.cancelRunOnUIThread(pdVar);
        pdVar.run();
        keVar.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
