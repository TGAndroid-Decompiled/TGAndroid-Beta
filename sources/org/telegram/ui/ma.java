package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ma implements TextWatcher {
    public final na f41400a;

    public ma(na naVar) {
        this.f41400a = naVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ta taVar = this.f41400a.f41723c;
        if (taVar.f43581r.startsWith("@")) {
            taVar.f43581r = taVar.f43581r.substring(1);
        }
        if (taVar.f43581r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.r2) taVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(taVar.f43581r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, taVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        na naVar = this.f41400a;
        ta taVar = naVar.f41723c;
        String str = taVar.f43581r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        taVar.f43581r = charSequence2;
        ta taVar2 = naVar.f41723c;
        qa qaVar = taVar2.E;
        if (qaVar != null && str != null) {
            qaVar.b(taVar2.f43581r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        na naVar = this.f41400a;
        ta taVar = naVar.f41723c;
        String str = taVar.f43581r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        taVar.f43581r = charSequence2;
        ta taVar2 = naVar.f41723c;
        qa qaVar = taVar2.E;
        if (qaVar != null && str != null) {
            qaVar.b(taVar2.f43581r);
        }
        if (taVar.f43580n) {
            return;
        }
        taVar.e0(taVar.f43581r);
    }
}
