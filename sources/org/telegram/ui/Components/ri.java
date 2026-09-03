package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ri implements TextWatcher {
    public final wi f28474a;

    public ri(wi wiVar) {
        this.f28474a = wiVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        wi wiVar = this.f28474a;
        mi miVar = wiVar.f30282d0;
        TextUtils.isEmpty(wiVar.B);
        wiVar.B = editable.toString().trim();
        mi miVar2 = wiVar.V;
        AndroidUtilities.cancelRunOnUIThread(miVar2);
        boolean z10 = true;
        if (!TextUtils.isEmpty(wiVar.B)) {
            String str = wiVar.B;
            if (str != null && str.length() >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            wiVar.U = z4;
            if (!TextUtils.equals(wiVar.T, wiVar.B)) {
                wiVar.J.clear();
                wiVar.W = 0;
                wiVar.f30279a0 = false;
            }
            AndroidUtilities.runOnUIThread(miVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(miVar);
        if (!TextUtils.isEmpty(wiVar.B)) {
            String str2 = wiVar.B;
            wiVar.f30289k0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(wiVar.f24282b.G1).config.musicSearchUsername.get())) ? false : false;
            if (!TextUtils.equals(wiVar.f30281c0, wiVar.B)) {
                wiVar.K.clear();
                wiVar.f30283e0 = false;
            }
            AndroidUtilities.runOnUIThread(miVar, 1500L);
        }
        wiVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
