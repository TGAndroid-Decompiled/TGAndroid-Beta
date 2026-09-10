package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ee1 implements TextWatcher {
    public final fe1 f32170a;

    public ee1(fe1 fe1Var) {
        this.f32170a = fe1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        fe1 fe1Var = this.f32170a;
        if (fe1Var.I) {
            return;
        }
        if (fe1Var.f32793a.length() > 0) {
            String str = "https://" + fe1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) fe1Var.f32793a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, fe1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            fe1Var.d.setText(TextUtils.concat(fe1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        fe1Var.d.setText(fe1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        fe1 fe1Var = this.f32170a;
        if (fe1Var.G) {
            return;
        }
        fe1Var.Z(fe1Var.f32793a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
