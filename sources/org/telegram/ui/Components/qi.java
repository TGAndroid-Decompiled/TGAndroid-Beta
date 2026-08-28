package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class qi implements TextWatcher {
    public final vi f31953a;

    public qi(vi viVar) {
        this.f31953a = viVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        vi viVar = this.f31953a;
        li liVar = viVar.f33371c0;
        TextUtils.isEmpty(viVar.A);
        viVar.A = editable.toString().trim();
        li liVar2 = viVar.U;
        AndroidUtilities.cancelRunOnUIThread(liVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(viVar.A)) {
            String str = viVar.A;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            viVar.T = z10;
            if (!TextUtils.equals(viVar.S, viVar.A)) {
                viVar.I.clear();
                viVar.V = 0;
                viVar.W = false;
            }
            AndroidUtilities.runOnUIThread(liVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(liVar);
        if (!TextUtils.isEmpty(viVar.A)) {
            String str2 = viVar.A;
            viVar.f33378j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(viVar.f27493b.F1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(viVar.f33370b0, viVar.A)) {
                viVar.J.clear();
                viVar.f33372d0 = false;
            }
            AndroidUtilities.runOnUIThread(liVar, 1500L);
        }
        viVar.O();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
