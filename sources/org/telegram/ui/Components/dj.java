package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dj implements TextWatcher {
    public final jj f25805a;

    public dj(jj jjVar) {
        this.f25805a = jjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        jj jjVar = this.f25805a;
        yi yiVar = jjVar.f27858f0;
        TextUtils.isEmpty(jjVar.f27870y);
        jjVar.f27870y = editable.toString().trim();
        yi yiVar2 = jjVar.f27853a0;
        AndroidUtilities.cancelRunOnUIThread(yiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(jjVar.f27870y)) {
            String str = jjVar.f27870y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jjVar.W = z10;
            if (!TextUtils.equals(jjVar.V, jjVar.f27870y)) {
                jjVar.L.clear();
                jjVar.f27854b0 = 0;
                jjVar.f27855c0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        if (!TextUtils.isEmpty(jjVar.f27870y)) {
            String str2 = jjVar.f27870y;
            jjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.f29741b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(jjVar.f27857e0, jjVar.f27870y)) {
                jjVar.M.clear();
                jjVar.f27859g0 = false;
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
