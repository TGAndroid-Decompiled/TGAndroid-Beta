package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ti implements TextWatcher {
    public final yi f32962a;

    public ti(yi yiVar) {
        this.f32962a = yiVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        yi yiVar = this.f32962a;
        oi oiVar = yiVar.f35067c0;
        TextUtils.isEmpty(yiVar.A);
        yiVar.A = editable.toString().trim();
        oi oiVar2 = yiVar.U;
        AndroidUtilities.cancelRunOnUIThread(oiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(yiVar.A)) {
            String str = yiVar.A;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yiVar.T = z10;
            if (!TextUtils.equals(yiVar.S, yiVar.A)) {
                yiVar.I.clear();
                yiVar.V = 0;
                yiVar.W = false;
            }
            AndroidUtilities.runOnUIThread(oiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(oiVar);
        if (!TextUtils.isEmpty(yiVar.A)) {
            String str2 = yiVar.A;
            yiVar.f35074j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(yiVar.f28403b.F1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(yiVar.f35066b0, yiVar.A)) {
                yiVar.J.clear();
                yiVar.f35068d0 = false;
            }
            AndroidUtilities.runOnUIThread(oiVar, 1500L);
        }
        yiVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
