package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cj implements TextWatcher {
    public final hj f23336a;

    public cj(hj hjVar) {
        this.f23336a = hjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        hj hjVar = this.f23336a;
        xi xiVar = hjVar.f24753g0;
        TextUtils.isEmpty(hjVar.E);
        hjVar.E = editable.toString().trim();
        xi xiVar2 = hjVar.f24748b0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(hjVar.E)) {
            String str = hjVar.E;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hjVar.f24747a0 = z10;
            if (!TextUtils.equals(hjVar.W, hjVar.E)) {
                hjVar.M.clear();
                hjVar.f24749c0 = 0;
                hjVar.f24750d0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(hjVar.E)) {
            String str2 = hjVar.E;
            hjVar.f24760n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(hjVar.f27083b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(hjVar.f24752f0, hjVar.E)) {
                hjVar.N.clear();
                hjVar.f24754h0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar, 1500L);
        }
        hjVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
