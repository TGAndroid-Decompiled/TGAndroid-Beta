package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dj implements TextWatcher {
    public final jj f25744a;

    public dj(jj jjVar) {
        this.f25744a = jjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        jj jjVar = this.f25744a;
        yi yiVar = jjVar.f27785f0;
        TextUtils.isEmpty(jjVar.f27797y);
        jjVar.f27797y = editable.toString().trim();
        yi yiVar2 = jjVar.f27780a0;
        AndroidUtilities.cancelRunOnUIThread(yiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(jjVar.f27797y)) {
            String str = jjVar.f27797y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jjVar.W = z10;
            if (!TextUtils.equals(jjVar.V, jjVar.f27797y)) {
                jjVar.L.clear();
                jjVar.f27781b0 = 0;
                jjVar.f27782c0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        if (!TextUtils.isEmpty(jjVar.f27797y)) {
            String str2 = jjVar.f27797y;
            jjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.f29642b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(jjVar.f27784e0, jjVar.f27797y)) {
                jjVar.M.clear();
                jjVar.f27786g0 = false;
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
