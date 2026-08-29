package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ea implements TextWatcher {
    public final fa f37767a;

    public ea(fa faVar) {
        this.f37767a = faVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        la laVar = this.f37767a.f38084c;
        if (laVar.f40145r.startsWith("@")) {
            laVar.f40145r = laVar.f40145r.substring(1);
        }
        if (laVar.f40145r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) laVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(laVar.f40145r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, laVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        fa faVar = this.f37767a;
        la laVar = faVar.f38084c;
        String str = laVar.f40145r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        laVar.f40145r = charSequence2;
        la laVar2 = faVar.f38084c;
        ia iaVar = laVar2.A;
        if (iaVar != null && str != null) {
            iaVar.b(laVar2.f40145r);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        fa faVar = this.f37767a;
        la laVar = faVar.f38084c;
        String str = laVar.f40145r;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        laVar.f40145r = charSequence2;
        la laVar2 = faVar.f38084c;
        ia iaVar = laVar2.A;
        if (iaVar != null && str != null) {
            iaVar.b(laVar2.f40145r);
        }
        if (laVar.f40144n) {
            return;
        }
        laVar.d0(laVar.f40145r);
    }
}
