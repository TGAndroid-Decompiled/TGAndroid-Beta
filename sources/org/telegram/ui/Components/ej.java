package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ej implements TextWatcher {
    public final kj f26096a;

    public ej(kj kjVar) {
        this.f26096a = kjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        kj kjVar = this.f26096a;
        zi ziVar = kjVar.f28029f0;
        TextUtils.isEmpty(kjVar.f28041y);
        kjVar.f28041y = editable.toString().trim();
        zi ziVar2 = kjVar.f28024a0;
        AndroidUtilities.cancelRunOnUIThread(ziVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(kjVar.f28041y)) {
            String str = kjVar.f28041y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kjVar.W = z10;
            if (!TextUtils.equals(kjVar.V, kjVar.f28041y)) {
                kjVar.L.clear();
                kjVar.f28025b0 = 0;
                kjVar.f28026c0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(ziVar);
        if (!TextUtils.isEmpty(kjVar.f28041y)) {
            String str2 = kjVar.f28041y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(kjVar.f30173b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            kjVar.m0 = z11;
            if (!TextUtils.equals(kjVar.f28028e0, kjVar.f28041y)) {
                kjVar.M.clear();
                kjVar.f28030g0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar, 1500L);
        }
        kjVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
