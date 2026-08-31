package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ia implements TextWatcher {
    public final ja f37784a;

    public ia(ja jaVar) {
        this.f37784a = jaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        pa paVar = this.f37784a.f38064c;
        if (paVar.f39997r.startsWith("@")) {
            paVar.f39997r = paVar.f39997r.substring(1);
        }
        if (paVar.f39997r.length() > 0) {
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) paVar).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/");
            sb.append(paVar.f39997r);
            String sb2 = sb.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb2);
            int indexOf = formatString.indexOf(sb2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb2, paVar, 3), indexOf, sb2.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ja jaVar = this.f37784a;
        pa paVar = jaVar.f38064c;
        String str = paVar.f39997r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        paVar.f39997r = charSequence2;
        pa paVar2 = jaVar.f38064c;
        ma maVar = paVar2.B;
        if (maVar != null && str != null) {
            maVar.b(paVar2.f39997r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ja jaVar = this.f37784a;
        pa paVar = jaVar.f38064c;
        String str = paVar.f39997r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        paVar.f39997r = charSequence2;
        pa paVar2 = jaVar.f38064c;
        ma maVar = paVar2.B;
        if (maVar != null && str != null) {
            maVar.b(paVar2.f39997r);
        }
        if (paVar.f39996n) {
            return;
        }
        paVar.d0(paVar.f39997r);
    }
}
