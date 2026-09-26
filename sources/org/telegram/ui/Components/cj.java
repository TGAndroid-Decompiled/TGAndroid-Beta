package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class cj implements TextWatcher {
    public final ij f23338a;

    public cj(ij ijVar) {
        this.f23338a = ijVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ij ijVar = this.f23338a;
        xi xiVar = ijVar.f25102f0;
        TextUtils.isEmpty(ijVar.f25114y);
        ijVar.f25114y = editable.toString().trim();
        xi xiVar2 = ijVar.f25097a0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(ijVar.f25114y)) {
            String str = ijVar.f25114y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ijVar.W = z10;
            if (!TextUtils.equals(ijVar.V, ijVar.f25114y)) {
                ijVar.L.clear();
                ijVar.f25098b0 = 0;
                ijVar.f25099c0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(ijVar.f25114y)) {
            String str2 = ijVar.f25114y;
            ijVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(ijVar.f27043b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(ijVar.f25101e0, ijVar.f25114y)) {
                ijVar.M.clear();
                ijVar.f25103g0 = false;
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
