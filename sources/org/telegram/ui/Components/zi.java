package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class zi implements TextWatcher {
    public final fj f35342a;

    public zi(fj fjVar) {
        this.f35342a = fjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        fj fjVar = this.f35342a;
        ui uiVar = fjVar.f28200f0;
        TextUtils.isEmpty(fjVar.f28212y);
        fjVar.f28212y = editable.toString().trim();
        ui uiVar2 = fjVar.f28195a0;
        AndroidUtilities.cancelRunOnUIThread(uiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(fjVar.f28212y)) {
            String str = fjVar.f28212y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fjVar.W = z10;
            if (!TextUtils.equals(fjVar.V, fjVar.f28212y)) {
                fjVar.L.clear();
                fjVar.f28196b0 = 0;
                fjVar.f28197c0 = false;
            }
            AndroidUtilities.runOnUIThread(uiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(uiVar);
        if (!TextUtils.isEmpty(fjVar.f28212y)) {
            String str2 = fjVar.f28212y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(fjVar.f30215b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            fjVar.m0 = z11;
            if (!TextUtils.equals(fjVar.f28199e0, fjVar.f28212y)) {
                fjVar.M.clear();
                fjVar.f28201g0 = false;
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
