package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class la implements TextWatcher {
    public final ma f35486a;

    public la(ma maVar) {
        this.f35486a = maVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        sa saVar = this.f35486a.f35735c;
        if (saVar.f37434r.startsWith("@")) {
            saVar.f37434r = saVar.f37434r.substring(1);
        }
        if (saVar.f37434r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) saVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(saVar.f37434r);
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
        ma maVar = this.f35486a;
        sa saVar = maVar.f35735c;
        String str = saVar.f37434r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f37434r = charSequence2;
        sa saVar2 = maVar.f35735c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f37434r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ma maVar = this.f35486a;
        sa saVar = maVar.f35735c;
        String str = saVar.f37434r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        saVar.f37434r = charSequence2;
        sa saVar2 = maVar.f35735c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.f37434r);
        }
        if (saVar.f37433n) {
            return;
        }
        saVar.d0(saVar.f37434r);
    }
}
