package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ej implements TextWatcher {
    public final jj f22716a;

    public ej(jj jjVar) {
        this.f22716a = jjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        jj jjVar = this.f22716a;
        zi ziVar = jjVar.f24415g0;
        TextUtils.isEmpty(jjVar.E);
        jjVar.E = editable.toString().trim();
        zi ziVar2 = jjVar.f24410b0;
        AndroidUtilities.cancelRunOnUIThread(ziVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(jjVar.E)) {
            String str = jjVar.E;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jjVar.f24409a0 = z10;
            if (!TextUtils.equals(jjVar.W, jjVar.E)) {
                jjVar.M.clear();
                jjVar.f24411c0 = 0;
                jjVar.f24412d0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(ziVar);
        if (!TextUtils.isEmpty(jjVar.E)) {
            String str2 = jjVar.E;
            jjVar.f24422n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.f26422b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(jjVar.f24414f0, jjVar.E)) {
                jjVar.N.clear();
                jjVar.f24416h0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar, 1500L);
        }
        jjVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
