package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ja implements TextWatcher {
    public final ka f34396a;

    public ja(ka kaVar) {
        this.f34396a = kaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        qa qaVar = this.f34396a.f34635c;
        if (qaVar.f36340r.startsWith("@")) {
            qaVar.f36340r = qaVar.f36340r.substring(1);
        }
        if (qaVar.f36340r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) qaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(qaVar.f36340r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, qaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ka kaVar = this.f34396a;
        qa qaVar = kaVar.f34635c;
        String str = qaVar.f36340r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        qaVar.f36340r = charSequence2;
        qa qaVar2 = kaVar.f34635c;
        na naVar = qaVar2.E;
        if (naVar != null && str != null) {
            naVar.b(qaVar2.f36340r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ka kaVar = this.f34396a;
        qa qaVar = kaVar.f34635c;
        String str = qaVar.f36340r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        qaVar.f36340r = charSequence2;
        qa qaVar2 = kaVar.f34635c;
        na naVar = qaVar2.E;
        if (naVar != null && str != null) {
            naVar.b(qaVar2.f36340r);
        }
        if (qaVar.f36339n) {
            return;
        }
        qaVar.d0(qaVar.f36340r);
    }
}
