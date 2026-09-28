package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cj implements TextWatcher {
    public final ij f23320a;

    public cj(ij ijVar) {
        this.f23320a = ijVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ij ijVar = this.f23320a;
        xi xiVar = ijVar.f25130f0;
        TextUtils.isEmpty(ijVar.f25142y);
        ijVar.f25142y = editable.toString().trim();
        xi xiVar2 = ijVar.f25125a0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(ijVar.f25142y)) {
            String str = ijVar.f25142y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ijVar.W = z10;
            if (!TextUtils.equals(ijVar.V, ijVar.f25142y)) {
                ijVar.L.clear();
                ijVar.f25126b0 = 0;
                ijVar.f25127c0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(ijVar.f25142y)) {
            String str2 = ijVar.f25142y;
            ijVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(ijVar.f27076b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(ijVar.f25129e0, ijVar.f25142y)) {
                ijVar.M.clear();
                ijVar.f25131g0 = false;
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
