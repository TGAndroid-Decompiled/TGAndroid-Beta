package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class na implements TextWatcher {
    public final oa f39401a;

    public na(oa oaVar) {
        this.f39401a = oaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ua uaVar = this.f39401a.f39698c;
        if (uaVar.f41936r.startsWith("@")) {
            uaVar.f41936r = uaVar.f41936r.substring(1);
        }
        if (uaVar.f41936r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) uaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(uaVar.f41936r);
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
        oa oaVar = this.f39401a;
        ua uaVar = oaVar.f39698c;
        String str = uaVar.f41936r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        uaVar.f41936r = charSequence2;
        ua uaVar2 = oaVar.f39698c;
        ra raVar = uaVar2.E;
        if (raVar != null && str != null) {
            raVar.b(uaVar2.f41936r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        oa oaVar = this.f39401a;
        ua uaVar = oaVar.f39698c;
        String str = uaVar.f41936r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        uaVar.f41936r = charSequence2;
        ua uaVar2 = oaVar.f39698c;
        ra raVar = uaVar2.E;
        if (raVar != null && str != null) {
            raVar.b(uaVar2.f41936r);
        }
        if (uaVar.f41935n) {
            return;
        }
        uaVar.d0(uaVar.f41936r);
    }
}
