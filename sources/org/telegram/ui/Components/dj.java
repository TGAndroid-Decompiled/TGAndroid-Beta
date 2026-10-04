package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dj implements TextWatcher {
    public final jj f25750a;

    public dj(jj jjVar) {
        this.f25750a = jjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        jj jjVar = this.f25750a;
        yi yiVar = jjVar.f27791f0;
        TextUtils.isEmpty(jjVar.f27803y);
        jjVar.f27803y = editable.toString().trim();
        yi yiVar2 = jjVar.f27786a0;
        AndroidUtilities.cancelRunOnUIThread(yiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(jjVar.f27803y)) {
            String str = jjVar.f27803y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jjVar.W = z10;
            if (!TextUtils.equals(jjVar.V, jjVar.f27803y)) {
                jjVar.L.clear();
                jjVar.f27787b0 = 0;
                jjVar.f27788c0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        if (!TextUtils.isEmpty(jjVar.f27803y)) {
            String str2 = jjVar.f27803y;
            jjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.f29648b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(jjVar.f27790e0, jjVar.f27803y)) {
                jjVar.M.clear();
                jjVar.f27792g0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar, 1500L);
        }
        jjVar.N();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
