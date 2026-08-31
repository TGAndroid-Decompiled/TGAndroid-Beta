package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class si implements TextWatcher {
    public final xi f31062a;

    public si(xi xiVar) {
        this.f31062a = xiVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        xi xiVar = this.f31062a;
        ni niVar = xiVar.f33106d0;
        TextUtils.isEmpty(xiVar.B);
        xiVar.B = editable.toString().trim();
        ni niVar2 = xiVar.V;
        AndroidUtilities.cancelRunOnUIThread(niVar2);
        boolean z10 = true;
        if (!TextUtils.isEmpty(xiVar.B)) {
            String str = xiVar.B;
            if (str != null && str.length() >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            xiVar.U = z4;
            if (!TextUtils.equals(xiVar.T, xiVar.B)) {
                xiVar.J.clear();
                xiVar.W = 0;
                xiVar.f33103a0 = false;
            }
            AndroidUtilities.runOnUIThread(niVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(niVar);
        if (!TextUtils.isEmpty(xiVar.B)) {
            String str2 = xiVar.B;
            xiVar.f33113k0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(xiVar.f26546b.G1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(xiVar.f33105c0, xiVar.B)) {
                xiVar.K.clear();
                xiVar.f33107e0 = false;
            }
            AndroidUtilities.runOnUIThread(niVar, 1500L);
        }
        xiVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
