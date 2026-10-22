package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class la implements TextWatcher {
    public final ma f38876a;

    public la(ma maVar) {
        this.f38876a = maVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        sa saVar = this.f38876a.f39169c;
        if (saVar.f41419r.startsWith("@")) {
            saVar.f41419r = saVar.f41419r.substring(1);
        }
        if (saVar.f41419r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) saVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(saVar.f41419r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, saVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ma maVar = this.f38876a;
        sa saVar = maVar.f39169c;
        String str = saVar.f41419r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f41419r = charSequence2;
        sa saVar2 = maVar.f39169c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f41419r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ma maVar = this.f38876a;
        sa saVar = maVar.f39169c;
        String str = saVar.f41419r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f41419r = charSequence2;
        sa saVar2 = maVar.f39169c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f41419r);
        }
        if (saVar.f41418n) {
            return;
        }
        saVar.d0(saVar.f41419r);
    }
}
