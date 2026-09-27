package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cj implements TextWatcher {
    public final ij f23339a;

    public cj(ij ijVar) {
        this.f23339a = ijVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ij ijVar = this.f23339a;
        xi xiVar = ijVar.f25152f0;
        TextUtils.isEmpty(ijVar.f25164y);
        ijVar.f25164y = editable.toString().trim();
        xi xiVar2 = ijVar.f25147a0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(ijVar.f25164y)) {
            String str = ijVar.f25164y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ijVar.W = z10;
            if (!TextUtils.equals(ijVar.V, ijVar.f25164y)) {
                ijVar.L.clear();
                ijVar.f25148b0 = 0;
                ijVar.f25149c0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(ijVar.f25164y)) {
            String str2 = ijVar.f25164y;
            ijVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(ijVar.f27104b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(ijVar.f25151e0, ijVar.f25164y)) {
                ijVar.M.clear();
                ijVar.f25153g0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar, 1500L);
        }
        ijVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
