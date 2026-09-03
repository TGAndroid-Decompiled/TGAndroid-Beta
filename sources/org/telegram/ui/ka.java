package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ka implements TextWatcher {
    public final la f35454a;

    public ka(la laVar) {
        this.f35454a = laVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ra raVar = this.f35454a.f35722c;
        if (raVar.f37780r.startsWith("@")) {
            raVar.f37780r = raVar.f37780r.substring(1);
        }
        if (raVar.f37780r.length() > 0) {
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/");
            sb.append(raVar.f37780r);
            String sb2 = sb.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb2);
            int indexOf = formatString.indexOf(sb2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb2, raVar, 3), indexOf, sb2.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        la laVar = this.f35454a;
        ra raVar = laVar.f35722c;
        String str = raVar.f37780r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f37780r = charSequence2;
        ra raVar2 = laVar.f35722c;
        oa oaVar = raVar2.B;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f37780r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        la laVar = this.f35454a;
        ra raVar = laVar.f35722c;
        String str = raVar.f37780r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f37780r = charSequence2;
        ra raVar2 = laVar.f35722c;
        oa oaVar = raVar2.B;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f37780r);
        }
        if (raVar.f37779n) {
            return;
        }
        raVar.d0(raVar.f37780r);
    }
}
