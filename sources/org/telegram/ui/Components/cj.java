package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cj implements TextWatcher {
    public final ij f23321a;

    public cj(ij ijVar) {
        this.f23321a = ijVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ij ijVar = this.f23321a;
        xi xiVar = ijVar.f25131f0;
        TextUtils.isEmpty(ijVar.f25143y);
        ijVar.f25143y = editable.toString().trim();
        xi xiVar2 = ijVar.f25126a0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(ijVar.f25143y)) {
            String str = ijVar.f25143y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ijVar.W = z10;
            if (!TextUtils.equals(ijVar.V, ijVar.f25143y)) {
                ijVar.L.clear();
                ijVar.f25127b0 = 0;
                ijVar.f25128c0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(ijVar.f25143y)) {
            String str2 = ijVar.f25143y;
            ijVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(ijVar.f27077b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(ijVar.f25130e0, ijVar.f25143y)) {
                ijVar.M.clear();
                ijVar.f25132g0 = false;
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
