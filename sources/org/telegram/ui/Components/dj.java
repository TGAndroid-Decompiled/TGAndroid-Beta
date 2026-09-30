package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dj implements TextWatcher {
    public final jj f23657a;

    public dj(jj jjVar) {
        this.f23657a = jjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        jj jjVar = this.f23657a;
        yi yiVar = jjVar.f25468f0;
        TextUtils.isEmpty(jjVar.f25480y);
        jjVar.f25480y = editable.toString().trim();
        yi yiVar2 = jjVar.f25463a0;
        AndroidUtilities.cancelRunOnUIThread(yiVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(jjVar.f25480y)) {
            String str = jjVar.f25480y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jjVar.W = z10;
            if (!TextUtils.equals(jjVar.V, jjVar.f25480y)) {
                jjVar.L.clear();
                jjVar.f25464b0 = 0;
                jjVar.f25465c0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        if (!TextUtils.isEmpty(jjVar.f25480y)) {
            String str2 = jjVar.f25480y;
            jjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.f27362b.J1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(jjVar.f25467e0, jjVar.f25480y)) {
                jjVar.M.clear();
                jjVar.f25469g0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar, 1500L);
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
