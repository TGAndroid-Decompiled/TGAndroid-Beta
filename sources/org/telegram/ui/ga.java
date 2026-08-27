package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class ga implements TextWatcher {

    public final ha f38378a;

    public ga(ha haVar) {
        this.f38378a = haVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        na naVar = this.f38378a.f38763c;
        if (naVar.f40706r.startsWith("@")) {
            naVar.f40706r = naVar.f40706r.substring(1);
        }
        if (naVar.f40706r.length() > 0) {
            String str = "https://" + MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) naVar).currentAccount).linkPrefix + "/" + naVar.f40706r;
            String string = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, str);
            int iIndexOf = string.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, naVar, 3), iIndexOf, str.length() + iIndexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ha haVar = this.f38378a;
        na naVar = haVar.f38763c;
        String str = naVar.f40706r;
        naVar.f40706r = charSequence == null ? "" : charSequence.toString();
        na naVar2 = haVar.f38763c;
        ka kaVar = naVar2.A;
        if (kaVar == null || str == null) {
            return;
        }
        kaVar.b(naVar2.f40706r);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ha haVar = this.f38378a;
        na naVar = haVar.f38763c;
        String str = naVar.f40706r;
        naVar.f40706r = charSequence == null ? "" : charSequence.toString();
        na naVar2 = haVar.f38763c;
        ka kaVar = naVar2.A;
        if (kaVar != null && str != null) {
            kaVar.b(naVar2.f40706r);
        }
        if (naVar.f40705n) {
            return;
        }
        naVar.d0(naVar.f40706r);
    }
}
