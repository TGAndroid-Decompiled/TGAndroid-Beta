package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class oa implements TextWatcher {
    public final pa f38905a;

    public oa(pa paVar) {
        this.f38905a = paVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        va vaVar = this.f38905a.f39168c;
        if (vaVar.f40940r.startsWith("@")) {
            vaVar.f40940r = vaVar.f40940r.substring(1);
        }
        if (vaVar.f40940r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) vaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(vaVar.f40940r);
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
        pa paVar = this.f38905a;
        va vaVar = paVar.f39168c;
        String str = vaVar.f40940r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        vaVar.f40940r = charSequence2;
        va vaVar2 = paVar.f39168c;
        sa saVar = vaVar2.E;
        if (saVar != null && str != null) {
            saVar.b(vaVar2.f40940r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        pa paVar = this.f38905a;
        va vaVar = paVar.f39168c;
        String str = vaVar.f40940r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        vaVar.f40940r = charSequence2;
        va vaVar2 = paVar.f39168c;
        sa saVar = vaVar2.E;
        if (saVar != null && str != null) {
            saVar.b(vaVar2.f40940r);
        }
        if (vaVar.f40939n) {
            return;
        }
        vaVar.d0(vaVar.f40940r);
    }
}
