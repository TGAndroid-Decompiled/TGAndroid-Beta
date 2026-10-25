package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class zi implements TextWatcher {
    public final fj f35339a;

    public zi(fj fjVar) {
        this.f35339a = fjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        fj fjVar = this.f35339a;
        ui uiVar = fjVar.f28198f0;
        TextUtils.isEmpty(fjVar.f28210y);
        fjVar.f28210y = editable.toString().trim();
        ui uiVar2 = fjVar.f28193a0;
        AndroidUtilities.cancelRunOnUIThread(uiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(fjVar.f28210y)) {
            String str = fjVar.f28210y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fjVar.W = z10;
            if (!TextUtils.equals(fjVar.V, fjVar.f28210y)) {
                fjVar.L.clear();
                fjVar.f28194b0 = 0;
                fjVar.f28195c0 = false;
            }
            AndroidUtilities.runOnUIThread(uiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(uiVar);
        if (!TextUtils.isEmpty(fjVar.f28210y)) {
            String str2 = fjVar.f28210y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(fjVar.f30213b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            fjVar.m0 = z11;
            if (!TextUtils.equals(fjVar.f28197e0, fjVar.f28210y)) {
                fjVar.M.clear();
                fjVar.f28199g0 = false;
            }
            AndroidUtilities.runOnUIThread(uiVar, 1500L);
        }
        fjVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
