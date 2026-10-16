package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class bj implements TextWatcher {
    public final hj f23481a;

    public bj(hj hjVar) {
        this.f23481a = hjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        hj hjVar = this.f23481a;
        wi wiVar = hjVar.f25328f0;
        TextUtils.isEmpty(hjVar.f25340y);
        hjVar.f25340y = editable.toString().trim();
        wi wiVar2 = hjVar.f25323a0;
        AndroidUtilities.cancelRunOnUIThread(wiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(hjVar.f25340y)) {
            String str = hjVar.f25340y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hjVar.W = z10;
            if (!TextUtils.equals(hjVar.V, hjVar.f25340y)) {
                hjVar.L.clear();
                hjVar.f25324b0 = 0;
                hjVar.f25325c0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        if (!TextUtils.isEmpty(hjVar.f25340y)) {
            String str2 = hjVar.f25340y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(hjVar.f27360b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            hjVar.m0 = z11;
            if (!TextUtils.equals(hjVar.f25327e0, hjVar.f25340y)) {
                hjVar.M.clear();
                hjVar.f25329g0 = false;
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
