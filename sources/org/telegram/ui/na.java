package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class na implements TextWatcher {
    public final oa f40334a;

    public na(oa oaVar) {
        this.f40334a = oaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ua uaVar = this.f40334a.f40609c;
        if (uaVar.f42436r.startsWith("@")) {
            uaVar.f42436r = uaVar.f42436r.substring(1);
        }
        if (uaVar.f42436r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) uaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(uaVar.f42436r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, uaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        oa oaVar = this.f40334a;
        ua uaVar = oaVar.f40609c;
        String str = uaVar.f42436r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        uaVar.f42436r = charSequence2;
        ua uaVar2 = oaVar.f40609c;
        ra raVar = uaVar2.E;
        if (raVar != null && str != null) {
            raVar.b(uaVar2.f42436r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        oa oaVar = this.f40334a;
        ua uaVar = oaVar.f40609c;
        String str = uaVar.f42436r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        uaVar.f42436r = charSequence2;
        ua uaVar2 = oaVar.f40609c;
        ra raVar = uaVar2.E;
        if (raVar != null && str != null) {
            raVar.b(uaVar2.f42436r);
        }
        if (uaVar.f42435n) {
            return;
        }
        uaVar.d0(uaVar.f42436r);
    }
}
