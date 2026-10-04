package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class la implements TextWatcher {
    public final ma f38209a;

    public la(ma maVar) {
        this.f38209a = maVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        sa saVar = this.f38209a.f38510c;
        if (saVar.f40429r.startsWith("@")) {
            saVar.f40429r = saVar.f40429r.substring(1);
        }
        if (saVar.f40429r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) saVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(saVar.f40429r);
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
        ma maVar = this.f38209a;
        sa saVar = maVar.f38510c;
        String str = saVar.f40429r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f40429r = charSequence2;
        sa saVar2 = maVar.f38510c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f40429r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ma maVar = this.f38209a;
        sa saVar = maVar.f38510c;
        String str = saVar.f40429r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f40429r = charSequence2;
        sa saVar2 = maVar.f38510c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f40429r);
        }
        if (saVar.f40428n) {
            return;
        }
        saVar.d0(saVar.f40429r);
    }
}
