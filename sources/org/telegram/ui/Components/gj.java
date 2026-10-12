package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class gj implements TextWatcher {
    public final mj f26442a;

    public gj(mj mjVar) {
        this.f26442a = mjVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        mj mjVar = this.f26442a;
        bj bjVar = mjVar.f28575f0;
        TextUtils.isEmpty(mjVar.f28587y);
        mjVar.f28587y = editable.toString().trim();
        bj bjVar2 = mjVar.f28570a0;
        AndroidUtilities.cancelRunOnUIThread(bjVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(mjVar.f28587y)) {
            String str = mjVar.f28587y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mjVar.W = z10;
            if (!TextUtils.equals(mjVar.V, mjVar.f28587y)) {
                mjVar.L.clear();
                mjVar.f28571b0 = 0;
                mjVar.f28572c0 = false;
            }
            AndroidUtilities.runOnUIThread(bjVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(bjVar);
        if (!TextUtils.isEmpty(mjVar.f28587y)) {
            String str2 = mjVar.f28587y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(mjVar.f30574b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            mjVar.m0 = z11;
            if (!TextUtils.equals(mjVar.f28574e0, mjVar.f28587y)) {
                mjVar.M.clear();
                mjVar.f28576g0 = false;
            }
            AndroidUtilities.runOnUIThread(bjVar, 1500L);
        }
        mjVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
