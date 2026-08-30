package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gd1 implements TextWatcher {
    public final hd1 f34578a;

    public gd1(hd1 hd1Var) {
        this.f34578a = hd1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        hd1 hd1Var = this.f34578a;
        if (hd1Var.F) {
            return;
        }
        if (hd1Var.f34818a.length() > 0) {
            String str = "https://" + hd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) hd1Var.f34818a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, hd1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            hd1Var.d.setText(TextUtils.concat(hd1Var.E, "\n\n", spannableStringBuilder));
            return;
        }
        hd1Var.d.setText(hd1Var.E);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        hd1 hd1Var = this.f34578a;
        if (hd1Var.D) {
            return;
        }
        hd1Var.Z(hd1Var.f34818a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
