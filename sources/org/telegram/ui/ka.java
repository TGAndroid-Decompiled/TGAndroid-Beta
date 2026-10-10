package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ka implements TextWatcher {
    public final la f39237a;

    public ka(la laVar) {
        this.f39237a = laVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ra raVar = this.f39237a.f39528c;
        if (raVar.f41368r.startsWith("@")) {
            raVar.f41368r = raVar.f41368r.substring(1);
        }
        if (raVar.f41368r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) raVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(raVar.f41368r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, raVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        la laVar = this.f39237a;
        ra raVar = laVar.f39528c;
        String str = raVar.f41368r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f41368r = charSequence2;
        ra raVar2 = laVar.f39528c;
        oa oaVar = raVar2.E;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f41368r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        la laVar = this.f39237a;
        ra raVar = laVar.f39528c;
        String str = raVar.f41368r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f41368r = charSequence2;
        ra raVar2 = laVar.f39528c;
        oa oaVar = raVar2.E;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f41368r);
        }
        if (raVar.f41367n) {
            return;
        }
        raVar.d0(raVar.f41368r);
    }
}
