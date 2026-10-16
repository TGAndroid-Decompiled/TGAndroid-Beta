package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class oa implements TextWatcher {
    public final pa f38587a;

    public oa(pa paVar) {
        this.f38587a = paVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        va vaVar = this.f38587a.f38862c;
        if (vaVar.f40627r.startsWith("@")) {
            vaVar.f40627r = vaVar.f40627r.substring(1);
        }
        if (vaVar.f40627r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) vaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(vaVar.f40627r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, vaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        pa paVar = this.f38587a;
        va vaVar = paVar.f38862c;
        String str = vaVar.f40627r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        vaVar.f40627r = charSequence2;
        va vaVar2 = paVar.f38862c;
        sa saVar = vaVar2.E;
        if (saVar != null && str != null) {
            saVar.b(vaVar2.f40627r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        pa paVar = this.f38587a;
        va vaVar = paVar.f38862c;
        String str = vaVar.f40627r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        vaVar.f40627r = charSequence2;
        va vaVar2 = paVar.f38862c;
        sa saVar = vaVar2.E;
        if (saVar != null && str != null) {
            saVar.b(vaVar2.f40627r);
        }
        if (vaVar.f40626n) {
            return;
        }
        vaVar.d0(vaVar.f40627r);
    }
}
