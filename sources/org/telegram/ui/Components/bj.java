package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class bj implements TextWatcher {
    public final gj f22755a;

    public bj(gj gjVar) {
        this.f22755a = gjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        gj gjVar = this.f22755a;
        wi wiVar = gjVar.f24244g0;
        TextUtils.isEmpty(gjVar.E);
        gjVar.E = editable.toString().trim();
        wi wiVar2 = gjVar.f24239b0;
        AndroidUtilities.cancelRunOnUIThread(wiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(gjVar.E)) {
            String str = gjVar.E;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gjVar.f24238a0 = z10;
            if (!TextUtils.equals(gjVar.W, gjVar.E)) {
                gjVar.M.clear();
                gjVar.f24240c0 = 0;
                gjVar.f24241d0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        if (!TextUtils.isEmpty(gjVar.E)) {
            String str2 = gjVar.E;
            gjVar.f24251n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(gjVar.f26463b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(gjVar.f24243f0, gjVar.E)) {
                gjVar.N.clear();
                gjVar.f24245h0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar, 1500L);
        }
        gjVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
