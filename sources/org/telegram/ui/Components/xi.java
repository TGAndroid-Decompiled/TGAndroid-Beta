package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class xi implements TextWatcher {
    public final dj f32585a;

    public xi(dj djVar) {
        this.f32585a = djVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        dj djVar = this.f32585a;
        si siVar = djVar.f25747f0;
        TextUtils.isEmpty(djVar.f25759y);
        djVar.f25759y = editable.toString().trim();
        si siVar2 = djVar.f25742a0;
        AndroidUtilities.cancelRunOnUIThread(siVar2);
        boolean z11 = true;
        if (!TextUtils.isEmpty(djVar.f25759y)) {
            String str = djVar.f25759y;
            if (str != null && str.length() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            djVar.W = z10;
            if (!TextUtils.equals(djVar.V, djVar.f25759y)) {
                djVar.L.clear();
                djVar.f25743b0 = 0;
                djVar.f25744c0 = false;
            }
            AndroidUtilities.runOnUIThread(siVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(siVar);
        if (!TextUtils.isEmpty(djVar.f25759y)) {
            String str2 = djVar.f25759y;
            if (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(djVar.f27704b.M1).config.musicSearchUsername.get())) {
                z11 = false;
            }
            djVar.m0 = z11;
            if (!TextUtils.equals(djVar.f25746e0, djVar.f25759y)) {
                djVar.M.clear();
                djVar.f25748g0 = false;
            }
            AndroidUtilities.runOnUIThread(siVar, 1500L);
        }
        djVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
