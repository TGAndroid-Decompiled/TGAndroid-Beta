package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ka implements TextWatcher {
    public final la f34306a;

    public ka(la laVar) {
        this.f34306a = laVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        ra raVar = this.f34306a.f34627c;
        if (raVar.f36277r.startsWith("@")) {
            raVar.f36277r = raVar.f36277r.substring(1);
        }
        if (raVar.f36277r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(raVar.f36277r);
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
        la laVar = this.f34306a;
        ra raVar = laVar.f34627c;
        String str = raVar.f36277r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f36277r = charSequence2;
        ra raVar2 = laVar.f34627c;
        oa oaVar = raVar2.E;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f36277r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        la laVar = this.f34306a;
        ra raVar = laVar.f34627c;
        String str = raVar.f36277r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        raVar.f36277r = charSequence2;
        ra raVar2 = laVar.f34627c;
        oa oaVar = raVar2.E;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.f36277r);
        }
        if (raVar.f36276n) {
            return;
        }
        raVar.d0(raVar.f36277r);
    }
}
