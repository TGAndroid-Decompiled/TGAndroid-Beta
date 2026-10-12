package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class de1 implements TextWatcher {
    public final ee1 f36776a;

    public de1(ee1 ee1Var) {
        this.f36776a = ee1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ee1 ee1Var = this.f36776a;
        if (ee1Var.I) {
            return;
        }
        if (ee1Var.f37069a.length() > 0) {
            String str = "https://" + ee1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ee1Var.f37069a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ee1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            ee1Var.d.setText(TextUtils.concat(ee1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        ee1Var.d.setText(ee1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ee1 ee1Var = this.f36776a;
        if (ee1Var.G) {
            return;
        }
        ee1Var.Z(ee1Var.f37069a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
