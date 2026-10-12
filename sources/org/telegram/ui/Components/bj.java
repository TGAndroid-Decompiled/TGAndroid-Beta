package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class bj implements TextWatcher {
    public final hj f23788a;

    public bj(hj hjVar) {
        this.f23788a = hjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        hj hjVar = this.f23788a;
        wi wiVar = hjVar.f25677f0;
        TextUtils.isEmpty(hjVar.f25689y);
        hjVar.f25689y = editable.toString().trim();
        wi wiVar2 = hjVar.f25672a0;
        AndroidUtilities.cancelRunOnUIThread(wiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(hjVar.f25689y)) {
            String str = hjVar.f25689y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hjVar.W = z10;
            if (!TextUtils.equals(hjVar.V, hjVar.f25689y)) {
                hjVar.L.clear();
                hjVar.f25673b0 = 0;
                hjVar.f25674c0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        if (!TextUtils.isEmpty(hjVar.f25689y)) {
            String str2 = hjVar.f25689y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(hjVar.f27671b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            hjVar.m0 = z11;
            if (!TextUtils.equals(hjVar.f25676e0, hjVar.f25689y)) {
                hjVar.M.clear();
                hjVar.f25678g0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar, 1500L);
        }
        hjVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
