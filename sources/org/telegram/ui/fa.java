package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class fa implements TextWatcher {
    public final ga f38193a;

    public fa(ga gaVar) {
        this.f38193a = gaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9;
        ma maVar = this.f38193a.f38489c;
        if (maVar.f40367r.startsWith("@")) {
            maVar.f40367r = maVar.f40367r.substring(1);
        }
        if (maVar.f40367r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i9 = ((org.telegram.ui.ActionBar.o2) maVar).currentAccount;
            sb2.append(MessagesController.getInstance(i9).linkPrefix);
            sb2.append("/");
            sb2.append(maVar.f40367r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, maVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        String charSequence2;
        ga gaVar = this.f38193a;
        ma maVar = gaVar.f38489c;
        String str = maVar.f40367r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        maVar.f40367r = charSequence2;
        ma maVar2 = gaVar.f38489c;
        ja jaVar = maVar2.A;
        if (jaVar != null && str != null) {
            jaVar.b(maVar2.f40367r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        String charSequence2;
        ga gaVar = this.f38193a;
        ma maVar = gaVar.f38489c;
        String str = maVar.f40367r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        maVar.f40367r = charSequence2;
        ma maVar2 = gaVar.f38489c;
        ja jaVar = maVar2.A;
        if (jaVar != null && str != null) {
            jaVar.b(maVar2.f40367r);
        }
        if (maVar.f40366n) {
            return;
        }
        maVar.c0(maVar.f40367r);
    }
}
