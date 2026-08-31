package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class id1 implements TextWatcher {
    public final jd1 f37803a;

    public id1(jd1 jd1Var) {
        this.f37803a = jd1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        jd1 jd1Var = this.f37803a;
        if (jd1Var.F) {
            return;
        }
        if (jd1Var.f38114a.length() > 0) {
            String str = "https://" + jd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) jd1Var.f38114a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, jd1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            jd1Var.d.setText(TextUtils.concat(jd1Var.E, "\n\n", spannableStringBuilder));
            return;
        }
        jd1Var.d.setText(jd1Var.E);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        jd1 jd1Var = this.f37803a;
        if (jd1Var.D) {
            return;
        }
        jd1Var.Z(jd1Var.f38114a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
