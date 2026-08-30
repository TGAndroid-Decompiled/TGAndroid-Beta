package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ia implements TextWatcher {
    public final ja f35051a;

    public ia(ja jaVar) {
        this.f35051a = jaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        pa paVar = this.f35051a.f35305c;
        if (paVar.f37256r.startsWith("@")) {
            paVar.f37256r = paVar.f37256r.substring(1);
        }
        if (paVar.f37256r.length() > 0) {
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) paVar).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/");
            sb.append(paVar.f37256r);
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
        ja jaVar = this.f35051a;
        pa paVar = jaVar.f35305c;
        String str = paVar.f37256r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        paVar.f37256r = charSequence2;
        pa paVar2 = jaVar.f35305c;
        ma maVar = paVar2.B;
        if (maVar != null && str != null) {
            maVar.b(paVar2.f37256r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        ja jaVar = this.f35051a;
        pa paVar = jaVar.f35305c;
        String str = paVar.f37256r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        paVar.f37256r = charSequence2;
        pa paVar2 = jaVar.f35305c;
        ma maVar = paVar2.B;
        if (maVar != null && str != null) {
            maVar.b(paVar2.f37256r);
        }
        if (paVar.f37255n) {
            return;
        }
        paVar.d0(paVar.f37256r);
    }
}
