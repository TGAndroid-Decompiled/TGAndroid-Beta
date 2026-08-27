package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class mi implements TextWatcher {

    public final ri f30691a;

    public mi(ri riVar) {
        this.f30691a = riVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ri riVar = this.f30691a;
        hi hiVar = riVar.f32173c0;
        TextUtils.isEmpty(riVar.A);
        riVar.A = editable.toString().trim();
        hi hiVar2 = riVar.U;
        AndroidUtilities.cancelRunOnUIThread(hiVar2);
        if (!TextUtils.isEmpty(riVar.A)) {
            String str = riVar.A;
            riVar.T = str != null && str.length() >= 0;
            if (!TextUtils.equals(riVar.S, riVar.A)) {
                riVar.I.clear();
                riVar.V = 0;
                riVar.W = false;
            }
            AndroidUtilities.runOnUIThread(hiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(hiVar);
        if (!TextUtils.isEmpty(riVar.A)) {
            String str2 = riVar.A;
            riVar.f32180j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(riVar.f34900b.F1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(riVar.f32172b0, riVar.A)) {
                riVar.J.clear();
                riVar.f32174d0 = false;
            }
            AndroidUtilities.runOnUIThread(hiVar, 1500L);
        }
        riVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
